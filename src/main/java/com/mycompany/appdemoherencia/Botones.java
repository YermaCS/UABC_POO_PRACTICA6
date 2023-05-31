/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author pluto
 */
public class Botones extends javax.swing.JFrame {
    private boolean pantallaActivo = false;
    private boolean salirActivo = false;
    private boolean sensorActivo = false;
    private boolean smarthPhoneActivo = false;
    private boolean TelevisionActivo = false;
    private boolean microActivo = false;
    private boolean computadoraActivo = false;
            
    public Botones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pluto\\OneDrive\\Documents\\NetBeansProjects\\AppDemoHerencia\\src\\main\\java\\Imagenes\\pantalla.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pluto\\OneDrive\\Documents\\NetBeansProjects\\AppDemoHerencia\\src\\main\\java\\Imagenes\\sensor.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pluto\\OneDrive\\Documents\\NetBeansProjects\\AppDemoHerencia\\src\\main\\java\\Imagenes\\smarthphone.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pluto\\OneDrive\\Documents\\NetBeansProjects\\AppDemoHerencia\\src\\main\\java\\Imagenes\\microprocesador.png")); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\pluto\\OneDrive\\Documents\\NetBeansProjects\\AppDemoHerencia\\src\\main\\java\\Imagenes\\television.png")); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\pluto\\OneDrive\\Documents\\NetBeansProjects\\AppDemoHerencia\\src\\main\\java\\Imagenes\\portatil.png")); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(80, 80, 80)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(183, 183, 183))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setPantalla(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setSalir(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setSensor(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setSmarthPhone(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        setMicro(true);
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        setComputadora(true);
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        setTelevision(true);
    }//GEN-LAST:event_jButton7MousePressed
    
    public void setMicro(boolean estado){
        microActivo = estado;
    } 
    
    public boolean getMicro(){
        return microActivo;
        
    }
    
    public void setComputadora(boolean estado){
        computadoraActivo = estado;
    } 
    
    public boolean getComputadora(){
        return computadoraActivo;
        
    }
    
    public void setTelevision(boolean estado){
        TelevisionActivo = estado;
    } 
    
    public boolean getTelevision(){
        return TelevisionActivo;
        
    }
    
    public void setSmarthPhone(boolean estado){
        smarthPhoneActivo = estado;
    } 
    
    public boolean getSmarthPhone(){
        return smarthPhoneActivo;
        
    }
    
    public void setSensor(boolean estado){
        sensorActivo = estado;
    } 
    
    public boolean getSensor(){
        return sensorActivo;
        
    }
    
    public void setPantalla(boolean estado){
        pantallaActivo = estado;
    } 
    
    public boolean getPantalla(){
        return pantallaActivo;
        
    }
    
    public void setSalir(boolean estado){
        salirActivo = estado;
    } 
    
    public boolean getSalir(){
        System.out.print("");
        return salirActivo;
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables
}
