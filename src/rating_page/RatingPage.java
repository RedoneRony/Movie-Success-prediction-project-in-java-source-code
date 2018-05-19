package rating_page;
import addMovie.NewMovieInfo;
import database.databaseCon;
import javax.swing.*;
import java.sql.*;

public class RatingPage extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public RatingPage() {
        initComponents();
        con = databaseCon.databaseConnection();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        videoQuality_Label = new javax.swing.JLabel();
        soundSystem_Label = new javax.swing.JLabel();
        movieName_Label = new javax.swing.JLabel();
        movieName_TextField = new javax.swing.JTextField();
        history_ComboBox = new javax.swing.JComboBox<>();
        historyOfTheMovie_Label = new javax.swing.JLabel();
        showResult_Button = new javax.swing.JButton();
        videoQuality_ComboBox = new javax.swing.JComboBox<>();
        soundSystem_ComboBox = new javax.swing.JComboBox<>();
        history_TextField = new javax.swing.JTextField();
        sound_TextField = new javax.swing.JTextField();
        video_TextField = new javax.swing.JTextField();
        resulttextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        back_Button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rating Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        videoQuality_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        videoQuality_Label.setText("  Video Quality");

        soundSystem_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        soundSystem_Label.setText("  Sound System");

        movieName_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        movieName_Label.setText("  Movie Name");

        history_ComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        history_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one option", "Action", "Drama", "Animation", "Love & Adventure", "comedy", "Dance", "Romantic", "Adventure", "comedy &  Romantic", "Drama & Romantic", "Action & Love" }));
        history_ComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                history_ComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        historyOfTheMovie_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        historyOfTheMovie_Label.setText("  History of the movie");

