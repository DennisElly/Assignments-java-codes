class Gen<T1, T2>
{
   T1 num1;
   T2 num2;
   Gen()
   {

   }
   Gen(T1 x, T2 y)
   {
      num1=x;
      num2=y;
   }
   T1 print()
   {
     return num1;
   }
}
class GenericClassDemo
{
     public static void main(String[] args)
     {
       Gen<Integer> obj1= new Gen<Integer>(20);
       System.out.println((obj1.print());
       
       Gen<String> obj2= new Gen<String>("Java");
       System.out.println(obj2.print());
       }
}