package exceptions;

public class Exception {

        int x;
        int y;
        int result;


        public double division(int x, int y){
            this.x = x;
            this.y = y;


                try{
                    this.result =  this.x / this.y;
                }catch(ArithmeticException e){
                    System.out.println(e.getMessage());
            }
                return result;

        }
    }


