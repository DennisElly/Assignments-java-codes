import java.util.scanner

interface Add_sub
{
void add(double x, double y);
void sub(double x, double y);
}

interface Mul_Div
{
}

interface calculate extends Add_sub, Mul_Div
{
default void print(double res)
}

class mycalculator implements calculate
{
}

class MainInteferface
{
print static void main(string[]args)
{
Mycalculator c=new MyCalculator()
c.Add(7.5,8.3),
c.sub(7.5,8.3)
c.Mul(7.5,8.3)
c.Div(7.5,8.3)
