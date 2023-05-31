package com.mycompany.appdemoherencia;

public class Sensor extends ComponenteElectronico{
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;
    
    public Sensor(){
        tipo="tipo1";
        unidadDeMedida="10";
        valor = 1;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getUnidadDeMedida(){
        return unidadDeMedida;
    }
    
    public int getValor(){
        return valor;
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
