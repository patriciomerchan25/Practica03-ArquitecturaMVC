/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Manual;
import java.util.ArrayList;
import java.util.List;

/**
 * Electrodomestico es la clase "hija"  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchá
 */
public final class Refrigerador extends LineaBlanca implements Manual{
    
    
    private String congelar;
    private String numeroPuertas; 
    private String led; 
    private String temperatura; 
    
    
    public Refrigerador(String lineaPequenia, String limpieza, String clima, String cosina, int codigo, String marca, String color, double Precio) {
        super(lineaPequenia, limpieza, clima, cosina, codigo, marca, color, Precio);
    }

    public Refrigerador(String congelar, String numeroPuertas, String led, String temperatura, String lineaPequenia, String limpieza, String clima, String cosina, int codigo, String marca, String nombre, double Precio) {
        super(lineaPequenia, limpieza, clima, cosina, codigo, marca, nombre, Precio);
        this.congelar = congelar;
        this.numeroPuertas = numeroPuertas;
        this.led = led;
        this.temperatura = temperatura;
    }
    
    

    
    public void setCongelar(String congelar) {
        this.congelar = congelar;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getCongelar() {
        return congelar;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getLed() {
        return led;
    }

    public String getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Refrigerador{" + "congelar=" + congelar + ", numeroPuertas=" + numeroPuertas + ", led=" + led + ", temperatura=" + temperatura + '}';
    }

  @Override
    public String instalar() {
        return "La marca " + super.getMarca() + " debe instarlar en el area de cosina especialmente.";
    }

    @Override
    public String configurar() {
         return "El  " + super.getNombre() + " puede configurar la temperatura del cogelador de manera manual.";
    }
   
 
   
    
    
}
