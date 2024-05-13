public class Pato extends Ave implements Nadador, Volador{
    @Override
    public void nadar() {
        System.out.println("soy un patito q estoy nadando");
    }

    @Override
    public void aletear() {
        System.out.println("soy un patito q estoy ALETEANDO");
    }

    @Override
    public void despegar() {
        System.out.println("soy un patito q estoy TOMANDO VUELO");
    }
}
