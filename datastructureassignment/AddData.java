package datastructureassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class AddData {

        static ArrayList<User> UserList = new ArrayList<User>();
        static Scanner input = new Scanner(System.in);
        public static int choice=0;
        static MainMenu mainmenu = new MainMenu();


        public static void choice(){

            System.out.println("1. Add Data");
            System.out.println("2. Back to Main Menu ");

            System.out.println("Enter your choice");
            choice=input.nextInt();

            if (choice==1){
                addData();
            }if (choice==2){
                mainmenu.choice();
            }
        }

        public static void addData(){

            long accNo,invNo;
            String date,nameConsumer,Address;
            int line =1,meterNo,prevoiusMeter,currentMeter;
            double tunggakan;

            try {
                System.out.println("Date Bill: ");
                date=input.next()+input.nextLine();
                System.out.println("Account No:");
                accNo=input.nextLong();
                System.out.println("Invoice No:");
                invNo=input.nextLong();
                System.out.println("Name:");
                nameConsumer=input.next()+input.nextLine();
                System.out.println("Address:");
                Address=input.next()+input.nextLine();
                System.out.println("Meter No:");
                meterNo=input.nextInt();
                System.out.println("Current Meter:");
                currentMeter=input.nextInt();
                System.out.println("Previous Meter:");
                prevoiusMeter=input.nextInt();
                System.out.println("Tunggakan:");
                tunggakan=input.nextDouble();

                CalculateData cData = new CalculateData(currentMeter,prevoiusMeter,tunggakan);
                cData.CalculateBill();
                cData.setcMeter(currentMeter);
                cData.setpMeter(prevoiusMeter);
                UserList.add(new User(date,accNo,invNo,nameConsumer,Address,meterNo,currentMeter,prevoiusMeter,tunggakan,cData.getTotalusage(),cData.getCurrentCharge(),cData.getTotalcurrentCharge()));
                System.out.printf("\nData Saved!!!\n");
                while (line<=100){
                    System.out.printf("%c",45);
                    line++;
                }

                System.out.println();
                System.out.println("Press 2 Back to Main Menu ");
                System.out.println("Enter your choice");
                choice=input.nextInt();

                if (choice==2){
                    mainmenu.choice();
                }
            }catch (Exception e){
                System.out.printf("\nError!!!\n");
            }
        }




}
