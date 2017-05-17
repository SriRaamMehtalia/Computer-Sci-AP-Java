//Drew Ramacher and SriRaam A. Mehtalia
//Arrays-Asg3: Array Work (PP)

public class ArrayWork_RamachMehta
{
   //This method creates an array
   public static int[] createIncreasingArray(int size) {
       int[] a1 = new int[size];
       //Populates the array
       for(int i = 0; i < size; i++) {
         a1 [i] = i*2;
       }
       
       return a1;
   }
   //Finds sum of the array
   public static int sumArray(int[] array ) {
      int L = array.length;
      int sum = 0;
      for (int i = 0; i < L; i++) {
         sum = sum + array [i];
      }
      //Returning it so we can print it in the main
      return sum;
   }
   //Prints the minimum and maximum values in the array
   public static void printMaxMin(int [] array) {
        int min = array[0];
        int max = array[0];
        
        for(int i = 0; i < array.length; i++) {
           if (min > array[i]) {
              min = array[i];
           }
           
           if (max < array[i]) {
              max = array[i];
           }
        }
        
        System.out.println("The minimum value of the array is " + min);
        System.out.println("The maximum value of the array is " + max);
    }
 
           
              
              
  //Main method to try it out 
   public static void main(String[] args) {
      //Sets array's length
      int[] first = createIncreasingArray(20);
      
      System.out.println("The sum of the array is " + sumArray(first));
      
      printMaxMin(first);
   
   }
   
   
   
   




}