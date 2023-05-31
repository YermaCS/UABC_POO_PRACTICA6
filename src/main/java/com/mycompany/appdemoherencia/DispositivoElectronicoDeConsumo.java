package com.mycompany.appdemoherencia;

public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    private boolean encendido;
    
    public DispositivoElectronicoDeConsumo(){
        
    }
    
    abstract void encender();
    
    abstract void apagar();
    
    abstract boolean isEncendido();
    
    public void setEncendidio(boolean encendido){
        this.encendido = encendido;
    }
    
    public boolean getEncendidio(){
        return encendido;
    }
}
