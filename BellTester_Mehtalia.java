//SriRaam A. Mehtalia Period 5
//AList-Asg2: ArrayList Book Program

import java.util.ArrayList;

public class BellTester_Mehtalia
{
   public static void main( String[] args )
   {
      //Creates the array
      ArrayList<Bell> bells = new ArrayList<Bell>();
      
      //Creates 10 Bells randomly
      
      for(int i = 0; i < 10; i++ )
      {
         bells.add(new Bell( 217250 + (int)(Math.random()*50)));
      }
      
      //running all the methods, with line breaks in between
      
      System.out.println("");
      
      System.out.println("Original ids are: " );
      printAll(bells);
      
      System.out.println("");
      
      System.out.println("After swapping the ends: ");
      swapEnds(bells);
      printAll(bells);
      
      System.out.println("");
      
      System.out.println("After shifting right: ");
      shiftRight(bells);
      printAll(bells);
      
      System.out.println("");
      
      System.out.println("Second largest value: " + secondLargest(bells));
      
      System.out.println("");
      
      System.out.println("Are there duplicates? ");
      printAll(bells);
      System.out.println(areDuplicates(bells));
      
      
      System.out.println("");
      
      System.out.println("After replacing the even ids: ");
      replaceEvens(bells);
      printAll(bells);
      
      System.out.println("");
      
      System.out.println("After removing the middle value(s): ");
      removeMiddle(bells);
      printAll(bells);
      
      System.out.println("");
      
      System.out.println("After replacing the neighbors: ");
      replaceWithBig(bells);
      printAll(bells);
      
      System.out.println(""); 
      
      System.out.println("After moving even ids to the front: ");
      frontEvens(bells);
      printAll(bells);
                 
   }
   
   //switches the first and last values of the array
   
   public static void swapEnds( ArrayList<Bell> bel )
   {
      Bell hold = bel.get( bel.size() - 1);
      bel.set( bel.size() - 1, bel.get(0) );
      bel.set( 0, hold );
   }
   
   //shifts every element one place to the right
   
   public static void shiftRight( ArrayList<Bell> bel )
   {
      Bell end = bel.get(bel.size()-1);
      for( int i = bel.size()-1; i > 0; i-- )
      {
         bel.set(i, bel.get(i-1));
      }
      bel.set(0, end);
   }   
   
   //replaces all even IDs with 216222 
   
   public static void replaceEvens( ArrayList<Bell> bel)
   {
      for( int i = 0; i < bel.size(); i++)
      {
         if(bel.get(i).id() % 2 == 0)
         {
            bel.set(i, new Bell(216222));
         }
      }
   }
   //replaces each element with the largest neighbor
   public static void replaceWithBig( ArrayList<Bell> bel )
   {
      for( int i = 1; i < bel.size() - 1; i++ )
      {
         if( i == 1 ) 
         {
            if( bel.get(i).id() < bel.get(i + 1).id() )
            {
               bel.set(i, new Bell(bel.get(i + 1).id()));
            }
         }
         else if( i == bel.size() - 2 )
         {
            if( bel.get(i).id() < bel.get(i - 1).id() )
            {
               bel.set(i, new Bell(bel.get(i - 1).id()));
            }
         }
         else
         {
            int left = bel.get(i-1).id();
            int middle = bel.get(i).id();
            int right = bel.get(i+1).id();
            if( middle < left && left > right )
            {
               bel.set(i, new Bell(left));
            }
            else if( middle < right && right > left )
            {
               bel.set(i, new Bell(right));
            }
         }
              
      }
   }  
   
   //Removes middle 2 values if array has even length, or removes middle value
   //if array has odd number length
   
   public static void removeMiddle( ArrayList<Bell> bel )
   {
      if(bel.size() % 2 == 0)
      {  
         bel.subList(bel.size()/2-1, bel.size()/2+1).clear();      
      }
      else
      {
         bel.remove(Math.round(bel.size() /2));
      }         
   }
   
   //moves all the even numbers to the front of the array
   
   public static void frontEvens( ArrayList<Bell> bel )
   {
      ArrayList<Bell> evens = new ArrayList<Bell>();
      ArrayList<Bell> odds = new ArrayList<Bell>();
      
      for( int i = 0; i < bel.size(); i++ )
      {
         if( bel.get(i).id() % 2 == 0 )
         {
            evens.add( bel.get(i));
         }
         else if( bel.get(i).id() % 2 != 0 )
         {
            odds.add( bel.get(i));
         }
      }
      
      bel.clear();
      bel.addAll(evens);
      bel.addAll(odds);
   }
   
   //returns the second largest id in the list
   
   public static int secondLargest( ArrayList<Bell> bel )
   {
      for( int i = 0; i < bel.size(); i++ )
      {
         int counter = 0;
         int start = bel.get(i).id();
         for( int j = 1; j < bel.size(); j++ )
         {
            if( start >= bel.get(j).id() )
            {
               counter++;
            }
         }
         if( counter == 8 )
         {
            return bel.get(i).id();
         }
      }
      return 0;
   }
   
   //Test if students have the same id number
   
   public static boolean areDuplicates( ArrayList<Bell> bel )
   {
      for( int i = 0; i < bel.size(); i++ )
      {
         int x = bel.get(i).id();
         for( int j = 0; j < bel.size(); j++ )
         {
            if( x == bel.get(j).id() )
            {
               return true;
            }
         }
      }
      return false;
   }
   
   //Method for printing current list
   
   public static void printAll( ArrayList<Bell> bel )
   {
      for( int i = 0; i < bel.size(); i++)
      {
         System.out.println(bel.get(i));
      }
   }   
    
    
}         

//Class where the object comes from

class Bell 
{
   private int studentId;

   public Bell( int id )
   {
      studentId = id;
   } 

   public int id()
   {
      return studentId;
   }

   public int compareTo( Bell otherBell )
   {
      return this.id() - otherBell.id();
   }
   public String toString() 
   {
      return "" + studentId;
   }
}