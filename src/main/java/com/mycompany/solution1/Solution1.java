/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solution1;

import java.util.Scanner;

/**
 *
 * @author Capaciti
 */
public class Solution1 {

  

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
 System.out.println(a);
       




        // Read and print integers until there is no more input
        while (scanner.hasNext()) {
            // Read an integer from stdin
            int number = scanner.nextInt();

            // Print the integer to stdout
            System.out.println(number);
        }

        // Close the scanner
        scanner.close();
    }


    }

    

