/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cyber.cafe.management;

import dao.userDao;
import dao.userDataDao;
import java.util.Date;
import javax.swing.JFrame;
import model.userData;

/**
 *
 * @author sai tarun
 */
public class Dashboard extends javax.swing.JFrame {
    public static String nAme;
    public static String PassS ;
    static int milliseconds =0;
    static int seconds=0;
    static int minutes=0;
    static int hours=0;
    static int bills = 0;
 public static  String H ="00";
   public static String M= "00";
   public static String B = "00";
   public static String S;
  public  static boolean state =true;
  public  static boolean state1 =true;
  Date obj = new Date();
  public String date = obj.toString();
 
 
 
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setDefaultCloseOperation(2);
    }
    
    public void stopWatch(){
       
        Thread t;
        t = new Thread(){
            public void run()
            {
                for(;;){
                    if( state==true){
                        try{
                            sleep(1);
                            
                            if (milliseconds > 500){
                                milliseconds= 0;
                                seconds++;}
                            if (seconds > 60){
                                milliseconds= 0;
                                seconds=0;
                                minutes++;
                                bills++;}
                            if (minutes > 60){
                                milliseconds= 0;
                                seconds=0;
                                minutes =0;
                                hours++;}
                            milliseconds++;
                            millisecond.setText(" : " + milliseconds);
                            second.setText(" : " + seconds);
                            minute.setText(" : "+minutes);
                            hour.setText(hours+"");
                            bill.setText("Your bill is  Rs "+bills);
                            M = minutes+"";
                            B = bills+"";
                            S = seconds+"";
                        }
                        catch(Exception e){}
                    }
                    else{
                        break;
                        
                        
                    }
                }
            }
        };  
        t.start();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        net = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        second = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        millisecond = new javax.swing.JLabel();
        bill = new javax.swing.JLabel();
        LogOutbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        net.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        net.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/kindpng_5923187.png"))); // NOI18N
        net.setText(" Browser");
        net.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netActionPerformed(evt);
            }
        });
        getContentPane().add(net, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Change password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 190, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        second.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        second.setText("00:");
        jPanel1.add(second, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 60));

        minute.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        minute.setText("00:");
        jPanel1.add(minute, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 69, 59));

        hour.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        hour.setText("00:");
        jPanel1.add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 69, 59));

        millisecond.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        millisecond.setText("00:");
        jPanel1.add(millisecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 50, 40));

        bill.setFont(new java.awt.Font("Segoe UI Historic", 3, 36)); // NOI18N
        bill.setText("your bill");
        jPanel1.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 340, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 250, 410, 250));

        LogOutbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutbtn.setText("Logout");
        LogOutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogOutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1362, 20, 130, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Show History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 190, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpaperflare.com_wallpaper (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void netActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netActionPerformed
        // TODO add your handling code here:
        
        new menu().setVisible(true);
        new menu().setAlwaysOnTop(true);
      stopWatch();
      state = true;
      state1=false;
       
      
    }//GEN-LAST:event_netActionPerformed

    private void LogOutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutbtnActionPerformed
        // TODO add your handling code here:
        userData User3 = new userData();
        String NAME =  Loginpage.Name;
        nAme = NAME; 
        User3.setNAme(NAME);
        User3.setHOURS(hour.getText());
        User3.setMINUTES(M);
        User3.setBILL(B);
        User3.setDATE(date);
        userDataDao.save2(User3);
        Loginpage page = new Loginpage();
        page.dispose();
       new receipt().setVisible(true);
       new receipt().setAlwaysOnTop(true);
        
    }//GEN-LAST:event_LogOutbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String NAME1 =  Loginpage.Name;
          nAme= NAME1;
         String PassSS =  Loginpage.passs;
         PassS = PassSS;
        new changePassword().setVisible(true);
        new changePassword().setAlwaysOnTop(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String NAME =  Loginpage.Name;
        nAme = NAME; 
        new history().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutbtn;
    private javax.swing.JLabel bill;
    private javax.swing.JLabel hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel millisecond;
    private javax.swing.JLabel minute;
    private javax.swing.JButton net;
    private javax.swing.JLabel second;
    // End of variables declaration//GEN-END:variables
}
