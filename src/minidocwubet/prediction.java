/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minidocwubet;
import java.util.*;
import java.lang.*;
import java.sql.*;
import javax.swing.JOptionPane;

import project.ConnectionProvider;

import static minidocwubet.symptoms1.*;
/**
 *
 * @author hp
 */
public class prediction extends javax.swing.JFrame {

    /**
     * Creates new form prediction
     */
      Disease d1= new Disease("d1",25,22,21,17,1,15);
    Disease d2= new Disease("d2",30,31,25,16);
    Disease d3= new Disease("d3",25,2,9,32,15,1);
    Disease d4= new Disease("d4",55,56,57,63);
    Disease d5= new Disease("d5",25,40,9,17,2,1,34,35,36,37,38,44,4);
    Disease d6= new Disease("d6",5,57,59,14,56,46,47,48,49);
    Disease d7= new Disease("d7",5,29,34,8);
    Disease d8= new Disease("d8",81,50,82,15);
    Disease d9= new Disease("d9",51,52,11,53);
    Disease d10= new Disease("d10",11,1,17,25,62,15,24);
    Disease d11= new Disease("d11",25,64,33,65,19,15,85);
    Disease d12= new Disease("d12",18,26,27,28,60,31);
    Disease d13= new Disease("d13",5,4,6,84,17,43); 
    Disease d14= new Disease("d14",17,25,1,2,69,23,77,76,86);
    Disease d15= new Disease("d15",85,51,36,12);
    Disease d16= new Disease("d16",17,12,15,30);
    Disease d17= new Disease("d17",25,31,20,87,62,1,2,24,23);
    Disease d18= new Disease("d18",11,36,31,18,39,73);
    Disease d19= new Disease("d19",12,1,2,7,8,23,25,15,58);
      Disease d20= new Disease("d20",25,31,78,67,80,87,83);
      Disease d21=new Disease("empity",0,0,0,0,0,0,0,0,0,0,0,0);

