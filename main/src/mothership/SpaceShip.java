package mothership;

public class SpaceShip {
    private String nombre;
    private String matriculaGalactica;
    private float aceleracion;
    private float velocidad_x;
    private float velocidad_y;
    private float coordenada_x;
    private float coordenada_y;
    private float direccion_x;
    private float direccion_y;

    public SpaceShip(String nombre, String matriculaGalactica, float aceleracion, float velocidad_x,
                     float velocidad_y, float coordenada_x, float coordenada_y, float direccion_x, float direccion_y) {
        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
        this.velocidad_x = velocidad_x;
        this.velocidad_y = velocidad_y;
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
        this.direccion_x = direccion_x;
        this.direccion_y = direccion_y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaGalactica() {
        return matriculaGalactica;
    }

    public void setMatriculaGalactica(String matriculaGalactica) {
        this.matriculaGalactica = matriculaGalactica;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getVelocidad_x() {
        return velocidad_x;
    }

    public void setVelocidad_x(float velocidad_x) {
        this.velocidad_x = velocidad_x;
    }

    public float getVelocidad_y() {
        return velocidad_y;
    }

    public void setVelocidad_y(float velocidad_y) {
        this.velocidad_y = velocidad_y;
    }

    public float getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(float coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public float getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(float coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public float getDireccion_x() {
        return direccion_x;
    }

    public void setDireccion_x(float direccion_x) {
        this.direccion_x = direccion_x;
    }

    public float getDireccion_y() {
        return direccion_y;
    }

    public void setDireccion_y(float direccion_y) {
        this.direccion_y = direccion_y;
    }

    @Override
    public String toString(){
        String valorPrint = "*-------------"+ getNombre() + "-------------*" + "\n";
        valorPrint += "Matricula Galactica: " + getMatriculaGalactica() + "\n";
        valorPrint += "Velocidad en X Actual: " + getVelocidad_x() + "\n";
        valorPrint += "Velocidad en Y Actual: " + getVelocidad_y() + "\n";
        valorPrint += "Aceleración Actual: " + getAceleracion() + "\n";
        valorPrint += "Posición Actual: " + getCoordenada_x() + " X " + getCoordenada_y() + " Y " + "\n";
        valorPrint += "Dirección Actual: " + getDireccion_x() + " X " + getDireccion_y() + " Y " + "\n";
        valorPrint += "             ▄▒▒▒▒▒▒▒▒▒▒▒▄" + "\n";
        valorPrint += "           ▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄" + "\n";
        valorPrint += "         ▄▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▄" + "\n";
        valorPrint += "       ▄▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▄" + "\n";
        valorPrint += "      ]▒▒██▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▄▄" + "\n";
        valorPrint += "      ]▒▒█████████▓▓▓▓▓╣╣╣╢╢╢╢▒▒▒▒▒▒▒▒▒▄▄▄" + "\n";
        valorPrint += "        ▀████▓╣╣╫╫╫╫╫╫╫╫╫╢█████████▓▓▓▒▒▒▒▒▒▄▄▄▄▄" + "\n";
        valorPrint += "          ▓█▓███████▓▓▓▓▓▓╣█████████▓▓▓▓▓▓█╢     ▓▓▒" + "\n";
        valorPrint += "        ▄███▓▓╣╣╫╫╫╫╫╫╫╫╫╢█████████▓▒▒▒▒▒▒▒▒▀▀▀▀▀" + "\n";
        valorPrint += "      ]▒███████████████╣╣╣╢╢╢╢▒▒▒▒▒▒▒▒▒▀▀▀" + "\n";
        valorPrint += "      ]▒█████████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▀▀" + "\n";
        valorPrint += "       ▀▒█▓█████▓▓███████▓▒▒▒▓▒▀" + "\n";
        valorPrint += "         ▀▒█████▓▓▓▒▒▒▒▒▒▒▒▒▒▀" + "\n";
        valorPrint += "           ▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀" + "\n";
        valorPrint += "             ▀▒▒▒▒▒▒▒▒▒▒▒▀" + "\n";

        return valorPrint;
    }
}
