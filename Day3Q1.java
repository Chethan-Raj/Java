package com.company;
import java.util.Scanner;
public class Day3Q1
{
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        float s1,s2,s3,s4,s5;
        float percentage;
        System.out.println("enter the marks in each subject");
        s1 = c.nextInt();
        s2 = c.nextInt();
        s3 = c.nextInt();
        s4 = c.nextInt();
        s5 = c.nextInt();
        percentage = (s1+s2+s3+s4+s5)/5;
        System.out.println(percentage);
        if (percentage<100 && percentage>=80){
            System.out.println("The grade is A");
        }
        else if (percentage<80 && percentage>= 65){
        System.out.println("The grade is B");}
        else if (percentage<65 && percentage>=50){
        System.out.println("The grade is C");}
        else if (percentage<50 && percentage>=40)
        {System.out.println("The grade is D");}
        else
            System.out.println("The grade is F");
    }
}
