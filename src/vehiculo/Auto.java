package vehiculo;

public class Auto extends Vehiculo {
    private int numeroPuertas;
    
    
    public Auto(String hp, int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica, int numeroPuertas) {
        super(hp, ruedas, modelo, color, marca, capacidad, añoFabrica);
        this.numeroPuertas = numeroPuertas;    
    }
    
    @Override
    public void informacion(){
        super.informacion();
        System.out.println("numero de puerta: "+numeroPuertas);
    }    
}
