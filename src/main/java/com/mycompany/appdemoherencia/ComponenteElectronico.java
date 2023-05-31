package com.mycompany.appdemoherencia;

public abstract class ComponenteElectronico extends DispositivoElectronico{
    private DispositivoElectronico esParteDe;
    
    public ComponenteElectronico(){
        
    }
    
    abstract void setEsParteDe();
}
