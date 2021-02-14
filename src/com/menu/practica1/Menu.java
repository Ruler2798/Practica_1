package com.menu.practica1;

import java.util.Scanner;

public class Menu {
    String reporte_html;
//reporte
    public Menu() {
        menu();
        encriptar();
        ataque_con_texto_claro();
    }

    private void menu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("1 Encriptar ");
            System.out.println("2 Desencriptar");
            System.out.println("3 Ataque con texto claro");
            System.out.println("4 Generar reporte");
            System.out.println("5 Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    encriptar();
                    break;
                case 2:
                    //declarar accion
                    break;
                case 3:
                    ataque_con_texto_claro();
                    break;
                case 4:
                    //declarar impresion
                    break;
                case 5:
                    salir = true;
                    break;
            }
        }
    }

    private void encriptar() {
        Scanner sn = new Scanner(System.in);
        boolean regresar = false;
        int opcion;
        while (!regresar) {
            System.out.println("1 Ingrese mensaje ");
            System.out.println("2 Ingreso Matriz A");
            System.out.println("3 Ingreso Matriz B");
            System.out.println("4 Encriptar");
            System.out.println("5 Regresar");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    encriptar_menu();
                    //declarar metodo
                    break;
                case 2:
                    //declarar metodo
                    break;
                case 3:
                    //declarar metodo
                    break;
                case 4:
                    //declarar metodo
                    break;
                case 5:
                    regresar = true;
                    break;
            }
        }
    }

    private void ataque_con_texto_claro() {
        Scanner sn = new Scanner(System.in);
        boolean regresar = false;
        int opcion;
        while (!regresar) {
            System.out.println("1. Ingresar matriz mensaje original ");
            System.out.println("2. Ingresar matriz mensaje cifrado");
            System.out.println("3. Obtener clave ");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    //declarar metodo
                    break;
                case 2:
                    //declarar metodo
                    break;
                case 3:
                    //declarar metodo
                    break;
                case 4:
                    regresar = true;
                    break;
            }
        }
    }

    private void generar_reporte() {
        System.out.println(reporte_html);
    }

    private void encriptar_menu() {
        Scanner im = new Scanner(System.in).useDelimiter("\\n");
        String mensaje;
        System.out.println("Ingrese su mensaje");
        mensaje = im.next();
        System.out.println(mensaje.toLowerCase());
        mensaje = mensaje.toLowerCase(); //minusculas
        int[] contador = new int[mensaje.length()]; // dar una id a cada letra
        for (int i = 0; i < mensaje.length(); i++) {
            char id = mensaje.charAt(i);
            if (id >= 97 && id <= 122) {
                contador[i] = id - 97;
            } else if (id == 164) {
                contador[i] = 14;
            } else if (id >= 111 && id <= 122) {
                contador[i] = -96;
            } else {
                contador[i] = 27;
            }
        }
        for (int i = 0; i < contador.length; i++) {
            System.out.println("ID [" + i + "] = " + contador[i]);
            int var[]; //guardar el id
            var = new int[mensaje.length()];
        }
        System.out.println("La palabra " + mensaje + " contiene " + contador.length + " letras ");
        Matrices(mensaje);
    }

    private void Matrices(String mensaje) {
        int tamano = mensaje.length(); // creacion de matriz
        int filas = 3;
        int columnas = tamano / 3;
        if (tamano % 3 != 0) {
            columnas++;
        }
        int[][] Mmensaje = new int[filas][columnas];
        int contador2 = 0;
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                if (contador2 < tamano) {
                    Mmensaje[i][j] = contador2;
                } else {
                    Mmensaje[i][j] = 24;
                }
                contador2++;
            }
        }
        impresion(Mmensaje, filas, columnas);
    }

    public void impresion(int[][] impresionM, int f, int c) { //impresion dematriz
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(impresionM[i][j] + "\t");
            }
            System.out.println();
        }

    }
}













