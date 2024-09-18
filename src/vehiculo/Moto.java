package vehiculo;

public class Moto extends Vehiculo {
    
    public Moto(String hp,int ruedas,String modelo,String color,String marca,int capacidad,int añoFabrica){
        super(hp,ruedas,modelo,color,marca,capacidad,añoFabrica);
    }
    
    public void frenar(){
        System.out.println("La moto frena");
    }
    public void acelerar(){
        System.out.println("La moto acelera");
    }
    public void arrancar(){
        System.out.println("La moto arranca");
    }
    public void derrapar(){
        System.out.println("La moto derrapa");
    }
}
