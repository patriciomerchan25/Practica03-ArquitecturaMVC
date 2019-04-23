/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Manual;

/**
 *
 * Electrodomestico es la clase "hija"  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchá
 */
public final class Televisor extends LineaMarron implements Manual{
    private String control;
    private String largo;
    private String ancho;
    private String hdmi;

    public Televisor(int codigo, String marca, String color, double Precio) {
        super(codigo, marca, color, Precio);
    }
    
    public Televisor(String lineaGrande, String audio, String imagen, String sonido, int codigo, String marca, String nombre, double Precio) {
        super(lineaGrande, audio, imagen, sonido, codigo, marca, nombre, Precio);
    }

    public Televisor(String control, String largo, String ancho, String hdmi, String lineaGrande, String audio, String imagen, String sonido, int codigo, String marca, String nombre, double Precio) {
        super(lineaGrande, audio, imagen, sonido, codigo, marca, nombre, Precio);
        this.control = control;
        this.largo = largo;
        this.ancho = ancho;
        this.hdmi = hdmi;
    }

    
    
    public void setControl(String control) {
        this.control = control;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public void setHdmi(String hdmi) {
        this.hdmi = hdmi;
    }

    public String getControl() {
        return control;
    }

    public String getLargo() {
        return largo;
    }

    public String getAncho() {
        return ancho;
    }

    public String getHdmi() {
        return hdmi;
    }

     @Override
    public String instalar() {
        return "La marca " + super.getMarca() + "  debe instarlar lugar de menos humedad y no al alcanse de los niños";
    }

    @Override
    public String configurar() {
        return "El  " + super.getNombre() + " puede configurar con el control remoto deacuerdo a su nesesidad";
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"\n Televisor{" + "control=" + control + ", largo=" + largo + ", ancho=" + ancho + ", hdmi=" + hdmi + '}';
    }

   
    
    
    
}
