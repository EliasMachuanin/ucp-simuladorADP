/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucp.simuladoradp.main;

import Util.Archivo;
import clases.FIFO;
import clases.RR;
import clases.SPN;
import clases.SRT;
import clases.Proceso;
import clases.ProcesoTableModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author porti
 */
public class VentanaSimulacion extends javax.swing.JFrame {

    
    private ArrayList<Proceso> listProcess;//crea una lista de procesos
    private ProcesoTableModel procesosTableModel;
    private String planificador;

    /**
     * Creates new form FifoView
     */
    public VentanaSimulacion(String planificador) {
        initComponents();
        ArrayList<Proceso> listado = new ArrayList();
       int orden = 10;
       Random r = new Random();
        for (int i = 0; i < 10; i++) {
            Proceso p = new Proceso(i, "p"+i, orden, r.nextInt((6 - 1) + 1) + 1);
            orden--;
            listado.add(p);
        }
        listProcess = listado;
        procesosTableModel = new ProcesoTableModel(listado);
        jTableProcesos.setModel(procesosTableModel);
        this.setPlanificador(planificador);
    }
    
    public VentanaSimulacion() {
        initComponents();
        ArrayList<Proceso> listado = new ArrayList();
       int orden = 10;
       Random r = new Random();
        for (int i = 0; i < 10; i++) {
            Proceso p = new Proceso(i, "p"+i, orden, r.nextInt((6 - 1) + 1) + 1);
            orden--;
            listado.add(p);
        }
        listProcess = listado;
        procesosTableModel = new ProcesoTableModel(listado);
        jTableProcesos.setModel(procesosTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopUpMenuTable = new javax.swing.JPopupMenu();
        jItemAgregarFila = new javax.swing.JMenuItem();
        jItemEliminarFila = new javax.swing.JMenuItem();
        jDialogFile = new javax.swing.JDialog();
        jFileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProcesos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelInformacion = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnComparar = new javax.swing.JButton();
        panelEspera = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProcesosEspera = new javax.swing.JTable();
        panelEjec = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProcesoEnCurso = new javax.swing.JTable();
        panelTermin = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProcesosTerminados = new javax.swing.JTable();
        jBtnIniciar = new javax.swing.JButton();
        rafagaCPULabel = new javax.swing.JLabel();
        timerCpu = new javax.swing.JLabel();
        labelEspera = new javax.swing.JLabel();
        labelTermin = new javax.swing.JLabel();
        labelEjec = new javax.swing.JLabel();

        jItemAgregarFila.setText("Agregar Fila");
        jItemAgregarFila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jItemAgregarFilaMouseClicked(evt);
            }
        });
        jItemAgregarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemAgregarFilaActionPerformed(evt);
            }
        });
        jPopUpMenuTable.add(jItemAgregarFila);

        jItemEliminarFila.setText("Eliminar Fila");
        jItemEliminarFila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jItemEliminarFilaMouseClicked(evt);
            }
        });
        jItemEliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemEliminarFilaActionPerformed(evt);
            }
        });
        jPopUpMenuTable.add(jItemEliminarFila);

        javax.swing.GroupLayout jDialogFileLayout = new javax.swing.GroupLayout(jDialogFile.getContentPane());
        jDialogFile.getContentPane().setLayout(jDialogFileLayout);
        jDialogFileLayout.setHorizontalGroup(
            jDialogFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogFileLayout.setVerticalGroup(
            jDialogFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Procesos"));

        jButton2.setText("Exportar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Importar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTableProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProcesos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProcesosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableProcesos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jButton1.setText("Seleccionar Todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Deseleccionar Todo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setText("1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Ingrese un quanto deseado:");

        jButton5.setText("Atras");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnComparar.setText("Comparar");
        btnComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(563, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btnComparar)))
        );

        panelEspera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 3, true));

        jTableProcesosEspera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProcesosEspera);

        javax.swing.GroupLayout panelEsperaLayout = new javax.swing.GroupLayout(panelEspera);
        panelEspera.setLayout(panelEsperaLayout);
        panelEsperaLayout.setHorizontalGroup(
            panelEsperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsperaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEsperaLayout.setVerticalGroup(
            panelEsperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsperaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEjec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));

        jTableProcesoEnCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableProcesoEnCurso);

        javax.swing.GroupLayout panelEjecLayout = new javax.swing.GroupLayout(panelEjec);
        panelEjec.setLayout(panelEjecLayout);
        panelEjecLayout.setHorizontalGroup(
            panelEjecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEjecLayout.setVerticalGroup(
            panelEjecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTermin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 179, 20), 3, true));

        jTableProcesosTerminados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableProcesosTerminados);

        javax.swing.GroupLayout panelTerminLayout = new javax.swing.GroupLayout(panelTermin);
        panelTermin.setLayout(panelTerminLayout);
        panelTerminLayout.setHorizontalGroup(
            panelTerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTerminLayout.setVerticalGroup(
            panelTerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBtnIniciar.setText("I N I C I A R");
        jBtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIniciarActionPerformed(evt);
            }
        });

        rafagaCPULabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        rafagaCPULabel.setText("Rafaga CPU (seg)");

        timerCpu.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        timerCpu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerCpu.setText("0");
        timerCpu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelEspera.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelEspera.setForeground(new java.awt.Color(204, 0, 0));
        labelEspera.setText("Procesos en Espera");
        labelEspera.setToolTipText("");

        labelTermin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelTermin.setForeground(new java.awt.Color(51, 179, 20));
        labelTermin.setText("Procesos Terminados");
        labelTermin.setToolTipText("");

        labelEjec.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelEjec.setForeground(new java.awt.Color(255, 204, 0));
        labelEjec.setText("Proceso en Ejecucion");
        labelEjec.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEspera)
                                .addGap(400, 400, 400)
                                .addComponent(labelEjec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTermin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panelEjec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rafagaCPULabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(timerCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jBtnIniciar)))
                                        .addGap(121, 121, 121)))
                                .addComponent(panelTermin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEspera)
                    .addComponent(labelTermin)
                    .addComponent(labelEjec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEjec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rafagaCPULabel)
                        .addGap(1, 1, 1)
                        .addComponent(timerCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTermin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIniciarActionPerformed
        // TODO add your handling code here:
        switch(this.getPlanificador()){
            case "FIFO":
                FIFO fifo = new FIFO("Fifo", "Caracteristicas", "Ventajas", procesosTableModel.getSelectedRows(), this);
                fifo.start();
                break;
                
            case "SPN":
                SPN spn = new SPN("SPN", "Caracteristicas", "Ventajas", procesosTableModel.getSelectedRows(), this);
                spn.start();
                break;
                
            case "RR":
                int valor = Integer.parseInt(this.jTextField1.getText());
                RR rr = new RR("RR", "Caracteristicas", "Ventajas", procesosTableModel.getSelectedRows(), this, valor);
                rr.start();
                break;
                
            case "SRT":
                SRT srt = new SRT("SRT", "Caracteristicas", "Ventajas", procesosTableModel.getSelectedRows(), this);
                srt.start();
                break;
        
        }
        
    }//GEN-LAST:event_jBtnIniciarActionPerformed

    private void jItemAgregarFilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jItemAgregarFilaMouseClicked
        
        procesosTableModel.addRow(null);
    }//GEN-LAST:event_jItemAgregarFilaMouseClicked

    private void jItemAgregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemAgregarFilaActionPerformed
        // TODO add your handling code here:
        procesosTableModel.addRow(null);
    }//GEN-LAST:event_jItemAgregarFilaActionPerformed

    private void jItemEliminarFilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jItemEliminarFilaMouseClicked
        // TODO add your handling code here:
        procesosTableModel.addRow(null);
    }//GEN-LAST:event_jItemEliminarFilaMouseClicked

    private void jItemEliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemEliminarFilaActionPerformed
        procesosTableModel.removeRow(jTableProcesos.getSelectedRow());
    }//GEN-LAST:event_jItemEliminarFilaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < this.procesosTableModel.getRowCount(); i++) {
            jTableProcesos.getModel().setValueAt(false, i, 0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < this.procesosTableModel.getRowCount(); i++) {
            jTableProcesos.getModel().setValueAt(true, i, 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProcesosMouseClicked
        // TODO add your handling code here:
        if(evt.getButton() == 3){
            jPopUpMenuTable.setLocation(evt.getLocationOnScreen());
            jPopUpMenuTable.show(evt.getComponent(), evt.getX(), evt.getY());
            jPopUpMenuTable.setVisible(true);
        }else{jPopUpMenuTable.setVisible(false);}
    }//GEN-LAST:event_jTableProcesosMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.listProcess = Archivo.getProcesos();
        procesosTableModel = new ProcesoTableModel(this.listProcess);
        jTableProcesos.setModel(procesosTableModel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(Archivo.grabarProcesos(this.listProcess)){
            JOptionPane.showMessageDialog(null, "EXITO!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompararActionPerformed
        // TODO add your handling code here:
        CuadroComparacion cuadro = new CuadroComparacion();
        cuadro.setVisible(true);
        FIFO fifo = new FIFO("FIFO", "Caracteristicas", "Ventajas", procesosTableModel.getSelectedRows(), this);
        SPN spn = new SPN("SPN", "Caracteristicas", "Ventajas", procesosTableModel.getSelectedRows(), this);
        int valor = Integer.parseInt(this.jTextField1.getText());
        RR rr = new RR("RR", "Caracteristicas", "Ventajas", procesosTableModel.getSelectedRows(), this, valor);
        SRT srt = new SRT("SRT", "Caracteristicas", "Ventajas", procesosTableModel.getSelectedRows(), this);
        fifo.run(cuadro);
        spn.run(cuadro);
        rr.run(cuadro);
        srt.run(cuadro);
        this.dispose();
        
    }//GEN-LAST:event_btnCompararActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSimulacion().setVisible(true);
            }
        });
    }
    
     /**geters y seters*/
    public JTable getjTableProcesoEnCurso() {
        return jTableProcesoEnCurso;
    }

    public JTable getjTableProcesosEspera() {
        return jTableProcesosEspera;
    }

    public JTable getjTableProcesosTerminados() {
        return jTableProcesosTerminados;
    }

    public JLabel getTimerCpu() {
        return timerCpu;
    }

   
    
    public void ocltarTextBox(){
        jTextField1.setVisible(false);
    }
    
    public void ocltarLabel(){
        jLabel5.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton jBtnIniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialogFile;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JMenuItem jItemAgregarFila;
    private javax.swing.JMenuItem jItemEliminarFila;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelInformacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopUpMenuTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableProcesoEnCurso;
    private javax.swing.JTable jTableProcesos;
    private javax.swing.JTable jTableProcesosEspera;
    private javax.swing.JTable jTableProcesosTerminados;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelEjec;
    private javax.swing.JLabel labelEspera;
    private javax.swing.JLabel labelTermin;
    private javax.swing.JPanel panelEjec;
    private javax.swing.JPanel panelEspera;
    private javax.swing.JPanel panelTermin;
    private javax.swing.JLabel rafagaCPULabel;
    private javax.swing.JLabel timerCpu;
    // End of variables declaration//GEN-END:variables

    public String getPlanificador() {
        return planificador;
    }

    private void setPlanificador(String planificador) {
        this.planificador = planificador;
    }

    public javax.swing.JPanel getPanelEjec() {
        return panelEjec;
    }

    public void setPanelEjec(javax.swing.JPanel panelEjec) {
        this.panelEjec = panelEjec;
    }

    public javax.swing.JPanel getPanelEspera() {
        return panelEspera;
    }

    public void setPanelEspera(javax.swing.JPanel panelEspera) {
        this.panelEspera = panelEspera;
    }

    public javax.swing.JPanel getPanelTermin() {
        return panelTermin;
    }

    public void setPanelTermin(javax.swing.JPanel panelTermin) {
        this.panelTermin = panelTermin;
    }

    public javax.swing.JLabel getRafagaCPULabel() {
        return rafagaCPULabel;
    }

    public void setRafagaCPULabel(javax.swing.JLabel rafagaCPULabel) {
        this.rafagaCPULabel = rafagaCPULabel;
    }

    public void setTimerCpu(javax.swing.JLabel timerCpu) {
        this.timerCpu = timerCpu;
    }

    public javax.swing.JButton getjBtnIniciar() {
        return jBtnIniciar;
    }

    public void setjBtnIniciar(javax.swing.JButton jBtnIniciar) {
        this.jBtnIniciar = jBtnIniciar;
    }

    public javax.swing.JLabel getLabelEjec() {
        return labelEjec;
    }

    public void setLabelEjec(javax.swing.JLabel labelEjec) {
        this.labelEjec = labelEjec;
    }

    public javax.swing.JLabel getLabelEspera() {
        return labelEspera;
    }

    public void setLabelEspera(javax.swing.JLabel labelEspera) {
        this.labelEspera = labelEspera;
    }

    public javax.swing.JLabel getLabelTermin() {
        return labelTermin;
    }

    public void setLabelTermin(javax.swing.JLabel labelTermin) {
        this.labelTermin = labelTermin;
    }

    public javax.swing.JButton getBtnComparar() {
        return btnComparar;
    }

    public void setBtnComparar(javax.swing.JButton btnComparar) {
        this.btnComparar = btnComparar;
    }
}
