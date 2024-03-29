
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class ControlCar extends javax.swing.JFrame {
    
    private int select =0; 
    
    
    public ControlCar() {
        initComponents();

        setLayout(new BorderLayout());
        System.out.println(Employees.Carlist.size());
        setLayout(new BorderLayout());
        for (int i=0;i<Employees.Carlist.size();i++){  
            if (i==select){
                add(Employees.Carlist.get(select).panel);
            }
        }
        
        PopuLabel.setText(Integer.toString( Employees.Carlist.get(select).getPopularity()));
        if (Employees.Carlist.get(select).isEtat()){
            StatLabel.setText("Available");
        }
        else{
            StatLabel.setText("no available");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PopuLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        StatLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Discount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        PopuLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Popularity");

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Switch State");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(PopuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(StatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(StatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(PopuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        invalidate();
        remove(Employees.Carlist.get(select).panel);
        if(select>0){
            select--;
        }   
        setLayout(new BorderLayout());
        add(Employees.Carlist.get(select).panel);
        PopuLabel.setText(Integer.toString( Employees.Carlist.get(select).getPopularity()));
        
        if (Employees.Carlist.get(select).isEtat()){
            StatLabel.setText("Available");
        }
        else{
            StatLabel.setText("no available");
        }
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        invalidate();
        remove(Employees.Carlist.get(select).panel);
        if(select<Employees.Carlist.size()-1){
            select++;
        }  
        setLayout(new BorderLayout());
        add(Employees.Carlist.get(select).panel);
        PopuLabel.setText(Integer.toString( Employees.Carlist.get(select).getPopularity()));
        if (Employees.Carlist.get(select).isEtat()){
            StatLabel.setText("Available");
        }
        else{
            StatLabel.setText("no available");
        }
        revalidate();
        repaint();    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double discount;
        String str; 
        str = JOptionPane.showInputDialog("Enter the discount");
        discount = Double.parseDouble(str);
        Employees.Carlist.get(select).setDiscount(discount);
        CarImpl cipp = new CarImpl();
        cipp.CarDiscount(Employees.Carlist.get(select).getCarID(), discount);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CarImpl cim = new CarImpl();
        boolean libre = !Employees.Carlist.get(select).isEtat();
        Employees.Carlist.get(select).setEtat(libre);
        cim.CarStat(Employees.Carlist.get(select).getCarID(), libre);
        if (libre){
            StatLabel.setText("Available");
        }
        else{
            StatLabel.setText("no available");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CarImpl cimp = new CarImpl();
        try {
            cimp.delete_car(Employees.Carlist.get(select).getCarID());
        } catch (SQLException ex) {
            Logger.getLogger(ControlCar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PopuLabel;
    private javax.swing.JLabel StatLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
