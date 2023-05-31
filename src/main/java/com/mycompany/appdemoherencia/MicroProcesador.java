package com.mycompany.appdemoherencia;

public class MicroProcesador extends ComponenteElectronico{
    private int cacheRam;
    private long velocidadHz;
    
    public MicroProcesador(){
        
    }
    
    public void setCacheRam(int cacheRam){
        this.cacheRam = cacheRam;
    }
    
    public int getCacheRam(){
        return cacheRam;
    }
    
    public void setVelocidadHz(long velocidadHz){
        this.velocidadHz = velocidadHz;
    }
    
    public long getVelocidadHz(){
        return velocidadHz;
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
    
}
