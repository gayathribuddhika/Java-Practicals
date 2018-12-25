/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aray3;

/**
 *
 * @author acer
 */
import java.util.*;
public class Aray3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int[]x=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("input number"+(i+1)+":");
            x[i]=input.nextInt();
        }
        int total=0;
        for(int i=0;i<10;i++){
            total+=x[i];
        }
        System.out.println("[");
        for(int i=0;i<10;i++){
            System.out.println(x[i]+",");
        }
        System.out.println("\b]");
        System.out.println("Total:"+total);
    }
    
}
