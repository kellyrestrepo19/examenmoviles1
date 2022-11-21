package org.example.examenmovi;

public class Jugador {

    private String nombre;
    private String apellidos;
    private int edad;
    private int numeroCamiseta;
    private String pocisionJugador;
    private  String equipoDondeJuega;

    public Jugador() {
    }

    public Jugador(String nombre, String apellidos, int edad, int numeroCamiseta, String pocisionJugador, String equipoDondeJuega) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
        this.pocisionJugador = pocisionJugador;
        this.equipoDondeJuega = equipoDondeJuega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPocisionJugador() {
        return pocisionJugador;
    }

    public void setPocisionJugador(String pocisionJugador) {
        this.pocisionJugador = pocisionJugador;
    }

    public String getEquipoDondeJuega() {
        return equipoDondeJuega;
    }

    public void setEquipoDondeJuega(String equipoDondeJuega) {
        this.equipoDondeJuega = equipoDondeJuega;
    }
}

