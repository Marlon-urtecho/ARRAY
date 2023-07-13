package aplicacionReservaciones;
abstract class Reservaciones {
    private String nombre;
    private int cantidadPersonas;
    private int tipoHabitacion;

    public Reservaciones(String nombre, int cantidadPersonas, int tipoHabitacion) {
        this.nombre = nombre;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoHabitacion = tipoHabitacion;
    }

public String getNombre() {
   return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(int tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public abstract void presupuestarEstadia();
}
