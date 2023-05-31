package com.mycompany.appdemoherencia;

public class Smathphone extends Computadora{
    private Sensor sensorDeHuella;
    private Pantalla pantalla;
    private Computadora cmp;
    
    public Smathphone(){
        pantalla = new Pantalla();
        sensorDeHuella = new Sensor();
        cmp = new Computadora();
    }
    
    public String toString(){
        return getSensorDeHuella().toString()+getPantalla().toString();
    }
    
    public void setSensorDeHuella(Sensor sensorDeHuella){
        this.sensorDeHuella = sensorDeHuella;
    }
    
    public Sensor getSensorDeHuella(){
        return sensorDeHuella;
    }
    
    public void setPantalla(Pantalla pantalla){
        this.pantalla = pantalla;
    }
    
    public Pantalla getPantalla(){
        return pantalla;
    }
    
    public void setComputadora(Computadora cmp){
        this.cmp = cmp;
    }
    
    public Computadora getComputadora(){
        return cmp;
    }
    
}
