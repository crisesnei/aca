/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario1;

/**
 *
 * @author Miguel Castillo
 */
public class Evaluacion2 extends javax.swing.JFrame {

   public static int cont1;
    public Evaluacion2() {
        initComponents();
            jLabelPRE5.setEnabled(true);
            jLabelPRE6.setEnabled(false);
            jLabelPRE7.setEnabled(false);
            jLabelPRE8.setEnabled(false);
            jRadioRES13.setEnabled(true);
            jRadioRES14.setEnabled(true);
            jRadioRES15.setEnabled(true);
            jRadioRES16.setEnabled(false);
            jRadioRES17.setEnabled(false);
            jRadioRES18.setEnabled(false);
            jRadioRES19.setEnabled(false);
            jRadioRES20.setEnabled(false);
            jRadioRES21.setEnabled(false);
            jRadioRES22.setEnabled(false);
            jRadioRES23.setEnabled(false);
            jRadioRES24.setEnabled(false);
            jButton2.setEnabled(false);
            jB1.setEnabled(false);
            jB2.setEnabled(false);
            jB3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabelPRE5 = new javax.swing.JLabel();
        jLabelPRE6 = new javax.swing.JLabel();
        jLabelPRE7 = new javax.swing.JLabel();
        jLabelPRE8 = new javax.swing.JLabel();
        jRadioRES13 = new javax.swing.JRadioButton();
        jRadioRES14 = new javax.swing.JRadioButton();
        jRadioRES15 = new javax.swing.JRadioButton();
        jRadioRES16 = new javax.swing.JRadioButton();
        jRadioRES17 = new javax.swing.JRadioButton();
        jRadioRES18 = new javax.swing.JRadioButton();
        jRadioRES19 = new javax.swing.JRadioButton();
        jRadioRES20 = new javax.swing.JRadioButton();
        jRadioRES21 = new javax.swing.JRadioButton();
        jRadioRES22 = new javax.swing.JRadioButton();
        jRadioRES23 = new javax.swing.JRadioButton();
        jRadioRES24 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("CUESTIONARIO DE CAPITALES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(136, 23, 560, 43);

        jLabelPRE5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelPRE5.setText("5. CAPITAL DE ESTADOS UNIDOS:");
        getContentPane().add(jLabelPRE5);
        jLabelPRE5.setBounds(10, 80, 240, 17);

        jLabelPRE6.setFont(jLabelPRE6.getFont().deriveFont((jLabelPRE6.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, jLabelPRE6.getFont().getSize()+3));
        jLabelPRE6.setText("6. CAPITAL DE ESPAÑA:");
        getContentPane().add(jLabelPRE6);
        jLabelPRE6.setBounds(10, 190, 180, 17);

        jLabelPRE7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelPRE7.setText("7. CAPITAL DE ITALIA:");
        getContentPane().add(jLabelPRE7);
        jLabelPRE7.setBounds(10, 300, 160, 17);

        jLabelPRE8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelPRE8.setText("8. CAPITAL DE FRANCIA:");
        getContentPane().add(jLabelPRE8);
        jLabelPRE8.setBounds(10, 420, 180, 17);

        buttonGroup1.add(jRadioRES13);
        jRadioRES13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES13.setText("NEW YORK");
        jRadioRES13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES13ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES13);
        jRadioRES13.setBounds(10, 100, 230, 25);

        buttonGroup1.add(jRadioRES14);
        jRadioRES14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES14.setText("ORLANDO");
        jRadioRES14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES14ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES14);
        jRadioRES14.setBounds(10, 125, 230, 25);

        buttonGroup1.add(jRadioRES15);
        jRadioRES15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES15.setText("WASHINGTON");
        jRadioRES15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES15ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES15);
        jRadioRES15.setBounds(10, 150, 230, 25);

