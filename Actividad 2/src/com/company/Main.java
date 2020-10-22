package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double Cal1,Cal2,Cal3,Cal4,Cal5;
        int promedio;
        String Alumno;

        System.out.println("Ingresa tu nombre: ");
        Alumno=teclado.nextLine();
        System.out.println("Calificacion numero 1:");
        Cal1=teclado.nextDouble();
        System.out.println("Calificacion numero 2:");
        Cal2=teclado.nextDouble();
        System.out.println("Calificacion numero 3:");
        Cal3=teclado.nextDouble();
        System.out.println("Calificacion numero 4:");
        Cal4=teclado.nextDouble();
        System.out.println("Calificacion numero 5:");
        Cal5=teclado.nextDouble();
        promedio=(int) ((Cal1+Cal2+Cal3+Cal4+Cal5)/5);



        System.out.println("Nombre: "+Alumno);
        System.out.println("La calificacion 1 fue: "+Cal1);
        System.out.println("La calificacion 2 fue: "+Cal2);
        System.out.println("La calificacion 3 fue: "+Cal3);
        System.out.println("La calificacion 4 fue: "+Cal4);
        System.out.println("La calificacion 5 fue: "+Cal5);
        System.out.println("Promedio total es: "+promedio);


    }

}