    public prediction() {
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
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treat = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dease = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Bauhaus 93", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 51));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\finish.png")); // NOI18N
        jButton5.setText("FINISH");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 540, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 134, 125));

        treat.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        treat.setForeground(new java.awt.Color(0, 153, 51));
        jScrollPane1.setViewportView(treat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 208, 710, 314));

        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("ACCURACY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 110, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Bauhaus 93", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 51));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\back.png")); // NOI18N
        jButton6.setText(" BACK TO MANU");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 623, 424, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 155, 214, 47));

        dease.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        dease.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(dease, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 155, 328, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int d111=0;
        int d22=0;
        int d33=0;
        int d44=0;
        int d55=0;
        int d66=0;
        int d77=0;
        int d88=0;
        int d99=0;
        int d1010=0;
        int d1111=0;
        int d1212=0;
        int d1313=0;
        int d1414=0;
        int d1515=0;
        int d1616=0;
        int d1717=0;
        int d1818=0;
        int d1919=0;
        int d2020=0;
        int d2121=0;
        symptoms1 sy1=new symptoms1();
        int[] symptoms={sy1.s1,sy1.s2,sy1.s3,sy1.s4,sy1.s5,sy1.s6,sy1.s7,sy1.s8,sy1.s9,sy1.s10,sy1.s11,sy1.s12,sy1.s13,sy1.s14,sy1.s15,sy1.s16,sy1.s17,sy1.s18,sy1.s19,sy1.s20,sy1.s21,sy1.s22,sy1.s23,sy1.s24,sy1.s25,sy1.s26,sy1.s27,sy1.s28,sy1.s29,sy1.s30,sy1.s31,sy1.s32,sy1.s33,sy1.s34,sy1.s35,sy1.s36,sy1.s37,sy1.s38,sy1.s39,sy1.s40,s41,s42,s43,s44,s45,s46,s47,s48,s49,s50,s51,s52,s53,s54,s55,s56,s57,s58,s59,s60,s61,s62,s63,s64,s65,s66,s67,s68,s69,s70,s71,s72,s73,s74,s75,s76,s77,s78,s79,s80,s81,s82,s83,s84,s85,s86,s87};

        // d1.symptom1==symptoms[i]||d1.symptom2==symptoms[i]||d1.symptom3==symptoms[i]||d1.symptom4==symptoms[i]||d1.symptom5==symptoms[i]||d1.symptom6==symptoms[i]||d1.symptom7==symptoms[i]||d1.symptom8==symptoms[i]||d1.symptom9==symptoms[i]||d1.symptom10==symptoms[i]||d1.symptom11==symptoms[i]||d1.symptom12==symptoms[i]||d1.symptom13==symptoms[i]
        //jLabel2.setText(String.valueOf(symptoms[0])+" "+String.valueOf(symptoms[1])+" "+String.valueOf(symptoms[2])+" "+String.valueOf(symptoms[3])+" "+String.valueOf(symptoms[4]));
        for (int i = 0; i < 87; i++) {

            if(d1.symptom1==symptoms[i]||d1.symptom2==symptoms[i]||d1.symptom3==symptoms[i]||d1.symptom4==symptoms[i]||d1.symptom5==symptoms[i]||d1.symptom6==symptoms[i]||d1.symptom7==symptoms[i]||d1.symptom8==symptoms[i]||d1.symptom9==symptoms[i]||d1.symptom10==symptoms[i]||d1.symptom11==symptoms[i]||d1.symptom12==symptoms[i]||d1.symptom13==symptoms[i])
            d111++;
            if(d2.symptom1==symptoms[i]||d2.symptom2==symptoms[i]||d2.symptom3==symptoms[i]||d2.symptom4==symptoms[i]||d2.symptom5==symptoms[i]||d2.symptom6==symptoms[i]||d2.symptom7==symptoms[i]||d2.symptom8==symptoms[i]||d2.symptom9==symptoms[i]||d2.symptom10==symptoms[i]||d2.symptom11==symptoms[i]||d2.symptom12==symptoms[i]||d2.symptom13==symptoms[i])
            d22++;

            if(d3.symptom1==symptoms[i]||d3.symptom2==symptoms[i]||d3.symptom3==symptoms[i]||d3.symptom4==symptoms[i]||d3.symptom5==symptoms[i]||d3.symptom6==symptoms[i]||d3.symptom7==symptoms[i]||d3.symptom8==symptoms[i]||d3.symptom9==symptoms[i]||d3.symptom10==symptoms[i]||d3.symptom11==symptoms[i]||d3.symptom12==symptoms[i]||d3.symptom13==symptoms[i])
            d33++;
            if(d4.symptom1==symptoms[i]||d4.symptom2==symptoms[i]||d4.symptom3==symptoms[i]||d4.symptom4==symptoms[i]||d4.symptom5==symptoms[i]||d4.symptom6==symptoms[i]||d4.symptom7==symptoms[i]||d4.symptom8==symptoms[i]||d4.symptom9==symptoms[i]||d4.symptom10==symptoms[i]||d4.symptom11==symptoms[i]||d4.symptom12==symptoms[i]||d4.symptom13==symptoms[i])
            d44++;
            if(d5.symptom1==symptoms[i]||d5.symptom2==symptoms[i]||d5.symptom3==symptoms[i]||d5.symptom4==symptoms[i]||d5.symptom5==symptoms[i]||d5.symptom6==symptoms[i]||d5.symptom7==symptoms[i]||d5.symptom8==symptoms[i]||d5.symptom9==symptoms[i]||d5.symptom10==symptoms[i]||d5.symptom11==symptoms[i]||d5.symptom12==symptoms[i]||d5.symptom13==symptoms[i])
            d55++;
            if(d6.symptom1==symptoms[i]||d6.symptom2==symptoms[i]||d6.symptom3==symptoms[i]||d6.symptom4==symptoms[i]||d6.symptom5==symptoms[i]||d6.symptom6==symptoms[i]||d6.symptom7==symptoms[i]||d6.symptom8==symptoms[i]||d6.symptom9==symptoms[i]||d6.symptom10==symptoms[i]||d6.symptom11==symptoms[i]||d6.symptom12==symptoms[i]||d6.symptom13==symptoms[i])
            d66++;
            if(d7.symptom1==symptoms[i]||d7.symptom2==symptoms[i]||d7.symptom3==symptoms[i]||d7.symptom4==symptoms[i]||d7.symptom5==symptoms[i]||d7.symptom6==symptoms[i]||d7.symptom7==symptoms[i]||d7.symptom8==symptoms[i]||d7.symptom9==symptoms[i]||d7.symptom10==symptoms[i]||d7.symptom11==symptoms[i]||d7.symptom12==symptoms[i]||d7.symptom13==symptoms[i])
            d77++;
            if(d8.symptom1==symptoms[i]||d8.symptom2==symptoms[i]||d8.symptom3==symptoms[i]||d8.symptom4==symptoms[i]||d8.symptom5==symptoms[i]||d8.symptom6==symptoms[i]||d8.symptom7==symptoms[i]||d8.symptom8==symptoms[i]||d8.symptom9==symptoms[i]||d8.symptom10==symptoms[i]||d8.symptom11==symptoms[i]||d8.symptom12==symptoms[i]||d8.symptom13==symptoms[i])
            d88++;
            if(d9.symptom1==symptoms[i]||d9.symptom2==symptoms[i]||d9.symptom3==symptoms[i]||d9.symptom4==symptoms[i]||d9.symptom5==symptoms[i]||d9.symptom6==symptoms[i]||d9.symptom7==symptoms[i]||d9.symptom8==symptoms[i]||d9.symptom9==symptoms[i]||d9.symptom10==symptoms[i]||d9.symptom11==symptoms[i]||d9.symptom12==symptoms[i]||d9.symptom13==symptoms[i])
            d99++;
            if(d10.symptom1==symptoms[i]||d10.symptom2==symptoms[i]||d10.symptom3==symptoms[i]||d10.symptom4==symptoms[i]||d10.symptom5==symptoms[i]||d10.symptom6==symptoms[i]||d10.symptom7==symptoms[i]||d10.symptom8==symptoms[i]||d10.symptom9==symptoms[i]||d10.symptom10==symptoms[i]||d10.symptom11==symptoms[i]||d10.symptom12==symptoms[i]||d10.symptom13==symptoms[i])
            d1010++;
            if(d1.symptom1==symptoms[i]||d11.symptom2==symptoms[i]||d11.symptom3==symptoms[i]||d11.symptom4==symptoms[i]||d11.symptom5==symptoms[i]||d11.symptom6==symptoms[i]||d11.symptom7==symptoms[i]||d11.symptom8==symptoms[i]||d11.symptom9==symptoms[i]||d11.symptom10==symptoms[i]||d11.symptom11==symptoms[i]||d11.symptom12==symptoms[i]||d11.symptom13==symptoms[i])
            d1111++;
            if(d12.symptom1==symptoms[i]||d12.symptom2==symptoms[i]||d12.symptom3==symptoms[i]||d12.symptom4==symptoms[i]||d12.symptom5==symptoms[i]||d12.symptom6==symptoms[i]||d12.symptom7==symptoms[i]||d12.symptom8==symptoms[i]||d12.symptom9==symptoms[i]||d12.symptom10==symptoms[i]||d12.symptom11==symptoms[i]||d12.symptom12==symptoms[i]||d12.symptom13==symptoms[i])
            d1212++;
            if(d13.symptom1==symptoms[i]||d13.symptom2==symptoms[i]||d13.symptom3==symptoms[i]||d13.symptom4==symptoms[i]||d13.symptom5==symptoms[i]||d13.symptom6==symptoms[i]||d13.symptom7==symptoms[i]||d13.symptom8==symptoms[i]||d13.symptom9==symptoms[i]||d13.symptom10==symptoms[i]||d13.symptom11==symptoms[i]||d13.symptom12==symptoms[i]||d13.symptom13==symptoms[i])
            d1313++;
            if(d14.symptom1==symptoms[i]||d14.symptom2==symptoms[i]||d14.symptom3==symptoms[i]||d14.symptom4==symptoms[i]||d14.symptom5==symptoms[i]||d14.symptom6==symptoms[i]||d14.symptom7==symptoms[i]||d14.symptom8==symptoms[i]||d14.symptom9==symptoms[i]||d14.symptom10==symptoms[i]||d14.symptom11==symptoms[i]||d14.symptom12==symptoms[i]||d14.symptom13==symptoms[i])
            d1414++;

            if(d15.symptom1==symptoms[i]||d15.symptom2==symptoms[i]||d15.symptom3==symptoms[i]||d15.symptom4==symptoms[i]||d15.symptom5==symptoms[i]||d15.symptom6==symptoms[i]||d15.symptom7==symptoms[i]||d15.symptom8==symptoms[i]||d15.symptom9==symptoms[i]||d15.symptom10==symptoms[i]||d15.symptom11==symptoms[i]||d15.symptom12==symptoms[i]||d15.symptom13==symptoms[i])
            d1515++;
            if(d16.symptom1==symptoms[i]||d16.symptom2==symptoms[i]||d16.symptom3==symptoms[i]||d16.symptom4==symptoms[i]||d16.symptom5==symptoms[i]||d16.symptom6==symptoms[i]||d16.symptom7==symptoms[i]||d16.symptom8==symptoms[i]||d16.symptom9==symptoms[i]||d16.symptom10==symptoms[i]||d16.symptom11==symptoms[i]||d16.symptom12==symptoms[i]||d16.symptom13==symptoms[i])
            d1616++;
            if(d17.symptom1==symptoms[i]||d17.symptom2==symptoms[i]||d17.symptom3==symptoms[i]||d17.symptom4==symptoms[i]||d17.symptom5==symptoms[i]||d17.symptom6==symptoms[i]||d17.symptom7==symptoms[i]||d17.symptom8==symptoms[i]||d17.symptom9==symptoms[i]||d17.symptom10==symptoms[i]||d17.symptom11==symptoms[i]||d17.symptom12==symptoms[i]||d17.symptom13==symptoms[i])
            d1717++;
            if(d18.symptom1==symptoms[i]||d18.symptom2==symptoms[i]||d18.symptom3==symptoms[i]||d18.symptom4==symptoms[i]||d18.symptom5==symptoms[i]||d18.symptom6==symptoms[i]||d18.symptom7==symptoms[i]||d18.symptom8==symptoms[i]||d18.symptom9==symptoms[i]||d18.symptom10==symptoms[i]||d18.symptom11==symptoms[i]||d18.symptom12==symptoms[i]||d18.symptom13==symptoms[i])
            d1818++;
            if(d19.symptom1==symptoms[i]||d19.symptom2==symptoms[i]||d19.symptom3==symptoms[i]||d19.symptom4==symptoms[i]||d19.symptom5==symptoms[i]||d19.symptom6==symptoms[i]||d19.symptom7==symptoms[i]||d19.symptom8==symptoms[i]||d19.symptom9==symptoms[i]||d19.symptom10==symptoms[i]||d19.symptom11==symptoms[i]||d19.symptom12==symptoms[i]||d19.symptom13==symptoms[i])
            d1919++;
            if(d20.symptom1==symptoms[i]||d20.symptom2==symptoms[i]||d20.symptom3==symptoms[i]||d20.symptom4==symptoms[i]||d20.symptom5==symptoms[i]||d20.symptom6==symptoms[i]||d20.symptom7==symptoms[i]||d20.symptom8==symptoms[i]||d20.symptom9==symptoms[i]||d20.symptom10==symptoms[i]||d20.symptom11==symptoms[i]||d20.symptom12==symptoms[i]||d20.symptom13==symptoms[i])
            d2020++;

        }
        int values []={d111,d22,d33,d44,d55,d66,d77,d88,d99,d1010,d1111,d1212,d1313,d1414,d1515,d1616,d1717,d1818,d1919,d2020};
        Arrays.sort(values);
        int ans=values[19];
        //jLabel3.setText(Arrays.toString(values));
        if (ans==d111)
        {
            int persentage= (d111*100)/6;
             jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T1'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d01'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d22)
        {
            int persentage =(d22*100)/4;
             jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T2'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d02'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d33)
        {
            int persentage =(d33*100)/6;
            //jLabel1.setText("d33");
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T3'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d03'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
            
        }
        if (ans==d44)
        {
            int persentage= (d44*100)/4;
             jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T4'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d04'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d55)
        {
           int persentage= (d55*100)/13;
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T5'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d05'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        
        }
        if (ans==d66)
        {
            int persentage= (d66*100)/9;
         jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T6'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d06'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d77)
        {
            int persentage= (d77*100)/4;
        jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T7'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d07'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d88)
        {
            int persentage= (d88*100)/4;
        jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T8'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d08'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d99)
        {
            int persentage= (d99*100)/4;
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T9'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d09'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d1010)
        {
            int persentage= (d1010*100)/7;
         jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T10'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d10'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d1111)
        {
            int persentage= (d1111*100)/7;
          jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T11'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d11'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d1212)
        {
            int persentage= (d1212*100)/6;
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T12'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d12'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }if (ans==d1313)
        {
            int persentage= (d1313*100)/6;
          jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T13'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d13'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }if (ans==d1414)
        {
           int persentage= (d1414*100)/9;
        
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T14'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d20'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
           }
        }if (ans==d1515)
        {
            int persentage= (d1515*100)/4;
        
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T15'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d15'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }if (ans==d1616)
        {
            int persentage= (d1616*100)/4;
        
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T16'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d16'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }if (ans==d1717)
        {
            int persentage= (d1717*100)/9;
          
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T17'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d17'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        jLabel4.setText(String.valueOf(persentage)+"%");
        }
        if (ans==d1818)
        {
            int persentage= (d1818*100)/6;
        
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T18'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d18'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d1919)
        {
            int persentage= (d1919*100)/9;
          
            jLabel4.setText(String.valueOf(persentage)+"%");
            try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
        ResultSet rs =  st1.executeQuery("SELECT tdescription FROM treatment where tcode='T19'");
       
          if(rs.next()){
            
             //String value = rs.getString("expert1");
             treat.setText(rs.getString(1));
     
       }
          ResultSet rs1=st1.executeQuery("select deases_name from deases where deases_code='d20'");
          if(rs1.next()){
              dease.setText(rs1.getString(1));
          }
        
     
        }catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
        }
        }
        if (ans==d2020)
        {
         if (ans!=0)
         {
             new rabies1().setVisible(true);
         setVisible(false);
         }
            
   
        }
        if (ans==d2121)
        {
            
           
            
                new disease_not_found().setVisible(true);
                setVisible(false);
            
        }
        Arrays.fill(symptoms,0);
        Arrays.fill(values,0);
        sy1.s1=sy1.s2=sy1.s3=sy1.s4=sy1.s5=sy1.s6=sy1.s7=sy1.s8=sy1.s9=sy1.s10=sy1.s11=sy1.s12=sy1.s13=sy1.s14=sy1.s15=sy1.s16=sy1.s17=sy1.s18=sy1.s19=sy1.s20=sy1.s21=sy1.s22=sy1.s23=sy1.s24=sy1.s25=sy1.s26=sy1.s27=sy1.s28=sy1.s29=sy1.s30=sy1.s31=sy1.s32=sy1.s33=sy1.s34=sy1.s35=sy1.s36=sy1.s37=sy1.s38=sy1.s39=sy1.s40=s41=s42=s43=s44=s45=s46=s47=s48=s49=s50=s51=s52=s53=s54=s55=s56=s57=s58=s59=s60=s61=s62=s63=s64=s65=s66=s67=s68=s69=s70=s71=s72=s73=s74=s75=s76=s77=s78=s79=s80=s81=s82=s83=s84=s85=s86=s87=0;
       // jLabel3.setText(String.valueOf(symptoms[0]));
        //jLabel1.setText(String.valueOf(sy1.count_chacked));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        start_page_wubet s2=new start_page_wubet();
        setVisible(false);
        s2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prediction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dease;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane treat;
    // End of variables declaration//GEN-END:variables
}
