package mothership;

public class Cargo extends SpaceShip{

    private static int cargoLimit;
    private static int cargo;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion, int velocidad_x, int velocidad_y, int coordenada_x, int coordenada_y, int direccion_x, int direccion_y) {
        super(nombre, matriculaGalactica, aceleracion, velocidad_x, velocidad_y, coordenada_x, coordenada_y, direccion_x, direccion_y);
    }


    public static int getCargoLimit() {
        return cargoLimit;
    }

    public static void setCargoLimit(int cargoLimit) {
        Cargo.cargoLimit = cargoLimit;
    }

    public static int getCargo() {
        return cargo;
    }

    public static void setCargo(int cargo) {
        Cargo.cargo = cargo;
    }

    public static void cargo(int payload){
        setCargoLimit(payload * 10);
        System.out.println(cargoLimit);
        if (cargoLimit > 100){
            System.out.println("Carga maxima alcanzada, estableciendo carga a 100");
            setCargoLimit(100);
        } else if (cargoLimit < 0){
            System.out.println("Imposible de procesar, estableciendo carga a 0");
            setCargoLimit(0);
        }
    }

    public static void load(int cargoLoaded){
        if (cargoLoaded <= cargoLimit && cargoLoaded >= 0){
            setCargo(cargoLoaded);
            System.out.println("Carga almacenada correctamente: " + getCargo());
        }else {
            setCargo(0);
            System.out.println("Fallo al cargar la nave espacio completo " + "\n" + "reinicio de proceso requerido");
        }
    }

    public static void unload(int cargoUnloaded){
        if (cargoUnloaded <= cargoLimit && cargoUnloaded >= 1){
            setCargo(cargoUnloaded);
            System.out.println("Carga descargada correctamente:" + getCargo());
        }else {
            System.out.println("Operacion no procesada, no hay containers/carga almacenada");
        }
    }
}
