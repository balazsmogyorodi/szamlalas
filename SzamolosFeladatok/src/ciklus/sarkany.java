
package ciklus;

public class sarkany {
    
     public static void main(String[] args) {
      
         
         int hetFeju = 7, tizenegyFeju = 11;
         
         for (int x = 0; x <= 20; x ++) {
             int osszeg = 0;
             for (int y = 0; y <= 13; y ++ ) {
                 osszeg = hetFeju * x + tizenegyFeju * y;
                 if (osszeg == 145) {
                     System.out.println("7 fejü:" + x);
                     System.out.println("11 fejü:" + y);
                     System.out.printf("%d*%d+%d*%d=%d\n", hetFeju, x, tizenegyFeju, y, osszeg);   
                        System.out.println("---------------------------------------------");
                     
                 }

             }
             
         }
            
          
     
     
     
     
     
     
     
     }
    
}
