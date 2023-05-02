package exceptionExamples;

public class ExcepNestedTryCatchFinally01 {
	
	public static void main(String args[])
    {
        try
        {
            System.out.print("A");
            throw new Exception();
        }
        catch (Exception e)
        {
            try
            {
                try 
                {
                    throw new Exception();
                }
                catch (Exception ex) 
                {
                    System.out.print("B");
                }
                throw new Exception();
            }
            catch (Exception exc)
            {
                System.out.print("C");
            }
            finally
            {
                System.out.print("D");
            }
        }
        finally
        {
            System.out.print("E");
        }
        System.out.print("F");
		
//		try 
//        {   
//            System.out.print("A");
//            throw 99; 
//        } 
//        catch (int ex) 
//        {
//            System.out.print("B");
//        } 
    }

}
