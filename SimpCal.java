/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpcal;
import java.util.Scanner;

/**
 *
 * @author raynz_000
 */
public class SimpCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to SimpCal");
        
        System.out.println("Simply calculate any two digit numbers");
              
        System.out.println("Enter first number(s): ");
        int input1 = scan.nextInt();
        
        
        System.out.println("Enter second number(s): ");
        int input2 = scan.nextInt();
       
        
        System.out.println("Select function by number to apply: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter function number below; like 1(for addition... 2 for ...etc)");
        
        int funcNum = scan.nextInt();
        try{
        if(funcNum == 1){
            System.out.println("Addition product= " + (input1 + input2));
        }else if(funcNum == 2){System.out.println("Subtraction product= " + (input1 - input2));
        }else if(funcNum ==3){System.out.println("Multiplication product= " + (input1 * input2));
        }else if(funcNum ==4 ){System.out.println("Divition product= " + (input1 / input2));}
        else{System.out.print("Error");}
        }catch(Exception e){System.out.println("Error");}
       }
        
        
        
    }
