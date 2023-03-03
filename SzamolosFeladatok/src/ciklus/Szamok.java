package ciklus;

import java.io.ObjectStreamConstants;

public class Szamok {

    public static void main(String[] args) {
        System.out.println("kji");
        
    int ismDb = 0, ismN1kDb = 0;
        System.err.print("ismétléssel (i/n)");
    
     //  boolean ismetel = false;
     boolean ismetel = true;
     
     
        for (int k = 2; k <= 4; k++) {
            for (int j = 2; j <= 4; j++) {
                for (int i = 2; i <= 4; i++) {

                    if (ismetel) {
                        System.out.printf("%d%d%d\n", k, j, i);
                        ismDb++;
                    } else if(k!=j && k!=i && j!=i ) {
                            System.out.printf("%d%d%d\n", k, j, i);
                            ismN1kDb++;
                    }

                }
            }
        }
        
        if(ismetel) {
        
            System.out.println("ismétléssel: " + ismDb);
        } else{
        System.out.println("ismétlés nélkül: " + ismN1kDb);
        }
        
        
        
    }

}
