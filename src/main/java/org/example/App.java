package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final double convFact = 0.09290304;

        Scanner sc = new Scanner(System.in);
        double length, width, areaF, areaM;

        System.out.print("What is the length of the room in feet? ");
        length = sc.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        width = sc.nextDouble();

        areaF = length * width;
        areaM = areaF * convFact;

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is: \n" +
                areaF + " square feet");
        System.out.println(String.format("%,.2f square meters", areaM));

    }
}
