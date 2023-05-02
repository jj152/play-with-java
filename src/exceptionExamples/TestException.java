package exceptionExamples;

public class TestException{
    public static void main(String[] args) 
    {
        try
        {
            // Creating an object of ArithmeticException
            ArithmeticException ae = new ArithmeticException();
            //Manually throwing ArithmeticException
            throw ae;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Rethrowing the caught exception below "); 
            //Rethrowing ArithmeticException 
            throw e;
        }
    }
}

