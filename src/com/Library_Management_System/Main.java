package com.Library_Management_System;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char option;
        do {
            System.out.println("********** Library Managent System **********");
            System.out.println("Press 1 to add Book");
            System.out.println("Press 2 to issue Book");
            System.out.println("Press 3 to return Book");
            System.out.println("Press 4 to print complete issue detail");
            System.out.println("Press 5 to exit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any Number : ");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    Library add = new Library();
                    add.addBook();
                    break;

                case 2:
                    Library issue = new Library();
                    issue.issueBook();
                    break;

                case 3:
                    Library ret = new Library();
                    ret.returnBook();
                    break;

                case 4:
                    Library completeDetail = new Library();
                    completeDetail.issueDetail();
                    break;

                case 5:
                    Library exitMenu = new Library();
                    exitMenu.exit();
                    break;

                default:
                    System.out.println("Invalid Number");
            }

            System.out.println("Press (y) to continue (n) to exit");
             option = sc.next().charAt(0);

        }while(option == 'y');
    }
}

