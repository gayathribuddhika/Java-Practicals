/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author acer
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=15;
        int b=27;
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    
}
