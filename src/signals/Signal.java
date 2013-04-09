/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package signals;

import javax.swing.JPanel;

/**
 *
 * @author Roger
 */
public class Signal {
    double Amplitude = 500*0.001,Frequency = 500*0.001,Phase = 0;
    JPanel pan;
    int x,y,xx,yy,x2,xx2,y2,yy2;
    
    public Signal(double Amp,double Fr,double Ph){
        Amplitude = Amp*(0.001);
        Frequency = Fr*(0.001);
        Phase = Ph;
    
    }
    public void setAmp(double Amp){
        Amplitude = Amp*(0.001);
    }
    public void setFreq(double Fr){
        Frequency = Fr*(0.001);
    }
    public void setPhase(double Ph){
        Phase = Ph;
    }
    public double getAmp(){
        return Amplitude/0.001;
    }
    public double getFreq(){
        return Frequency/0.001;
    }
    public double getPhase(){
        return Phase;
    }
    public void setPan(JPanel jp){
        pan = jp;
    }
    public int amplitudeModulate(Signal carrier,double param,double Scale){
        return (int)-(((carrier.Amplitude*(Scale)  +  ((((Amplitude)*(Scale))*Math.sin(((2*3.14)*(param)*((Frequency)/((Scale))))+Phase))))   *   (Math.sin(((2*3.14)*(param)*((carrier.Frequency)/((Scale))))+Phase))));
    }
    public int frequencyModulate(Signal carrier,double param,double Scale){
        return (int)-((Amplitude*(Scale)*(Math.cos(2*3.14*(carrier.Frequency/Scale)*param+200*(Math.sin(2*3.14*(Frequency/Scale)*param+Phase))))));
    }
    public int phaseModulate(Signal carrier,double param,double Scale){
        return (int)-((Amplitude*(Scale)*(Math.cos(2*3.14*(carrier.Frequency/Scale)*param+200*(Math.cos(2*3.14*(Frequency/Scale)*param+Phase))+Phase))));
    }
    public int getFx(double param,double Scale){
        return (int)-((Frequency/(Scale))*2*3.14*param);
    }
    public int getInstAmp(double param,double Scale){
        return (int)-(Amplitude*(Scale)*Math.sin(2*3.14*(this.Frequency/(Scale))*(param)+Phase));
        
    }
    @Override
    public String toString(){
        String str = (int)(Amplitude/0.001)+"Sin(2П"+(int)((Frequency/0.001)/1000)+"*(10^3)t+"+(int)Phase+")";
        return str;
    }
    
}
