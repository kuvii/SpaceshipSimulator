package mothership;

public class SpaceShip {
    private static String nombre;
    private static String matriculaGalactica;
    private static int aceleracion;
    private static int velocidad_x;
    private static int velocidad_y;
    private static int coordenada_x;
    private static int coordenada_y;
    private static int direccion_x;
    private static int direccion_y;


    public SpaceShip( String nombre, String matriculaGalactica, int aceleracion, int velocidad_x, int velocidad_y, int coordenada_x, int coordenada_y, int direccion_x, int direccion_y) {
        SpaceShip.nombre = nombre;
        SpaceShip.matriculaGalactica = matriculaGalactica;
        SpaceShip.aceleracion = aceleracion;
        SpaceShip.velocidad_x = velocidad_x;
        SpaceShip.velocidad_y = velocidad_y;
        SpaceShip.coordenada_x = coordenada_x;
        SpaceShip.coordenada_y = coordenada_y;
        SpaceShip.direccion_x = direccion_x;
        SpaceShip.direccion_y = direccion_y;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        SpaceShip.nombre = nombre;
    }

    public static String getMatriculaGalactica() {
        return matriculaGalactica;
    }

    public static void setMatriculaGalactica(String matriculaGalactica) {
        SpaceShip.matriculaGalactica = matriculaGalactica;
    }

    public static int getAceleracion() {
        return aceleracion;
    }

    public static void setAceleracion(int aceleracion) {
        SpaceShip.aceleracion = aceleracion;
    }

    public static int getVelocidad_x() {
        return velocidad_x;
    }

    public static void setVelocidad_x(int velocidad_x) {
        SpaceShip.velocidad_x = velocidad_x;
    }

    public static int getVelocidad_y() {
        return velocidad_y;
    }

    public static void setVelocidad_y(int velocidad_y) {
        SpaceShip.velocidad_y = velocidad_y;
    }

    public static int getCoordenada_x() {
        return coordenada_x;
    }

    public static void setCoordenada_x(int coordenada_x) {
        SpaceShip.coordenada_x = coordenada_x;
    }

    public static int getCoordenada_y() {
        return coordenada_y;
    }

    public static void setCoordenada_y(int coordenada_y) {
        SpaceShip.coordenada_y = coordenada_y;
    }

    public static int getDireccion_x() {
        return direccion_x;
    }

    public static void setDireccion_x(int direccion_x) {
        SpaceShip.direccion_x = direccion_x;
    }

    public static int getDireccion_y() {
        return direccion_y;
    }

    public static void setDireccion_y(int direccion_y) {
        SpaceShip.direccion_y = direccion_y;
    }

    public static void speedUp() {
        setVelocidad_x(velocidad_x + aceleracion);
        setCoordenada_x(getCoordenada_x() + getVelocidad_x());
        System.out.println("Velocidad X: " + getVelocidad_x() + "\n" + "Coordenada X: " + getCoordenada_x());
    }

    public static void brake(){
        setVelocidad_x(velocidad_x - aceleracion);
        setCoordenada_x(getCoordenada_x() - getVelocidad_x());
        System.out.println("Velocidad X: " + getVelocidad_x() + "\n" + "Coordenada X: " + getCoordenada_x());
    }

    public static void emergencyStop(){
        setVelocidad_x(0);
        System.out.println("Velocidad X: " + getVelocidad_x() + "\n" + "Coordenada X: " + getCoordenada_x());
    }
    String falcon =
            "|             ▄▒▒▒▒▒▒▒▒▒▒▒▄" + "\n" +
            "|           ▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄" + "\n" +
            "|         ▄▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▄" + "\n" +
            "|       ▄▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▄" + "\n" +
            "|      ]▒▒██▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▄▄" + "\n" +
            "|      ]▒▒█████████▓▓▓▓▓╣╣╣╢╢╢╢▒▒▒▒▒▒▒▒▒▄▄▄" + "\n" +
            "|        ▀████▓╣╣╫╫╫╫╫╫╫╫╫╢█████████▓▓▓▒▒▒▒▒▒▄▄▄▄▄" + "\n" +
            "|          ▓█▓███████▓▓▓▓▓▓╣█████████▓▓▓▓▓▓█╢     ▓▓▒" + "\n" +
            "|        ▄███▓▓╣╣╫╫╫╫╫╫╫╫╫╢█████████▓▒▒▒▒▒▒▒▒▀▀▀▀▀" + "\n" +
            "|      ]▒███████████████╣╣╣╢╢╢╢▒▒▒▒▒▒▒▒▒▀▀▀" + "\n" +
            "|      ]▒█████████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▀▀" + "\n" +
            "|       ▀▒█▓█████▓▓███████▓▒▒▒▓▒▀" + "\n" +
            "|         ▀▒█████▓▓▓▒▒▒▒▒▒▒▒▒▒▀" + "\n" +
            "|           ▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀" + "\n" +
            "|             ▀▒▒▒▒▒▒▒▒▒▒▒▀" + "\n";
    @Override
    public String toString() {
        String valorPrint = "*-------------" + getNombre() + "-------------*" + "\n";
        valorPrint += "Matricula Galactica: " + getMatriculaGalactica() + "\n";
        valorPrint += "Velocidad en X Actual: " + getVelocidad_x() + "\n";
        valorPrint += "Velocidad en Y Actual: " + getVelocidad_y() + "\n";
        valorPrint += "Aceleración Actual: " + getAceleracion() + "\n";
        valorPrint += "Posición Actual: " + getCoordenada_x() + " X " + getCoordenada_y() + " Y " + "\n";
        valorPrint += "Dirección Actual: " + getDireccion_x() + " X " + getDireccion_y() + " Y " + "\n";
        valorPrint += falcon;

        return valorPrint;
    }
}
