import java.util.Scanner;

class demo
{
public static void check(int age)
{
if(age<18)
throw new ArithmeticException("person is not eligible to vote");
else
{
System.out.println("you can vote");
}
}
}