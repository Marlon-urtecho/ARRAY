package aplicacionReservaciones;

class HuespedHabitaciones extends Reservaciones {
    private boolean habitacionOcupada;

    public HuespedHabitaciones(String nombre, int cantidadPersonas, int tipoHabitacion, boolean habitacionOcupada) {
        super(nombre, cantidadPersonas, tipoHabitacion);
        this.habitacionOcupada = habitacionOcupada;
    }

    @Override
    public void presupuestarEstadia() {
        double costoEstadia = calcularCostoEstadia();
        System.out.println("Presupuesto de estadia para el huésped: " + getNombre());
        System.out.println("Costo total de la estadía: $" + costoEstadia);
    }

    protected double calcularCostoEstadia() {
        double costoHabitacion = 0;

        switch (getTipoHabitacion()) {
            case 1: // Habitación sencilla
                costoHabitacion = 35;
                break;
            case 2: // Habitación doble
                costoHabitacion = 50;
                break;
            case 3: // Habitación triple
                costoHabitacion = 80;
                break;
        }

        return costoHabitacion * getCantidadPersonas();
    }

    public boolean isHabitacionOcupada() {
        return habitacionOcupada;
    }

    public void setHabitacionOcupada(boolean habitacionOcupada) {
        this.habitacionOcupada = habitacionOcupada;
    }
}
