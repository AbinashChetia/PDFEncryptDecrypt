import com.formdev.flatlaf.FlatIntelliJLaf;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        btnSelectFile = new javax.swing.JButton();
        lbSelection = new javax.swing.JLabel();
        btnStoreLoc = new javax.swing.JButton();
        lbLoc = new javax.swing.JLabel();
        btnEncrypt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb2 = new javax.swing.JLabel();
        tfPassword1 = new javax.swing.JTextField();
        btnSelectFile1 = new javax.swing.JButton();
        lbSelection1 = new javax.swing.JLabel();
        btnStoreLoc1 = new javax.swing.JButton();
        lbLoc1 = new javax.swing.JLabel();
        btnDecrypt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDF Encryption & Decryption");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(456, 420));
        setMinimumSize(new java.awt.Dimension(456, 420));
        setPreferredSize(new java.awt.Dimension(456, 420));

        jLabel1.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PDF Encryption & Decryption");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        lb1.setText("Select a suitable password");

        btnSelectFile.setText("Select a PDF File to be encrypted");
        btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFileActionPerformed(evt);
            }
        });

        lbSelection.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnStoreLoc.setText("Select a location to store the encrypted file ");
        btnStoreLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreLocActionPerformed(evt);
            }
        });

        lbLoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSelection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEncrypt)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectFile)
                            .addComponent(btnStoreLoc))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelectFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStoreLoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEncrypt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Encrypt", jPanel1);

        lb2.setText("Enter the password of the PDF File");

        btnSelectFile1.setText("Select the PDF File to be decrypted");
        btnSelectFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFile1ActionPerformed(evt);
            }
        });

        lbSelection1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnStoreLoc1.setText("Select a location to store the decrypted file ");
        btnStoreLoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreLoc1ActionPerformed(evt);
            }
        });

        lbLoc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnDecrypt.setText("Decrypt");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb2)
                    .addComponent(btnStoreLoc1)
                    .addComponent(btnSelectFile1)
                    .addComponent(lbSelection1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(btnDecrypt)
                    .addComponent(lbLoc1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(tfPassword1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelectFile1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSelection1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStoreLoc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnDecrypt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Decrypt", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFileActionPerformed
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter(null, "pdf");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setDialogTitle("Choose PDF file to encrypt");
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File f = new File(fileChooser.getSelectedFile().getAbsolutePath());
            try {
                pdd = Loader.loadPDF(f);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex);                
                lbSelection.setText("");
                return;
            }
            fileName = fileChooser.getSelectedFile().getName();
            fileExtension = FilenameUtils.getExtension(fileName);
        }
        if (!"pdf".equals(fileExtension)) {
            JOptionPane.showMessageDialog(this, "The selected file is not a PDF file! Please select a PDF file.");
            fileName = "";
            fileExtension = "";
        } else {
            lbSelection.setText(fileName + " is selected.");
        }
    }//GEN-LAST:event_btnSelectFileActionPerformed

    private void btnStoreLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreLocActionPerformed
        JFileChooser locChooser = new JFileChooser();
        locChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        locChooser.setDialogTitle("Choose a location to store");
        if (locChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            storeLoc = locChooser.getSelectedFile().toString();
            lbLoc.setText(storeLoc);
        }
    }//GEN-LAST:event_btnStoreLocActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        if (tfPassword.getText().isEmpty() || tfPassword.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No password is entered! Please enter a suitable password.");
        }
        else if (fileName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No file is selected! Please select a file.");
        }
        else if (storeLoc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No location to store encrypted file is selected! Please select a suitable location.");
        }
        else {
            String newFileName = fileName.replace("." + fileExtension, "_encrypted." + fileExtension);
            boolean check = new File(storeLoc + "/" + newFileName).exists();
            if (check) {
                JOptionPane.showMessageDialog(this, "Another file with name " + newFileName + " exists in the specified location. Please rename or relocate that file or select some other location to store, and click the \"Encrypt\" button to continue.");
            } else {
                try {
                    String passkey = tfPassword.getText();
                    AccessPermission ap = new AccessPermission();
                    StandardProtectionPolicy stpp = new StandardProtectionPolicy(passkey, passkey, ap);
                    stpp.setEncryptionKeyLength(128);
                    stpp.setPermissions(ap);
                    pdd.protect(stpp);
                    pdd.save(storeLoc + "/" + newFileName);
                    pdd.close();
                    JOptionPane.showMessageDialog(this, newFileName + " has been stored in specified location.");
                    storeLoc = "";
                    fileName = "";
                    fileExtension = "";
                    lbSelection.setText("");
                    lbLoc.setText("");
                    tfPassword.setText("");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSelectFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFile1ActionPerformed
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter(null, "pdf");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setDialogTitle("Choose PDF file to decrypt");
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            decryptFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
            fileName1 = fileChooser.getSelectedFile().getName();
            fileExtension1 = FilenameUtils.getExtension(fileName1);
        }
        lbSelection1.setText(fileName1 + " is selected.");
    }//GEN-LAST:event_btnSelectFile1ActionPerformed

    private void btnStoreLoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreLoc1ActionPerformed
        JFileChooser locChooser = new JFileChooser();
        locChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        locChooser.setDialogTitle("Choose a location to store");
        if (locChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            storeLoc1 = locChooser.getSelectedFile().toString();
            lbLoc1.setText(storeLoc1);
        }
    }//GEN-LAST:event_btnStoreLoc1ActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        if (tfPassword1.getText().isEmpty() || tfPassword1.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No password is entered! Please enter the password.");
        }
        else if (fileName1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No file is selected! Please select a file.");
        }
        else if (storeLoc1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No location to store decrypted file is selected! Please select a suitable location.");
        }
        else {
            String newFileName = fileName1.replace("." + fileExtension1, "_decrypted." + fileExtension1);
            boolean check = new File(storeLoc1 + "/" + newFileName).exists();
            if (check) {
                JOptionPane.showMessageDialog(this, "Another file with name " + newFileName + " exists in the specified location. Please rename or relocate that file or select some other location to store, and then, click the \"Decrypt\" button to continue.");
            } else {
                try {          
                    PDDocument pdd = Loader.loadPDF(decryptFile, tfPassword1.getText());
                    pdd.setAllSecurityToBeRemoved(true);
                    pdd.save(storeLoc1 + "/" + newFileName);
                    pdd.close();
                    JOptionPane.showMessageDialog(this, newFileName + " has been stored in specified location.");
                    storeLoc1 = "";
                    fileName1 = "";
                    fileExtension1 = "";
                    lbSelection1.setText("");
                    lbLoc1.setText("");
                    tfPassword1.setText("");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
        }
    }//GEN-LAST:event_btnDecryptActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private String storeLoc = "";
    private String fileName = "";
    private String fileExtension = "";
    private PDDocument pdd;
    private String storeLoc1 = "";
    private String fileName1 = "";
    private String fileExtension1 = "";
    private File decryptFile;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSelectFile;
    private javax.swing.JButton btnSelectFile1;
    private javax.swing.JButton btnStoreLoc;
    private javax.swing.JButton btnStoreLoc1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbLoc;
    private javax.swing.JLabel lbLoc1;
    private javax.swing.JLabel lbSelection;
    private javax.swing.JLabel lbSelection1;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPassword1;
    // End of variables declaration//GEN-END:variables
}
