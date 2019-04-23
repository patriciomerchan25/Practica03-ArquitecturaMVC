/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Manual;

/**
 * Electrodomestico es la clase "hija"  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchá
 */
public final class AireAcondicionado extends LineaBlanca implements Manual{
    
       private String condensador;
    private String compresor;
    private String evaporador;
    private String termoestato;

    public AireAcondicionado(String lineaPequenia, String limpieza, String clima, String cosina, int codigo, String marca, String nombre, double Precio) {
        super(lineaPequenia, limpieza, clima, cosina, codigo, marca, nombre, Precio);
    }

    public AireAcondicionado(String condensador, String compresor, String evaporador, String termoestato, String lineaPequenia, String limpieza, String clima, String cosina, int codigo, String marca, String nombre, double Precio) {
        super(lineaPequenia, limpieza, clima, cosina, codigo, marca, nombre, Precio);
        this.condensador = condensador;
        this.compresor = compresor;
        this.evaporador = evaporador;
        this.termoestato = termoestato;
    }
    
    
    
    
    public void setCondensador(String condensador) {
        this.condensador = condensador;
    }

    public void setCompresor(String compresor) {
        this.compresor = compresor;
    }

    public void setEvaporador(String evaporador) {
        this.evaporador = evaporador;
    }

    public void setTermoestato(String termoestato) {
        this.termoestato = termoestato;
    }

    public String getCondensador() {
        return condensador;
    }

    public String getCompresor() {
        return compresor;
    }

    public String getEvaporador() {
        return evaporador;
    }

    public String getTermoestato() {
        return termoestato;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Refrigerador{" + "condensador=" + condensador + ", compresor=" + compresor + ", evaporador=" + evaporador + ", termoestato=" + termoestato + '}';
    }

    @Override
    public String instalar() {
        return "La marca " + super.getMarca() + " debe instarlar en una zona amplia";
    }

    @Override
    public String configurar() {
         return "El  " + super.getNombre() + " puede configurar la temperatura usando su telefono movil.";
    }
    
    
}
