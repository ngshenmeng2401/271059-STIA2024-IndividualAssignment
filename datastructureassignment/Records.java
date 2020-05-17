package datastructureassignment;

import java.util.Scanner;

import static datastructureassignment.AddData.UserList;
import static datastructureassignment.AddData.mainmenu;
public class Records {


    public static void displayRecord() {

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.printf("\t\t\t\t***************Display Data***************\n");
        for (User List : UserList) {

            System.out.printf("Date\t\t:%s\n",List.date);
            System.out.printf("Account No\t:%d\n",List.accNo);
            System.out.printf("Invois No\t:%d\n",List.invNo);
            System.out.printf("Name\t:%s\n",List.name);
            System.out.printf("Address\t:%s\n\n",List.Address);
            System.out.printf("Meter no\t:%d\n",List.meterNo);
            System.out.printf("Previos Meter:%d\n",List.pMeter);
            System.out.printf("Current Meter:%d\n",List.cMeter);
            System.out.printf("------------------------\n");
            System.out.printf("Total usage\t:%d\n\n",List.totalusage);
            System.out.printf("Tunggakan\t:%.2f\n",List.tunggakan);
            System.out.printf("Current Charge\t:%.2f\n",List.currentCharge);
            System.out.println("------------------------");
            System.out.printf("Total Charge\t:%.2f\n",List.totalcurrentCharge);
        }

        System.out.println("Press 2 Back to Main Menu ");
        System.out.println("Enter your choice");
        choice=input.nextInt();

        if (choice==2){
            mainmenu.choice();
        }
    }
}
