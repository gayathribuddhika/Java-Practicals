/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author acer
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        System.out.println("number of rows 5");
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j); 
            }
            System.out.println(" ");
        }
    }
    
}
