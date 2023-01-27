/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {

    public static void main(String[] args) {
        
        ArrayList <String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
    }

    public static ArrayList<String> obtenerDatos(){
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String pais;
        String opcion;
        while(bandera) {
            System.out.println("Ingrese el nombre de un pais");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Ingrese s para salir");
            opcion = entrada.nextLine();
            if ("s".equals(opcion)) {
                bandera = false;
            }
        }
        return arreglo2;
    }
    
    public static String obtenerCadenaFinal(ArrayList<String> arreglo2){
        String mensaje = "";
        for (int i = 0; i < arreglo2.size(); i++) {
            mensaje = String.format("%s%s\n", mensaje,arreglo2.get(i));
        }
        return mensaje;
    }
    
}
