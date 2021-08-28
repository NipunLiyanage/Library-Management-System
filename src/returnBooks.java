
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oop.gui.assignment.Admindash;
import oop.gui.assignment.Connect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nipun Liyanage
 */
public class returnBooks extends javax.swing.JFrame {

    /**
     * Creates new form returnBooks
     */
    public returnBooks() {
        initComponents();
    }
           Connection con=null;
       ResultSet rs = null;
       PreparedStatement pst=null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bookID = new javax.swing.JLabel();
        bookID1 = new javax.swing.JLabel();
        bookID2 = new javax.swing.JLabel();
        bookID3 = new javax.swing.JLabel();
        bookID4 = new javax.swing.JLabel();
        BookID = new javax.swing.JTextField();
        BookName = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        CardNo = new javax.swing.JTextField();
        BorrowerName = new javax.swing.JTextField();
        ReturnBook = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Return Books");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 553, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        bookID.setBackground(new java.awt.Color(204, 204, 204));
        bookID.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        bookID.setForeground(new java.awt.Color(0, 0, 0));
        bookID.setText("Book ID");

        bookID1.setBackground(new java.awt.Color(204, 204, 204));
        bookID1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        bookID1.setForeground(new java.awt.Color(0, 0, 0));
        bookID1.setText("Book Name");

        bookID2.setBackground(new java.awt.Color(204, 204, 204));
        bookID2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        bookID2.setForeground(new java.awt.Color(0, 0, 0));
        bookID2.setText("Author");

        bookID3.setBackground(new java.awt.Color(204, 204, 204));
        bookID3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        bookID3.setForeground(new java.awt.Color(0, 0, 0));
        bookID3.setText("Borrower's Card No:");

        bookID4.setBackground(new java.awt.Color(204, 204, 204));
        bookID4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        bookID4.setForeground(new java.awt.Color(0, 0, 0));
        bookID4.setText("Borrower's Name");

        BookID.setBackground(new java.awt.Color(204, 204, 204));
        BookID.setForeground(new java.awt.Color(0, 0, 0));
        BookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIDActionPerformed(evt);
            }
        });

        BookName.setBackground(new java.awt.Color(204, 204, 204));
        BookName.setForeground(new java.awt.Color(0, 0, 0));
        BookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameActionPerformed(evt);
            }
        });

        Author.setBackground(new java.awt.Color(204, 204, 204));
        Author.setForeground(new java.awt.Color(0, 0, 0));
        Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorActionPerformed(evt);
            }
        });

        CardNo.setBackground(new java.awt.Color(204, 204, 204));
        CardNo.setForeground(new java.awt.Color(0, 0, 0));

        BorrowerName.setBackground(new java.awt.Color(204, 204, 204));
        BorrowerName.setForeground(new java.awt.Color(0, 0, 0));

        ReturnBook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ReturnBook.setText("Return Book");
        ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookID2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookID4)
                    .addComponent(bookID3)
                    .addComponent(bookID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrowerName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(214, 214, 214))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookID)
                    .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookID1)
                    .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookID2)
                    .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookID3)
                    .addComponent(CardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookID4)
                    .addComponent(BorrowerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReturnBook)
                    .addComponent(Back))
                .addGap(88, 88, 88))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 164;
        gridBagConstraints.ipady = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 168, 40, 166);
        jPanel1.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIDActionPerformed

    private void BookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorActionPerformed

    private void ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookActionPerformed
        // TODO add your handling code here:
                con= Connect.ConnectDB();
        
        if(BookID.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the Book ID to return","Error",JOptionPane.ERROR_MESSAGE);
            BookID.requestDefaultFocus();
            return;
        }
        if(CardNo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the borrower's Card number","Error",JOptionPane.ERROR_MESSAGE);
            CardNo.requestDefaultFocus();
            return;
        }
        
        String sql = "delete from issuedbooks where book_ID = '" +BookID.getText() +"'AND Card_No = '" + CardNo.getText() +"'";
        String sql1 = "UPDATE books SET Availability = 'Yes' , Return_Date = '' WHERE Book_ID = '"+BookID.getText()+"'";
        try{
            pst = con.prepareStatement(sql);
            pst.execute();
            pst = con.prepareStatement(sql1);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Book returned Succesfully to the library");
            BookID.setText("");
            BookName.setText("");
            Author.setText("");
            CardNo.setText("");
            BorrowerName.setText("");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Admindash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReturnBookActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
                       this.hide();
        LibrarianDash libd = new LibrarianDash();
        libd.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(returnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JButton Back;
    private javax.swing.JTextField BookID;
    private javax.swing.JTextField BookName;
    private javax.swing.JTextField BorrowerName;
    private javax.swing.JTextField CardNo;
    private javax.swing.JButton ReturnBook;
    private javax.swing.JLabel bookID;
    private javax.swing.JLabel bookID1;
    private javax.swing.JLabel bookID2;
    private javax.swing.JLabel bookID3;
    private javax.swing.JLabel bookID4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}