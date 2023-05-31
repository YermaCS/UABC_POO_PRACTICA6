package com.mycompany.appdemoherencia;

import java.util.ArrayList;

public abstract class DispositivoElectronico {
    private final String fabricante;
    private final String numeroSerie;
    private final String marca;
    private final String nombre;
    private float costo;
    
    //ArrayLists<ComponenteElectronico> componentes= new ArrayList();
    
    public DispositivoElectronico(){
        fabricante ="YermaCorporation";
        numeroSerie="1111";
        marca="Thneed";
        nombre="laptop";
    }
    
    public String toString(){
        return "Fabricante:"+fabricante+"  #Serie:"+numeroSerie+"  marca:"+marca+"  nombre:"+nombre+"\n";
    }
    
    abstract void agregarComponente(DispositivoElectronicoDeConsumo componente);
    
    abstract void quitarComponente();
    
    public String getNumeroSerie(){
        return fabricante;
    }
    
    public String getMarca(){
        return numeroSerie;
    }
    
    public String getFabricante(){
        return marca;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getCosto(){
        return costo;
    }
    
    public void setCosto(float costo){
        this.costo=costo;
    }
}
