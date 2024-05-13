import java.time.LocalDate;

public class Bebida extends Producto implements EsAlimento, Descuento{
    protected  double volumen;
    protected int calorias;

    public Bebida(String nombre, double precio, LocalDate fechaCaducidad, int calorias) {
        super(nombre, precio, fechaCaducidad);
        this.volumen =volumen;
        this.calorias=calorias;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public void aplicarDescuento() {

    }

    @Override
    public boolean esAlimento() {
        return false;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }
}
