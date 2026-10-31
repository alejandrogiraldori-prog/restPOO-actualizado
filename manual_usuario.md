# Manual de Usuario - Sistema de Gestión de Restaurantes

## 1. Introducción
Bienvenido al Sistema de Gestión de Restaurantes por consola. Esta aplicación permite a los clientes realizar consultas, reservas y pedidos de forma interactiva, y al personal administrar la disponibilidad de mesas y el flujo de los pedidos.

## 2. Guía de Inicio
1. Asegúrate de tener instalado Java en tu equipo.
2. Abre la aplicación ejecutando la clase principal **`Main.java`** desde tu entorno de desarrollo (VS Code / IntelliJ) o mediante tu consola.

## 3. Navegación por el Menú Principal
Al iniciar la aplicación, la consola te mostrará el menú de bienvenida:
- **1. Iniciar Sesión:** Permite acceder a las funciones del sistema según el rol.
- **2. Salir:** Cierra la aplicación.

### 4. Módulo de Cliente (Rol: 1)
Una vez inicias sesión como cliente, dispondrás de las siguientes opciones:
1. **Consultar mesa:** Muestra la lista de mesas disponibles y su estado actual.
2. **Hacer reserva:** Permite registrar una reserva ingresando los datos solicitados.
3. **Hacer pedido:** Permite seleccionar productos y registrar un pedido con estado inicial *"pendiente"*.
4. **Cancelar reserva:** Cancela una reserva activa existente.
5. **Ver estado pedido:** Muestra el estado actual de los pedidos registrados.
6. **Cerrar sesión:** Regresa al menú principal.

### 5. Módulo de Personal (Rol: 2)
Una vez inicias sesión como personal administrativo/empleado:
1. **Registrar mesa:** Agrega nuevas mesas al sistema del restaurante.
2. **Ver pedido:** Visualiza los detalles de los pedidos en curso.
3. **Actualizar pedido:** Modifica el estado de los pedidos según avance la cocina.
4. **Cerrar sesión:** Regresa al menú principal.
