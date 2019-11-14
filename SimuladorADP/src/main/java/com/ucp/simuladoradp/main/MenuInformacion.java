/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucp.simuladoradp.main;

import clases.Algoritmo;
import clases.FIFO;
import clases.RR;
import clases.SPN;
import clases.SRT;
import clases.SRT;

/**
 *
 * @author Facun
 */
public class MenuInformacion extends javax.swing.JFrame {

    /**
     * Creates new form Informacion
     */
    public MenuInformacion() {
        
         initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Informacion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonFIFO = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonRR = new javax.swing.JButton();
        jButtonSPN = new javax.swing.JButton();
        jButtonSTR = new javax.swing.JButton();
        jButtonScan = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtonSSTF = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonSW = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("            Algoritmos");

        jButtonFIFO.setText("FIFO");
        jButtonFIFO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFIFOMouseClicked(evt);
            }
        });
        jButtonFIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFIFOActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonRR.setText("Round Robbin");
        jButtonRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRRActionPerformed(evt);
            }
        });

        jButtonSPN.setText("SPN");
        jButtonSPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSPNActionPerformed(evt);
            }
        });

        jButtonSTR.setText("STR");
        jButtonSTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSTRActionPerformed(evt);
            }
        });

        jButtonScan.setText(" Scan");
        jButtonScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScanActionPerformed(evt);
            }
        });

        jButton7.setText("Dekker");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButtonSSTF.setText("SSTF ");
        jButtonSSTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSSTFActionPerformed(evt);
            }
        });

        jButton9.setText("Peterson");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonSW.setText("Swapping");
        jButtonSW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSWActionPerformed(evt);
            }
        });

        jButton11.setText("Lamport");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonRR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFIFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonSTR, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonScan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSSTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFIFO)
                    .addComponent(jButtonScan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSSTF)
                    .addComponent(jButtonRR))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jButtonSPN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSTR)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSW)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:}
      System.exit(0);
         
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonFIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFIFOActionPerformed
        // TODO add your handling code here:
         FIFO fifo = new FIFO("FIFO", "\n  Algunas de las características de este algoritmo es que es no apropiativo y justo en el sentido formal, aunque injusto en el sentido de que: los trabajos largos hacen esperar a los cortos y los trabajos sin importancia hacen esperar a los importantes. Por otro lado es predecible pero no garantiza buenos tiempos de respuesta y por ello se emplea como esquema secundario.", "\n La ventaja de este algoritmo es su fácil implementación, sin embargo, no es válido para entornos interactivos ya que un proceso de mucho cálculo de CPU hace aumentar el tiempo de espera de los demás procesos.");
         InformacionAlgoritmo verInformacionFIFO = new InformacionAlgoritmo (fifo);
         verInformacionFIFO.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButtonFIFOActionPerformed

    private void jButtonFIFOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFIFOMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButtonFIFOMouseClicked

    private void jButtonRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRRActionPerformed
        // TODO add your handling code here:
         RR rr = new RR("RR", "\n  La determinación del tamaño del quantum es vital para la operación efectiva de un sistema de cómputo.\n" +
"Si el quantum de tiempo es muy grande, cada proceso tendrá el tiempo necesario para terminar, de manera que el esquema de planificación por turno rotatorio degenera en uno de FIFO.\n" +
"Si el quantum es muy pequeño, el gasto extra por cambio de proceso se convierte en el factor dominante y el rendimiento del sistema se degradará hasta el punto en que la mayor parte del tiempo se invierte en la conmutación del procesador, con muy poco o ningún tiempo para ejecutar los programas de los usuarios.", "\n  El round robin es muy fácil de implementar. Todo lo que necesita el planificador es mantener una lista de los procesos listos.");
         InformacionAlgoritmo verInformacionRR = new InformacionAlgoritmo(rr);
         verInformacionRR.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButtonRRActionPerformed

    private void jButtonSPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSPNActionPerformed
        // TODO add your handling code here:
         SPN spn = new SPN("SPN", "\n Este algoritmo no expropiativo favorece a los procesos más cortos. De esta forma se consigue que los procesos más cortos se sitúen por delante de los largos. Esto ofrece un beneficio frente al algoritmo FIFO puesto que da un tiempo de procesamiento más óptimo.", "\n  Tiene el mínimo tiempo de espera promedio para el conjunto de procesos.\n" +
"Ayuda a los procesos más cortos. \n" +
"Minimiza el tiempo de espera medio.");
         InformacionAlgoritmo verInformacionSPN = new InformacionAlgoritmo (spn);
         verInformacionSPN.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButtonSPNActionPerformed

    private void jButtonSTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSTRActionPerformed
        // TODO add your handling code here:
         SRT str = new SRT("SRT", "\n El algoritmo de SRT (Tiempo restante más corto) viene de una versión con adquisición de prioridad (SPN) en la que el objetivo siempre es elegir el proceso que tiene el tiempo restante de procesamiento esperado más corto.", "\n Ofrece un buen tiempo de respuesta. La productividad es alta a cambio de la sobrecarga del sistema es decir que a cada paso debe decidir a qué proceso asignar la CPU.");
         InformacionAlgoritmo verInformacionSRT = new InformacionAlgoritmo (str);
         verInformacionSRT.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButtonSTRActionPerformed

    private void jButtonSWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSWActionPerformed
        // TODO add your handling code here:
         Algoritmo swapping = new Algoritmo("Swapping", "\n En lugar de utilizar espacio en memoria RAM, el swapping utiliza espacio en disco duro para almacenar datos temporales, reduciendo así el uso de la RAM.", "\n Las ventajas en tener el disco particionado es que si tenemos un error o problema en una de las particiones, las demás no se verán afectadas. Podemos tener nuestros archivos de datos en particionales totalmente independientes y borrar/cambiar el contenido de una partición sin que esto afecte a los demás.");
         InformacionAlgoritmo verInformacionSWP = new InformacionAlgoritmo (swapping);
         verInformacionSWP.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButtonSWActionPerformed

    private void jButtonScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScanActionPerformed
        // TODO add your handling code here:
         Algoritmo scan = new Algoritmo("Scan", "\n Las cabezas se mueven de un extremo a otro del disco, atendiendo las solicitudes que se van encontrando.Con SCAN, al llegar a un extremo y cambiar de sentido, se encuentran por lo general pocas solicitudes. La mayor densidad estará en el extremo opuesto, con las solicitudes que llevan más tiempo esperando.", "\n  La ventaja que nos da el algoritmo de SCAN son que los Tiempos de servicio son más acotados, y más variables en los extremos que en el centro.");
         InformacionAlgoritmo verInformacionScan = new InformacionAlgoritmo (scan);
         verInformacionScan.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButtonScanActionPerformed

    private void jButtonSSTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSSTFActionPerformed
        // TODO add your handling code here:
         Algoritmo sstf = new Algoritmo("SSTF", "\n La ejecución de este algoritmo busca mejorar la problemática del algoritmo FCFS, es decir, mediante esta planificación, el sistema operativo dará la orden para que el cabezal del disco se mueva hacia la solicitud más cercana, satisfaciendo un mayor número de solicitudes pendientes en un menor tiempo.", "\n SSTF tiene la ventaja de ser un algoritmo muy simple y que mejora claramente el método FIFO, en el sentido de que reduce drásticamente el número de saltos que tiene que realizar el cabezal haciendo que el tiempo medio de respuesta se reduzca.");
         InformacionAlgoritmo verInformacionSSTF = new InformacionAlgoritmo (sstf);
         verInformacionSSTF.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButtonSSTFActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          Algoritmo dekker = new Algoritmo("Dekker", "\n Fue uno de los primeros algoritmos de exclusión mutua inventados, implementado por Edsger Dijkstra. Si ambos procesos intentan acceder a la sección crítica simultáneamente, el algoritmo elige un proceso según una variable turno. Si el otro proceso está ejecutando en su sección crítica, deberá esperar su finalización.", "\n Esta técnica tiene la ventaja de mostrar muchos de los errores típicos del desarrollo de programas concurrentes.");
         InformacionAlgoritmo verInformacionDekker = new InformacionAlgoritmo (dekker);
         verInformacionDekker.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          Algoritmo peter = new Algoritmo("Peterson", "\n El algoritmo fue desarrollado en 1981, para dos procesos que fue una simplificación del algoritmo desarrollado por Dekker. Más tarde este algoritmo fue generalizado para N procesos.", "\n Es aplicable a cualquier número de procesos con memoria compartida tanto del monoprocesador como de multiprocesador, es simple, fácil de verificar y puede usarse para varias secciones críticas");
         InformacionAlgoritmo verInformacionPeter = new InformacionAlgoritmo (peter);
         verInformacionPeter.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
          Algoritmo lamport = new Algoritmo("Lamport", "\n El algoritmo de la panadería de Lamport es un algoritmo de computación creado por el científico en computación Lord Leslie Lamport, para implementar la exclusión mutua de N procesos o hilos de ejecución. Este toma el nombre de algoritmo de panadería porque simula la costumbre de atender mediante un número de turno, el cliente entra al local y retira un número(turno) y lo utilizan para ir atendiendolos en orden de llegada.", "\n No hay inanición, no hay bloqueo y es fácil de implementar.");
         InformacionAlgoritmo verInformacionLam = new InformacionAlgoritmo (lamport);
         verInformacionLam.setVisible (true);
         dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionAlgoritmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionAlgoritmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionAlgoritmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionAlgoritmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionAlgoritmo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonFIFO;
    private javax.swing.JButton jButtonRR;
    private javax.swing.JButton jButtonSPN;
    private javax.swing.JButton jButtonSSTF;
    private javax.swing.JButton jButtonSTR;
    private javax.swing.JButton jButtonSW;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonScan;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
