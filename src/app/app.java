/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.time.LocalTime;
import java.util.Scanner;
import servicio.PeliculaService;

/**
 *
 * @author JUAN VILCHEZ
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner consola = new Scanner(System.in);
//        System.out.println("Ingrese hora y minutos");
//        LocalTime horario = LocalTime.parse(consola.nextLine());
//        System.out.println(" "+horario);

          PeliculaService ps = new PeliculaService();
          ps.crearPelicula();
    }
    
}
