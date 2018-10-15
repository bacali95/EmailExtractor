/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso;

import com.eniso.FileType.PPTFiles;
import com.eniso.FileType.XLSFiles;
import com.eniso.FileType.CSVFiles;
import com.eniso.FileType.PDFFiles;
import com.eniso.FileType.XLSXFiles;
import com.eniso.FileType.DOCXFiles;
import com.eniso.FileType.DOCFiles;
import com.eniso.FileType.PPTXFiles;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import com.eniso.FileType.MailList;

/**
 *
 * @author Nasreddine
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form first
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("E-MAIL EXTRACTOR ");
        setBounds(new java.awt.Rectangle(300, 110, 0, 0));

        jButton1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMinimumSize(new java.awt.Dimension(7, 7));
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SAVE TO FILE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Load files...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(2, 2, 2))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser("C:\\Users\\Nasreddine\\Desktop");
        chooser.setDialogTitle("File to choose");
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return "csv".contains(f.getName().substring(f.getName().lastIndexOf(".") + 1).toLowerCase()) || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "CSV Document (*.csv)";
            }
        });
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return "txt".contains(f.getName().substring(f.getName().lastIndexOf(".") + 1).toLowerCase()) || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Text Document (*.txt)";
            }
        });
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return "html|htm".contains(f.getName().substring(f.getName().lastIndexOf(".") + 1).toLowerCase()) || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Web Page(*.html .htm)";
            }
        });
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return "pdf".contains(f.getName().substring(f.getName().lastIndexOf(".") + 1).toLowerCase()) || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "PDF Document (*.pdf)";
            }
        });
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return "xls|xlsx".contains(f.getName().substring(f.getName().lastIndexOf(".") + 1).toLowerCase()) || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Excel Document (*.xls *.xlsx)";
            }
        });
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return "ppt|pptx".contains(f.getName().substring(f.getName().lastIndexOf(".") + 1).toLowerCase()) || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Powerpoint Document (*.ppt *.pptx)";
            }
        });
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return "doc|docx".contains(f.getName().substring(f.getName().lastIndexOf(".") + 1).toLowerCase()) || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Word Document (*.doc *.docx)";
            }
        });
        chooser.setApproveButtonText("Choix du fichier...");
        chooser.setMultiSelectionEnabled(true);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File[] files = chooser.getSelectedFiles();
            String names = "";
            for (File file : files) {
                names += file.getName() + "; ";
            }
            jTextField1.setForeground(new java.awt.Color(0, 0, 0));
            jTextField1.setText(names);
            for (File file : files) {
                String ext = file.getName().substring(file.getName().lastIndexOf(".") + 1);
                System.out.println(ext);
                MailList dt = null;
                if (ext.equals("doc")) {
                    dt = new DOCFiles();
                } else if (ext.equals("docx")) {
                    dt = new DOCXFiles();
                } else if (ext.equals("xlsx")) {
                    dt = new XLSXFiles();
                } else if (ext.equals("xls")) {
                    dt = new XLSFiles();
                } else if (ext.equals("ppt")) {
                    dt = new PPTFiles();
                } else if (ext.equals("pptx")) {
                    dt = new PPTXFiles();
                } else if (ext.equals("pdf")) {
                    dt = new PDFFiles();
                } else if ("csv|htm|html|txt".contains(ext)) {
                    dt = new CSVFiles();
                }
                if (dt != null) {
                    dt.setWorkFile(file);
                    for (String string : dt.getList()) {
                        if (!jTextArea1.getText().contains(string)) {
                            jTextArea1.append(string + "\r\n");
                            edited = true;
                        }
                    }
                } else {
                    jOptionPane1.showMessageDialog(rootPane, "Unsupported Type !", "Type Warning", JOptionPane.WARNING_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jOptionPane1.showConfirmDialog(rootPane, "Would You like to exit ?", "EXIT", JOptionPane.YES_NO_OPTION) == 0) {
            if (edited == false || jTextArea1.getText().equals("")) {
                System.exit(0);
            } else {
                if (jOptionPane1.showConfirmDialog(rootPane, "Work not saved, would you save it ?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 1) {
                    System.exit(0);
                } else {
                    jButton3ActionPerformed(evt);
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser choose = new JFileChooser("C:\\Users\\Nasreddine\\Desktop");
        choose.setDialogTitle("Specify a file to save");
        int userSelection = choose.showSaveDialog(null);
        boolean edit = false;
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = choose.getSelectedFile();
            Object[] options = {"Ecrase", "Edit", "Rename", "Cancel"};
            if (fileToSave.exists()) {
                int n = jOptionPane1.showOptionDialog(rootPane, "File alredy exist, would you want to ecrase it ?", "Warning",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[2]);
                switch (n) {
                    case 1:
                        edit = true;
                        break;
                    case 2:
                        jButton3ActionPerformed(evt);
                        break;
                    case 3:
                        return;
                    default:
                        break;
                }
            }
            try {
                FileWriter fw = new FileWriter(fileToSave, edit);
                fw.write(jTextArea1.getText());
                fw.close();
                edited = false;
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object[] options = {"Yes", "No"};
        int n = jOptionPane1.showOptionDialog(rootPane, "Would you like to save result ?",
                "Save Results", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]);
        if (n == 0) {
            jButton3ActionPerformed(evt);
        }
        jTextArea1.setText("");
        jTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    private boolean edited = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
