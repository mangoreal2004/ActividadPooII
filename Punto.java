public class Punto {
    private int coordenada_x;
    private int coordenada_y;

    //sin parametros
    public Punto (){
        this.coordenada_x = 0;
        this.coordenada_y = 0;
    }
    //con parametros
    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenada_x = coordenadaX;
        this.coordenada_y = coordenadaY;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenada_x + "," + coordenada_y;
    }
}
