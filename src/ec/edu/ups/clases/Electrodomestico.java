/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * Electrodomestico es la clase "abuelo"  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchán
 */
public class Electrodomestico implements Comparable<Electrodomestico>{
    
    //Atributos de la clase Electrodomestico 
    
    private int codigo;
    private String marca;
    private String nombre;
    private double Precio;

    // generamos el constructor
    public Electrodomestico(int codigo, String marca, String nombre, double Precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.Precio = Precio;
    }
    
    // generamos los setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

   // generamos los getters
    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    // generamos el to String
    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", marca=" + marca + ", nombre=" + nombre + ", Precio=" + Precio + '}';
    }
    
     //set
    @Override
    public int hashCode() {
        int hash = 3;    
        hash = 47 * hash + this.codigo;
        return hash;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Electrodomestico o) {
        return nombre.compareTo(o.nombre);
    }
    
    
    
}
