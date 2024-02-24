package com.example.parcial;
public class Factura {
    private int precioTomate = 1000;
    private int precioCebolla = 1500;
    private int cantidadTomate;
    private int cantidadCebolla;

    public void setCantidadTomate(int cantidadTomate) {
        this.cantidadTomate = cantidadTomate;
    }

    public void setCantidadCebolla(int cantidadCebolla) {
        this.cantidadCebolla = cantidadCebolla;
    }

    public int calcularTotal() {
        int totalTomate = cantidadTomate * precioTomate;
        int totalCebolla = cantidadCebolla * precioCebolla;
        return totalTomate + totalCebolla;
    }
}
