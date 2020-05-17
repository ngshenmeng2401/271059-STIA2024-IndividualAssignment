package datastructureassignment;

public class User {

    long accNo,invNo;
    String date,name,Address;
    int meterNo,pMeter,cMeter,totalusage;
    double tunggakan,currentCharge,totalcurrentCharge;


    public User(String date, long accNo, long invNo, String nameConsumer, String address, int meterNo, int currentMeter, int prevoiusMeter, double tunggakan,int totalusage, double currentCharge, double totalcurrentCharge) {
        this.accNo = accNo;
        this.invNo = invNo;
        this.date = date;
        this.name = nameConsumer;
        this.Address = address;
        this.meterNo = meterNo;
        this.pMeter = prevoiusMeter;
        this.cMeter = currentMeter;
        this.tunggakan = tunggakan;
        this.totalusage=totalusage;
        this.currentCharge = currentCharge;
        this.totalcurrentCharge = totalcurrentCharge;
    }
}
