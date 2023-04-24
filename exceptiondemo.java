import java.util.scanner;

class exceptiondemo
{
 public static void main(String args[])
{
  try
  {
    int x= 125/0;
    System.out.println(x);
 }
  catch(NullPointerException e)
 {
   System.out.println("Exception");
 }
  finally
 {
   System.out.println("done");
 }
}