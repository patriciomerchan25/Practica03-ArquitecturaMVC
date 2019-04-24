package ec.edu.ups.vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ec.edu.ups.clases.AireAcondicionado;
import ec.edu.ups.clases.ComputadoraPersonal;
import ec.edu.ups.clases.Refrigerador;
import ec.edu.ups.clases.Televisor;
import ec.edu.ups.controladores.ControladorAireAcondicionado;
import ec.edu.ups.controladores.ControladorComputadora;
import ec.edu.ups.controladores.ControladorRefrigerador;
import ec.edu.ups.controladores.ControladorTelevisor;
import java.util.Scanner;

/**
 * 
 * @author Patricio Merchán
 */
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        Scanner letra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        int opcionMenuPrincipal = 0;
        int opcionMenuAire = 0;
        int opcionMenuRefrigerador = 0;
        int opcionMenuComputador = 0;
        int opcionMenuTelevisor = 0;
        
        ControladorAireAcondicionado controladorAire = new ControladorAireAcondicionado();
        ControladorComputadora controladorComputadora=new ControladorComputadora();
        ControladorRefrigerador controladorRefrigerador=new ControladorRefrigerador();
        ControladorTelevisor controladorTelevisor=new ControladorTelevisor();
        
         do{
                    
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Aire Acondicionado");
            System.out.println("2. CRUD Regrigerador");
            System.out.println("3. CRUD Computador");
            System.out.println("4. CRUD Televisor");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcionMenuPrincipal = entrada.nextInt();
            
            switch(opcionMenuPrincipal){
                case 1: 
                    //opcion para el crud aire acondicionado
                    do{
                        System.out.println("MENU AIRE ACONDICIONADO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuAire = entrada.nextInt();
                        
                        switch(opcionMenuAire){
                            case 1:
                                //create pide todos los datos por teclado, instancia un objeto,llama al metodo create del controlador
                                System.out.println("ingrese el condensador");
                                String condensador=letra.nextLine();
                                System.out.println("ingrese el compresor");
                                String compresor=letra.nextLine();
                                System.out.println("ingrese el evaporador");
                                String evaporador=letra.nextLine();
                                System.out.println("ingrese el termoestato");
                                String termoestato=letra.nextLine();
                                System.out.println("ingrese la lineaPequenia");
                                String lineaPequenia=letra.nextLine();
                                System.out.println("ingrese  limpieza");
                                String limpieza=letra.nextLine();
                                System.out.println("ingrese el clima");
                                String clima=letra.nextLine();
                                System.out.println("ingrese cosina");
                                String cosina=letra.nextLine();
                                
                                System.out.println("ingrese la marca");
                                String marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                String nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                double precio=num.nextDouble();
                                
                              
                                 AireAcondicionado objeto=new AireAcondicionado(condensador, compresor, evaporador, termoestato, lineaPequenia,
                                        limpieza, clima, cosina, 0, marca, nombre, precio);
                                        
                                controladorAire.create(objeto);
                                break;
                            case 2:
                                //read //pide el codigo por teclado //llama al metodo read del controlador//visualizo los datos del objeto
                                System.out.println("ingrese el codigo del Aire Acondicionado");
                                int codigoRead=num.nextInt();
                                System.out.println(controladorAire.read(codigoRead));
                                
                                break;
                            case 3:
                                //update//pide todos los datos por teclado//instancia un objeto //llama al metodo update del controlador
                                System.out.println("ingrese el codigo del Aire Acondicionado");
                                codigoRead=num.nextInt();
                                if (controladorAire.read(codigoRead) != null) {
                                    System.out.println("ingrese el condensador");
                                 condensador=letra.nextLine();
                                System.out.println("ingrese el compresor");
                                compresor=letra.nextLine();
                                System.out.println("ingrese el evaporador");
                                evaporador=letra.nextLine();
                                System.out.println("ingrese el termoestato");
                                termoestato=letra.nextLine();
                                System.out.println("ingrese la lineaPequenia");
                                lineaPequenia=letra.nextLine();
                                System.out.println("ingrese  limpieza");
                                 limpieza=letra.nextLine();
                                System.out.println("ingrese el clima");
                                clima=letra.nextLine();
                                System.out.println("ingrese cosina");
                                cosina=letra.nextLine();
                                
                                System.out.println("ingrese la marca");
                                marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                precio=num.nextDouble();
                                
                              
                               objeto=new AireAcondicionado(condensador, compresor, evaporador, termoestato, lineaPequenia,
                                        limpieza, clima, cosina, 0, marca, nombre, precio);
                               objeto.setCodigo(codigoRead);
                               controladorAire.update(objeto);
                                }else {
                                    System.out.println("El Aire Acondicionado no existe");
                                }
                               
                                break;
                            case 4:
                                //delete//pide el codigo por teclado //llama al metodo delete del controlador
                                System.out.println("ingrese el codigo del Aire Acondicionado que desea Eliminar");
                                codigoRead=num.nextInt();
                                controladorAire.delete(codigoRead);
                               
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuAire !=5);
                    break;
                case 2:
                    do{
                    //opcion para el crud de refrigerador
                    System.out.println("MENU REFRIGERADOR");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Imprimir");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuRefrigerador = entrada.nextInt();
                    
                        switch(opcionMenuRefrigerador){
                            case 1:
                                //create pide todos los datos por teclado, instancia un objeto,llama al metodo create del controlador
                                 System.out.println("ingrese el congelador");
                                String congelar=letra.nextLine();
                                System.out.println("ingrese el numero de Puertas");
                                String numeroPuertas=letra.nextLine();
                                System.out.println("ingrese el led ");
                                String led=letra.nextLine();
                                System.out.println("ingrese la temperatura");
                                String temperatura=letra.nextLine();
                                System.out.println("ingrese la lineaPequenia");
                                String lineaPequenia=letra.nextLine();
                                System.out.println("ingrese  limpieza");
                                String limpieza=letra.nextLine();
                                System.out.println("ingrese el clima");
                                String clima=letra.nextLine();
                                System.out.println("ingrese cosina");
                                String cosina=letra.nextLine();
                                
                                System.out.println("ingrese la marca");
                                String marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                String nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                double precio=num.nextDouble();
                                Refrigerador objeto=new Refrigerador(congelar, numeroPuertas, led, temperatura, 
                                        lineaPequenia, limpieza, clima, cosina, 0, marca, nombre, precio);
                                controladorRefrigerador.create(objeto);
                                
                                break;
                            case 2:
                                //read //pide el codigo por teclado //llama al metodo read del controlador//visualizo los datos del objeto
                                System.out.println("Ingrese el el codigo del Refrigerador");
                                int codigoRead = num.nextInt();
                                System.out.println(controladorRefrigerador.read(codigoRead));
                                
                                break;
                            case 3:
                                //update//pide todos los datos por teclado//instancia un objeto //llama al metodo update del controlador
                                System.out.println("Ingrese el codigo del Refrigerador");
                                codigoRead = num.nextInt();
                                 if (controladorRefrigerador.read(codigoRead) != null) {
                                    System.out.println("ingrese el congelar");
                                 congelar=letra.nextLine();
                                System.out.println("ingrese el numero de Puertas");
                                numeroPuertas=letra.nextLine();
                                System.out.println("ingrese el led");
                                led=letra.nextLine();
                                System.out.println("ingrese la temperatura");
                                temperatura=letra.nextLine();
                                System.out.println("ingrese la lineaPequenia");
                                lineaPequenia=letra.nextLine();
                                System.out.println("ingrese  limpieza");
                                 limpieza=letra.nextLine();
                                System.out.println("ingrese el clima");
                                clima=letra.nextLine();
                                System.out.println("ingrese cosina");
                                cosina=letra.nextLine();
                                
                                System.out.println("ingrese la marca");
                                marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                precio=num.nextDouble();
                                
                              
                               objeto=new Refrigerador(congelar, numeroPuertas, led, temperatura, 
                                        lineaPequenia, limpieza, clima, cosina, 0, marca, nombre, precio);
                               objeto.setCodigo(codigoRead);
                               controladorRefrigerador.update(objeto);
                                 }else {
                                    System.out.println("El Refrigerador no existe");
                                }
                               
                                break;
                            case 4:
                                //delete//pide el codigo por teclado //llama al metodo delete del controlador
                                 System.out.println("Ingrese el codigo del Refrigerador");
                                codigoRead = num.nextInt();
                                controladorRefrigerador.delete(codigoRead);
                               
                                break;
                            case 5:
                                //imprimir
                                controladorRefrigerador.imprimir();
                                break;
                            case 6:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuRefrigerador !=6);
                    break;
                case 3:
                    do{
                    //opcion para el crud de computador
                    System.out.println("MENU COMPUTADOR");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Imprimir");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuComputador = entrada.nextInt();
                    
                        switch(opcionMenuComputador){
                            case 1:
                                //create pide todos los datos por teclado, instancia un objeto,llama al metodo create del controlador
                                 System.out.println("ingrese el cpu");
                                String cpu=letra.nextLine();
                                System.out.println("ingrese el monitor");
                                String monitor=letra.nextLine();
                                System.out.println("ingrese el parlante ");
                                String parlante=letra.nextLine();
                                System.out.println("ingrese el mouse");
                                String mouse=letra.nextLine();
                                System.out.println("ingrese la linea Grande");
                                String lineaGrande=letra.nextLine();
                                System.out.println("ingrese  el audio");
                                String audio=letra.nextLine();
                                System.out.println("ingrese la imagen");
                                String imagen=letra.nextLine();
                                System.out.println("ingrese el sonido");
                                String sonido=letra.nextLine();
                                
                                System.out.println("ingrese la marca");
                                String marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                String nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                double precio=num.nextDouble();
                                ComputadoraPersonal objeto=new ComputadoraPersonal(cpu, monitor, parlante, mouse, lineaGrande, audio, 
                                        imagen, sonido, 0, marca, nombre, precio);
                                controladorComputadora.create(objeto);
                                break;
                            case 2:
                                //read //pide el codigo por teclado //llama al metodo read del controlador//visualizo los datos del objeto
                                System.out.println("Ingrese el codigo del Computador");
                                int codigoRead = num.nextInt();
                                System.out.println(controladorComputadora.read(codigoRead));
                               
                                
                                break;
                            case 3:
                                //update//pide todos los datos por teclado//instancia un objeto //llama al metodo update del controlador
                                System.out.println("Ingrese el codigo del Computador");
                                 codigoRead = num.nextInt();
                                if (controladorComputadora.read(codigoRead) != null) {
                                System.out.println("ingrese el cpu");
                                 cpu=letra.nextLine();
                                System.out.println("ingrese el monitor");
                                 monitor=letra.nextLine();
                                System.out.println("ingrese el parlante ");
                                 parlante=letra.nextLine();
                                System.out.println("ingrese el mouse");
                                 mouse=letra.nextLine();
                                System.out.println("ingrese la linea Grande");
                                 lineaGrande=letra.nextLine();
                                System.out.println("ingrese  el audio");
                                 audio=letra.nextLine();
                                System.out.println("ingrese la imagen");
                                 imagen=letra.nextLine();
                                System.out.println("ingrese el sonido");
                                 sonido=letra.nextLine();
                                
                                System.out.println("ingrese la marca");
                                marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                precio=num.nextDouble();
                                
                                 objeto=new ComputadoraPersonal(cpu, monitor, parlante, mouse, lineaGrande, audio, 
                                        imagen, sonido, 0, marca, nombre, precio);
                                 objeto.setCodigo(codigoRead);
                                 controladorComputadora.update(objeto);
                                }else {
                                    System.out.println("El Computador no existe");
                                }
                              
                                break;
                            case 4:
                                //delete//pide el codigo por teclado //llama al metodo delete del controlador
                                System.out.println("Ingrese el codigo del Computador");
                                 codigoRead = num.nextInt();
                                 controladorComputadora.delete(codigoRead);
                               
                                break;
                            case 5:
                                //imprimir
                                controladorComputadora.imprimir();
                                break;
                            case 6:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                    }while(opcionMenuComputador !=6);
                    break;
                case 4:
                    do{
                    //opcion para el crud de televisor
                    System.out.println("MENU TELEVISOR");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Imprimir");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuTelevisor = entrada.nextInt();
                    
                        switch(opcionMenuTelevisor){
                            case 1:
                                //create pide todos los datos por teclado, instancia un objeto,llama al metodo create del controlador
                                  System.out.println("ingrese el control");
                                String control=letra.nextLine();
                                System.out.println("ingrese el largo");
                                String largo=letra.nextLine();
                                System.out.println("ingrese el ancho ");
                                String ancho=letra.nextLine();
                                System.out.println("ingrese el hdmi");
                                String hdmi=letra.nextLine();
                                System.out.println("ingrese la linea Grande");
                                String lineaGrande=letra.nextLine();
                                System.out.println("ingrese  el audio");
                                String audio=letra.nextLine();
                                System.out.println("ingrese la imagen");
                                String imagen=letra.nextLine();
                                System.out.println("ingrese el sonido");
                                String sonido=letra.nextLine();
                                
                                System.out.println("ingrese la marca");
                                String marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                String nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                double precio=num.nextDouble();
                                Televisor objeto=new Televisor(control, largo, ancho, hdmi, lineaGrande, audio, imagen, sonido, 0
                                        , marca, nombre, precio);
                                controladorTelevisor.crear(objeto);
                                break;
                            case 2:
                                //read //pide el codigo por teclado //llama al metodo read del controlador//visualizo los datos del objeto
                                System.out.println("Ingrese el codigo del Televisor");
                                 int codigoRead = num.nextInt();
                                 System.out.println(controladorTelevisor.read(codigoRead));
                                
                                break;
                            case 3:
                                //update//pide todos los datos por teclado//instancia un objeto //llama al metodo update del controlador
                                  System.out.println("Ingrese el codigo del Televisor");
                                  codigoRead = num.nextInt();
                                if (controladorTelevisor.read(codigoRead) != null) {
                                    System.out.println("ingrese el control");
                                 control=letra.nextLine();
                                System.out.println("ingrese el largo");
                                 largo=letra.nextLine();
                                System.out.println("ingrese el ancho ");
                                 ancho=letra.nextLine();
                                System.out.println("ingrese el hdmi");
                                 hdmi=letra.nextLine();
                                System.out.println("ingrese la linea Grande");
                                 lineaGrande=letra.nextLine();
                                System.out.println("ingrese  el audio");
                                 audio=letra.nextLine();
                                System.out.println("ingrese la imagen");
                                 imagen=letra.nextLine();
                                System.out.println("ingrese el sonido");
                                 sonido=letra.nextLine();
                                
                                System.out.println("ingrese la marca");
                                marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                precio=num.nextDouble();
                                
                                objeto=new Televisor(control, largo, ancho, hdmi, lineaGrande, audio, imagen, sonido, 0
                                        , marca, nombre, precio);
                                objeto.setCodigo(codigoRead);
                                controladorTelevisor.update(objeto);
                                }else {
                                    System.out.println("El Televisor no existe");
                                }
                                
                               
                                break;
                            case 4:
                                //delete//pide el codigo por teclado //llama al metodo delete del controlador
                                System.out.println("Ingrese el codigo del Televisor");
                                  codigoRead = num.nextInt();
                                  controladorTelevisor.delete(codigoRead);
                               
                                break;
                                case 5:
                                //imprimir
                                    controladorTelevisor.imprimir();
                                
                                break;
                            case 6:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                    }while(opcionMenuTelevisor !=5);
                    break;
                case 5:
                    //opcion para salir
                    System.out.println("Adiós !!!");
                    break;
            }
        }while(opcionMenuPrincipal != 5);
        
        
    }
}
