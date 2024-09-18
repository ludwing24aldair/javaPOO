package vehiculo;
//Autor: LUDWING ALDAIR MAMANI YUCRA
public class Principal {
    public static void main(String[] args) {
        //instanciar = invocar = llamar a un objeto
        
        Moto moto = new Moto("1600",2,"Honda","negro","hdp",4,2024); 
        
        //moto.encender();
        //moto.transportar();
        //moto.frenar();
        //moto.acelerar();
        //moto.arrancar();
        //moto.derrapar();
        moto.informacion();
        
        
        Moto moto1 = new Moto("2600",2,"Pulsar","verde","Pulsar",4,2025); 
        
        //moto1.encender();
        //moto1.transportar();
        //moto1.frenar();
        //moto1.acelerar();
        //moto1.arrancar();
        //moto1.derrapar();
        moto1.informacion();
        
        
        
        
        //instanciar = invocar = llamar a un objeto
        Auto auto = new Auto("400",4,"Toyota","naranja","Supra",5,2025,4);
        auto.informacion();
    }
    
    
}
