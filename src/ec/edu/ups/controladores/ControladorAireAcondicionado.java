/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.clases.AireAcondicionado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patrick
 */
public class ControladorAireAcondicionado {
    
     private List<AireAcondicionado> lista;
      private int codigo;
    public ControladorAireAcondicionado() {
        lista = new ArrayList<>();
        codigo=0;
    }
    
    public void create(AireAcondicionado objeto){
        
        objeto.setCodigo(codigo);
        codigo++;
        lista.add(objeto);
        
    }
    
    public AireAcondicionado read(int codigo){
        for (AireAcondicionado aireAcondicionado : lista) {
            if(aireAcondicionado.getCodigo() == codigo){
                return aireAcondicionado;
            }
        }
        return null;
    }
    
    public void update(AireAcondicionado objeto){
        for (int i = 0; i < lista.size(); i++) {
            AireAcondicionado elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            AireAcondicionado elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }
    
}
