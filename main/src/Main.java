import mothership.SpaceShip;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Constructor
        SpaceShip Falcon = new SpaceShip(
                2,
                0,
                0,
                0,
                1,
                0);
        SpaceShip.setNombre("Falcon");
        System.out.println(Falcon);
        //Configuracion Test SpeedUP
        SpaceShip.setAceleracion(2);

        menu();
    }
    public static void menu(){
        String command = "0";
        while (command != "q") {
        System.out.println("Terminal");
        System.out.println("--------------");
        System.out.println("[1] SpeedUP");
        System.out.println("[2] Brake");
        System.out.println("--------------");
        System.out.print("Esperando órdenes: ");
        command = scanner.next();
            switch (command) {
                case "1":
                    SpaceShip.speedUp();
                    break;
                case "2":
                    break;
                default:
                    System.out.println("No se ha elegido ninguna opcion viable");
            }
        }
    }
}
