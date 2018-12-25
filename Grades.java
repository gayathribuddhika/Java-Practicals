/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author acer
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int marks=32;
        if(marks>75){
            System.out.println("Grade A");
        }else if(marks>60){
            System.out.println("Grade B");
        }else if(marks >50){
            System.out.println("Grade C");
        }else if(marks>40){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }
    
}
