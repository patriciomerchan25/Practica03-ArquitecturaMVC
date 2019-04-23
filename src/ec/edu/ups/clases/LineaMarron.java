/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Manual;

/**
 * LineaMarron es la clase "padre"  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchán
 */
public class LineaMarron extends Electrodomestico  {
    
    // Atributos de la clase
    private String lineaGrande;
    private String audio;
     private String imagen;
      private String sonido;
    
      
     // generamos el contructor que contien atributos de la clase Electrodomestico 
    public LineaMarron(int codigo, String marca, String nombre, double Precio) {
        super(codigo, marca, nombre, Precio);
    }

    public LineaMarron(String lineaGrande, String audio, String imagen, String sonido, int codigo, String marca, String nombre, double Precio) {
        super(codigo, marca, nombre, Precio);
        this.lineaGrande = lineaGrande;
        this.audio = audio;
        this.imagen = imagen;
        this.sonido = sonido;
    }
    
    
    
    public void setLineaGrande(String lineaGrande) {
        this.lineaGrande = lineaGrande;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getLineaGrande() {
        return lineaGrande;
    }

    public String getAudio() {
        return audio;
    }

    public String getImagen() {
        return imagen;
    }

    public String getSonido() {
        return sonido;
    }

    @Override
    public String toString() {
        return super.toString() +"\n LineaMarron{" + "lineaGrande=" + lineaGrande + ", audio=" + audio + ", imagen=" + imagen + ", sonido=" + sonido + '}';
    }

    
    
    
}