        buttonGroup2.add(jRadioRES16);
        jRadioRES16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES16.setText("MADRID");
        jRadioRES16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES16ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES16);
        jRadioRES16.setBounds(10, 213, 170, 20);

        buttonGroup2.add(jRadioRES17);
        jRadioRES17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES17.setText("BARCELONA");
        jRadioRES17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES17ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES17);
        jRadioRES17.setBounds(10, 233, 170, 30);

        buttonGroup2.add(jRadioRES18);
        jRadioRES18.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES18.setText("SEVILLA");
        jRadioRES18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES18ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES18);
        jRadioRES18.setBounds(10, 260, 170, 20);

        buttonGroup3.add(jRadioRES19);
        jRadioRES19.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES19.setText("VENECIA");
        jRadioRES19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES19ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES19);
        jRadioRES19.setBounds(10, 320, 150, 25);

        buttonGroup3.add(jRadioRES20);
        jRadioRES20.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES20.setText("ROMA");
        jRadioRES20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES20ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES20);
        jRadioRES20.setBounds(10, 345, 150, 30);

        buttonGroup3.add(jRadioRES21);
        jRadioRES21.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES21.setText("PISA");
        jRadioRES21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES21ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES21);
        jRadioRES21.setBounds(10, 375, 150, 30);

        buttonGroup4.add(jRadioRES22);
        jRadioRES22.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES22.setText("NIZA");
        jRadioRES22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES22ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES22);
        jRadioRES22.setBounds(10, 440, 170, 25);

        buttonGroup4.add(jRadioRES23);
        jRadioRES23.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES23.setText("LYON");
        jRadioRES23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES23ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES23);
        jRadioRES23.setBounds(10, 465, 170, 30);

        buttonGroup4.add(jRadioRES24);
        jRadioRES24.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jRadioRES24.setText("PARIS");
        jRadioRES24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRES24ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioRES24);
        jRadioRES24.setBounds(10, 495, 170, 30);

        jButton2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("SIGUIENTE HOJA");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 460, 170, 70);

        jB1.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jB1.setText("SIGUIENTE PREGUNTA");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        getContentPane().add(jB1);
        jB1.setBounds(280, 140, 180, 40);

        jB2.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jB2.setText("SIGUIENTE PREGUNTA");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        getContentPane().add(jB2);
        jB2.setBounds(280, 240, 180, 40);

        jB3.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jB3.setText("SIGUIENTE PREGUNTA");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        getContentPane().add(jB3);
        jB3.setBounds(280, 350, 180, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario1/cuestionarios.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioRES13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES13ActionPerformed
        jRadioRES15.setEnabled(false);
        jRadioRES14.setEnabled(false);
        jB1.setEnabled(true);
    }//GEN-LAST:event_jRadioRES13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Evaluacion3 op=new Evaluacion3();
        op.setVisible(true);
        op.setSize(950,600);
        Evaluacion1 cap=new Evaluacion1();
        cont1=cap.cont+cont1;
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioRES15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES15ActionPerformed
       jRadioRES15.isSelected();
       cont1=cont1+10; 
       jRadioRES14.setEnabled(false);
       jRadioRES13.setEnabled(false); 
       jB1.setEnabled(true); 
    }//GEN-LAST:event_jRadioRES15ActionPerformed

    private void jRadioRES16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES16ActionPerformed
       jRadioRES16.isSelected();
       cont1=cont1+10; 
       jRadioRES17.setEnabled(false);
       jRadioRES18.setEnabled(false);  
       jB2.setEnabled(true); 
    }//GEN-LAST:event_jRadioRES16ActionPerformed

    private void jRadioRES20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES20ActionPerformed
       jRadioRES20.isSelected();
       cont1=cont1+10; 
       jRadioRES19.setEnabled(false);
       jRadioRES21.setEnabled(false);  
       jB3.setEnabled(true); 
    }//GEN-LAST:event_jRadioRES20ActionPerformed

    private void jRadioRES22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES22ActionPerformed
        jRadioRES24.setEnabled(false);
        jRadioRES23.setEnabled(false);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jRadioRES22ActionPerformed

    private void jRadioRES24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES24ActionPerformed
       jRadioRES24.isSelected();
       cont1=cont1+10; 
       jRadioRES23.setEnabled(false);
       jRadioRES22.setEnabled(false);  
       jButton2.setEnabled(true);
    }//GEN-LAST:event_jRadioRES24ActionPerformed

    private void jRadioRES17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES17ActionPerformed
        jRadioRES16.setEnabled(false);
        jRadioRES18.setEnabled(false);
        jB2.setEnabled(true); 
    }//GEN-LAST:event_jRadioRES17ActionPerformed

    private void jRadioRES19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES19ActionPerformed
        jRadioRES20.setEnabled(false);
        jRadioRES21.setEnabled(false);
        jB3.setEnabled(true); 
    }//GEN-LAST:event_jRadioRES19ActionPerformed

    private void jRadioRES14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES14ActionPerformed
        jRadioRES15.setEnabled(false);
        jRadioRES13.setEnabled(false);
        jB1.setEnabled(true); 
    }//GEN-LAST:event_jRadioRES14ActionPerformed

    private void jRadioRES18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES18ActionPerformed
        jRadioRES17.setEnabled(false);
        jRadioRES16.setEnabled(false);
        jB2.setEnabled(true); 
    }//GEN-LAST:event_jRadioRES18ActionPerformed

    private void jRadioRES21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES21ActionPerformed
        jRadioRES19.setEnabled(false);
        jRadioRES20.setEnabled(false);
        jB3.setEnabled(true); 
    }//GEN-LAST:event_jRadioRES21ActionPerformed

    private void jRadioRES23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRES23ActionPerformed
        jRadioRES24.setEnabled(false);
        jRadioRES22.setEnabled(false);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jRadioRES23ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
            jLabelPRE6.setEnabled(true);
            jRadioRES16.setEnabled(true);
            jRadioRES17.setEnabled(true);
            jRadioRES18.setEnabled(true);
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
            jLabelPRE7.setEnabled(true);
            jRadioRES19.setEnabled(true);
            jRadioRES20.setEnabled(true);
            jRadioRES21.setEnabled(true);
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
            jLabelPRE8.setEnabled(true);
            jRadioRES22.setEnabled(true);
            jRadioRES23.setEnabled(true);
            jRadioRES24.setEnabled(true);
    }//GEN-LAST:event_jB3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluacion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //</editor-fold>
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Evaluacion2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPRE5;
    private javax.swing.JLabel jLabelPRE6;
    private javax.swing.JLabel jLabelPRE7;
    private javax.swing.JLabel jLabelPRE8;
    private javax.swing.JRadioButton jRadioRES13;
    private javax.swing.JRadioButton jRadioRES14;
    private javax.swing.JRadioButton jRadioRES15;
    private javax.swing.JRadioButton jRadioRES16;
    private javax.swing.JRadioButton jRadioRES17;
    private javax.swing.JRadioButton jRadioRES18;
    private javax.swing.JRadioButton jRadioRES19;
    private javax.swing.JRadioButton jRadioRES20;
    private javax.swing.JRadioButton jRadioRES21;
    private javax.swing.JRadioButton jRadioRES22;
    private javax.swing.JRadioButton jRadioRES23;
    private javax.swing.JRadioButton jRadioRES24;
    // End of variables declaration//GEN-END:variables
}
