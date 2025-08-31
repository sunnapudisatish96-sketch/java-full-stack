
public class ExceptionHandling {
	//public static void main(String[] args) throws Exception {
		//try {
			//int i = 10;
			//int j = 0;
			//int k=i/j;
		//} catch (ArithmeticException ae) {
			//System.out.println("Divisible by zero");
		//} finally {
			//System.out.println("After that the given successfully");
		//}
	//}
		//try
		//{
            //int a, b;
            //b = 0;
            //a = 5;
            //int c = a / b; 
          //  System.out.println("A");
        //} catch (ArithmeticException ae) {
      //      System.out.println( ae);
    //    }
  //  }
//}

			static int test()
			{
				try
				{
					int num=Integer.parseInt("abc");
				}
				catch(NumberFormatException e)
				{
					return 20;
				}
				finally
				{
					return 40;
				}
			}
				public static void main (String[] args)
				{
					System.out.println(1);
					System.out.println(test());
					System.out.println(2);
				}
			}
class S
{
    public static void main (String[] args)
    {
        try
        {
            int i;
            return;
        }
        catch(Exception e)
        {
            System.out.println("in catch block");
        }
        finally
        {
            System.out.println("infinally block");
        }
    }
}