package org.example;

public class Dispositivo implements Transporte {
    //Atributos
    private String modelo;
    private boolean esElectrico;

    //Constructor
    public Dispositivo() {
    }

    public Dispositivo(String modelo, boolean esElectrico) {
        this.modelo = modelo;
        this.esElectrico = esElectrico;
    }

    //Metodos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isElectrico() {
        return esElectrico;
    }

    public void setElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public void encender() {
        System.out.println("Dispositivo " + modelo + " encendido");
    }

    public void apagar() {
        System.out.println("Dispositivo " + modelo + " apagado");
    }

    @Override
    public void arrancar() {
        if(esElectrico) {
            System.out.println("Dispositivo electrico " + modelo + " iniciado");
        } else {
            System.out.println("Dispositivo " + modelo + " arrancado");
        }
    }

    @Override
    public void detener() {
        System.out.println("Dispositivo " + modelo + " detenido");
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "modelo='" + modelo + '\'' +
                ", esElectrico=" + esElectrico +
                '}';
    }
}