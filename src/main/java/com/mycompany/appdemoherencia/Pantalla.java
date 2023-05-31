package com.mycompany.appdemoherencia;

public class Pantalla extends ComponenteElectronico{
    private final int resolucionX;
    private final int resolucionY;
    
    public Pantalla(){
        resolucionY=100;
        resolucionX=200;
    }
    
    public int getResolucionX(){
        return resolucionX;
    }
    
    public int getResolucionY(){
        return resolucionY;
    }

    @Override
    void setEsParteDe() {
        
    }

    @Override
    void agregarComponente(DispositivoElectronicoDeConsumo componente) {
        
    }

    @Override
    void quitarComponente() {
        
    }
    
    public String toString(){
        return "resX: "+resolucionX+"  resY:"+resolucionX+"\n";
    }
}
