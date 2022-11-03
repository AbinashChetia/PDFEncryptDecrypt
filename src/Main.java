import com.formdev.flatlaf.FlatIntelliJLaf;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        btnSelectFile = new javax.swing.JButton();
        lbSelection = new javax.swing.JLabel();
        btnEncrypt = new javax.swing.JButton();
        lbSelection1 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        btnStoreLoc = new javax.swing.JButton();
        lbLoc = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(392, 450));
        setMinimumSize(new java.awt.Dimension(392, 450));
        setPreferredSize(new java.awt.Dimension(392, 450));

        jLabel1.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PDF Encryption");

        btnSelectFile.setText("Select a PDF File to be encrypted");
        btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFileActionPerformed(evt);
            }
        });

        lbSelection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        lbSelection1.setText("Select a suitable password");

        btnStoreLoc.setText("Select a location to store the encrypted file ");
        btnStoreLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreLocActionPerformed(evt);
            }
        });

        lbLoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSelectFile)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfPassword)
                                    .addComponent(lbSelection1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbLoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStoreLoc))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEncrypt)
                .addGap(56, 56, 56)
                .addComponent(btnExit)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbSelection1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSelectFile)
                .addGap(5, 5, 5)
                .addComponent(lbSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStoreLoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncrypt)
                    .addComponent(btnExit))
                .addContainerGap(38, Short.MAX_VALUE))
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
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSelectFile;
    private javax.swing.JButton btnStoreLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbLoc;
    private javax.swing.JLabel lbSelection;
    private javax.swing.JLabel lbSelection1;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}
