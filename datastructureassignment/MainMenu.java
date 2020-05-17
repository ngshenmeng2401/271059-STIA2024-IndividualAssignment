package datastructureassignment;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        choice();
    }

    public static void choice(){
        Scanner input = new Scanner(System.in);

        AddData adddata = new AddData();
        Records records = new Records();
        int choice;

        //Display Main Menu
        System.out.println("Main Menu");
        System.out.println("1. Add Data");
        System.out.println("2. Display All Records");
        System.out.println("3. Exit");

        System.out.println("Your choice:");
        choice=input.nextInt();

        if (choice==1){
            adddata.choice();
        }if (choice==2){
            records.displayRecord();
        }if (choice==3){
            System.out.println("Thank You for Using Our System");
        }
    }
}
