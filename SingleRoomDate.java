
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blood-Joker
 */
public class SingleRoomDate extends javax.swing.JFrame {

    /**
     * Creates new form SingleRoomDate
     */
    int m1;
    int m2;
    int d1;
    int d2;
    int total;
    int money;
    int c;
    int b;
    int e;
    int f;
            
    public SingleRoomDate() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        month1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        month2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        date1 = new javax.swing.JComboBox();
        date2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        jLabel1.setText("So you want a single room, that's cool~!");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel2.setText(" Tell us your check in and check out date");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkin.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkout.jpg"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setText("Check in");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("Month");

        month1.setBackground(new java.awt.Color(51, 51, 255));
        month1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        month1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                month1ItemStateChanged(evt);
            }
        });
        month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel6.setText("Check out");

        month2.setBackground(new java.awt.Color(51, 51, 255));
        month2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        month2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                month2ItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel4.setText("Date");

        date1.setBackground(new java.awt.Color(51, 51, 255));
        date1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        date1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        date1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                date1ItemStateChanged(evt);
            }
        });

        date2.setBackground(new java.awt.Color(51, 51, 255));
        date2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        date2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        date2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                date2ItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel7.setText("Your total will be: $");

        jLabel8.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel8.setText("dollars.");

        text.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButton1.setText("Proceed to check out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(133, 133, 133))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(94, 94, 94)
                                                        .addComponent(month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2))
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(514, 514, 514))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton2)))
                        .addGap(142, 142, 142))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel10)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void month1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_month1ItemStateChanged
        // TODO add your handling code here:
        if (month1.getSelectedIndex()== 0)
        {
            m1=0;
        }
        
        if (month1.getSelectedIndex()== 1)
        {
            if(date1.getSelectedIndex()==28||date1.getSelectedIndex()==29||date1.getSelectedIndex()==30||date1.getSelectedIndex()==31)
            {
               c=100000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             else{
                  m1=31;
             }
           
        }
        
        if (month1.getSelectedIndex()== 2)
        {
            m1=59;
        }
        
        if (month1.getSelectedIndex()== 3)
        {
            if(date1.getSelectedIndex()==31)
            {
               c=100000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             else{
                  m1=90;
             }
            
        }
        
        if (month1.getSelectedIndex()== 4)
        {
            m1=120;
        }
        
        if (month1.getSelectedIndex()== 5)
        {
             if(date1.getSelectedIndex()==31)
            {
               c=100000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             else{
                  m1=151;
             }
           
        }
        
        if (month1.getSelectedIndex()== 6)
        {
            m1=181;
        }
        
        if (month1.getSelectedIndex()== 7)
        {
            m1=212;
        }
        
        if (month1.getSelectedIndex()== 8)
        { 
            m1=243;
            
             if(date1.getSelectedIndex()==31)
            {
               c=100000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             
                 
             
            
        }
        
        if (month1.getSelectedIndex()== 9)
        {
            m1=273;
        }
        
        if (month1.getSelectedIndex()== 10)
        {
            m1=304;
            
             if(date1.getSelectedIndex()==31)
            {
               c=10000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             
                  
             
            
        }
        
        if (month1.getSelectedIndex()== 11)
        {
            m1=334;
        }
        
    }//GEN-LAST:event_month1ItemStateChanged

    private void month2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_month2ItemStateChanged
        // TODO add your handling code here:
        if (month2.getSelectedIndex()== 0)
        {
            m2=0;
        }
        
        if (month2.getSelectedIndex()== 1)
        {
            m2=31;
            
            if(date2.getSelectedIndex()==28||date2.getSelectedIndex()==29||date2.getSelectedIndex()==30||date2.getSelectedIndex()==31)
            {
               b=1000000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             
                  
             
         
        }
        
        if (month2.getSelectedIndex()== 2)
        {
            m2=59;
        }
        
        if (month2.getSelectedIndex()== 3)
        { 
            m2=90;
        
             if(date2.getSelectedIndex()==31)
            {
               b=1000000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             
                  
             
           
        }
        
        if (month2.getSelectedIndex()== 4)
        {
            
             m2=120;
        }
        
        if (month2.getSelectedIndex()== 5)
        {
            m2=151;
            
              if(date2.getSelectedIndex()==31)
            {
               b=1000000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             
                    
             
            
        }
        
        if (month2.getSelectedIndex()== 6)
        {
          
            m2=181;
        }
        
        if (month2.getSelectedIndex()== 7)
        {
            
             m2=212;
        }
        
        if (month2.getSelectedIndex()== 8)
        {
            m2=243;
            
            if(date2.getSelectedIndex()==31)
            {
               b=1000000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             
                  
             
           
        }
        
        if (month2.getSelectedIndex()== 9)
        {
            m2=273;
        }
        
        if (month2.getSelectedIndex()== 10)
        {
            m2=304;
            
            if(date2.getSelectedIndex()==30)
            {
             
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             
                  
             
        }
        
        if (month2.getSelectedIndex()== 11)
        {
            m2=334;
        }
    }//GEN-LAST:event_month2ItemStateChanged

    private void date1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_date1ItemStateChanged
        // TODO add your handling code here:
        if (date1.getSelectedIndex()== 0)
        {
            d1=0;
        }
        
        if (date1.getSelectedIndex()== 1)
        {
            d1=1;
        }
        
        if (date1.getSelectedIndex()== 2)
        {
            d1=2;
        }
        
        if (date1.getSelectedIndex()== 3)
        {
            d1=3;
        }
        
        if (date1.getSelectedIndex()== 4)
        {
            d1=4;
        }
        
        if (date1.getSelectedIndex()== 5)
        {
            d1=5;
        }
        
        if (date1.getSelectedIndex()== 6)
        {
            d1=6;
        }
        
        if (date1.getSelectedIndex()== 7)
        {
            d1=7;
        }
        
        if (date1.getSelectedIndex()== 8)
        {
            d1=8;
        }
        
        if (date1.getSelectedIndex()== 9)
        {
            d1=9;
        }
        
        if (date1.getSelectedIndex()== 10)
        {
            d1=10;
        }
        
        if (date1.getSelectedIndex()== 11)
        {
            d1=11;
        }
        
        if (date1.getSelectedIndex()== 12)
        {
            d1=12;
        }
        
        if (date1.getSelectedIndex()== 13)
        {
            d1=13;
        }
        
        if (date1.getSelectedIndex()== 14)
        {
            d1=14;
        }
        
        if (date1.getSelectedIndex()== 15)
        {
            d1=15;
        }
        
        if (date1.getSelectedIndex()== 16)
        {
            d1=16;
        }
        
        if (date1.getSelectedIndex()== 17)
        {
            d1=17;
        }
        
        if (date1.getSelectedIndex()== 18)
        {
            d1=18;
        }
        
        if (date1.getSelectedIndex()== 19)
        {
            d1=19;
        }
        
        if (date1.getSelectedIndex()== 20)
        {
            d1=20;
        }
        
        if (date1.getSelectedIndex()== 21)
        {
            d1=21;
        }
        
        if (date1.getSelectedIndex()== 22)
        {
            d1=22;
        }
        
        if (date1.getSelectedIndex()== 23)
        {
            d1=23;
        }
        
        if (date1.getSelectedIndex()== 24)
        {
            d1=24;
        }
        
        if (date1.getSelectedIndex()== 25)
        {
            d1=25;
        }
        
        if (date1.getSelectedIndex()== 26)
        {
            d1=26;
        }
        
        if (date1.getSelectedIndex()== 27)
        {
            d1=27;
        }
        
        if (date1.getSelectedIndex()== 28)
        {
            d1=28;
            
             if(month1.getSelectedIndex()==1)
            {
               e=10000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
             
        }
        
        if (date1.getSelectedIndex()== 29)
        {
            d1=29;
            
            if(month1.getSelectedIndex()==1)
            {
                e=10000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
            
            
          
            
        }
        
        if (date1.getSelectedIndex()== 30)
        {
            d1=30;
            
            if(month1.getSelectedIndex()==3||month1.getSelectedIndex()==5||month1.getSelectedIndex()==8||month1.getSelectedIndex()==10)
            {
                e=1;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
            
        }
        
        
        
    }//GEN-LAST:event_date1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int g=c+e;
         int h= b+f
;       
         String b = "";   
            b = String.format("Please enter a valid date, or we will count as normal days.It's your loss.");
        
            JOptionPane.showMessageDialog(null,b);
        if(g>=10000||h>=10000)
        {
            String a = "";   
            a = String.format("Please enter a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
        }
           total=(m2-m1)+(d2-d1);
      
        
       if(total<=0)
        {
            String a = "";   
            a = String.format("Please enter a valid date! Otherwise,we cannot have you live here for more than a year!");
        
            JOptionPane.showMessageDialog(null,a);
        }
        else
        {
              money = total*200;
        text.setText(String.format("%d",money));
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void date2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_date2ItemStateChanged
        // TODO add your handling code here:
        if (date2.getSelectedIndex()== 0)
        {
            d2=0;
        }
        
        if (date2.getSelectedIndex()== 1)
        {
            d2=1;
        }
        
        if (date2.getSelectedIndex()== 2)
        {
            d2=2;
        }
        
        if (date2.getSelectedIndex()== 3)
        {
            d2=3;
        }
        
        if (date2.getSelectedIndex()== 4)
        {
            d2=4;
        }
        
        if (date2.getSelectedIndex()== 5)
        {
            d1=5;
        }
        
        if (date2.getSelectedIndex()== 6)
        {
            d2=6;
        }
        
        if (date2.getSelectedIndex()== 7)
        {
            d2=7;
        }
        
        if (date2.getSelectedIndex()== 8)
        {
            d2=8;
        }
        
        if (date2.getSelectedIndex()== 9)
        {
            d2=9;
        }
        
        if (date2.getSelectedIndex()== 10)
        {
            d2=10;
        }
        
        if (date2.getSelectedIndex()== 11)
        {
            d2=11;
        }
        
        if (date2.getSelectedIndex()== 12)
        {
            d2=12;
        }
        
        if (date2.getSelectedIndex()== 13)
        {
            d2=13;
        }
        
        if (date2.getSelectedIndex()== 14)
        {
            d2=14;
        }
        
        if (date2.getSelectedIndex()== 15)
        {
            d2=15;
        }
        
        if (date2.getSelectedIndex()== 16)
        {
            d2=16;
        }
        
        if (date2.getSelectedIndex()== 17)
        {
            d2=17;
        }
        
        if (date2.getSelectedIndex()== 18)
        {
            d2=18;
        }
        
        if (date2.getSelectedIndex()== 19)
        {
            d2=19;
        }
        
        if (date2.getSelectedIndex()== 20)
        {
            d2=20;
        }
        
        if (date2.getSelectedIndex()== 21)
        {
            d2=21;
        }
        
        if (date2.getSelectedIndex()== 22)
        {
            d2=22;
        }
        
        if (date2.getSelectedIndex()== 23)
        {
            d2=23;
        }
        
        if (date2.getSelectedIndex()== 24)
        {
            d2=24;
        }
        
        if (date2.getSelectedIndex()== 25)
        {
            d2=25;
        }
        
        if (date2.getSelectedIndex()== 26)
        {
            d2=26;
        }
        
        if (date2.getSelectedIndex()== 27)
        {
            d2=27;
        }
        
        if (date2.getSelectedIndex()== 28)
        {
             d2=28;
            
            if(month2.getSelectedIndex()==1)
            {
                f=10000;
            String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
           
           
        }
        
        if (date2.getSelectedIndex()== 29)
        {
            d2=29;
            
             if(month2.getSelectedIndex()==1)
            {
                f=100000;
            String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
            
          
        }
        
        if (date2.getSelectedIndex()== 30)
        {
            d2=29;
            
             if(month2.getSelectedIndex()==3||month2.getSelectedIndex()==5||month2.getSelectedIndex()==8||month2.getSelectedIndex()==10)
            {
                f=10000;
                 String a = "";   
            a = String.format("Please choose a valid date!");
        
            JOptionPane.showMessageDialog(null,a);
            }
          
           
        }
        
        
        
        
    }//GEN-LAST:event_date2ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Payment a = new Payment();
        a.run();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_month1ActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        //</editor-fold>

        /* Create and display the form */
     //   java.awt.EventQueue.invokeLater(new Runnable() {
            
      //  });
    //}//
    public void run() {
                new SingleRoomDate().setVisible(true);
            }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox date1;
    private javax.swing.JComboBox date2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox month1;
    private javax.swing.JComboBox month2;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
