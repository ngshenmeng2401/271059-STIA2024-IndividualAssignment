package datastructureassignment;

public class CalculateData {

    int cMeter,pMeter;
    public static int totalusage;
    double tunggakan;
    public static double currentCharge,totalcurrentCharge;

    public CalculateData(int cMeter, int pMeter, double tunggakan) {
        this.cMeter = cMeter;
        this.pMeter = pMeter;
        this.tunggakan = tunggakan;
    }

    public void CalculateBill(){

        totalusage=cMeter+pMeter;

        if(totalusage>=1&&totalusage<=200){
            currentCharge=totalusage*0.218;
        }else if (totalusage>=201&&totalusage<=300){
            currentCharge=((totalusage-200)*0.334)+43.6;
        }else if (totalusage>=301&&totalusage<=600){
            currentCharge=((totalusage-300)*0.516)+77;
        }else if (totalusage>=601&&totalusage<=900){
            currentCharge=((totalusage-600)*0.546)+231.8;
        }else if (totalusage>=901){
            currentCharge=((totalusage-900)*0.571)+395.6;
        }else {
            System.out.println("ERROR");
        }
        totalcurrentCharge=tunggakan+currentCharge;

    }

    public void setcMeter(int cMeter) {
        this.cMeter = cMeter;
    }

    public void setpMeter(int pMeter) {
        this.pMeter = pMeter;
    }

    public static int getTotalusage() {
        return totalusage;
    }

    public static double getCurrentCharge() {
        return currentCharge;
    }

    public static double getTotalcurrentCharge() {
        return totalcurrentCharge;
    }
}
