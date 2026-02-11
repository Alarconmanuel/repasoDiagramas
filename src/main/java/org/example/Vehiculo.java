package org.example;

public class Vehiculo implements Transporte {
    //Atributos
    private String marca;
    private int anio;
    private double velocidad;

    //Constructor
    public Vehiculo() {
    }

    public Vehiculo(String marca, int anio, double velocidad) {
        this.marca = marca;
        this.anio = anio;
        this.velocidad = velocidad;
    }

    //Metodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        this.velocidad += 10;
        System.out.println("Acelerando... Velocidad: " + velocidad + " km/h");
    }

    public void frenar() {
        if(velocidad >= 10) {
            this.velocidad -= 10;
        } else {
            this.velocidad = 0;
        }
        System.out.println("Frenando... Velocidad: " + velocidad + " km/h");
    }

    @Override
    public void arrancar() {
        System.out.println("El vehiculo " + marca + " ha arrancado");
    }

    @Override
    public void detener() {
        this.velocidad = 0;
        System.out.println("El vehiculo " + marca + " se ha detenido");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", anio=" + anio +
                ", velocidad=" + velocidad +
                '}';
    }
}