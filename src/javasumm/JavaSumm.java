/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasumm;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JavaSumm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //byte a= 5;
        //byte b = 3;
        //byte c = 2;
        
        //System.out.println(a+b+c);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write lenght");
        int number = scanner.nextInt();
        int sum = (number/100);
        int sum1 = (number%100/10);
        int sum2 = (number%100%10);
        System.out.println(sum+sum1+sum2);
        
        
        
        
        
        
    }
    
}
