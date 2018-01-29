
public class Euclid {

    static int euc(int a, int b) { 
              
        while (b!=0) {
            if (a<b) {
                int csere=a;
                a=b;
                b=csere;
            }
               a-=b;
           }              
            return a;
        }
            
    
   public static void main(String[] args) {
       System.out.println(euc(180,40));
   }
}
