/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alumno;

/**
 *
 * @author Daniel Noriega R
 */
import java.util.Scanner;

public class Alumno {
    String nombre;
    int[] calificaciones;

    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int cal : calificaciones) {
            suma += cal;
        }
        return (double) suma / calificaciones.length;
    }

    public char CalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados(double promedio, char calificacionFinal) {
        System.out.println("******************");
        System.out.println("--- Resultados ---");
        System.out.println("Nombre Alumno: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Calificacion promedio: " + promedio);
        System.out.println("Calificacion Final: " + calificacionFinal);
        System.out.println("******************");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingrese el nombre de alumno: ");
        String nombre = scanner.nextLine();

        // Solicitar calificaciones
        int[] calificaciones = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        // Crear objeto alumno
        Alumno alumno = new Alumno(nombre, calificaciones);

        // Procesar resultados
        double promedio = alumno.calcularPromedio();
        char calFinal = alumno.CalificacionFinal(promedio);

        // Mostrar resultados
        alumno.imprimirResultados(promedio, calFinal);

        scanner.close();
    }
}
