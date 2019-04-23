/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
  * LineaBlanca es la clase "padre"  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchán
 
 */
public class LineaBlanca extends Electrodomestico{
    
    private String lineaPequenia;
    private String limpieza;
    private String clima;
    private String cosina;

  
    
     public LineaBlanca(int codigo, String marca, String nombre, double Precio) {
        super(codigo, marca, nombre, Precio);
    }
    
    public LineaBlanca(String lineaPequenia, String limpieza, String clima, String cosina, int codigo, String marca, String nombre, double Precio) {
        super(codigo, marca, nombre, Precio);
        this.lineaPequenia = lineaPequenia;
        this.limpieza = limpieza;
        this.clima = clima;
        this.cosina = cosina;
    }
    
    
    
    
  

    
    
    public void setLineaPequenia(String lineaPequenia) {
        this.lineaPequenia = lineaPequenia;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void setCosina(String cosina) {
        this.cosina = cosina;
    }

    public String getLineaPequenia() {
        return lineaPequenia;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public String getClima() {
        return clima;
    }

    public String getCosina() {
        return cosina;
    }

    @Override
    public String toString() {
        return super.toString()+"\n LineaBlanca{" + "lineaPequenia=" + lineaPequenia + ", limpieza=" + limpieza + ", clima=" + clima + ", cosina=" + cosina + '}';
    }
    
    
    
}
