/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.form;

import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import rs.ac.bg.fon.ps.communication.Communication;
import rs.ac.bg.fon.ps.PSCommon.communication.Operation;
import rs.ac.bg.fon.ps.PSCommon.communication.Receiver;
import rs.ac.bg.fon.ps.PSCommon.communication.Request;
import rs.ac.bg.fon.ps.PSCommon.communication.Response;
import rs.ac.bg.fon.ps.PSCommon.communication.Sender;
import rs.ac.bg.fon.ps.PSCommon.domain.Klijent;
import rs.ac.bg.fon.ps.PSCommon.domain.PlanGledanja;
//import rs.ac.bg.fon.ps.domain.MeasurementUnit;
import rs.ac.bg.fon.ps.PSCommon.domain.Rezervacija;
import rs.ac.bg.fon.ps.view.form.util.FormMode;

/**
 * Klasa koja predstavlja formu za rad sa klijentima.
 * Moze da se prikaze i sacuva nov klijent.
 */
public class FrmKlijent extends javax.swing.JDialog {

   /**
    * Konstruktor klase FrmKlijent.
    *
    * @param parent Glavni okvir koji sadrži ovu formu.
    * @param modal  Da li je forma modalna (true) ili nije (false).
    * @param formMode Način rada forme (dodavanje, izmena ili pregled).
    */
    public FrmKlijent(java.awt.Frame parent, boolean modal, FormMode formMode) {
        super(parent, modal);
        initComponents();
        prepareView(formMode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form for client");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Klijent:"));

        lblId.setText("ID:");

        lblName.setText("Name:");

        lblLastName.setText("Lastname:");

        lblEmail.setText("Email:");

        lblStatus.setText("Status:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "student", "penzioner", "nezaposlen", "redovan" }));
        jComboBox1.setSelectedIndex(-1);

        jLabel1.setText("ili izaberite");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID)
                            .addComponent(txtName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addGap(133, 133, 133)
                        .addComponent(txtEmail))
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
 * Metoda koja se poziva kada korisnik pritisne dugme "Sačuvaj".
 * Cuva klijenta,uzima sa forme njegove podatke,ukoliko nije nesto selektovano, vratice upozorenje
 * ako je sve u redu poslace preko Communictaion klijenta
 * postoji opcija Klijent svaed a ako nije dobro klijent not saved
 * @param evt Objekat koji sadrži informacije o događaju.
 */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {
            Klijent klijent = new Klijent();
            //klijent.setKlijentId(Integer.parseInt(getTxtID().getText().trim()));
            klijent.setIme(getTxtName().getText().trim());
            klijent.setPrezime(getTxtLastname().getText().trim());
            if(getCb().getSelectedIndex()==-1){
            klijent.setStatus(getTxtStatus().getText().trim());
            }else{
                 klijent.setStatus(getCb().getSelectedItem().toString());
            }
           klijent.setEmail(getTxtEmail().getText().trim());

            Communication.getInstance().addKlijent(klijent);
            JOptionPane.showMessageDialog(this, "Klijent successfully saved.");
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() +" Klijent not saved","ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSaveActionPerformed
/**
 * Metoda koja se poziva kada korisnik pritisne dugme "Otkaži".
 *
 * @param evt Objekat koji sadrži informacije o događaju.
 */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    /**
 * Metoda koja vraća dugme "Otkaži".
 *
 * @return Dugme "Otkaži".
 */
    public JButton getBtnCancel() {
        return btnCancel;
    }

/**
 * Metoda koja vraća dugme "Sačuvaj".
 *
 * @return Dugme "Sačuvaj".
 */
    public JButton getBtnSave() {
        return btnSave;
    }

    /**
 * Metoda koja vraća panel jPanel1.
 *
 * @return Panel jPanel1.
 */
    public JPanel getjPanel1() {
        return jPanel1;
    }

   /**
 * Metoda koja vraća labelu lblLastName.
 *
 * @return Labela lblLastName.
 */
    public JLabel getLblLastname() {
        return lblLastName;
    }
/**
 * Metoda koja vraća labelu lblId.
 *
 * @return Labela lblId.
 */
    public JLabel getLblId() {
        return lblId;
    }
/**
 * Metoda koja vraća labelu lblStatus.
 *
 * @return Labela lblStatus.
 */
    public JLabel getLblStatus() {
        return lblStatus;
    }

  
/**
 * Metoda koja vraća labelu lblName.
 *
 * @return Labela lblName.
 */
    public JLabel getLblName() {
        return lblName;
    }
/**
 * Metoda koja vraća labelu lblEmail.
 *
 * @return Labela lblEmail.
 */
    public JLabel getLblEmail() {
        return lblEmail;
    }
    /**
 * Metoda koja vraća JComboBox cb.
 *
 * @return JComboBox cb.
 */
      public JComboBox getCb() {
        return jComboBox1;
    }
/**
 * Metoda koja vraća JTextField txtLastname.
 *
 * @return JTextField txtLastname.
 */
    public JTextField getTxtLastname() {
        return txtLastname;
    }
/**
 * Metoda koja vraća JTextField txtID.
 *
 * @return JTextField txtID.
 */
    public JTextField getTxtID() {
        return txtID;
    }
/**
 * Metoda koja vraća JTextField txtName.
 *
 * @return JTextField txtName.
 */

    public JTextField getTxtName() {
        return txtName;
    }
/**
 * Metoda koja vraća JTextField txtStatus.
 *
 * @return JTextField txtStatus.
 */
    public JTextField getTxtStatus() {
        return txtStatus;
    }
/**
 * Metoda koja vraća JTextField txtEmail.
 *
 * @return JTextField txtEmail.
 */
     public JTextField getTxtEmail() {
        return txtEmail;
    }
/**
 * Metoda koja dodaje ActionListener za dugme btnSave.
 *
 * @param actionListener ActionListener koji se dodaje.
 */
    public void addSaveBtnActionListener(ActionListener actionListener) {
        btnSave.addActionListener(actionListener);
    }

 
/**
 * Metoda koja dodaje ActionListener za dugme btnCancel.
 *
 * @param actionListener ActionListener koji se dodaje.
 */
    public void addCancelBtnActionListener(ActionListener actionListener) {
        btnCancel.addActionListener(actionListener);
    }
    

  
/**
 * Metoda koja priprema prikaz forme na osnovu zadatog FormMode-a.
 *
 * @param formMode FormMode koji određuje pripremu prikaza forme.
 */
    private void prepareView(FormMode formMode) {
        setupComponents(formMode);

    }



  
/**
 * Metoda koja postavlja komponente forme na osnovu zadatog FormMode-a.
 *ova forma ima samo add mode jer se klijent moze samo novi dodavati
 * @param formMode FormMode koji određuje postavljanje komponenti forme.
 */
    private void setupComponents(FormMode formMode) {
        switch (formMode) {
            case FORM_ADD:
                getBtnCancel().setEnabled(true);
           
                getBtnSave().setEnabled(true);
                
                getTxtID().setEnabled(false);
                getTxtName().setEnabled(true);
                getTxtLastname().setEnabled(true);
                getTxtEmail().setEnabled(true);
               getTxtStatus().setEnabled(true);
                break;
            
            
    }
    }
}


