package com.Library_Management_System;

import java.util.Scanner;

class Library{
    static  String str, b, date;
    static int a, c;
    void addBook(){
        System.out.println("Enter Book Name, Price and Book_No :");
        Scanner obj2 = new Scanner(System.in);
        str = obj2.nextLine();
        int price = obj2.nextInt();
        int book_no = obj2.nextInt();
        System.out.println("Your detail is "+str+" | "+price+" | "+book_no);
    }

    void issueBook(){
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Book Name :");
        str = obj3.nextLine();
        System.out.println("Book_Id :");
        a = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Issue Date :");
        b = obj3.nextLine();
        System.out.println("Total number of Book Issued");
        c = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Return Book Date :");
        date = obj3.nextLine();
    }

    int getid(){
        return a;
    }

    void returnBook() {
        System.out.println("Enter Student Name and Book Id :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int bookId = sc.nextInt();

        if (a == bookId) {
            System.out.println("Total Details");
            System.out.println("Book Name : " + Library.str);
            System.out.println("Book Id : " +Library.a);
            System.out.println("Issue Date : " + Library.b);
            System.out.println("Total Number of Book Issued : " + Library.c);
            System.out.println("Book Return Date : " + Library.date);
        } else {
            System.out.println("Please enter correct Id :");
        }
    }
    void issueDetail(){
        System.out.println("Book Name : " + Library.str);
        System.out.println("Book Id : " +Library.a);
        System.out.println("Issue Date : " + Library.b);
        System.out.println("Total Number of Book Issued : " + Library.c);
        System.out.println("Book Return Date : " + Library.date);
    }

    void exit(){
        System.exit(0);
    }
}

