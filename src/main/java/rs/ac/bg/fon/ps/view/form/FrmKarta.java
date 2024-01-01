/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.form;

import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.net.Socket;
import java.util.ArrayList;
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
import rs.ac.bg.fon.ps.communication.LocalStorage;
import rs.ac.bg.fon.ps.PSCommon.communication.Operation;
import rs.ac.bg.fon.ps.PSCommon.communication.Receiver;
import rs.ac.bg.fon.ps.PSCommon.communication.Request;
import rs.ac.bg.fon.ps.PSCommon.communication.Response;
import rs.ac.bg.fon.ps.PSCommon.communication.Sender;
import rs.ac.bg.fon.ps.domain.Karta;
import rs.ac.bg.fon.ps.domain.Klijent;
import rs.ac.bg.fon.ps.domain.Predstava;

import rs.ac.bg.fon.ps.domain.Rezervacija;
import rs.ac.bg.fon.ps.domain.StavkaRezervacije;
import rs.ac.bg.fon.ps.view.form.util.FormMode;

public class FrmKarta extends javax.swing.JDialog {

    /**
     * Creates new form FrmProduct
     */
     private LocalStorage localStorage = LocalStorage.getInstance();
    public FrmKarta(java.awt.Frame parent, boolean modal, FormMode formMode) {
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
        lblReservation = new javax.swing.JLabel();
        lblCLient = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cbClient = new javax.swing.JComboBox<>();
        cbReservation = new javax.swing.JComboBox<>();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblShow = new javax.swing.JLabel();
        cbShow = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        lblNapomena = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form for ticket");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ticket:"));

        lblId.setText("ID:");

        lblReservation.setText("Reservation:");

        lblCLient.setText("Client:");

        lblPrice.setText("Price:");

        lblShow.setText("Show:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblNapomena.setText("*Napomena cenu koju unesete na nju ce se obracunati popust prilikom cuvanja karte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(586, 586, 586))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbShow, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCLient, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbClient, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblNapomena)))))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCLient)
                    .addComponent(cbClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblShow)
                    .addComponent(cbShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnSearch)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservation)
                    .addComponent(cbReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNapomena)
                .addContainerGap())
        );

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(254, 254, 254)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave)
                        .addComponent(btnCancel))
                    .addComponent(btnDelete))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {
            Karta karta = new Karta();
            //karta.setKartaId(Integer.parseInt(getTxtID().getText().trim()));
            Integer cena=Integer.parseInt(getTxtPrice().getText().trim());
            int popust=((StavkaRezervacije) getCbRezervacija().getSelectedItem()).getPopust();
            if(popust!=0){
            cena=cena- cena*popust/100;
            }
            karta.setCena(cena);
            karta.setRezervacijaId(((StavkaRezervacije) getCbRezervacija().getSelectedItem()).getRezervacijaId());
            karta.setStavkaId(((StavkaRezervacije) getCbRezervacija().getSelectedItem()));
            

            Communication.getInstance().addKarta(karta);
            JOptionPane.showMessageDialog(this, "Karta successfully saved.");
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage()+" System can not save ticket","ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //TODO...
        
            Karta pr=(Karta) localStorage.getItemFromHashMap("Karta");
            
        try {
            Communication.getInstance().deleteTicket(pr);
            JOptionPane.showMessageDialog(this, "Karta succesfully deleted.");
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Karta not deleted. "+ ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
             
         getCbRezervacija().setVisible(false);
         getTxtPrice().setVisible(false);
        getBtnSave().setEnabled(true);
        //Rezervacija rezervacija= new Rezervacija();
        //rezervacija.setKlijentId((Klijent)getCbClient().getSelectedItem());
        try {
            fillCbReservations();
        } catch (Exception ex) {
            Logger.getLogger(FrmKarta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Object> cbClient;
    private javax.swing.JComboBox<Object> cbReservation;
    private javax.swing.JComboBox<Object> cbShow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCLient;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNapomena;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblReservation;
    private javax.swing.JLabel lblShow;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }



    public JButton getBtnSave() {
        return btnSave;
    }
      public JButton getBtnSearch() {
        return btnSearch;
    }

    public JComboBox<Object> getCbClient() {
        return cbClient;
    }
    public JComboBox<Object> getCbShow() {
        return cbShow;
    }
    public JComboBox<Object> getCbRezervacija() {
        return cbReservation;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

 

    public JLabel getLblClient() {
        return lblCLient;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public JLabel getLblShow() {
        return lblShow;
    }



    public JLabel getLblReservation() {
        return lblReservation;
    }

    public JLabel getLblPrice() {
        return lblPrice;
    }

  public JLabel getLblNapomena() {
        return lblNapomena;
    }

    public JTextField getTxtID() {
        return txtID;
    }



    public JTextField getTxtPrice() {
        return txtPrice;
    }

    public void addSaveBtnActionListener(ActionListener actionListener) {
        btnSave.addActionListener(actionListener);
    }



    public void addCancelBtnActionListener(ActionListener actionListener) {
        btnCancel.addActionListener(actionListener);
    }

    public void addDeleteBtnActionListener(ActionListener actionListener) {
        btnDelete.addActionListener(actionListener);
    }

  

    private void prepareView(FormMode formMode) {
       
        try {
            fillCbClients();
            fillCbShows();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        setupComponents(formMode);

    }

  private void fillCbShows() throws Exception {
        getCbShow().removeAllItems();
        List<Predstava> shows = getShows();
        getCbShow().setModel(new DefaultComboBoxModel<>(shows.toArray()));
    }

    private List<Predstava> getShows() throws Exception {
        return Communication.getInstance().getAllShows();
    }
  
     private void fillCbReservations() throws Exception {
         boolean flag=false;
       
        List<StavkaRezervacije> stavke = getStavke();
        ArrayList<StavkaRezervacije> nove=new ArrayList<>();
        Klijent k=(Klijent)getCbClient().getSelectedItem();
        Predstava p=(Predstava)getCbShow().getSelectedItem();
          
              for(StavkaRezervacije stavka:stavke){
                  if(stavka.getRezervacijaId().getKlijentId().getKlijentId().equals(k.getKlijentId())){
                    if(stavka.getPredstavaId().getPredstavaId().equals(p.getPredstavaId())){
                        {
                          
                          nove.add(stavka);
                          flag=true;
                          
                        }    
              }
              }
        }
              if(flag==false){
                  JOptionPane.showMessageDialog(this,"Za trazenu predstavu i klijenta nema rezervacije, prvo je napravite","ERROR",JOptionPane.ERROR_MESSAGE);
              }
              else{
                   getCbRezervacija().setModel(new DefaultComboBoxModel<>(nove.toArray()));
         getCbRezervacija().setVisible(true);
         getTxtPrice().setVisible(true);
         getLblPrice().setVisible(true);
                getLblReservation().setVisible(true);
                getLblNapomena().setVisible(true);
              }
        
      }
        
    

    private List<Rezervacija> getReservations() throws Exception {
        return Communication.getInstance().getAllReservations();
    }
    private void fillCbClients() throws Exception {
        getCbClient().removeAllItems();
        List<Klijent> clienti = getClients();
        getCbClient().setModel(new DefaultComboBoxModel(clienti.toArray()));
    }

    private List<Klijent> getClients() throws Exception {
        return Communication.getInstance().getAllCLients();
    }

    private void setupComponents(FormMode formMode) {
        switch (formMode) {
            case FORM_ADD:
                getBtnCancel().setEnabled(true);
                getBtnDelete().setEnabled(false);
                getLblPrice().setVisible(false);
                getLblReservation().setVisible(false);
                getLblNapomena().setVisible(false);
                getBtnSave().setEnabled(false);

                getTxtID().setEnabled(false);
              
                getTxtPrice().setEnabled(true);
                getCbClient().setEnabled(true);
                getCbShow().setEnabled(true);
                getCbRezervacija().setEnabled(true);
                getCbRezervacija().setVisible(false);
                getTxtPrice().setVisible(false);
                break;
            case FORM_VIEW:
                getBtnCancel().setEnabled(true);
                getBtnDelete().setEnabled(true);
              
                getBtnSave().setEnabled(false);
               
                //zabrani izmenu vrednosti
                getTxtID().setEnabled(false);
                getCbShow().setEnabled(false);
                getTxtPrice().setEnabled(false);
                getCbClient().setEnabled(false);
                getCbRezervacija().setEnabled(false);
                fillForView();
                

                //get product
                //TODO..
                break;
            case FORM_EDIT:
                getBtnCancel().setEnabled(true);
                getBtnDelete().setEnabled(false);
      
                getBtnSave().setEnabled(false);

                //zabrani izmenu vrednosti
                getTxtID().setEnabled(false);
                getCbShow().setEnabled(true);
                getTxtPrice().setEnabled(true);
                getCbClient().setEnabled(true);
                getCbRezervacija().setEnabled(true);
                break;
        }
    }

    private List<StavkaRezervacije> getStavke() throws Exception {
         return Communication.getInstance().getAllItemReservations();
    }

    private void fillForView() {
        Karta pr=(Karta) localStorage.getItemFromHashMap("Karta");
        
        Klijent k=pr.getStavkaId().getRezervacijaId().getKlijentId();
        getCbClient().addItem(k);
        getCbClient().setSelectedItem(k);
        getCbShow().setSelectedItem(pr.getStavkaId().getPredstavaId());
        
        getTxtPrice().setText(Integer.toString(pr.getCena()));

        getCbRezervacija().addItem(pr.getStavkaId());
        getBtnSearch().setVisible(false);
        JOptionPane.showMessageDialog(this,"System load selected ticket");

        
    }

}
