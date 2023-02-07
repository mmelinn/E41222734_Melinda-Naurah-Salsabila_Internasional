/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamberapa;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Jamberapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        System.out.print("What's hour? it's ");
        int time = input.nextInt();
    
        if (time> 00 && time < 12)  {
            System.out.println("Good Morning!");
        } else if (time>=12 && time<18) {
            System.out.println("Good Afternoon!");
        } else if (time>=18 && time<=00) {
            System.out.println("Good Evening!");
        
        } else {
            System.out.println("I don't know what's your time to go sleep, but I would say, GOOD NIGHT!");
        }    }
    
}
