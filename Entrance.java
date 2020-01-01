
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blood-Joker
 */
public class Entrance extends javax.swing.JFrame {

    /**
     * Creates new form Entrance
     */
    public Entrance() {
        initComponents();
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
        welcome = new javax.swing.JLabel();
        getName = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        display = new javax.swing.JLabel();
        guestName = new javax.swing.JLabel();
        book = new javax.swing.JLabel();
        sure = new javax.swing.JButton();
        no = new javax.swing.JButton();
        look = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();
        pic = new javax.swing.JLabel();
        map = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        surround = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        language = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));

        welcome.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome to the hotel Reservation System");

        getName.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        getName.setText("May I have your name please?");

        jTextField1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        display.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        display.setText("So,Mr/Mrs/Ms");

        guestName.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N

        book.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        book.setText(", you want to book a room, right?");

        sure.setBackground(new java.awt.Color(153, 255, 255));
        sure.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        sure.setText("Sure, why not!!!");
        sure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sureActionPerformed(evt);
            }
        });

        no.setBackground(new java.awt.Color(0, 204, 255));
        no.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        no.setText("Humm...Maybe next time~");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        look.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        look.setText("Take a look at our hotel's ");

        combo.setBackground(new java.awt.Color(102, 102, 255));
        combo.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Overview", "Inside", "Restaurant", "Swimming Pool", "SPA", " " }));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entry.jpg"))); // NOI18N

        map.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        map.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        map.setText("Who needs a map?");

        location.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        location.setText("Our Location");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N

        surround.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        surround.setText("Our surroundings");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/map.jpg"))); // NOI18N

        language.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        language.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Language", "English", "中文", "日本語" }));
        language.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                languageItemStateChanged(evt);
            }
        });
        language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
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
                        .addGap(681, 681, 681)
                        .addComponent(location)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(guestName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(book)
                                .addGap(86, 86, 86))
                            .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(115, 115, 115))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(look)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(map)
                        .addGap(101, 101, 101))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(getName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(sure)
                            .addGap(101, 101, 101)
                            .addComponent(no))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(pic)
                                    .addGap(84, 84, 84)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(31, 31, 31))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(surround)
                                            .addGap(104, 104, 104))))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getName)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(guestName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book))
                        .addGap(3, 3, 3))
                    .addComponent(display))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sure)
                    .addComponent(no))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(look)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(map))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(location)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(surround)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(pic)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
         String name= evt.getActionCommand();
        guestName.setText(String.format("%s",name));
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_noActionPerformed

    private void sureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sureActionPerformed
        // TODO add your handling code here:
        RoomChoose a = new RoomChoose();
        a.run();
    }//GEN-LAST:event_sureActionPerformed

    private void languageItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_languageItemStateChanged
        // TODO add your handling code here:
        if(language.getSelectedIndex()==1)
        {
            welcome.setText("Welcome to the hotel reservation system.");
            getName.setText("May I have your name please?");
            display.setText("So,Mr/Mrs/Ms");
            book.setText("you want to book a room,right?");
            sure.setText("Sure, why not!");
            no.setText("Humm...maybe next time.");
            look.setText("Take a look at our hotel's:");
            map.setText("Who needs a map?");
            location.setText("Our location");
            surround.setText("Our surroundings");
        }
        if(language.getSelectedIndex()==2)
        {
            welcome.setText("欢迎来到酒店预定系统");
            getName.setText("请问阁下贵姓？");
            display.setText("那");
            book.setText("先生/女士，您想预定一间客房？");
            sure.setText("当然啦~");
            no.setText("额。。。我是来打酱油的。");
            look.setText("来看看我们酒店的：");
            map.setText("酒店地理环境");
            location.setText("我们的位置");
            surround.setText("我们的周边商铺");
        }
         if(language.getSelectedIndex()==3)
        {
            welcome.setText("ホテル予約システムへようこそ");
            getName.setText("お名前は何とおっしゃいますか?");
            display.setText("あの");
            book.setText("宿泊のご予約ですか？");
            sure.setText("Yes] はい");
            no.setText("いいえ");
            look.setText("私たちのホテルを見てみて：");
            map.setText("ホテルの情報");
            location.setText("ホテルの位置は");
            surround.setText("ホテル周辺のお店");
        }
    }//GEN-LAST:event_languageItemStateChanged

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        // TODO add your handling code here:
        Icon image1 = new ImageIcon(getClass().getResource("entry.jpg"));
         Icon image2 = new ImageIcon(getClass().getResource("inside.jpg"));         
        Icon image3 = new ImageIcon(getClass().getResource("restaurant.jpg"));         
        Icon image4 = new ImageIcon(getClass().getResource("pool.jpg")); 
        Icon image5 = new ImageIcon(getClass().getResource("spa.jpg")); 
         if (combo.getSelectedIndex()== 0)         
            pic.setIcon(image1);         
        else if (combo.getSelectedIndex()==1)             
            pic.setIcon(image2);         
        else if (combo.getSelectedIndex()==2)             
            pic.setIcon(image3);         
        else if (combo.getSelectedIndex()==3)             
            pic.setIcon(image4);
         else if (combo.getSelectedIndex()==4)             
            pic.setIcon(image5);
    }//GEN-LAST:event_comboItemStateChanged

    private void languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageActionPerformed

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
            java.util.logging.Logger.getLogger(Entrance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrance().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel book;
    private javax.swing.JComboBox combo;
    private javax.swing.JLabel display;
    private javax.swing.JLabel getName;
    private javax.swing.JLabel guestName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox language;
    private javax.swing.JLabel location;
    private javax.swing.JLabel look;
    private javax.swing.JLabel map;
    private javax.swing.JButton no;
    private javax.swing.JLabel pic;
    private javax.swing.JButton sure;
    private javax.swing.JLabel surround;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
