# Manual Técnico - Sistema de Gestión de Restaurantes

## 1. Descripción General del Proyecto
Este sistema es una aplicación de consola desarrollada en **Java** bajo un paradigma de **Programación Orientada a Objetos (POO)**. Su propósito es gestionar las operaciones diarias de un restaurante, abarcando el control de usuarios (clientes y personal), mesas, reservas y pedidos.

## 2. Arquitectura y Estructura de Paquetes
El código fuente está organizado en paquetes lógicos para mantener una alta cohesión y bajo acoplamiento:
- `com.restaurante`: Contiene la clase principal de ejecución (`Main.java`) y la gestión de bases de datos (`ConexionBD.java`).
- `com.restaurante.domain`: Contiene las clases del modelo de negocio:
  - `Usuario` (Clase base/padre)
  - `Cliente` (Hereda de Usuario, gestiona menús y pedidos del cliente)
  - `Personal` (Hereda de Usuario, gestiona la administración de mesas y actualización de pedidos)
  - `Mesa` (Control de mesas del restaurante)
  - `Reserva` (Gestión de reservas de clientes)
  - `Pedido` (Control de platos y estados de los pedidos)

## 3. Persistencia de Datos (Base de Datos H2)
El sistema utiliza **H2 Database** configurada en modo archivo local para garantizar la persistencia de la información sin necesidad de servidores externos.
- **Driver:** `org.h2.Driver`
- **URL de Conexión:** `jdbc:h2:./data/restauranteDB`
- **Credenciales por defecto:** Usuario `sa`, sin contraseña.

## 4. Requisitos del Entorno y Ejecución
- **Java Development Kit (JDK):** Versión 17 o superior.
- **Gestor de Dependencias:** Apache Maven.
- **Pruebas Unitarias:** JUnit 5 integrado para validación de lógica de negocio.

### Comandos de Compilación y Pruebas (Maven)
- Compilar el proyecto: `mvn clean compile`
- Ejecutar las pruebas unitarias: `mvn test`
