package com.proyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudiante cuenta = new Estudiante();
        cuenta.setNombre("Santiago");
        cuenta.setId("U00173557");
        cuenta.setHorasLibres(30);

        InfoCuenta infoCuenta = new InfoCuenta(cuenta);

        IngresoUsuario ingresoUsuario = new IngresoUsuario();

        LogisticaEventos logisticaEventos = new LogisticaEventos();

        Evento videoJuegos = new Evento("Competencia Lol"," 28/05/23"," Laboratorio de video juegos ", 23);
        Evento baile = new Evento("Unab fest: evento baile "," 28/05/23"," CSU ", 24 );
        Evento cocina = new Evento("Cocina y juega"," 28/05/23", " CSU ", 26);
        logisticaEventos.agregarEventos(videoJuegos);
        logisticaEventos.agregarEventos(baile);
        logisticaEventos.agregarEventos(cocina);


        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido estudiante " + cuenta.getNombre());
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Registro y login");
        System.out.println("2. Ver cuantas horas libres tienes");
        System.out.println("3. Agregar horas libres");
        System.out.println("4. Eliminar horas libres");
        System.out.println("5. Calcular promedio de horas libres a la semana");
        System.out.println("6. Calcular promedio de horas libres al mes");
        System.out.println("7. Calcular promedio de horas libres a año");
        System.out.println("8. Calcular promedio de horas libres hechas en el semestre");
        System.out.println("9. Ver el intinerario de eventos");
        System.out.println("10. Salir de la Aplicación");


        while(true){
            int input = sc.nextInt();

            switch (input){
                case 1:
                    ingresoUsuario.password();
                    System.out.println("Pon otro numero para realizar otra opcion");
                    break;
                case 2:
                    infoCuenta.verHorasLibres();
                    System.out.println("Pon otro numero para realizar otra opción");
                    break;
                case 3:
                    System.out.println("Cuantas horas libres hiciste demás?");
                    int deposito = sc.nextInt();
                    infoCuenta.actualizarHorasLibres(deposito);
                    infoCuenta.verHorasLibres();
                    System.out.println("Pon otro numero para realizar otra opcion");
                    break;
                case 4:
                    System.out.println("Cuantas horas libres vas a eliminar de tu cuenta?");
                    int retiro = sc.nextInt();
                    infoCuenta.retirarHorasLibres(retiro);
                    infoCuenta.verHorasLibres();
                    System.out.println("Pon otro numero para realizar otra opcion");
                    break;
                case 5:
                    infoCuenta.promedioHorasSemana();
                    System.out.println("Pon otro numero para realizar otra opcion");
                    break;
                case 6:
                    infoCuenta.promedioHorasMes(31);
                    System.out.println("Pon otro numero para realizar otra opcion");
                    break;
                case 7:
                    infoCuenta.promedioHorasAño();
                    System.out.println("Pon otro numero para realizar otra opcion");
                    break;
                case 8:
                    infoCuenta.promedioHorasSemestre();
                    System.out.println("Pon otro numero para realizar otra opcion");
                    break;
                case 9:
                    logisticaEventos.imprimirEventos();
                    System.out.println("Pon otro numero para realizar otra opcion");
                    break;
                case 10:
                    System.out.println("Saliendo de la aplicacion...");
                    System.exit(0);
                default:
                    System.out.println("No es una opcion valida");
                    System.out.println("pon otro numero para realizar otra opcion");
                    break;
            }
        }

    }
}
