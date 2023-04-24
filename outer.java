class outer
{
static int x=10; //non static variable
int y=3;  //non static variable
private static int z=20;

static class inner
{
void disp()
{
System.out.println( "x is=" +x);
System.out.println(" y is=" +y);
System.out.println(" z is=" +z);
}}}
class A
{
public static void main(String[] args)
{
outer obj= new outer();
outer.inner obj1=obj.new inner();
obj1.disp();
}}