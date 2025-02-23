/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Nguyễn Đức Thiện
 */
public class chooseFolder extends javax.swing.JDialog {

    main parentForm;

    public chooseFolder(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        parentForm = (main) parent;
    }

    private int type = 0;

    public void setType(int type) {
        this.type = type;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaFolderChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Save to");
        setLocationByPlatform(true);
        setResizable(false);

        areaFolderChooser.setAcceptAllFileFilterUsed(false);
        areaFolderChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        areaFolderChooser.setCurrentDirectory(new java.io.File("C:\\Users\\Admin\\Downloads"));
        areaFolderChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        areaFolderChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaFolderChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaFolderChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaFolderChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaFolderChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaFolderChooserActionPerformed
        if (type == 1) {
            String dir = areaFolderChooser.getSelectedFile().toString();
            parentForm.setFolderSave(dir);
            dispose();
        } else if (type == 2) {
            String dir = areaFolderChooser.getSelectedFile().toString();
            parentForm.setFolderSave1(dir);
            dispose();
        } else if (type == 3) {
            String dir = areaFolderChooser.getSelectedFile().toString();
            if (parentForm.checkFileMp4(dir)) {
                parentForm.setFolderinput(dir);
                dispose();
            }
        } else if (type == 4) {
            String dir = areaFolderChooser.getSelectedFile().toString();
            if (parentForm.checkFileMp43(dir)) {
                parentForm.setFolderinput3(dir);
                dispose();
            }
        } else if (type == 5) {
            String dir = areaFolderChooser.getSelectedFile().toString();
            if (parentForm.checkFileMp42(dir)) {
                parentForm.setFolderinput2(dir);
                dispose();
            }

        } else if (type == 6) {
            String dir = areaFolderChooser.getSelectedFile().toString();
            if (parentForm.checkFileMp44(dir)) {
                parentForm.setFolderinputlive(dir);
                dispose();
            }
        }

    }//GEN-LAST:event_areaFolderChooserActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chooseFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chooseFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chooseFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chooseFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                chooseFolder dialog = new chooseFolder(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser areaFolderChooser;
    // End of variables declaration//GEN-END:variables
}
