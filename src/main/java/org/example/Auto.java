package org.example;

public class Auto extends Vehiculo {
    //Atributos
    private int numeroPuertas;
    private String tipoCombustible;

    //Constructor
    public Auto() {
        super();
    }

    public Auto(String marca, int Anio, double velocidad, int numeroPuertas, String tipoCombustible) {
        super(marca, Anio, velocidad);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    //Metodos
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad() + 15);
        System.out.println("El auto acelera mas rapido! Velocidad: " + getVelocidad() + " km/h");
    }

    public void mostrarInfo() {
        System.out.println("=== Informacion del Auto ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Año: " + getAnio());
        System.out.println("Numero de puertas: " + numeroPuertas);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Velocidad actual: " + getVelocidad() + " km/h");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + getMarca() + '\'' +
                ", Anio=" + getAnio() +
                ", velocidad=" + getVelocidad() +
                ", numeroPuertas=" + numeroPuertas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }
}