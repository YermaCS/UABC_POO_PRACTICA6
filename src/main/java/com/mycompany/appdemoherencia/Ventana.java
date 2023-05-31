
package com.mycompany.appdemoherencia;

//
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
//

public class Ventana extends javax.swing.JFrame{
    
    //
    JPanel contenedor;
    //
    public Ventana(){
        //
        contenedor = new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300,300,500,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.contenedor);
        this.contenedor.setLayout(null);
        
        //
        
        setSize(350,270);
        add(new CanvasTelevision());
        setVisible(true);
    }
}
