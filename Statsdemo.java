class Stats<T extends Number>
{
   T[] nums;
   Stats(T[] o)
   {
           nums=o;
   }
   double average()
      
            double sum=0.0;
            for(int i=0;i<nums.length;i++)
                    sum+=nums[i].doubleValues();
             return sum/nums.length;
   }
}
class BoundDemo
{
          public static void main(Strings[] args)
          {
                 Integer inums[]={1,2,3,4,5};
                 Stats<Integer> iob= new Stats< Integer>(inums)
                 System.out.println("Average of Integer: "+iob.average());


                 Double dnums[]={1.1,2.2,3.3,4.4,5.5};
                 Stats<Double>.