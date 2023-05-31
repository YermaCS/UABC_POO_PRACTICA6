package com.mycompany.appdemoherencia;

public class Computadora extends DispositivoElectronicoDeConsumo{
    private MicroProcesador cpu;
    private long ramMB;
    
    public void setCpu(MicroProcesador cpu){
        this.cpu=cpu;
    }
    
    public MicroProcesador getCpu(){
        return cpu;
    }
    
    public void setRamMB(long ramMB){
        this.ramMB=ramMB;
    }
    
    public long getRamMB(){
        return ramMB;
    }

    @Override
    void encender() {
        
    }

    @Override
    void apagar() {
        
    }

    @Override
    boolean isEncendido() {
        
        return false;
        
    }

    @Override
    void agregarComponente(DispositivoElectronicoDeConsumo componente) {
        
    }

    @Override
    void quitarComponente() {
        
    }
    
}
