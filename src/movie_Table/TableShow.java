package movie_Table;
import addMovie.NewMovieInfo;
import database.databaseCon;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class TableShow extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TableShow() {
        initComponents();
        con = databaseCon.databaseConnection();
        UpdateTable();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        movieInfo_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        update_Button = new javax.swing.JButton();
        releaseDate_Label = new javax.swing.JLabel();
        musicDirectorName_TextField = new javax.swing.JTextField();
        directorName_TextField = new javax.swing.JTextField();
        actorName_TextField = new javax.swing.JTextField();
        actressName_Label = new javax.swing.JLabel();
        movieName_TextField = new javax.swing.JTextField();
        releaceDate_DateChooser = new com.toedter.calendar.JDateChooser();
        actorName_Label = new javax.swing.JLabel();
        musicDirectorName_Label = new javax.swing.JLabel();
        movieName_Label = new javax.swing.JLabel();
        directorName_Label = new javax.swing.JLabel();
        delete_Button = new javax.swing.JButton();
        actressName_TextField = new javax.swing.JTextField();
        clear_Button = new javax.swing.JButton();
        movieInfoPage_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        movieInfo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        movieInfo_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieInfo_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(movieInfo_table);

        update_Button.setBackground(new java.awt.Color(0, 0, 0));
        update_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update_Button.setForeground(new java.awt.Color(255, 255, 255));
        update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie_Table/disk-save-icon.png"))); // NOI18N
        update_Button.setText("Update Information");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });

        releaseDate_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        releaseDate_Label.setText("  Releace Date");

        actressName_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actressName_Label.setText("  Actress Name");

        releaceDate_DateChooser.setDateFormatString("yyyy-MM-dd");

        actorName_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actorName_Label.setText("  Actor Name");

        musicDirectorName_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        musicDirectorName_Label.setText("  Music Director Name");

        movieName_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        movieName_Label.setText("  Movie Name");

        directorName_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        directorName_Label.setText("  Director Name");

        delete_Button.setBackground(new java.awt.Color(0, 0, 0));
        delete_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete_Button.setForeground(new java.awt.Color(255, 255, 255));
        delete_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie_Table/Editing-Delete-icon.png"))); // NOI18N
        delete_Button.setText("Delete Information");
        delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ButtonActionPerformed(evt);
            }
        });

        clear_Button.setBackground(new java.awt.Color(0, 0, 0));
        clear_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear_Button.setForeground(new java.awt.Color(255, 255, 255));
        clear_Button.setText("Clear Information");
        clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(musicDirectorName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actressName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actorName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(directorName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(movieName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(releaseDate_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(movieName_TextField)
                            .addComponent(directorName_TextField)
                            .addComponent(actorName_TextField)
                            .addComponent(actressName_TextField)
                            .addComponent(musicDirectorName_TextField)
                            .addComponent(releaceDate_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(update_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(delete_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directorName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directorName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actorName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actorName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actressName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actressName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(musicDirectorName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musicDirectorName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(releaseDate_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(releaceDate_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        movieInfoPage_Button.setBackground(new java.awt.Color(0, 0, 0));
        movieInfoPage_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        movieInfoPage_Button.setForeground(new java.awt.Color(255, 255, 255));
        movieInfoPage_Button.setText("Movie Info Page");
        movieInfoPage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieInfoPage_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(movieInfoPage_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(movieInfoPage_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        
        try{
            
            String value = movieName_TextField.getText();
            String value1 = directorName_TextField.getText();
            String value2 = actorName_TextField.getText();
            String value3 = actressName_TextField.getText();
            String value4 = musicDirectorName_TextField.getText();
            String value5 = ((JTextField)releaceDate_DateChooser.getDateEditor().getUiComponent()).getText();
            
            String sql = "update MovieInfo set moviename='"+value+"', directorname='"+value1+"', actorname='"+value2+"', actressname='"+value3+"', musicdirectorname='"+value4+"', relesedate='"+value5+"' ";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Information!");
            UpdateTable();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally{
            
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){
            }
        }
        
        
    }//GEN-LAST:event_update_ButtonActionPerformed

    private void movieInfo_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieInfo_tableMouseClicked
        
        int row = movieInfo_table.getSelectedRow();
        String click = (movieInfo_table.getModel().getValueAt(row, 0).toString());
        try{
        String sql = "select * from MovieInfo where moviename='"+click+"'";
        pst =con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        if(rs.next()){
            
            String add = rs.getString("moviename");
            movieName_TextField.setText(add);
            
            String add1 = rs.getString("directorname");
            directorName_TextField.setText(add1);
            
            String add2 = rs.getString("actorname");
            actorName_TextField.setText(add2);
            
            String add3 = rs.getString("actressname");
            actressName_TextField.setText(add3);
            
            String add4 = rs.getString("musicdirectorname");
            musicDirectorName_TextField.setText(add4);
            
            Date add5 = rs.getDate("relesedate");
            releaceDate_DateChooser.setDate(add5);
            
            
        }
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        UpdateTable();
    }//GEN-LAST:event_movieInfo_tableMouseClicked

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
        
        int dialog = JOptionPane.showConfirmDialog(null, "Do you want to delete", "delete", JOptionPane.YES_NO_OPTION);
        if(dialog == 0){
            
            String sql = "delete from MovieInfo where moviename=?";
            
            try{
                pst = con.prepareStatement(sql);
                pst.setString(1, movieName_TextField.getText());
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                
            }
            
            
        }
        
        UpdateTable();
        
    }//GEN-LAST:event_delete_ButtonActionPerformed

    private void clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_ButtonActionPerformed
        
        movieName_TextField.setText("");
        directorName_TextField.setText("");
        actorName_TextField.setText("");
        actressName_TextField.setText("");
        musicDirectorName_TextField.setText("");
        releaceDate_DateChooser.setDate(null);
        
    }//GEN-LAST:event_clear_ButtonActionPerformed

    private void movieInfoPage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieInfoPage_ButtonActionPerformed
        
        dispose();
        new NewMovieInfo().setVisible(true);
        
    }//GEN-LAST:event_movieInfoPage_ButtonActionPerformed

    public void UpdateTable(){
        
        try{
            
            String sql = "select * from MovieInfo ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            movieInfo_table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally{
            
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){
            }
        }
        
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(TableShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actorName_Label;
    private javax.swing.JTextField actorName_TextField;
    private javax.swing.JLabel actressName_Label;
    private javax.swing.JTextField actressName_TextField;
    private javax.swing.JButton clear_Button;
    private javax.swing.JButton delete_Button;
    private javax.swing.JLabel directorName_Label;
    private javax.swing.JTextField directorName_TextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton movieInfoPage_Button;
    private javax.swing.JTable movieInfo_table;
    private javax.swing.JLabel movieName_Label;
    private javax.swing.JTextField movieName_TextField;
    private javax.swing.JLabel musicDirectorName_Label;
    private javax.swing.JTextField musicDirectorName_TextField;
    private com.toedter.calendar.JDateChooser releaceDate_DateChooser;
    private javax.swing.JLabel releaseDate_Label;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
