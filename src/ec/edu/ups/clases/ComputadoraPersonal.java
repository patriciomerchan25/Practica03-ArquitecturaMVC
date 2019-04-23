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
public final class ComputadoraPersonal extends LineaMarron implements Manual{
    
    private String cpu;
    private String monitor;
    private String parlante;
    private String mouse;

    public ComputadoraPersonal(int codigo, String marca, String color, double Precio) {
        super(codigo, marca, color, Precio);
    }

    
    public ComputadoraPersonal(String lineaGrande, String audio, String imagen, String sonido, int codigo, String marca, String color, double Precio) {
        super(lineaGrande, audio, imagen, sonido, codigo, marca, color, Precio);
    }

    public ComputadoraPersonal(String cpu, String monitor, String parlante, String mouse, String lineaGrande, String audio, String imagen, String sonido, int codigo, String marca, String nombre, double Precio) {
        super(lineaGrande, audio, imagen, sonido, codigo, marca, nombre, Precio);
        this.cpu = cpu;
        this.monitor = monitor;
        this.parlante = parlante;
        this.mouse = mouse;
    }
    
    
    

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setParlante(String parlante) {
        this.parlante = parlante;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getParlante() {
        return parlante;
    }

    public String getMouse() {
        return mouse;
    }

    @Override
    public String toString() {
        return super.toString()+"\n ComputadoraPersonal{" + "cpu=" + cpu + ", monitor=" + monitor + ", parlante=" + parlante + ", mouse=" + mouse + '}';
    }
    
    @Override
    public String instalar() {
        return "La marca " + super.getMarca() + "  debe instarlar en un escritorio para mayor comodidad";
    }

    @Override
    public String configurar() {
        return "La  " + super.getNombre() + " puede configurar desde la bios o desde el sistema operativo";
    }
    
    
}
