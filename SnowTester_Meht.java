//SriRaam A. Mehtalia and Joshua Vincent Period 5
//AList-A3: Find2ndMin-PP

import java.util.ArrayList;

public class SnowTester_MehtVinc
{

  public static int find2ndMin( ArrayList<Integer> ints ) {
  
   ArrayList<Integer> bells = ints;
   int SecondMin = 10000;
   int min = 1000;
   
   int uu = 0;
   
   for(int i = 0; i < bells.size(); i++) {
       if(bells.get(i) <= min) {
           min = bells.get(i);
           uu = i;
        }
   }
   
   bells.remove(uu);
   
   for(int i = 0; i < bells.size()-1; i++) {
      if(bells.get(i) <= SecondMin) {
           SecondMin = bells.get(i);
        }
   }
   
   return SecondMin;
 }

      
  
  
  public static void main(String[] args)
  {
      ArrayList<Integer> stuff = new ArrayList<Integer>();
      stuff.add(-2);
      stuff.add(12);
      stuff.add(22);
      stuff.add(17);
      stuff.add(19);
      stuff.add(-10);
      stuff.add(-2);
      System.out.println("Test 1: 2nd smallest is: " + find2ndMin(stuff) );

      stuff = new ArrayList<Integer>();
      stuff.add(-2);
      stuff.add(12);
      stuff.add(22);
      stuff.add(17);
      stuff.add(19);
      stuff.add(-1);
      stuff.add(-2);
      System.out.println("Test 2: 2nd smallest is: " + find2ndMin(stuff) );

      stuff = new ArrayList<Integer>();
      stuff.add(-2);
      stuff.add(12);
      stuff.add(22);
      stuff.add(17);
      stuff.add(19);
      stuff.add(-1);
      stuff.add(999999);
      System.out.println("Test 3: 2nd smallest is: " + find2ndMin(stuff) );
   }


}