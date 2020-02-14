
public class 원시자료형2차원Test4 {
   public static void main(String[] args) {

      int s = 7;
      for (int r = 0; r < 3; r++) {
         System.out.println(r);
      }
      System.out.println("/n//");
      for (int r = s; r > 0; r -= 3) {

         System.out.println(r);
      }

      System.out.println("/n//");
      for (int r = s; r > 0; r -= 3) {

         // System.out.println(r);
         for (int c = 0; c < 3; c++) {
            System.out.print(r + c);

         }
         System.out.println();

      }