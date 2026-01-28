package exceptions;

public class ExceptionMain {

    public static void main(String[] args){

        TestException testException = new TestException();

        testException.division(3, 0);
    }

}
