package com.company;
import java.util.Scanner;
public class Day3Q2
{
    public static void main(String[] args)
    {
        String name,age;
//        Int num =5,4,3,2;
        int salary;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter Your name:");
        name = c.nextLine();
        System.out.println("Enter your age:");
        age=c.nextLine();
        System.out.println("enter your salary in Lakhs:");
        salary=c.nextInt();
        switch(salary) {
            case 2:
                {
                System.out.println(name);
                System.out.println(age);
                System.out.println(200000.00);
                System.out.println("Tax amount is");
                System.out.println(200000*0.05);
                break;
            }
            case 3:{
                System.out.println(name);
                System.out.println(age);
                System.out.println(300000.00);
                System.out.println("Tax amount is");
                System.out.println(300000*0.05);
                break;
            }
            case 4:{
                System.out.println(name);
                System.out.println(age);
                System.out.println(400000.00);
                System.out.println("Tax amount is");
                System.out.println(400000*0.05);
                break;
            }
            case 5:{
                System.out.println(name);
                System.out.println(age);
                System.out.println(500000.00);
                System.out.println("Tax amount is");
                System.out.println(500000*0.05);
                break;
            }
            default:{
                System.out.println("Enter the valid Annual Salary");
                break;}
        }
        }




    }


