package com.mycompany.appdemoherencia;

public class Television extends DispositivoElectronicoDeConsumo{
   private Pantalla pantalla;
   
    public Television(){
         
    }
    
    public void setPantalla(Pantalla pantalla){
        this.pantalla=pantalla;
    }
    
    public Pantalla getPantalla(){
        return pantalla;
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
