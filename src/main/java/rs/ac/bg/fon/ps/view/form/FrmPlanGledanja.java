package rs.ac.bg.fon.ps.view.form;

import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import rs.ac.bg.fon.ps.communication.Communication;
import rs.ac.bg.fon.ps.PSCommon.communication.Operation;
import rs.ac.bg.fon.ps.PSCommon.communication.Receiver;
import rs.ac.bg.fon.ps.PSCommon.communication.Request;
import rs.ac.bg.fon.ps.PSCommon.communication.Response;
import rs.ac.bg.fon.ps.PSCommon.communication.Sender;
import rs.ac.bg.fon.ps.domain.Klijent;
import rs.ac.bg.fon.ps.domain.PlanGledanja;
import rs.ac.bg.fon.ps.domain.Predstava;
import rs.ac.bg.fon.ps.domain.Rezervacija;
import rs.ac.bg.fon.ps.domain.StavkaRezervacije;
import rs.ac.bg.fon.ps.view.form.componenet.table.ReservationsTableModel;

public class FrmPlanGledanja extends javax.swing.JDialog {

    /**
     * Creates new form FrmInvoice
     */
  

    public FrmPlanGledanja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jClient = new javax.swing.JLabel();
        cbClients = new javax.swing.JComboBox<>();
        lblPredstava = new javax.swing.JLabel();
        cbProduct = new javax.swing.JComboBox<>();
        lblGrade = new javax.swing.JLabel();
        txtGrade = new javax.swing.JTextField();
        lblWatched = new javax.swing.JLabel();
        cbWatched = new javax.swing.JComboBox<>();
        btnSaveProduct1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form for Plan Gledanja");

        jClient.setText("Clients:");

        lblPredstava.setText("Show:");

        lblGrade.setText("Grade:");

        lblWatched.setText("Watched:");

        cbWatched.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ne", "da" }));

        btnSaveProduct1.setText("Cancel");
        btnSaveProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProduct1ActionPerformed(evt);
            }
        });

        btnSave.setText("Save Changes");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jClient, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPredstava, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrade)
                    .addComponent(lblWatched))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbProduct, 0, 392, Short.MAX_VALUE)
                                .addComponent(cbClients, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbWatched, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnSaveProduct1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addGap(0, 174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jClient)
                    .addComponent(cbClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPredstava, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrade))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWatched)
                    .addComponent(cbWatched, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveProduct1)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProduct1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSaveProduct1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         try {
                    
                    PlanGledanja pl=new PlanGledanja();
                    Predstava pr= (Predstava)getCbPredstava().getSelectedItem();
                    pl.setPredstavaId(pr);
                    Klijent kl=(Klijent)getCbClient().getSelectedItem();
                    pl.setKlijentId(kl);
                    if(getCbWatched().getSelectedItem().equals("ne")){
                        pl.setGledao(false);
                    }
                    else{
                        pl.setGledao(true);
                    }
                    pl.setOcena(Integer.parseInt(getTxtGrade().getText()));
                    savePlan(pl);
                    JOptionPane.showMessageDialog(this, "PlanGledanja is saved");
                    this.dispose();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "PlanGledanja is not saved! " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

                }
    }//GEN-LAST:event_btnSaveActionPerformed

    
    public JLabel getLblShow() {
        return lblPredstava;
    }
     public JLabel getLblDiscount() {
        return lblGrade;
    }
     
    public JLabel getLblWatched() {
        return lblWatched;
    }
   
     public JLabel getLblClient() {
        return jClient;
    }

    public JComboBox<Object> getCbPredstava() {
        return cbProduct;
    }
    public JComboBox<Object> getCbClient() {
        return cbClients;
    }
   
      public JComboBox<String> getCbWatched() {
        return cbWatched;
    }

   
  
    public JButton getBtnSave(){
       return btnSave;
   }
  
  
    
 

    public JTextField getTxtGrade() {
        return txtGrade;
    }

    

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveProduct1;
    private javax.swing.JComboBox<Object> cbClients;
    private javax.swing.JComboBox<Object> cbProduct;
    private javax.swing.JComboBox<String> cbWatched;
    private javax.swing.JLabel jClient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblPredstava;
    private javax.swing.JLabel lblWatched;
    private javax.swing.JTextField txtGrade;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        try {
            getCbPredstava().setModel(new DefaultComboBoxModel(getProducts().toArray()));
            getCbPredstava().setSelectedIndex(-1);
             getCbClient().setModel(new DefaultComboBoxModel(getClients().toArray()));
            getCbClient().setSelectedIndex(-1);
        } catch (Exception ex) {
            Logger.getLogger(FrmPlanGledanja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }

    

 

    private List<Predstava> getProducts() throws Exception {
        return Communication.getInstance().getAllProducts();
    }
  private List<Klijent> getClients() throws Exception {
        return Communication.getInstance().getAllClients();
    }



    private void savePlan(PlanGledanja pl) throws Exception {
         Communication.getInstance().savePlan(pl);
    }
}