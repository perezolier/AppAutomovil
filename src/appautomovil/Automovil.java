/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appautomovil;

/**
 *
 * @author JAPO
 */
public class Automovil {

    public String marcasAutos[] = new String[6];

    public void verMarcas() {

        this.marcasAutos[0] = "Renailt";
        this.marcasAutos[1] = "Chevrolet";
        this.marcasAutos[2] = "Mazda";
        this.marcasAutos[3] = "Ford";
        this.marcasAutos[4] = "Audi";
        this.marcasAutos[5] = "BMW";

        for (int contador = 0; contador < 6; contador++) {
            System.out.println("Marca en la posición: " + contador + " es: " + this.marcasAutos[contador]);

        }//fin de la clase Automovil

    }

}
