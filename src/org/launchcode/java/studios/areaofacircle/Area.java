package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;
public class Area {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius;
        boolean val = true;
       do{
        System.out.println("Enter a radius:");
        radius = input.nextDouble();
        if(radius<0){
            System.out.println("Please enter the correct value for radius: ");
        } else {
            Double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
            val = false;
        }
       }while(val);
        }
    }

