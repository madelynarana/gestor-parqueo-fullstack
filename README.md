# 🚗 Sistema de Parqueo - Spring Boot & Frontend

## 📂 Estructura del Proyecto

Vista general de la organización del proyecto.

```  
📂 backend/                          # Contiene la API y lógica de negocio (Spring Boot)
│   📂 src/                          # Código fuente de la aplicación
│   │   📂 main/
│   │   │   📂 java/com/parqueo/      # Paquete base del proyecto
│   │   │   │   📂 controllers/       # Controladores REST
│   │   │   │   📂 models/            # Modelos o entidades JPA
│   │   │   │   📂 repository/        # Interfaces de repositorio (Spring Data JPA)
│   │   │   │   📂 security/          # Configuración de seguridad (SecurityConfig)
│   │   │   📂 resources/
│   │   │       📄 application.properties # Configuración de la app (puerto,base de datos)
│   📄 pom.xml                        # Dependencias Maven del proyecto
│   📄 README.md                      # Documentación del backend
<!--
📂 frontend/                         # Contiene la interfaz de usuario (React, Angular o Vue)
│   📂 src/                           # Código fuente del frontend
│   📂 public/                        # Archivos públicos y estáticos
│   📄 package.json                   # Dependencias del frontend
│   📄 README.md                      # Documentación del frontend

📄 Database.sql                       # Backup de la base de datos Mysql8
📄 README.md                          # Documentación principal del proyecto
```

## ⚙️ Configuración

### 1️⃣ Backend (Spring Boot)
1. Importar el proyecto en IntelliJ IDEA.
2. Configurar `application.properties` con la conexión a la base de datos.
3. Ejecutar el proyecto con:
   ```bash
   mvn spring-boot:run
   ```
<!--
### 2️⃣ Frontend  
1. Entrar a la carpeta `frontend`.  
2. Instalar dependencias:  
   ```bash
   npm install
   ```
3. Ejecutar el servidor de desarrollo:  
   ```bash
   npm run dev
   ```
-->
### 3️⃣ Base de datos
- Ejecutar el archivo `Database.sql` en Mysql8.
