package me.parzibyte.sistemaventasspringboot;

public class ProductoParaVender extends Producto {
    private Float cantidad, total;

    public ProductoParaVender(String nombre, String codigo, Float precio, Float existencia, Integer id, Float cantidad) {
        super(nombre, codigo, precio, existencia, id);
        this.cantidad = cantidad;
    }

    public ProductoParaVender(String nombre, String codigo, Float precio, Float existencia, Float cantidad) {
        super(nombre, codigo, precio, existencia);
        this.cantidad = cantidad;
        this.refrescarTotal();
    }

    public void refrescarTotal() {
        this.total = this.cantidad * this.getPrecio();
    }

    public void aumentarCantidad() {
        this.cantidad++;
        this.refrescarTotal();
    }

    public Float getCantidad() {
        return cantidad;
    }

    public Float getTotal() {
        return total;
    }
}