        showResult_Button.setBackground(new java.awt.Color(0, 0, 0));
        showResult_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showResult_Button.setForeground(new java.awt.Color(255, 255, 255));
        showResult_Button.setText("Add Info");
        showResult_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResult_ButtonActionPerformed(evt);
            }
        });

        videoQuality_ComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        videoQuality_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one option", "144 pixel", "360 pixel", "720 pixel", "1080 pixel", "4 k", "144 & 360 pixel", "144 & 720 pixel", "360 & 720 pixel", "360 & 1080 pixel", "720 & 1080 pixel", "720 pixel & 4k", "1080 pixel & 4 k" }));
        videoQuality_ComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                videoQuality_ComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        soundSystem_ComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        soundSystem_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one option", "Good", "Medium", "Bad" }));
        soundSystem_ComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                soundSystem_ComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(historyOfTheMovie_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movieName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soundSystem_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(videoQuality_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(movieName_TextField)
                    .addComponent(history_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soundSystem_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(videoQuality_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(history_TextField)
                    .addComponent(sound_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(video_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showResult_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historyOfTheMovie_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sound_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundSystem_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundSystem_ComboBox))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(videoQuality_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(videoQuality_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(video_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(showResult_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        history_TextField.getAccessibleContext().setAccessibleName("");

        resulttextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resulttextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resulttextFieldActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rating_page/res.jpg"))); // NOI18N

        back_Button.setBackground(new java.awt.Color(0, 0, 0));
        back_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back_Button.setForeground(new java.awt.Color(255, 255, 255));
        back_Button.setText("Go to movie Info page");
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rating_page/Actions-arrow-left-icon.png"))); // NOI18N
        jMenuItem1.setText(" Standerd Page");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rating_page/Actions-arrow-right-icon.png"))); // NOI18N
        jMenuItem2.setText(" Result Page");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resulttextField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
            .addGroup(layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(resulttextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showResult_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResult_ButtonActionPerformed
   
       
        int one = history_ComboBox.getSelectedIndex();
        String index1 = String.valueOf(one);
        
        int two = soundSystem_ComboBox.getSelectedIndex();
        String index2 = String.valueOf(two);
        int three = videoQuality_ComboBox.getSelectedIndex();
        String index3 = String.valueOf(three);
        
        
        try{
            String sql = "insert into Rating_Table (moviename,history,soundsystem,videoquality) values (?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, movieName_TextField.getText());
            pst.setString(2, index1);
            pst.setString(3, index2);
            pst.setString(4, index3);
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data saved");
            
            this.setResizable(true);
            this.setSize(1044, 540);
            
            int a = 0, b = 0, c = 0, result = 0;
            
           if(history_TextField.getText().matches("Action") || history_TextField.getText().matches("Love & Adventure") || history_TextField.getText().matches("Adventure") || history_TextField.getText().matches("Action & Love") ){
               a = 3; 
            }
            
           if(history_TextField.getText().matches("Animation") || history_TextField.getText().matches("Dance") || history_TextField.getText().matches("Romantic") || history_TextField.getText().matches("Comedy & Romantic") ){
               a = 2; 
            }
           
           if(history_TextField.getText().matches("Drama") || history_TextField.getText().matches("Comedy") || history_TextField.getText().matches("Drama & Romantic") ){
               a = 1; 
            }
           
           
            if(sound_TextField.getText().matches("Good")){
               b = 3;
           }
           
           if(sound_TextField.getText().matches("Medium")){
               b = 2;
           }
           
           if(sound_TextField.getText().matches("Bad")){
               b = 1;
           }
           
           if(video_TextField.getText().matches("720 pixel") || video_TextField.getText().matches("1080 pixel")|| video_TextField.getText().matches("4k") || video_TextField.getText().matches("360 & 1080 pixel") || video_TextField.getText().matches("360 & 720 pixel") || video_TextField.getText().matches("720 & 1080 pixel") || video_TextField.getText().matches("720 pixel & 4k") || video_TextField.getText().matches("1080 pixel & 4k") ){
               c=3;
           }
           
           if(video_TextField.getText().matches("360 pixel") || video_TextField.getText().matches("720 pixel") || video_TextField.getText().matches("144 & 360 pixel") || video_TextField.getText().matches("144 & 720 pixel")){
               c = 2;
           }
           
           if(video_TextField.getText().matches("144 pixel") || video_TextField.getText().matches("360 pixel") || video_TextField.getText().matches("144 & 360 pixel")){
               c = 1;
           }
           
           result = a+b+c;
           
           if(result == 10 || result == 9){
                 resulttextField.setText("Block Buster");
             }
             
             if (result == 8 || result == 7  ){
                 resulttextField.setText("Super Hit");
             }
             if (result == 5 || result == 6 ){
                 resulttextField.setText("Hit");
             }    
             
             if (result == 4 ){
                 resulttextField.setText("Average");
             }
             if(result <4) {
                 resulttextField.setText("Flop");
             }
           
             
             
           
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
        
        
    }//GEN-LAST:event_showResult_ButtonActionPerformed

    private void history_ComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_history_ComboBoxPopupMenuWillBecomeInvisible
        
        history_TextField.setText(history_ComboBox.getSelectedItem().toString());
        
        
    }//GEN-LAST:event_history_ComboBoxPopupMenuWillBecomeInvisible

    private void soundSystem_ComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_soundSystem_ComboBoxPopupMenuWillBecomeInvisible
        
        sound_TextField.setText(soundSystem_ComboBox.getSelectedItem().toString());
        
        
    }//GEN-LAST:event_soundSystem_ComboBoxPopupMenuWillBecomeInvisible

    private void videoQuality_ComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_videoQuality_ComboBoxPopupMenuWillBecomeInvisible
        
        video_TextField.setText(videoQuality_ComboBox.getSelectedItem().toString());
        
    }//GEN-LAST:event_videoQuality_ComboBoxPopupMenuWillBecomeInvisible

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(666, 540);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        this.setResizable(true);
        this.setSize(666, 540);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         this.setResizable(true);
         this.setSize(1185, 540);
         
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void resulttextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resulttextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resulttextFieldActionPerformed

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_ButtonActionPerformed
        
        dispose();
        new NewMovieInfo().setVisible(true);
        
    }//GEN-LAST:event_back_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RatingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RatingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RatingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RatingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RatingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Button;
    private javax.swing.JLabel historyOfTheMovie_Label;
    private javax.swing.JComboBox<String> history_ComboBox;
    private javax.swing.JTextField history_TextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel movieName_Label;
    private javax.swing.JTextField movieName_TextField;
    private javax.swing.JTextField resulttextField;
    private javax.swing.JButton showResult_Button;
    private javax.swing.JComboBox<String> soundSystem_ComboBox;
    private javax.swing.JLabel soundSystem_Label;
    private javax.swing.JTextField sound_TextField;
    private javax.swing.JComboBox<String> videoQuality_ComboBox;
    private javax.swing.JLabel videoQuality_Label;
    private javax.swing.JTextField video_TextField;
    // End of variables declaration//GEN-END:variables
}
