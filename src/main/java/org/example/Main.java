package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(" SISTEMA DE TRANSPORTE \n");

        //Crear un Auto
        Auto auto1 = new Auto("Toyota", 2024, 0, 4, "Gasolina");
        auto1.arrancar();
        auto1.acelerar();
        auto1.acelerar();
        auto1.mostrarInfo();
        auto1.detener();
        System.out.println(auto1.toString());

        System.out.println("\n Auto Electrico \n");

        //Crear un Auto Electrico
        AutoElectrico tesla = new AutoElectrico("Tesla", 2024, 0, 500, 80.0);
        tesla.arrancar();
        tesla.acelerar();
        tesla.acelerar();
        tesla.mostrarInfo();
        tesla.cargar();
        tesla.detener();
        System.out.println(tesla.toString());

        System.out.println("\n Dispositivo \n");

        //Crear un Dispositivo
        Dispositivo patineta = new Dispositivo("Patineta Electrica X1", true);
        patineta.encender();
        patineta.arrancar();
        patineta.detener();
        patineta.apagar();
        System.out.println(patineta.toString());


        //System.out.println("\n ejemploPolimorfismo \n");

        //ejemploPolimorfismo
        Transporte t1 = auto1;
        Transporte t2 = tesla;
        Transporte t3 = patineta;

        t1.arrancar();
        t2.arrancar();
        t3.arrancar();

        System.out.println("\n Interface Electrico \n");

        Electrico e1 = tesla;
        e1.cargar();
    }
}