package com.mycompany.appdemoherencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CanvasTelevision extends Canvas {

   private BufferedImage image,image2,image3,image4,image5,image6;

    public CanvasTelevision(){
        try {
     	// Cargar la imagen desde el archivo PNG
            image = ImageIO.read(new File("C:\\Users\\pluto\\OneDrive\\Desktop\\EDEN\\UABC\\4 Semestre\\POO\\Laboratirios\\Practica6\\television.png"));
            image2 = ImageIO.read(new File("C:\\Users\\pluto\\OneDrive\\Desktop\\EDEN\\UABC\\4 Semestre\\POO\\Laboratirios\\Practica6\\sensor.png"));
            image3 = ImageIO.read(new File("C:\\Users\\pluto\\OneDrive\\Desktop\\EDEN\\UABC\\4 Semestre\\POO\\Laboratirios\\Practica6\\pantalla.png"));
            image4 = ImageIO.read(new File("C:\\Users\\pluto\\OneDrive\\Desktop\\EDEN\\UABC\\4 Semestre\\POO\\Laboratirios\\Practica6\\microprocesador.png"));
            image5 = ImageIO.read(new File("C:\\Users\\pluto\\OneDrive\\Desktop\\EDEN\\UABC\\4 Semestre\\POO\\Laboratirios\\Practica6\\smartphone.png"));
            image6 = ImageIO.read(new File("C:\\Users\\pluto\\OneDrive\\Desktop\\EDEN\\UABC\\4 Semestre\\POO\\Laboratirios\\Practica6\\computadora.png"));
  	} catch (Exception e) {
            e.printStackTrace();
  	}
   }

   public void paint(Graphics g) {
  	// Dibujar la imagen en el objeto Canvas
  	g.drawImage(image, 10, 10, 100,100, this);
        g.drawImage(image2, 110, 10, 100,100, this);
        g.drawImage(image3, 210, 10, 100,100, this);
        g.drawImage(image4, 10, 110, 100,100, this);
        g.drawImage(image5, 110, 110, 100,100, this);
        g.drawImage(image6, 210, 110, 100,100, this);
   }
         
    public static void main(String[] args){
        CanvasTelevision canvas = new CanvasTelevision();
        Frame frame = new Frame();
  	frame.setSize(300, 300);
  	frame.add(canvas);
  	frame.setVisible(true);
    }
            
}
