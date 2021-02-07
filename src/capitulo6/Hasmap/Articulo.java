package capitulo6.Hasmap;

public class Articulo {

    public int codBarras;
    public int numEstante;
    public String nombre;
    public int numStock;

    public Articulo(int codigoBarras, int numeroEstante, String nombre, int numStock) {
        super();
        this.codBarras = codigoBarras;
        this.numEstante = numeroEstante;
        this.nombre = nombre;
        this.numStock = numStock;
    }

    public Articulo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getCodigoBarras() {
        return codBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codBarras = codigoBarras;
    }

    public int getNumeroEstante() {
        return numEstante;
    }

    public void setNumeroEstante(int numeroEstante) {
        this.numEstante = numeroEstante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroStock() {
        return numStock;
    }

    public void setNumeroStock(int numeroStock) {
        this.numStock = numeroStock;
    }

    @Override
    public String toString() {
        return "Articulo [codigoBarras=" + codBarras + ", numeroEstante=" + numEstante + ", nombre=" + nombre
                + ", numeroStock=" + numStock + "]";
    }


}
