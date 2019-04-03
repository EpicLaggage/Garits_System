/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Core.*;
import Account.Vehicle;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author jly09
 */
public class AddVehicleForm extends javax.swing.JFrame {

    Control control = null;
    Vehicle vehicle = null;
    CreateCustCardForm custForm = null;
    UpdateCustomerForm updateCustForm = null;

    /**
     * Creates new form MenuForm
     */
    public AddVehicleForm() {
        initComponents();

        regNum_txt.setDocument(new LengthRestrictedDocument(8));
        engine_serial_no_txt.setDocument(new LengthRestrictedDocument(10));
        chassisNo_txt.setDocument(new LengthRestrictedDocument(9));

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public AddVehicleForm(Control c) {
        initComponents();

        control = c;
        control.getWindowList().add(this);
        
        regNum_txt.setDocument(new LengthRestrictedDocument(8));
        engine_serial_no_txt.setDocument(new LengthRestrictedDocument(10));
        chassisNo_txt.setDocument(new LengthRestrictedDocument(9));

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public AddVehicleForm(CreateCustCardForm cForm) {
        initComponents();

        custForm = cForm;
    }

    public AddVehicleForm(Control c, CreateCustCardForm cForm) {
        initComponents();

        control = c;
        custForm = cForm;

        control = c;
        regNum_txt.setDocument(new LengthRestrictedDocument(8));
        engine_serial_no_txt.setDocument(new LengthRestrictedDocument(10));
        chassisNo_txt.setDocument(new LengthRestrictedDocument(9));

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public AddVehicleForm(Control c, UpdateCustomerForm cForm) {
        initComponents();

        control = c;
        updateCustForm = cForm;

        control = c;
        regNum_txt.setDocument(new LengthRestrictedDocument(8));
        engine_serial_no_txt.setDocument(new LengthRestrictedDocument(10));
        chassisNo_txt.setDocument(new LengthRestrictedDocument(9));

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        control.terminateThread();
    }

    public void setControl(Control c) {
        control = c;
    }

    public void setCustForm(CreateCustCardForm cForm) {
        custForm = cForm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addVehicle_lbl = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        regNum_lbl = new javax.swing.JLabel();
        make_lbl = new javax.swing.JLabel();
        model_lbl = new javax.swing.JLabel();
        regNum_txt = new javax.swing.JTextField();
        make_txt = new javax.swing.JTextField();
        model_txt = new javax.swing.JTextField();
        colour_txt = new javax.swing.JTextField();
        colour_lbl = new javax.swing.JLabel();
        engine_serial_no_txt = new javax.swing.JTextField();
        engine_serial_no_lbl = new javax.swing.JLabel();
        chassisNo_txt = new javax.swing.JTextField();
        chassisNo_lbl = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        purchaseDate_lbl = new javax.swing.JLabel();
        purchaseDate_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addVehicle_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addVehicle_lbl.setText("Add Vehicle");

        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        regNum_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regNum_lbl.setText("Reg No.");

        make_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        make_lbl.setText("Make");

        model_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        model_lbl.setText("Model");

        regNum_txt.setToolTipText("Vehicle registration number");

        make_txt.setToolTipText("Vehicle make");

        model_txt.setToolTipText("Vehicle model");

        colour_txt.setToolTipText("Vehicle colour");

        colour_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colour_lbl.setText("Colour");

        engine_serial_no_txt.setToolTipText("Vehicle engine serial number");

        engine_serial_no_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        engine_serial_no_lbl.setText("Engine Serial No.");

        chassisNo_txt.setToolTipText("Vehicle chassis no");

        chassisNo_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chassisNo_lbl.setText("Chassis No.");

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        purchaseDate_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        purchaseDate_lbl.setText("Purchase Date");

        purchaseDate_txt.setToolTipText("Vehicle purchase date (dd/mm/yyyy)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(addVehicle_lbl)
                        .addGap(170, 170, 170)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(regNum_lbl)
                        .addGap(51, 51, 51)
                        .addComponent(regNum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(make_lbl)
                        .addGap(73, 73, 73)
                        .addComponent(make_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(model_lbl)
                        .addGap(67, 67, 67)
                        .addComponent(model_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(colour_lbl)
                        .addGap(63, 63, 63)
                        .addComponent(colour_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(engine_serial_no_lbl)
                        .addGap(21, 21, 21)
                        .addComponent(engine_serial_no_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(purchaseDate_lbl)
                            .addComponent(chassisNo_lbl))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chassisNo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseDate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(addVehicle_lbl))
                    .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(regNum_lbl))
                    .addComponent(regNum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(make_lbl))
                    .addComponent(make_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(model_lbl))
                    .addComponent(model_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(colour_lbl))
                    .addComponent(colour_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(engine_serial_no_lbl))
                    .addComponent(engine_serial_no_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(chassisNo_lbl))
                    .addComponent(chassisNo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(purchaseDate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseDate_lbl))
                .addGap(40, 40, 40)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        vehicle = new Vehicle();
        if (regNum_txt.getText() != ""
                && make_txt.getText() != ""
                && model_txt.getText() != ""
                && engine_serial_no_txt.getText() != ""
                && chassisNo_txt.getText() != ""
                && colour_txt.getText() != ""
                && purchaseDate_txt.getText().matches("[0-9]{2}[0-9]{2}[0-9]{4}")) {
            
            Date date = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            try {
                date = dateFormat.parse(purchaseDate_txt.getText());
                
            } catch (Exception e) {
                date = null;
            }

            if (date != null) {
                vehicle.setReg_num(regNum_txt.getText());
                vehicle.setMake(make_txt.getText());
                vehicle.setModel(model_txt.getText());
                vehicle.setEngine_serial_no(engine_serial_no_txt.getText());
                vehicle.setChassis_no(chassisNo_txt.getText());
                vehicle.setColour(colour_txt.getText());
                vehicle.setPurchase_date(purchaseDate_txt.getText());

                if (custForm != null && vehicle != null) {
                    custForm.getVehicleList().add(vehicle);
                    custForm.getVehicleComboBox().addItem(vehicle.getReg_num() + "," + vehicle.getMake() + "," + vehicle.getModel());
                    this.setVisible(false);
                }

                if (updateCustForm != null && vehicle != null) {
                    updateCustForm.getVehicleList().add(vehicle);
                    updateCustForm.getVehicleComboBox().addItem(vehicle.getReg_num() + "," + vehicle.getMake() + "," + vehicle.getModel());
                    this.setVisible(false);
                }
            }

        }

    }//GEN-LAST:event_add_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.setVisible(false);
        vehicle = null;
    }//GEN-LAST:event_back_btnActionPerformed

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);

        if (visible) {
            resetText();
        }
    }

    public Vehicle getVehicle() {
        if (vehicle != null) {
            return vehicle;
        }
        return null;
    }

    public void resetText() {
        regNum_txt.setText("");
        make_txt.setText("");
        model_txt.setText("");
        engine_serial_no_txt.setText("");
        chassisNo_txt.setText("");
        colour_txt.setText("");
    }

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
            java.util.logging.Logger.getLogger(AddVehicleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVehicleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVehicleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVehicleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVehicleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addVehicle_lbl;
    private javax.swing.JButton add_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel chassisNo_lbl;
    private javax.swing.JTextField chassisNo_txt;
    private javax.swing.JLabel colour_lbl;
    private javax.swing.JTextField colour_txt;
    private javax.swing.JLabel engine_serial_no_lbl;
    private javax.swing.JTextField engine_serial_no_txt;
    private javax.swing.JLabel make_lbl;
    private javax.swing.JTextField make_txt;
    private javax.swing.JLabel model_lbl;
    private javax.swing.JTextField model_txt;
    private javax.swing.JLabel purchaseDate_lbl;
    private javax.swing.JTextField purchaseDate_txt;
    private javax.swing.JLabel regNum_lbl;
    private javax.swing.JTextField regNum_txt;
    // End of variables declaration//GEN-END:variables

    public final class LengthRestrictedDocument extends PlainDocument {

        private final int limit;

        public LengthRestrictedDocument(int limit) {
            this.limit = limit;
        }

        @Override
        public void insertString(int offs, String str, AttributeSet a)
                throws BadLocationException {
            if (str == null) {
                return;
            }

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offs, str, a);
            }
        }
    }
}
