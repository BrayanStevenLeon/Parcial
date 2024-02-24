package com.example.parcial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FacturaTest {
    @Test
    public void testCalcularTotal() {
        Factura factura = new Factura();
        factura.setCantidadTomate(3);
        factura.setCantidadCebolla(4);
        assertEquals(9000, factura.calcularTotal());
    }

}