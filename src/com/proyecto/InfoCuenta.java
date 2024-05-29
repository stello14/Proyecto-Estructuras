package com.proyecto;

public class InfoCuenta {
    private Estudiante cuenta;


    //CRUD
    public InfoCuenta(Estudiante cuenta){
        this.cuenta = cuenta;
    }

    public void verHorasLibres(){
        System.out.println("Su cantidad de horas libres son: " + cuenta.getHorasLibres());
    }

    public void actualizarHorasLibres(int cantidadHorasLibres){
        cuenta.setHorasLibres(cuenta.getHorasLibres() + cantidadHorasLibres);
    }

    public void retirarHorasLibres(int horasLibresParaEliminar){
        if (horasLibresParaEliminar > cuenta.getHorasLibres()){
            System.out.println("No puedes eliminar esa cantidad de horas libres");
        } else {
            cuenta.setHorasLibres(cuenta.getHorasLibres() - horasLibresParaEliminar);
        }
    }


    //Metodos para las horas libres

    //PromedioSemana
    public void promedioHorasSemana(){
        System.out.println("A la semana realiza : " + (double)cuenta.getHorasLibres()/168 + " horas");
    }

    //PromedioMes
    public void promedioHorasMes(int cantidadDiasDelMes){
        if (cantidadDiasDelMes == 31){
            System.out.println("Al mes realiza : " + (double)cuenta.getHorasLibres()/744 + " horas");
        } else if (cantidadDiasDelMes == 30) {
            System.out.println("Al mes realiza : " + (double)cuenta.getHorasLibres()/720 + " horas");
        } else if (cantidadDiasDelMes == 29) {
            System.out.println("Al mes realiza : " + (double)cuenta.getHorasLibres()/696 + " horas");
        } else {
            System.out.println("Solo hay 3 opciones disponibles: 29,30,31 dias");
        }
    }

    //PromedioAño
    public void promedioHorasAño(){
        System.out.println("Al año realiza: " + (double)cuenta.getHorasLibres()/8760 + " horas");
    }

    //PromedioSemestre
    public void promedioHorasSemestre(){
        System.out.println("Durante el semestre realiza: " + (double)cuenta.getHorasLibres()/2920 + " horas");
    }

    //HorasRestantes
    public void horasRestantes(int horasLibresUnab){
        System.out.println("Horas restantes: " + (horasLibresUnab - cuenta.getHorasLibres()));
    }

    //HorasActuales
    public void horasLibresActuales(){
        System.out.println("Tus horas libres hasta el momento son: " + cuenta.getHorasLibres());
    }



}
