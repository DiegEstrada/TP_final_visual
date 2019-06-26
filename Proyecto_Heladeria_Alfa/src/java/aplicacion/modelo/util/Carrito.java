/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Catalogo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Carrito implements Serializable {

    List<Catalogo> carrito;

    public Carrito() {
        carrito = new ArrayList<>();
    }

    public void agregarCatalogoAlCarrito(Catalogo catalogoAAgregar) {
        carrito.add(catalogoAAgregar);
    }

    public void eleminarCatalogoDelCarrito(Catalogo catalogoAEliminar) {
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < carrito.size(); i++) {
            precioTotal = precioTotal + calcularPrecioConDescuento(carrito.get(i));
        }
        return precioTotal;
    }

    public double calcularPrecioConDescuento(Catalogo catalogo) {
        double precioConDescuento = 0;
        precioConDescuento = catalogo.getProducto().getPrecio() - (catalogo.getProducto().getPrecio() / 100) * catalogo.getPromocion().getDescuento();
        return precioConDescuento;
    }

    public List<Catalogo> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Catalogo> carrito) {
        this.carrito = carrito;
    }

}
