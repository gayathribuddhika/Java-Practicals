/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author acer
 */
public class Box {

   int length,height,width;
   int volume= length* height* width;
   
    void printvolume(){
       System.out.println("volume is ="+volume);
   }
     void setvariables(int l,int h,int w){
       l=2;
       h=3;
       w=4;
       
   }
   int getvolume(){
   return volume;
    
}
}
}