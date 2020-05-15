// Copyright (c) Ac industries All rights reserved  
//
// Created by: Andrew Coxall
// Created on: May 15, 2020
// Circumference of circle

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;  



public class CircumferenceOfCircle {



    public static void main(String[] args) throws IOException { 

        final double TAU = 6.28;

        String radius1;
        double circumferemce;
        double radius;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
        

        System.out.print("Enter the radius (mm): ");

        

        try {

            radius1 = br.readLine();
            
            radius = Double.parseDouble(radius1);

            circumferemce = radius*TAU;
            
            System.out.println("The circumferemce is: " + circumferemce + " mm");

        } catch(NumberFormatException nfe) {

            System.err.println("Invalid input!");

        }

        

        System.out.println();

        System.out.println("Done.");

    }



}
