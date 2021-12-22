
package segretarie;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Segretaria extends javax.swing.JFrame {

    GestioneMetadata scuolaNNNN;
    String db = "scuolannnn";
    
    public Segretaria() {
        initComponents();
        try {
            // anche se bisognerebbe fare loggare la segretaria con il suo account e non quello root
            scuolaNNNN = new GestioneMetadata("localhost",3306, db, "root", "password");
        } catch (Exception ex) {
         JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCognome = new javax.swing.JTextField();
        jTextFieldInidirizzo = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jButtoniInserisciStudente = new javax.swing.JButton();
        jButtonaIUTO = new javax.swing.JButton();
        jButtonRicercaStudente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonElencoTab = new javax.swing.JButton();
        jButtonRimuoviStudente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldNome.setText("Nome");
        jTextFieldNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNomeMouseClicked(evt);
            }
        });

        jTextFieldCognome.setText("Cognome");
        jTextFieldCognome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCognomeMouseClicked(evt);
            }
        });

        jTextFieldInidirizzo.setText("Indirizzo");
        jTextFieldInidirizzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldInidirizzoMouseClicked(evt);
            }
        });

        jTextFieldTelefono.setText("Telefono");
        jTextFieldTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldTelefonoMouseClicked(evt);
            }
        });

        jButtoniInserisciStudente.setText("INSERISCI STUDENTE");
        jButtoniInserisciStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoniInserisciStudenteActionPerformed(evt);
            }
        });

        jButtonaIUTO.setText("AIUTO");
        jButtonaIUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaIUTOActionPerformed(evt);
            }
        });

        jButtonRicercaStudente.setText("RICERCA STUDENTE");
        jButtonRicercaStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRicercaStudenteActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonElencoTab.setText("MOSTRA TABELLE");
        jButtonElencoTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElencoTabActionPerformed(evt);
            }
        });

        jButtonRimuoviStudente.setText("ELIMINA STUDENTE");
        jButtonRimuoviStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRimuoviStudenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRicercaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonElencoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldInidirizzo)
                                .addComponent(jTextFieldTelefono)
                                .addComponent(jTextFieldNome)
                                .addComponent(jTextFieldCognome)
                                .addComponent(jButtoniInserisciStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jButtonaIUTO, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                            .addComponent(jButtonRimuoviStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButtonaIUTO)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInidirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtoniInserisciStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRimuoviStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonElencoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRicercaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNomeMouseClicked
        jTextFieldNome.setText("");
    }//GEN-LAST:event_jTextFieldNomeMouseClicked

    private void jTextFieldCognomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCognomeMouseClicked
        jTextFieldCognome.setText("");
    }//GEN-LAST:event_jTextFieldCognomeMouseClicked

    private void jTextFieldInidirizzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldInidirizzoMouseClicked
        jTextFieldInidirizzo.setText("");
    }//GEN-LAST:event_jTextFieldInidirizzoMouseClicked

    private void jTextFieldTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoMouseClicked
        jTextFieldTelefono.setText("");
    }//GEN-LAST:event_jTextFieldTelefonoMouseClicked

    private void jButtoniInserisciStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoniInserisciStudenteActionPerformed
        try {
            scuolaNNNN.insertStudente(jTextFieldNome.getText(), jTextFieldCognome.getText(), jTextFieldInidirizzo.getText(), jTextFieldTelefono.getText());
            jButtoniInserisciStudente.setBackground(Color.green);
            JOptionPane.showMessageDialog(rootPane, "Studente aggiunto con successo");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            jButtoniInserisciStudente.setBackground(Color.red);
        }
    }//GEN-LAST:event_jButtoniInserisciStudenteActionPerformed

    private void jButtonaIUTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaIUTOActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Btn INSERISCI STUDENTE-> Inserire i dati che si vogliono aggiungere;" + "\n" + "Btn RICERCA STUDENTE-> Utilizza il campo cognome;" + "\n" + "Btn ELIMINA STUDENTE-> Utilizza i campi nome e cognome.");
    }//GEN-LAST:event_jButtonaIUTOActionPerformed

    private void jButtonRicercaStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRicercaStudenteActionPerformed
        try {
            //jTextArea1.setText(scuolaNNNN.ricercaStudenti(jTextFieldCognome.getText()));
            jTextArea1.setText("");
            jButtonRicercaStudente.setBackground(Color.green);
            ArrayList stud;
            stud = scuolaNNNN.ricercaStudente(jTextFieldCognome.getText(), jTextFieldNome.getText());            
            
            for (int i = 0; i < stud.size(); i++) {
                String str = (String) stud.get(i);
                jTextArea1.append(str + "\n");
            }
            JOptionPane.showMessageDialog(rootPane, "la ricerca da lei effettuata con il filtro '" + jTextFieldCognome.getText() + "' è andata a buon fine e ha prodotto " + stud.size() + " risultati");
            
        } catch (Exception ex) {
            String messaggio = "La ricerca dello studente avente cognome '" + jTextFieldCognome.getText() + "' non è andata a buon fine";
            JOptionPane.showMessageDialog(rootPane, messaggio);
            jButtonRicercaStudente.setBackground(Color.red);
        }
    }//GEN-LAST:event_jButtonRicercaStudenteActionPerformed

    private void jButtonElencoTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElencoTabActionPerformed
        try {
            jTextArea1.setText("");
            jButtonElencoTab.setBackground(Color.green);
            ArrayList tab;
            tab = scuolaNNNN.elencoTabelle();            
            
            for (int i = 0; i < tab.size(); i++) {
                String str = (String) tab.get(i);
                jTextArea1.append(str + "\n");
            }
            JOptionPane.showMessageDialog(rootPane, "Ricerca di Tabelle nel database " + db + " è andata a buon fine");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "La ricerca delle tabelle nel database " + db + "non è andata a buon fine");
            jButtonRicercaStudente.setBackground(Color.red);
        }
    }//GEN-LAST:event_jButtonElencoTabActionPerformed

    private void jButtonRimuoviStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviStudenteActionPerformed
        try {
            jTextArea1.setText("");
            ArrayList studDaEliminare;
            studDaEliminare = scuolaNNNN.ricercaStudente(jTextFieldCognome.getText(), jTextFieldNome.getText());
            //stampo gli studenti sulla JtexArea;
            for (int i = 0; i < studDaEliminare.size(); i++) {
                String str = (String) studDaEliminare.get(i);
                jTextArea1.append(str + "\n");
            }
            //Gestione scelta Della conferma da parte dell'utente
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Desidera proecedere con la rimozione degli studenti riportati?", "Rimozione dal DataBase", dialogButton);
            if(dialogResult == 0) {
                int rimozioni = scuolaNNNN.deleteStudente(jTextFieldCognome.getText(), jTextFieldNome.getText());
                jButtonRimuoviStudente.setBackground(Color.green);
                JOptionPane.showMessageDialog(rootPane, "Rimozione è stata effettuata con successo, con la rimozione di " + rimozioni + " record");
            } else {
              JOptionPane.showMessageDialog(rootPane, "Rimozione annullata con successo");
            } 
            
        } catch (Exception ex) {
            String messaggio = "La rimozione dello studente avente cognome '" + jTextFieldCognome.getText() + "' non è andata a buon fine";
            JOptionPane.showMessageDialog(rootPane, messaggio);
            jButtonRimuoviStudente.setBackground(Color.red);
        }
    }//GEN-LAST:event_jButtonRimuoviStudenteActionPerformed

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
            java.util.logging.Logger.getLogger(Segretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Segretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Segretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Segretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Segretaria().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonElencoTab;
    private javax.swing.JButton jButtonRicercaStudente;
    private javax.swing.JButton jButtonRimuoviStudente;
    private javax.swing.JButton jButtonaIUTO;
    private javax.swing.JButton jButtoniInserisciStudente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCognome;
    private javax.swing.JTextField jTextFieldInidirizzo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
