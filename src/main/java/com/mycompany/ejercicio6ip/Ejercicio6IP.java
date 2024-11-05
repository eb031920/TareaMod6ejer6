
package com.mycompany.ejercicio6ip;
//Copyright:Ruth Bautista(202320050047).
//Este programa define dos arreglos: uno para los nombres de los estudiantes 
// y otro para sus respectivas notas.Se Utiliza un bucle for para recorrer ambos 
// arreglos y muestra el nombre y la nota de cada estudiante, indicando si 
// está "Aprobado" o "Reprobado" según su nota (70 o más para aprobar).
public class Ejercicio6IP {

     public static void main(String[] args) {
        
        String[] nombres = {"Ana", "Lisny", "Juan", "Mario"};
        int[] notas = {65, 89, 72, 55};

        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
            System.out.println(notas[i]);

            if (notas[i] >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }

            System.out.println(); 
        }
    }
}
