/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6p2lab;
import java.util.Comparator;
/**
 *
 * @author agust
 */
public class Producto implements Comparable<Producto> {

    private int codigo;
    
    private Rubro rubro;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(int codigo, Rubro rubro, String descripcion, double precio, int stock) {
        this.codigo = codigo;
        this.rubro = rubro;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", rubro=" + rubro + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + '}';
    }

   
   

    @Override
    public int compareTo(Producto o) {
      return codigo - o.codigo;
    }
   
    
    
    
    
    
    
    
}
