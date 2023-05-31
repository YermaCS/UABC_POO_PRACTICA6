package com.mycompany.appdemoherencia;

import java.util.ArrayList;

public class AppDemoHerencia {

    public static void main(String[] args) {
        ArrayList<Smathphone> listaDeSmartphones = new ArrayList(2);
        ArrayList<Television> listaDeTvs = new ArrayList(2);
        
        listaDeSmartphones.add(new Smathphone());
        listaDeTvs.add(new Television());
        
        Botones boton = new Botones();
        boton.setVisible(true);
        
        while(boton.getSalir()==false)
        {
            //System.out.println(boton.getSalir());
            if(boton.getPantalla()==true)
            {
                System.out.print(listaDeSmartphones.get(0).getPantalla().toString());
                boton.setPantalla(false);
            }
            
            if(boton.getSensor()==true)
            {
                System.out.print(listaDeSmartphones.get(0).getSensorDeHuella().toString());
                boton.setSensor(false);
            }
            
            if(boton.getSmarthPhone()==true)
            {
                System.out.print(listaDeSmartphones.get(0).toString());
                boton.setSmarthPhone(false);
            }
            
            if(boton.getComputadora()==true)
            {
                System.out.print(listaDeSmartphones.get(0).getComputadora().toString());
                boton.setComputadora(false);
            }
            
            if(boton.getTelevision()==true)
            {
                System.out.print(listaDeTvs.get(0).toString());
                boton.setTelevision(false);
            }
            
            if(boton.getMicro()==true)
            {
                System.out.print(listaDeSmartphones.get(0).getComputadora().getCpu().toString());
                boton.setMicro(false);
            }
            
                
        }
        System.out.println("Has salido del programa...");
    }
}
