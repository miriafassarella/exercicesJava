public class ConversaoLongParaInt {
   public static void main(String[] args) {
      long x = 10;

      //int y = x; não compila
      int y = (int) x; //casting

      System.out.println(x);
      System.out.println(y);

      long a = 93000000035L;
      int b = (int) a;
      
      System.out.println(a);
      System.out.println(b);
   }


}