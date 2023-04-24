///inner class
class A
{
int age;
public void show()
{
System.out.println("A class fn");
}
static class B //inner
{
public void config()
{
System.out.println("B class fn");
}}}
class C
{
publc static void main(String[] args)
{
A obj=new A(); obj.show();
A.B obj1=new A.B();
obj.config();
}}