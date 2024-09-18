package vehiculo;

import java.util.Date;

//objeto Vehiculo
public class Vehiculo {
    //caracteristicas  = atributos = variables
    private String hp;
    private int ruedas;
    private String modelo;
    private String color;
    private String marca;
    private int capacidad;
    private int añoFabrica;
    private boolean encendido;
    
    //Constructor - Inicializar
    public Vehiculo(String hp,int ruedas,String modelo,String color,String marca,int capacidad,int añoFabrica){
        this.hp = hp;
        this.ruedas = ruedas;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.añoFabrica = añoFabrica;   
    }
    
    
    //metodos o funcions
    public void transportar(){
        System.out.println("El vehiculo esta en transporte");
    }
    
    public void encender(){
        System.out.println("Vehiculo encendido");
        this.encendido = true;
    }
    public void informacion(){
        System.out.println("Caballos de fuerza: "+hp);
        System.out.println("Cantidad de ruedas: "+ruedas);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
        System.out.println("Marca: "+marca);
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Año de Fabrica: "+añoFabrica);
        
    }
}
