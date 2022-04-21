import com.sun.security.jgss.GSSUtil;
import mothership.Cargo;
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
        System.out.println("[3] Emergency Stop");
        System.out.println("[4] Cargo");
        System.out.println("--------------");
        System.out.print("Esperando órdenes: ");
        command = scanner.next();
            switch (command) {
                case "1":
                    SpaceShip.speedUp();
                    break;
                case "2":
                    SpaceShip.brake();
                    break;
                case "3":
                    SpaceShip.emergencyStop();
                    break;
                case "4":
                    System.out.println("\033[0;34m█INFO: 'Cada contenedor tiene 10 espacios█" + "\n" + "█Maxima carga 10 contenedores            █\033[0m\n");
                    System.out.println("Inserte la cantidad de contenedores a añadir: ");
                    int cargaUtil = scanner.nextInt();
                    Cargo.cargo(cargaUtil);
                    break;
                case "5":
                    System.out.println("Indica la cantidad a cargar, maximo disponible: " + Cargo.getCargoLimit());
                    int cargoLoaded = scanner.nextInt();
                    Cargo.load(cargoLoaded);
                    break;
                case "6":
                    System.out.println("Indica la cantidad a descargar, carga almacenada: " + Cargo.getCargo());
                    int cargoUnload = scanner.nextInt();
                    Cargo.unload(cargoUnload);
                    break;
                default:
                    System.out.println("No se ha elegido ninguna opcion viable");
            }
        }
    }
}
