package org.example;

public class AutoElectrico extends Vehiculo implements Electrico {
    //Atributos
    private int autonomia;
    private double nivelBateria;

    //Constructor
    public AutoElectrico() {
        super();
    }

    public AutoElectrico(String marca, int anio, double velocidad, int autonomia, double nivelBateria) {
        super(marca, anio, velocidad);
        this.autonomia = autonomia;
        this.nivelBateria = nivelBateria;
    }

    //Metodos
    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void cargar() {
        this.nivelBateria = 100.0;
        System.out.println("Auto electrico cargado al 100%");
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad() + 20);
        this.nivelBateria -= 2;
        System.out.println("Auto electrico acelerando! Velocidad: " + getVelocidad() + " km/h - Bateria: " + nivelBateria + "%");
    }

    public void mostrarInfo() {
        System.out.println("=== Informacion del Auto Electrico ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Año: " + getAnio());
        System.out.println("Autonomia: " + autonomia + " km");
        System.out.println("Nivel de bateria: " + nivelBateria + "%");
        System.out.println("Velocidad actual: " + getVelocidad() + " km/h");
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "marca='" + getMarca() + '\'' +
                ", anio=" + getAnio() +
                ", velocidad=" + getVelocidad() +
                ", autonomia=" + autonomia +
                ", nivelBateria=" + nivelBateria +
                '}';
    }
}