/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @author acer
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0;
        int y=1;
        System.out.println(x);
        System.out.println(y);
        for(int i=1;i<=8;i++){
            int sum=x+y;
            x=y;
            y=sum;
            System.out.println(sum);
        }
    }
    
}
