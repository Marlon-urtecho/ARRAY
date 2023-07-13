package aplicacionReservaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del huésped: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();

        System.out.print("Ingrese el tipo de habitación (1: Sencilla, 2: Doble, 3: Triple): ");
        int tipoHabitacion = scanner.nextInt();

        System.out.print("¿La habitación está ocupada? (true/false): ");
        boolean habitacionOcupada = scanner.nextBoolean();

        HuespedHabitaciones huesped = new HuespedHabitaciones(nombre, cantidadPersonas, tipoHabitacion, habitacionOcupada);
        huesped.presupuestarEstadia();

        // ...
        // Resto del código para crear y procesar otras reservaciones
    }
}
