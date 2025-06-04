package PACKAGE_NAME.Utils;

public class Enums {

    // definicion de un enum para dias de la semana

    enum DaysWeek {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    public static void main(String[] args) {

        DaysWeek today = DaysWeek.Miercoles;

        if (today == DaysWeek.Miercoles) {
            System.out.println("Hoy es: " + today);
        } else {
            System.out.println("Hoy no es: " + DaysWeek.Miercoles);
        }

        for (DaysWeek day: DaysWeek.values()) {
            System.out.println(day);
        }
    }
}
