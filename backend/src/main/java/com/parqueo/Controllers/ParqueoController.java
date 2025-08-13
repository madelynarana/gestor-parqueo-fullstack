package com.parqueo.Controllers;

import com.parqueo.Models.Parqueo;
import com.parqueo.Repository.ParqueoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/parqueo")

public class ParqueoController {

    @Autowired
    private ParqueoRepository parqueoRepository;
    private static final double PrecioHora = 5.00;

    public double CostosParqueo(LocalDateTime HoraIngreso, LocalDateTime HoraSalida){
        long minutos = Duration.between(HoraIngreso,HoraSalida).toMinutes();

        double horas = Math.ceil(minutos / 60.0);

        return horas * PrecioHora;
    }

    // http://localhost:8080/parqueo/ingreso
    @PostMapping("/ingreso")
    public String EntradaParqueo() {
        Parqueo parqueomodel = new Parqueo();
        parqueomodel.setHoraIngreso(LocalDateTime.now());
        parqueoRepository.save(parqueomodel);
        return "Exito al ingresado al parqueo número de ticket: " + parqueomodel.getId();
    }

    //http://localhost:8080/parqueo/salida/12
    @PutMapping("/salida/{parqueoId}")
    public String SalidaParqueo(@PathVariable Long parqueoId) {

        Optional<Parqueo> parqueOp = parqueoRepository.findById(parqueoId);
              if(parqueOp.isPresent()) {
                  Parqueo parqueoModel = parqueOp.get();
                  parqueoModel.setHoraSalida(LocalDateTime.now());
                  double costoParqueo = this.CostosParqueo(parqueoModel.getHoraIngreso(), parqueoModel.getHoraSalida());
                  parqueoModel.setCostoTotal(costoParqueo);
                  parqueoRepository.save(parqueoModel);
                  return "Gracias por su visita. Costo de ticket:" + parqueoModel.getCostoTotal();
              }else{
                  return "No se encontró el número de ticket";
              }
    }

    // http://localhost:8080/parqueo/eliminar/12
    @DeleteMapping("/eliminar/{parqueoId}")
    public String eliminarTicket(@PathVariable Long parqueoId){
        Optional<Parqueo> parqueoOp = parqueoRepository.findById(parqueoId);
        if (parqueoOp.isPresent()) {
            parqueoRepository.delete(parqueoOp.get());
            return "Ticket No. " + parqueoId + " eliminado exitosamente";
        } else {
            return "No se encontró el No. de ticket: " + parqueoId;
        }
    }

    // http://localhost:8080/parqueo/reporte
    @GetMapping("/reporte")
        public List<Parqueo> ReporteParqueo(){
            return  parqueoRepository.findAll();
        }

}
