package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Triangulo f = new Triangulo();
        Paralelogramo p = new Paralelogramo();
        System.out.println("Bienvenido al sistema de figuras");
        while (true) {
            System.out.println("cuantos puntos desea ingresar 3 o 4: ");
            int opcion = Integer.parseInt(scan.nextLine());

            if (opcion == 3) {
                f.IngresarTriangulo();
            } else {
                p.ingresarParalelogramo();
            }

            System.out.println("Desea salir?");
            System.out.println("1.-Continuar ");
            System.out.println("2.-Salir");
            int opcionsalir = Integer.parseInt(scan.nextLine());
            if (opcionsalir == 2) {
                break;
            }
        }

    }

}
