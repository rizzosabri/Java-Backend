import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Carne extends Producto implements Descuento,EsAlimento{
    protected int calorias;
    protected boolean descuentoAplicado;

    public Carne(String nombre, double precio, LocalDate fechaCaducidad, int calorias) {
        super(nombre, precio, fechaCaducidad);
        this.calorias=calorias;
        this.descuentoAplicado=false;
    }

    @Override
    public void aplicarDescuento() {
        if(!descuentoAplicado){
            long diasHastaCaducidad=ChronoUnit.DAYS.between(LocalDate.now(),fechaCaducidad);
            if(diasHastaCaducidad<=2){
                double descuento=0.2; //20%desc
                precio-=precio*descuento;
                descuentoAplicado=true;

            }
        }

    }

    @Override
    public boolean esAlimento() {
        return false;
    }

    @Override
    public int getCalorias() {
        return 0;
    }
}
