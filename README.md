# Practica03-ArquitecturaMVC
Practica 3 POO JAVA
1. Crear un repositorio en GitHub con el nombre   “Práctica 03 – Arquitectura MVC”.
![image](https://user-images.githubusercontent.com/49033556/56704486-e7d25f80-66d2-11e9-9ad5-c9c707b38770.png)
2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar varios commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub). 
![image](https://user-images.githubusercontent.com/49033556/56704555-2ec05500-66d3-11e9-988b-3541a6ed4ef2.png)
3. Crear un paquete para los controladores y un paquete para la vista. 

![image](https://user-images.githubusercontent.com/49033556/56704613-6929f200-66d3-11e9-8b7f-f7fb84d90914.png)




 4. Crear un controlador por cada clase hija. En total, cuatro controladores. 
 
![image](https://user-images.githubusercontent.com/49033556/56704676-abebca00-66d3-11e9-96b2-f0a6206d5267.png)

 5. Al menos una clase Controlador debe ser implementada usando la interface List y la clase ArrayList.
 
 
![image](https://user-images.githubusercontent.com/49033556/56704734-e5bcd080-66d3-11e9-8b8a-e68946b27e0c.png)

6. Al menos una clase Controlador debe ser   implementada usando la interface Set y la clase HashSet.

![image](https://user-images.githubusercontent.com/49033556/56704779-13097e80-66d4-11e9-9f2f-ede22789c936.png)

7. Al menos una clase Controlador debe ser implementada usando la interface SortedSet y la clase  
   TreeSet. 
   
   
![image](https://user-images.githubusercontent.com/49033556/56704837-4a782b00-66d4-11e9-8b5b-3efe14b463b1.png)

 8. Al menos una clase Controlador debe ser implementada usando la interface Map y la clase HashMap o la interface Map y la clase TreeMap. 
 
 ![image](https://user-images.githubusercontent.com/49033556/56704903-8a3f1280-66d4-11e9-93ea-b5c58718b460.png)

 9. Crear una clase “Principal”, en donde se demostrará el funcionamiento del sistema completo a través de la consola de java, usando menús y submenús para acceder a las opciones.  
 
 
![image](https://user-images.githubusercontent.com/49033556/56705020-ed30a980-66d4-11e9-9093-a010e2656366.png)

![image](https://user-images.githubusercontent.com/49033556/56705039-00dc1000-66d5-11e9-8a7e-6d0df302b384.png)

11. Desarrollar el diagrama de clases correspondiente usando la herramienta LucidChart. Se debe agregar las clases controladores y la clase “Principal”. 

![image](https://user-images.githubusercontent.com/49033556/56705106-35e86280-66d5-11e9-9a17-4765783c2588.png)

RESULTADO(S) OBTENIDO(S):

Cuando selecciona la opción 1 es donde vamos crear un nuevo Aire Acondicionado.
![image](https://user-images.githubusercontent.com/49033556/56705163-78aa3a80-66d5-11e9-92fd-ad6ef424365c.png)

Cuando selecciona la opción 2 lee los datos Ingresados.
![image](https://user-images.githubusercontent.com/49033556/56705184-8e1f6480-66d5-11e9-926f-a0c49e676d96.png)

Cuando selecciona la opción 3 actualiza los datos buscando por el código.
![image](https://user-images.githubusercontent.com/49033556/56705221-b73ff500-66d5-11e9-85bf-b9bfbe189858.png)

Cuando selecciona la opción 4 elimina los datos ingresando el código y confirmamos con el read que nos da null.
![image](https://user-images.githubusercontent.com/49033556/56705458-93c97a00-66d6-11e9-9df1-68efdd763cc3.png)


Cuando selecciona la opción 5 imprime el nombre del Aire Acondicionado Ingresado.

![image](https://user-images.githubusercontent.com/49033556/56705529-de4af680-66d6-11e9-86ca-c718d29c59ce.png)

Cuando selecciona la opción 6 regresa al Menú principal.

![image](https://user-images.githubusercontent.com/49033556/56705568-0b97a480-66d7-11e9-89dd-0b7575bc09bb.png)

Link: https://github.com/patriciomerchan25/Practica03-ArquitecturaMVC

CONCLUSIONES:

En esta práctica 3 aplicamos 4 Interfases distintas la cual los aplicamos para cada controlador y cada una de ellas tiene sus ventajas como interfaz Set o SortedSet y Map como la de ordenar de forma natural, no permite ingresar atributos repetidos, la cual debemos implementar de acuerdo al atributo  que  tengamos las cuales son equals, hashcode, compareTo.
Cada Interfaz se implemento con el Crud la cual sus métodos cambiaron un poco como del Map.

RECOMENDACIONES:

El Modelo Vista Controlador tiene grandes ventajas por que a la hora de hacer el Crud  no se implementa directamente en las clase Abuelo, Padres o Hijas,  para ello se crea los controladores donde creamos todos los métodos y las Interfases. 

