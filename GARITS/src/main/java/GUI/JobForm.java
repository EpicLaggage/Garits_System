/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Core.Control;
import java.sql.*;
import DatabaseConnect.DBConnect;
import Processing.Job;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/**
 *
 * @author jly09
 */
public class JobForm extends javax.swing.JFrame {
    Control control;
    ForepersonMenuForm fpMenuForm;
    FranchiseeMenuForm franchiseeMenuForm;
    ReceptionistMenuForm receptionMenuForm;
    MechanicMenuForm mechanicMenuForm;
    DBConnect dbConnect;
    
    /**
     * Creates new form MenuForm
     */
    public JobForm() {
        initComponents();
        dbConnect = new DBConnect();
    }
    
    public JobForm(Control c) {
        initComponents();
        control = c;
        dbConnect = control.getDatabaseConnector();
        control.getWindowList().add(this);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public JobForm(Control c, ForepersonMenuForm fpmf) {
        initComponents();
        control = c;
        fpMenuForm = fpmf;
        
        dbConnect = control.getDatabaseConnector();
        control.getWindowList().add(this);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public JobForm(Control c, FranchiseeMenuForm fmf) {
        initComponents();
        control = c;
        franchiseeMenuForm = fmf;
        
        dbConnect = control.getDatabaseConnector();
        control.getWindowList().add(this);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public JobForm(Control c, ReceptionistMenuForm rmf) {
        initComponents();
        control = c;
        receptionMenuForm = rmf;
        
        dbConnect = control.getDatabaseConnector();
        control.getWindowList().add(this);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public JobForm(Control c, MechanicMenuForm mmf) {
        initComponents();
        control = c;
        mechanicMenuForm = mmf;
        
        dbConnect = control.getDatabaseConnector();
        control.getWindowList().add(this);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        control.terminateThread();
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        logout_btn.setText("Logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Display Jobs");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Status", "Duration", "Start Date", "Vehicle", "job_id", "mechanic_assigned", "customer_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(32);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search By");

        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "reg_no", "job_type", "job_status", "job_duration", "job_date", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton8)
                        .addGap(0, 446, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout_btn)
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout_btn)
                    .addComponent(back_btn))
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String searchedText = jTextField1.getText();
        String searchFilter = (String) jComboBox1.getSelectedItem();
        DefaultTableModel jobTable = (DefaultTableModel) jTable1.getModel();
        Job selectedJob = new Job();
        int[] selectedRow = jTable1.getSelectedRows();
        if(selectedRow.length == 0) {
            //Display window requiring user to select a job to update first
            JOptionPane.showMessageDialog(JobForm.this,
                    "Select a job to update first");
            
        } else {
            selectedJob.setType((String) jobTable.getValueAt(selectedRow[0], 0));
            selectedJob.setStatus((String) jobTable.getValueAt(selectedRow[0], 1));
            selectedJob.setDuration((int) jobTable.getValueAt(selectedRow[0], 2));
            selectedJob.setDate_start((String) jobTable.getValueAt(selectedRow[0], 3));
            selectedJob.setRegistrationNum((String) jobTable.getValueAt(selectedRow[0], 4));
            selectedJob.setJobId((int) jobTable.getValueAt(selectedRow[0], 5));
            selectedJob.setMechanicId((int) jobTable.getValueAt(selectedRow[0], 6));
            selectedJob.setCustomerId((int) jobTable.getValueAt(selectedRow[0], 7));
            UpdateJobForm jobView = new UpdateJobForm(control, selectedJob,
                    searchedText, searchFilter, this);
            jobView.setVisible(true);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        
        String searchText = jTextField1.getText();
        String sortBy = jComboBox1.getSelectedItem().toString(); //Potentially convert options to kebab case

        String jobsQuery = "SELECT * FROM garitsdb.Job WHERE " + sortBy
                + " LIKE '%" + searchText + "%'";

        ResultSet rs;
        Job job = new Job();
        try {
            rs = dbConnect.read(jobsQuery);
            
            while(rs.next()) {
                
                job.setType(rs.getString("job_type"));
                job.setStatus(rs.getString("job_status"));
                job.setDuration(rs.getInt("job_duration"));
                job.setDate_start(rs.getString("job_date"));
                job.setRegistrationNum(rs.getString("reg_no"));
                job.setJobId(rs.getInt("job_id"));
                job.setMechanicId(rs.getInt("mechanic_assigned"));
                job.setCustomerId(rs.getInt("customer_id"));
                
                
                Object[] row = { job.getType(), job.getStatus(),
                    job.getDuration(),
                    job.getDate_start(), job.getRegistrationNum(),
                    job.getJobId(), job.getMechanicId(), job.getCustomerId()};

                model.addRow(row);
            } 
        } catch (Exception exc) {
            exc.printStackTrace();
        }
                
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        model.setRowCount(0);
        jComboBox1.getItemAt(0);
        TableColumn jobIdColumn = jTable1.getColumnModel().getColumn(5);
        TableColumn mechanicIdColumn = jTable1.getColumnModel().getColumn(6);
        TableColumn customerIdColumn = jTable1.getColumnModel().getColumn(7);
        
        jTable1.getColumnModel().removeColumn(jobIdColumn);        
        jTable1.getColumnModel().removeColumn(mechanicIdColumn);
        jTable1.getColumnModel().removeColumn(customerIdColumn);
    }//GEN-LAST:event_formWindowOpened

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        control.OpenMenu();
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        control.logout();
        this.dispose();
    }//GEN-LAST:event_logout_btnActionPerformed

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
            java.util.logging.Logger.getLogger(JobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JobForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logout_btn;
    // End of variables declaration//GEN-END:variables
}
