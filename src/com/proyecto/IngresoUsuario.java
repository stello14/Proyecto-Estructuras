package com.proyecto;

import java.util.Scanner;

public class IngresoUsuario {

    void password(){

        //Creando password y usuario
        System.out.println("Dame tu id, ese va a ser tu usuario");
        Scanner scanner = new Scanner(System.in);
        String usuarionuevo = scanner.nextLine();

        System.out.println("Dame una contraseña: ");
        Scanner sc = new Scanner(System.in);
        String contraseñaNueva = sc.nextLine();


        //Pidiendo la información
        System.out.println("Escribe tu id: ");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();

        System.out.println("pon tu contraseña: ");
        Scanner input = new Scanner(System.in);
        String contraseña = input.nextLine();

        //Verificamos que coincidan
        while(!contraseñaNueva.equals(contraseña) || !usuarionuevo.equals(usuario)){
            System.out.println("Contraseña o usuario incorrecto, intentalo de nuevo");
            contraseña = input.nextLine();
            usuario = scan.nextLine();
        }
        //Si coinciden
        System.out.println("Ingresando...");
    }
    }

