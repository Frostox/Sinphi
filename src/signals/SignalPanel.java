/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package signals;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roger
 */
public class SignalPanel extends javax.swing.JPanel {
    double xscale = 1/30.0,yscale = 1;
    double tempx = 0,temp2x = 0;
    double xx = 0,xsx = 0, yx = 0,yr1x = 0;
    double yrx = 0;
    Signal s,s2;
    double Scale = 60;
    Signal carrier = new Signal(1000,100000,0);
    int select = 1;
    /**
     * Creates new form SignalPanel
     */
    public SignalPanel() {
        
        s = new Signal(500,1000,0);
        s2 = new Signal(500,1000,0);
        initComponents();
        
        
        
    }
    public void setSignal(Signal sig){
        s = sig;
    }
        public void paintSignal(Graphics g) {
        double temp = tempx,temp2 = temp2x;
        double x = xx,xxx = x;
        double xs = xsx, y = (this.getHeight()/2)+yx,yr1 = yr1x;
        //double yr = yrx,yra = yrx,yr1a = yr1x;
        
        System.out.println(s.Frequency/0.001);
        
        //if(s.Frequency/0.001==0){System.out.println("yes");g.drawLine(0, (int)(y-this.s.Amplitude*(Scale)*10), this.getWidth(), (int)(y-this.s.Amplitude*(Scale)*10));}else{
        //System.out.println(Scale+" "+(int)(s.Frequency/0.001));
        do{
            //yr =Math.pow(-((2*3.14)*(xs)*((s.Frequency)/((Scale*0.1))))+s.Phase , ((((s.Amplitude)*(Scale*0.1))*Math.cos(((2*3.14)*(xs)*((s.Frequency)/((Scale*0.1))))+s.Phase)*10))     );
            //yr = (-(((s.Amplitude)*(Scale*0.1))*Math.sin(((2*3.14)*(xs)*((s.Frequency)/((Scale*0.1))))+s.Phase)*10));
            //yra = -Math.pow(xs, 2)*(Scale);
            //this.s.y = (int)(((500*(Scale)*0.001  +  (-(((s.Amplitude)*(Scale))*Math.sin(((2*3.14)*(xs)*((s.Frequency)/((Scale))))+s.Phase))))   *   (-Math.sin(((2*3.14)*(xs)*((100000*0.001)/((Scale))))+s.Phase)))*yscale );
            //this.s.y = (int)(((s.Amplitude   +  (-(((s.Amplitude)*(Scale))*Math.sin(((2*3.14)*(-xs)*((s.Frequency)/((Scale))))+s.Phase))))   *   (-Math.sin(((2*3.14)*(-xs)*((100000*0.001)/((Scale))))+s.Phase)))*yscale) ;
            
            //this.s.y = (int)(s.amplitudeModulate(carrier, xs,Scale)*yscale);
            //this.s.y2 = (int)(s.amplitudeModulate(carrier, -xs,Scale)*yscale);
            //this.s.y = (int)(s.getInstAmp(xs, Scale) *yscale);
            //this.s.y2 = (int)(s.getInstAmp(-xs, Scale)*yscale);
            //this.s.y  = (int)(s.phaseModulate(carrier, xs, Scale)*yscale);
            //this.s.y2 = (int)(s.phaseModulate(carrier, -xs, Scale)*yscale);
            //this.s.y = (int)-((s.Amplitude*(Scale)*(Math.sin(2*3.14*(carrier.Frequency/Scale)*xs+200*(Math.sin(2*3.14*(s.Frequency/Scale)*xs)))))*yscale);
            //yra = -(s.Amplitude*(Scale)*Math.sin(2*3.14*s.Frequency/(Scale)*xs)*yscale);
            if(select == 0){
                this.s.y = (int)(carrier.getInstAmp(xs, Scale) *yscale);
                this.s.y2 = (int)(carrier.getInstAmp(-xs, Scale)*yscale);
            }else if(select == 1){
                this.s.y = (int)(s.getInstAmp(xs, Scale) *yscale);
                this.s.y2 = (int)(s.getInstAmp(-xs, Scale)*yscale);
            }else if(select ==2){
                this.s.y = (int)(s.amplitudeModulate(carrier, xs,Scale)*yscale);
                this.s.y2 = (int)(s.amplitudeModulate(carrier, -xs,Scale)*yscale);
            }else if(select ==3){
                this.s.y = (int)(s.frequencyModulate(carrier, xs, Scale)*yscale);
                this.s.y2 = (int)(s.frequencyModulate(carrier, -xs, Scale)*yscale);
            }else{
                this.s.y  = (int)(s.phaseModulate(carrier, xs, Scale)*yscale);
                this.s.y2 = (int)(s.phaseModulate(carrier, -xs, Scale)*yscale);
            }
            //graph for sin x/x!!
            
            
            
            
            //System.out.println((-((s.Amplitude*(Scale)*0.25)*Math.sin(((xs)*((s.Frequency)/(Scale)*0.25))+s.Phase)*10)));
            g.setColor(Color.black);
            g.drawLine((int)x-1, (int)y+(int)this.s.yy, (int)x, (int)y+(int)this.s.y);
            //g.setColor(Color.blue);
            g.drawLine((int)xxx+1, (int)y+(int)this.s.yy2, (int)xxx, (int)y+(int)s.y2);
            //g.setColor(Color.black);
            this.s.yy = (int)this.s.y;
            this.s.yy2 = this.s.y2;
            xs += xscale;
            x+=1;
            xxx-=1;
            //System.out.println(x+" "+x/1000+" "+xs);
        }while(x<50000);//}
        
    }
    @Override
    public void paint(Graphics g){
        
            paintSignal(g);
            g.setColor(Color.red);
            for(int i=0;i<this.getWidth();i+=10){
            g.drawLine(i, (this.getHeight()/2)+(int)yx,i+5 , (this.getHeight()/2)+(int)yx);
            g.drawLine((int)xx, i, (int)xx, i+5);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
