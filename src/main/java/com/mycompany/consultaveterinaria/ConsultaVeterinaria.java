/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consultaveterinaria;

/**
 *
 * @author José Chic
 */
import java.util.ArrayList;

public class ConsultaVeterinaria {
    public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Perro());
        mascotas.add(new Gato());
        mascotas.add(new Conejo());
        mascotas.add(new Tortuga());

        for (Mascota m : mascotas) {
            m.hacerSonido();
            m.descansar();

            if (m instanceof AtencionEspecial) {
                ((AtencionEspecial) m).recibirAtencionEspecial();
            }

            if (m instanceof Vacunable) {
                ((Vacunable) m).vacunar();
            }

            System.out.println(); // Separador visual
        }
    }
}