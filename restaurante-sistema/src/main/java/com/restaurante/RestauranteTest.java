package com.restaurante;

import com.restaurante.domain.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestauranteTest {

    @Test
    public void testCrearCliente() {
        Cliente cliente = new Cliente("Carlos Pérez", "carlos@mail.com", "3001234567");
        assertNotNull(cliente, "El cliente no debería ser nulo");
        assertEquals("3001234567", cliente.getTelefono(), "El teléfono debe coincidir");
    }

    @Test
    public void testCrearPersonal() {
        // Ajusta los parámetros según los constructores de tu clase Personal
        Personal personal = new Personal("Ana Gómez", "ana@restaurante.com", "Cajero");
        assertNotNull(personal, "El objeto personal no debería ser nulo");
    }

    @Test
    public void testCrearMesa() {
        // Valida la creación de una mesa
        Mesa mesa = new Mesa();
        assertNotNull(mesa, "La mesa creada no debe ser nula");
    }

    @Test
    public void testCrearReserva() {
        // Valida la inicialización de reservas
        Reserva reserva = new Reserva();
        assertNotNull(reserva, "La reserva no debe ser nula");
    }

    @Test
    public void testCrearPedido() {
        // Valida la creación de pedidos
        Pedido pedido = new Pedido(1, "Plato ejecutivo", "pendiente");
        assertNotNull(pedido, "El pedido no debería ser nulo");
    }

}