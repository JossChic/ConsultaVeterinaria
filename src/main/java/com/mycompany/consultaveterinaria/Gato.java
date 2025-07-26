/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultaveterinaria;

/**
 *
 * @author José Chic
 */
public class Gato extends Mascota implements Vacunable {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: Miau miau");
    }

    @Override
    public void vacunar() {
        System.out.println("El gato ha sido vacunado.");
    }
}
