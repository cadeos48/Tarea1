/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.indiv01;

/**
 *
 * @author Usuario
 */
public class AVMIndiv01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Muestra mi nombre en pantalla
           System.out.println("Me llamo Arturo Vinagre Muñoz");
           System.out.println("Al crear una variable, debemos de comunicar al compilador que tipo de datos va a contener para que reserve la memoria necesaria");
           System.out.println("Si va a contener números enteros, deberemos indicar que dicha variable contendrá ese tipo de datos mediante int");
           System.out.println("Por lo tanto, al escribir en el código fuente int delante del nombre de la variable, estamos indicando al compilador que va a contener datos de tipo entero");
           System.out.println("Así, si definimos la variable como int malaSuerte, estaremos indicando al compilador que la variable malaSuerte es de tipo entero");
           System.out.println("A voy a definir la variable entera malaSuerte y le voy a asignar el valor entero 13, para que se escriba dicho valor en pantalla");
           int malaSuerte = 13;
           System.out.println(malaSuerte);

    }
    
}
