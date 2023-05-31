package com.mycompany.appdemoherencia;

public class Smathphone extends Computadora{
    private Sensor sensorDeHuella;
    private Pantalla pantalla;
    
    public Smathphone(){
        
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
    
}
