package Shreya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many subjects you have: ");
        int n = s.nextInt();
        double sum=0;
        int totalMarks=0;
        for( int i=1;i<=n;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Obtained marks of subject " + i +": ");
            double a = scanner.nextDouble();
            sum += a;
            Scanner scr = new Scanner(System.in);
            System.out.print(" Out of ");
            int b = scr.nextInt();
            totalMarks += b;
        }
        System.out.println("Your total obtained marks: " + sum + " out of " + totalMarks);

        double percentageMarks = ((sum)/totalMarks)*100;
        System.out.println("Your percentage = " + percentageMarks + " %");

    }
}
