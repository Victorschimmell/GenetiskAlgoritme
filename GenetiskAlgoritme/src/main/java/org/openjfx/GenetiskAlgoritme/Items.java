/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.GenetiskAlgoritme;

/**
 *
 * @author edwardrostomian
 */
public class Items {
    
    private float price;
    
     private float weight;
     
     private int x;
    
      private int type;
     
      private String name;
      
      Items(int t){ //constructor
      
      type = t;
      
      
      switch(type){
      
            case 1: 
                name = "kort"; 
                weight = 90; 
                price = 150;
                     break;
            case 2:  
                name = "kompas";
                weight = 130; 
                price = 35;
                     break;
            case 3:  
                name = "vand";
                weight = 1530; 
                price = 200;
                     break;
            case 4:  
                name = "sandwich";
                weight = 500; 
                price = 160;
                     break;
            case 5:  
                name = "sukker";
                weight = 150; 
                price = 60;
                     break;
            case 6:  
                name = "dåsemad";
                weight = 680; 
                price = 45;
                     break;
            case 7:  
                name = "banan";
                weight = 270; 
                price = 60;
                     break;
            case 8:  
                name = "æble";
                weight = 390; 
                price = 40;
                     break;
            case 9:  
                name = "ost";
                weight = 230; 
                price = 30;
                     break;
            case 10: 
                name = "øl";
                weight = 520; 
                price = 10;
                     break;
            case 11: 
                name = "solcreme";
                weight = 110; 
                price = 70;
                     break;
                     
            case 12: 
                name = "kamera"; 
                weight = 320; 
                price = 30;
                     break;
            case 13:  
                name = "T-shirt";
                weight = 240; 
                price = 15;
                     break;
            case 14:  
                name = "bukser";
                weight = 480; 
                price = 10;
                     break;
            case 15:  
                name = "paraply";
                weight = 730; 
                price = 40;
                     break;
            case 16:  
                name = "vandtætte bukser";
                weight = 420; 
                price = 70;
                     break;
            case 17:  
                name = "vandtæt overtøj";
                weight = 430; 
                price = 75;
                     break;
            case 18:  
                name = "pung";
                weight = 220; 
                price = 80;
                     break;
            case 19:  
                name = "solbriller";
                weight = 70; 
                price = 20;
                     break;
            case 20:  
                name = "håndkælde";
                weight = 180; 
                price = 12;
                     break;
            case 21: 
                name = "sokker";
                weight = 40; 
                price = 50;
                     break;
            case 22: 
                name = "bog";
                weight = 300; 
                price = 10;
                     break;
                     
             case 23: 
                name = "notesbog";
                weight = 900; 
                price = 1;
                     break;      
                     
               case 24: 
                name = "telt";
                weight = 2000; 
                price = 150;
                     break;
            
            default: 
                name = "any Item";
                weight = x; 
                price = x;
                     break;
  
      }
          
      }
      
}
