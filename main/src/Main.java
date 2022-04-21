import com.sun.security.jgss.GSSUtil;
import mothership.Cargo;
import mothership.SpaceShip;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        String command = "0";
        while (command != "q") {
        System.out.println("Terminal");
        System.out.println("--------------");
        System.out.println("[1] Crear Nave");
        System.out.println("[2] SpeedUP");
        System.out.println("[3] Brake");
        System.out.println("[4] Emergency Stop");
        System.out.println("[5] Cargo");
        System.out.println("[6] Load");
        System.out.println("[7] Unload");
        System.out.println("--------------");
        System.out.print("Esperando órdenes: ");
        command = scanner.next();
            switch (command) {
                case "1":
                    crearNave();
                    break;
                case "2":
                    SpaceShip.speedUp();
                    break;
                case "3":
                    SpaceShip.brake();
                    break;
                case "4":
                    SpaceShip.emergencyStop();
                    break;
                case "5":
                    System.out.println("\033[0;34m█INFO: 'Cada contenedor tiene 10 espacios█" + "\n" + "█Maxima carga 10 contenedores            █\033[0m\n");
                    System.out.println("Inserte la cantidad de contenedores a añadir: ");
                    int cargaUtil = scanner.nextInt();
                    Cargo.cargo(cargaUtil);
                    break;
                case "6":
                    System.out.println("Indica la cantidad a cargar, maximo disponible: " + Cargo.getCargoLimit());
                    int cargoLoaded = scanner.nextInt();
                    Cargo.load(cargoLoaded);
                    break;
                case "7":
                    System.out.println("Indica la cantidad a descargar, carga almacenada: " + Cargo.getCargo());
                    int cargoUnload = scanner.nextInt();
                    Cargo.unload(cargoUnload);
                    break;
                default:
                    System.out.println("No se ha elegido ninguna opcion viable");
            }
        }
    }
    public static void crearNave(){
        System.out.println("Crear Nueva Nave");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Matricula Galactica: ");
        String matriculaGalactica = scanner.next();
        System.out.print("Aceleración de la nave: ");
        int aceleracion = scanner.nextInt();
        SpaceShip naveSpacial = new SpaceShip(nombre, matriculaGalactica, aceleracion, 0,0,0,0,0,0);
        System.out.println(naveSpacial);
    }
}
