
package main;

import java.util.Scanner;


public class Paralelogramo extends Triangulo{
    double a [] = new double [2];
    double b [] = new double [2];
    double c [] = new double [2];
    double d [] = new double [2];

    Scanner scan = new Scanner(System.in);
    
    public void ingresarParalelogramo(){
        System.out.println("ingrese cordanada 1:");
        String separador1 = scan.nextLine();
        String[] cadena1 = separador1.split(",");
        String a1 = cadena1[0];
        String a2 = cadena1[1];
        double asd1 = Double.parseDouble(a1);
        double asd2 = Double.parseDouble(a2);
        a [0] = asd1;
        a [1] = asd2;
        
        System.out.println("ingrese cordenada 2:");
        String separador2 = scan.nextLine();
        String[] cadena2 = separador2.split(",");
        String a3 = cadena2[0];
        String a4 = cadena2[1];
        b [0] = Double.parseDouble(a3);
        b [1] = Double.parseDouble(a4);

        System.out.println("ingrese cordenada 3:");
        String separador3 = scan.nextLine();
        String[] cadena3 = separador3.split(",");
        String a5 = cadena3[0];
        String a6 = cadena3[1];
        c [0] = Double.parseDouble(a5);
        c [1] = Double.parseDouble(a6);
        
        System.out.println("ingrese cordenada 3:");
        String separador4 = scan.nextLine();
        String[] cadena4 = separador4.split(",");
        String a7 = cadena3[0];
        String a8 = cadena3[1];
        d [0] = Double.parseDouble(a7);
        d [1] = Double.parseDouble(a8);
    
        double distancia1 = Math.sqrt(Math.pow(a[0]-a[1],2)+Math.pow(b[0]-b[1],2));
        double distancia2 = Math.sqrt(Math.pow(b[0]-b[1],2)+Math.pow(c[0]-c[1],2));
        double distancia3 = Math.sqrt(Math.pow(d[0]-d[1],2)+Math.pow(c[0]-c[1],2));
        double distancia4 = Math.sqrt(Math.pow(d[0]-d[1],2)+Math.pow(a[0]-a[1],2));
        
        if(distancia1 == distancia3 && distancia2 == distancia4 ){
            System.out.println("cuadrado");
        }
        
    }

    
    
    
    
}
