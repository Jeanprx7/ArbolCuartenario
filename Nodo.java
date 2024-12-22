public class Nodo {
    int x, y;
    String etiqueta;
   Nodo izquierda,hijo2,hijo3, derecha;

    public Nodo(int x, int y, String etiqueta) {
        this.x = x;
        this.y = y;
        this.etiqueta = etiqueta;
        this.izquierda = null;
        this.hijo2=null;
        this.hijo3=null;
        this.derecha = null;
    }

    @Override
    public String toString() {
        return etiqueta + " (" + x + ", " + y + ")";
    }
}