package lt.dmitrij.rusiavimas;

import java.util.Arrays;

public class masyvoRusiavimas {
   public static void main (String[] args) {

       int[] masyvas = {1,100,-900,89,24,-6};
       System.out.println(Arrays.toString(masyvas));

       for (int i = 0; i < masyvas.length; i++ ) {

           for (int j = 0; j < masyvas.length; j++){
               if (masyvas[i] < masyvas[j]) {
                   int tarpinis = masyvas[i];
                   masyvas[i] = masyvas[j];
                   masyvas[j] = tarpinis;
               }


           }
       }






       System.out.println(Arrays.toString(masyvas));


   }
}
