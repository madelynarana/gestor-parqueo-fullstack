package com.parqueo.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="parqueo")
public class Parqueo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id;

    @Column(name="hora_ingreso")
    private LocalDateTime HoraIngreso;

    @Column(name="hora_salida")
    private LocalDateTime HoraSalida;

    @Column(name="costo")
    private double CostoTotal;

    public Parqueo() {
    }

    public Parqueo(Long id, LocalDateTime horaIngreso, LocalDateTime horaSalida, double costoTotal) {
        Id = id;
        HoraIngreso = horaIngreso;
        HoraSalida = horaSalida;
        CostoTotal = costoTotal;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDateTime getHoraIngreso() {
        return HoraIngreso;
    }

    public void setHoraIngreso(LocalDateTime horaIngreso) {
        HoraIngreso = horaIngreso;
    }

    public LocalDateTime getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        HoraSalida = horaSalida;
    }

    public double getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        CostoTotal = costoTotal;
    }
}
