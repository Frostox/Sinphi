/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package signals;

import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Roger
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public test(String str) {
        super(str);
        //setResizable(false);
        initComponents();
        this.jLabel1.setText(this.signalPanel1.s.toString());
        setSize(800,600);
        horizAdjustmentValueChanged(null);
        carrierx.setText(this.signalPanel1.carrier.toString());
        this.modulating.setSelected(true);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SpinnerModel sm = new SpinnerNumberModel(60, 1, 1000000, 1);
        jSpinner1 = new javax.swing.JSpinner(sm);
        signalPanel1 = new signals.SignalPanel();
        SpinnerModel sm1 = new SpinnerNumberModel(500, -100000, 100000, 1);
        jSpinner2 = new javax.swing.JSpinner(sm1);
        SpinnerModel sm2 = new SpinnerNumberModel(1000, -10000, 10000, 1);
        jSpinner3 = new javax.swing.JSpinner(sm2);
        SpinnerModel sm3 = new SpinnerNumberModel(0, -359, 359, 1);
        jSpinner4 = new javax.swing.JSpinner(sm3);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vert = new javax.swing.JScrollBar();
        horiz = new javax.swing.JScrollBar();
        xy = new javax.swing.JLabel();
        SpinnerModel sm5 = new SpinnerNumberModel(30, -10000000,10000000, 1);
        xscale = new javax.swing.JSpinner(sm5);
        SpinnerModel sm6 = new SpinnerNumberModel(1, 1,300, 1);
        jSpinner6 = new javax.swing.JSpinner(sm6);
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        carrierx = new javax.swing.JLabel();
        FM = new javax.swing.JRadioButton();
        AM = new javax.swing.JRadioButton();
        PM = new javax.swing.JRadioButton();
        modulating = new javax.swing.JRadioButton();
        carrier = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JSpinner.NumberEditor editor4 = new JSpinner.NumberEditor(jSpinner1, "#");
        jSpinner2.setEditor(editor4);
        jSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner1, ""));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        signalPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                signalPanel1MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout signalPanel1Layout = new javax.swing.GroupLayout(signalPanel1);
        signalPanel1.setLayout(signalPanel1Layout);
        signalPanel1Layout.setHorizontalGroup(
            signalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        signalPanel1Layout.setVerticalGroup(
            signalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JSpinner.NumberEditor editor2 = new JSpinner.NumberEditor(jSpinner2, "#");
        jSpinner2.setEditor(editor2);
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(jSpinner3, "#");
        jSpinner3.setEditor(editor);
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Signal");

        jLabel2.setText("Scale :");

        jLabel3.setText("Amplitude (V) :");

        jLabel4.setText("Frequency (Hz) :");

        jLabel5.setText("Phase (Degrees) :");

        vert.setMaximum(1000);
        vert.setValue(500);
        vert.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                vertAdjustmentValueChanged(evt);
            }
        });

        horiz.setMaximum(1000);
        horiz.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        horiz.setValue(500);
        horiz.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                horizAdjustmentValueChanged(evt);
            }
        });

        xy.setText("X:  Y:");

        xscale.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                xscaleStateChanged(evt);
            }
        });

        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6StateChanged(evt);
            }
        });

        jLabel7.setText("XScale");

        jLabel8.setText("YScale");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modulating Signal :");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Carrier Signal :");

        carrierx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carrierx.setText("Signal");

        buttonGroup1.add(FM);
        FM.setText("FM");
        FM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMActionPerformed(evt);
            }
        });

        buttonGroup1.add(AM);
        AM.setText("AM");
        AM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMActionPerformed(evt);
            }
        });

        buttonGroup1.add(PM);
        PM.setText("PM");
        PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMActionPerformed(evt);
            }
        });

        buttonGroup1.add(modulating);
        modulating.setText("Modulating");
        modulating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulatingActionPerformed(evt);
            }
        });

        buttonGroup1.add(carrier);
        carrier.setText("Carrier");
        carrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrierActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(35, 17, 17));
        jLabel6.setForeground(new java.awt.Color(124, 124, 124));
        jLabel6.setText("| Roger Cores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(signalPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(vert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(carrierx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(xscale, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(carrier)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modulating)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PM)))
                                .addGap(0, 21, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xy, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xy)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(carrierx)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FM)
                            .addComponent(AM)
                            .addComponent(PM)
                            .addComponent(modulating)
                            .addComponent(carrier))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(vert, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(signalPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int temp = Integer.parseInt(this.jSpinner1.getValue().toString());
        if(temp>0){
        this.signalPanel1.Scale = temp;
        }
        this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        this.signalPanel1.s.setAmp(Integer.parseInt(jSpinner2.getValue().toString()));
        this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
        this.jLabel1.setText(this.signalPanel1.s.toString());
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        this.signalPanel1.s.setFreq(Integer.parseInt(this.jSpinner3.getValue().toString()));
        System.out.println(Integer.parseInt(jSpinner3.getValue().toString()));
        System.out.println((((double)((int)(signalPanel1.s.Frequency/0.001)))/1000));
        this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
        this.jLabel1.setText(this.signalPanel1.s.toString());
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        double temp = Integer.parseInt(jSpinner4.getValue().toString());
        temp = (temp*3.14)/180;
        
        this.signalPanel1.s.setPhase(temp);
        this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
        this.jLabel1.setText(this.signalPanel1.s.toString());
    }//GEN-LAST:event_jSpinner4StateChanged

    private void vertAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_vertAdjustmentValueChanged
        int temp = this.vert.getValue();
        if(temp > 500){this.signalPanel1.yx = (500-temp)*5; }else if(temp < 500){this.signalPanel1.yx = -(temp-500)*5; }else{this.signalPanel1.yx=0;}
        System.out.println(temp+" "+this.signalPanel1.xx);
        this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.revalidate();
    }//GEN-LAST:event_vertAdjustmentValueChanged

    private void horizAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_horizAdjustmentValueChanged
        int temp = this.horiz.getValue();
        if(temp > 500){this.signalPanel1.xx = (500-temp)*40;
        //this.signalPanel1.xsx = 0-(temp-500)*(this.signalPanel1.xscale)*(40);
        }
        else if(temp < 500){
            this.signalPanel1.xx = -(temp-500)*(40); 
            //this.signalPanel1.xsx = 0-(temp-500.0)*(this.signalPanel1.xscale)*(40);
        }
        else{this.signalPanel1.xx=0;
        //this.signalPanel1.xsx = 0;
        }
        System.out.println(temp+" "+this.signalPanel1.xx);
        this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.revalidate();
        System.out.println(this.signalPanel1.xx);
    }//GEN-LAST:event_horizAdjustmentValueChanged

    private void signalPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signalPanel1MouseMoved
        int temp = evt.getX();
        int temp2 = evt.getY();
        //if(this.horiz.getValue()<500){
            //System.out.println((temp+this.signalPanel1.xx)*this.signalPanel1.xscale);
            //xy.setText("X: "+String.format("%.2f",(float)((temp-this.signalPanel1.xx)*(1/this.signalPanel1.xscale)))+" Y:"+((this.signalPanel1.getHeight()/2)-temp2));
            
            //System.out.println((temp-this.signalPanel1.yx)*this.signalPanel1.yscale);
        //}
    }//GEN-LAST:event_signalPanel1MouseMoved

    private void xscaleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_xscaleStateChanged
        this.signalPanel1.xscale = (1/Double.parseDouble(this.xscale.getValue().toString()));
        this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.revalidate();
    }//GEN-LAST:event_xscaleStateChanged

    private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
        this.signalPanel1.yscale = (1/Double.parseDouble(this.jSpinner6.getValue().toString()));
        this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.revalidate();
    }//GEN-LAST:event_jSpinner6StateChanged

    private void AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMActionPerformed
        this.signalPanel1.select = 2;this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
    }//GEN-LAST:event_AMActionPerformed

    private void FMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMActionPerformed
        this.signalPanel1.select = 3;this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
    }//GEN-LAST:event_FMActionPerformed

    private void PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMActionPerformed
        this.signalPanel1.select = 4;this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
    }//GEN-LAST:event_PMActionPerformed

    private void carrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrierActionPerformed
        this.signalPanel1.select = 0;this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
    }//GEN-LAST:event_carrierActionPerformed

    private void modulatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulatingActionPerformed
        this.signalPanel1.select = 1;this.repaint();
        this.revalidate();
        this.signalPanel1.repaint();
        this.signalPanel1.revalidate();
    }//GEN-LAST:event_modulatingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        

            
                new test("Modulation Emulation | Roger Cores").setVisible(true);
            
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AM;
    private javax.swing.JRadioButton FM;
    private javax.swing.JRadioButton PM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton carrier;
    private javax.swing.JLabel carrierx;
    private javax.swing.JScrollBar horiz;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JRadioButton modulating;
    private signals.SignalPanel signalPanel1;
    private javax.swing.JScrollBar vert;
    private javax.swing.JSpinner xscale;
    private javax.swing.JLabel xy;
    // End of variables declaration//GEN-END:variables
}