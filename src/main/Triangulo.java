package main;

import java.util.Scanner;

public class Triangulo {

    double a[] = new double[2];
    double b[] = new double[2];
    double c[] = new double[2];

    public Triangulo() {
    }

    public void IngresarTriangulo() {

        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese cordanada 1:");
        String separador1 = scan.nextLine();
        String[] cadena1 = separador1.split(",");
        String a1 = cadena1[0];
        String a2 = cadena1[1];
        double asd1 = Double.parseDouble(a1);
        double asd2 = Double.parseDouble(a2);
        a[0] = asd1;
        a[1] = asd2;

        System.out.println("ingrese cordenada 2:");
        String separador2 = scan.nextLine();
        String[] cadena2 = separador2.split(",");
        String a3 = cadena2[0];
        String a4 = cadena2[1];
        b[0] = Double.parseDouble(a3);
        b[1] = Double.parseDouble(a4);

        System.out.println("ingrese cordenada 3:");
        String separador3 = scan.nextLine();
        String[] cadena3 = separador3.split(",");
        String a5 = cadena3[0];
        String a6 = cadena3[1];
        c[0] = Double.parseDouble(a5);
        c[1] = Double.parseDouble(a6);

        double distancia1 = Math.sqrt(Math.pow(a[0] - a[1], 2) + Math.pow(b[0] - b[1], 2));
        double distancia2 = Math.sqrt(Math.pow(b[0] - b[1], 2) + Math.pow(c[0] - c[1], 2));
        double distancia3 = Math.sqrt(Math.pow(a[0] - a[1], 2) + Math.pow(c[0] - c[1], 2));

        if (distancia1 == distancia2 && distancia1 == distancia3) {
            System.err.println("triangulo equilatero");
            calcularPerimetroEquilatero();
            calcularAreaEqui();
        }
        if (distancia1 == distancia2 && distancia1 != distancia3) {
            if (distancia2 == distancia3 && distancia3 != distancia1) {
                if (distancia1 == distancia3 && distancia1 != distancia2) {
                    System.err.println("isoseles");
                }
                System.err.println("isoseles");
            }
            System.err.println("isoseles");
            calcularPerimatroIsoseles();
            calcularAreaIsoseles();
        }
        if (distancia1 != distancia2 && distancia1 != distancia3) {
            System.err.println("Escaleno");
            calcularPerimetroEscaleno();

        }

    }

    public void calcularPerimetroEquilatero() {

        for (int i = 0; i < a.length; i++) {
            float perimetro = (float) (3*a[i]);
            System.out.println("Perimetro:" +perimetro);
            break;

        }
        

       

    }
    
    public void calcularPerimatroIsoseles(){
        for (int i = 0; i < a.length; i++) {
            float perimetro = (float) (c[i] * a[i] + b[i]);
            System.out.println("Perimetro Isosceles:"+perimetro);
            break;
            
        }
    }
    
    public void calcularPerimetroEscaleno(){
        for (int i = 0; i < a.length; i++) {
            float perimetro = (float)(a[i]+b[i]+c[i]);
            System.out.println("Perimetro Escaleno:"+perimetro);
            break;
            
        }
    }
    
    public void calcularAreaEqui(){
        for (int i = 0; i <a.length; i++) {
            double area = Math.sqrt(2)/4*Math.pow(a[i],2);
            System.out.println("Area Equilatero:"+area);
            break;
            
        }
    }
    
    public void calcularAreaIsoseles(){
        for (int i = 0; i < a.length; i++) {
            double area = b[i]*Math.sqrt(Math.pow(a[i], 2)-Math.pow(b[i], 2)/4)/2;
            System.out.println("Area Isoseles:"+area);
            break;
            
        }
    }
    
    

}
