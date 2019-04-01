/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Core.Control;
import DatabaseConnect.DBConnect;
import static GUI.UpdateJobForm.BOLD;
import Processing.Invoice;
import static Processing.PDFCreator.getAddressTable;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jly09
 */
public class RemindersForm extends javax.swing.JFrame {
    Control control;
    ArrayList<Invoice> unpaidInvoices = new ArrayList<Invoice>();
    DBConnect dbConnect;
    DefaultTableModel invoiceModel;

    /**
     * Creates new form MenuForm
     */
    public RemindersForm(ArrayList<Invoice> unpaidInvoices) {
        initComponents();
        this.unpaidInvoices.addAll(unpaidInvoices);
        dbConnect = new DBConnect();
    }
    

    public RemindersForm() {
        initComponents();
    }
    
    public RemindersForm(Control c) {
        initComponents();
        control = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton3.setText("Logout");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Display and Print");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Job No.", "Payment Due", "Customer Name", "Email", "Reminder", "Invoice No.", "Invoice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Back");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Reminders");

        jButton7.setText("Display");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(684, 797, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO Create list of invoice objects with all necessary data         
        //Query Job table
        for(Invoice invoice : unpaidInvoices) {
            String jobQuery = "SELECT * FROM garitsdb.Job WHERE job_id = '"
                    + invoice.getJobId() +"';";
            try {
                Connection conn = dbConnect.connect();
                conn.setAutoCommit(false);
                PreparedStatement statement = conn.prepareStatement(jobQuery);
                ResultSet rs = statement.executeQuery();
                while(rs.next()) {
                    invoice.setJobStart(rs.getString("job_date"));
                    invoice.setRegNum(rs.getString("reg_no"));
                    invoice.setCustomerId(rs.getInt("customer_id"));
                    invoice.setMechanicAssigned(rs.getInt("mechanic_assigned"));
                    invoice.setJobDuration(rs.getInt("job_duration"));
                }
                conn.commit();
                conn.setAutoCommit(true);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
        
        //Query Customer table
        for(Invoice invoice : unpaidInvoices) {
            String customerQuery = "SELECT * FROM garitsdb.Customer WHERE "
                    + "customer_id = '" + invoice.getCustomerId() + "';";
            try {
                Connection conn = dbConnect.connect();
                conn.setAutoCommit(false);
                PreparedStatement statement = conn.prepareStatement(customerQuery);
                ResultSet rs = statement.executeQuery();
                while(rs.next()) {
                    invoice.setCustomerName(rs.getString("customer_name"));
                    invoice.setCustomerAddress(rs.getString("customer_address"));
                    invoice.setCustomerPostCode(rs.getString("customer_postcode"));
                    invoice.setCustomerPhone(rs.getInt("customer_tel"));
                    invoice.setCustomerEmail(rs.getString("customer_email"));
                    invoice.setAccountHolder(rs.getBoolean(
                            "customer_account_holder"));
                }
                conn.commit();
                conn.setAutoCommit(true);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
        
        invoiceModel = (DefaultTableModel) jTable1.getModel();
        invoiceModel.setRowCount(0);
        for(Invoice invoice : unpaidInvoices) {
            Object[] row = { invoice.getJobId(), invoice.getPaymentDueDate(),
                invoice.getCustomerName(), invoice.getCustomerEmail(), 
            invoice.isReminderSent(), invoice.getInvoiceId(), invoice};
            invoiceModel.addRow(row);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int[] selectedRow = jTable1.getSelectedRows();
        if(selectedRow.length == 0) {
            //Display window requiring user to select a job to update first
            JOptionPane.showMessageDialog(RemindersForm.this,
                    "Select an invoice reminder to print first");
            
        } else {
            Invoice invoice = (Invoice) jTable1.getValueAt(selectedRow[0], 6);
            //GETTING MISSING INVOICE DATA
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date date = new java.util.Date();
            String currDate = dateFormat.format(date);
            
            // TODO OPEN INVOICE IN PDF
            String dest = "/Users/paul/Uni/GARITS/software/Garits/GARITS"
                    + "/resources/Invoice" + invoice.getInvoiceId() +
                    "Reminder" + invoice.isReminderSent() + ".pdf";       
            PdfWriter writer = null; 
            try {
                writer = new PdfWriter(dest);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UpdateJobForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Creating a PdfDocument       
            PdfDocument pdfDoc = new PdfDocument(writer); 

            PdfFont bold = null;
            try {
                bold = PdfFontFactory.createFont(BOLD, true);
            } catch (IOException ex) {
                Logger.getLogger(UpdateJobForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Adding a new page 
            pdfDoc.addNewPage();               

            // Creating a Document
            Document document = new Document(pdfDoc);
            //Adding INvoice number
            document.add(
                    new Paragraph()
                            .setTextAlignment(TextAlignment.RIGHT)
                            .setMultipliedLeading(1)
                            .add(new Text(String.format("REMINDER " + 
                                    invoice.isReminderSent()+1+
                                    "- INVOICE NO.: %s\n",
                                    invoice.getInvoiceId())).setFontSize(14))
                            .add(currDate));    
            //Adding adresses
            document.add(getAddressTable(invoice.getCustomerName(),
                    invoice.getCustomerAddress(), invoice.getCustomerPostCode(),
                    bold));
            document.add(new Paragraph().add("\n"));
            //Adding Vehicle details
            document.add(
                    new Paragraph()
                            .setTextAlignment(TextAlignment.LEFT)
                            .setMultipliedLeading(1)
                            .add(new Text(String.format("Dear %s,\n", invoice.getCustomerName())))
                            .add(new Text("\n"))
                            .add(new Text(String.format("Vehicle Registraion No: "
                                    + "%s\n", invoice.getRegNum())))
                            .add(new Text(String.format("Amount Due:  %s\n", 
                                    invoice.getAmountDue())))
            );
            document.add(new Paragraph().add("\n"));

            document.add(new Paragraph().add(new Text("According to our "
                    + "records, it appears that we have not yet received "
                    + "payment of the above invoice, which was posted "
                    + "to you on " + invoice.getJobEnd() + " for workd done on the "
                    + "vehicle listed above.")));
            
            document.add(new Paragraph().add("We would appreaciate payment "
                    + "at your earliest convenience."));
            
            document.add(new Paragraph().add("If you have already sent a "
                    + "payment to us recently, please accept our apologies."));

            //Ending
            document.add(new Paragraph()
                    .add(new Text("\n"))
                    .add(new Text("Yours sincerely,\n"))
                    .add(new Text("\n"))
                    .add(new Text("G. Lancaster"))
            );
            // Closing the document
            document.close();

            System.out.println("PDF Created");
            
            try {

		File pdfFile = new File(dest);
		if (pdfFile.exists()) {

			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}

		} else {
			System.out.println("File is not exists!");
		}

		System.out.println("Done");

            } catch (Exception ex) {
                  ex.printStackTrace();
            }
            //UPDATING PAYMENT DUE DATE AND REMINDER COUNT
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate paymentDueDate = LocalDate.parse(
                    invoice.getPaymentDueDate(), formatter);
            
            String reminderUpdate = "UPDATE Invoice SET "
                    + "payment_due_date = '" + paymentDueDate.plusMonths(1) + "', "
                    + "invoice_reminder=invoice_reminder+1 " + "WHERE "
                    + "(`invoice_id` = '" + invoice.getInvoiceId() + "');"; 
            try {
                System.out.println("TEST");
                Connection conn = dbConnect.connect();
                conn.setAutoCommit(false);
                PreparedStatement statement = conn.prepareStatement(reminderUpdate);
                statement.execute();
                conn.commit();
                conn.setAutoCommit(true);
            }
            catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(RemindersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemindersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemindersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemindersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RemindersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
