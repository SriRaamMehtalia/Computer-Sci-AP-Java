//SriRaam A. Mehtalia Period 5
//Arrays-A12: Student GPA

//Importing packages for sorting the array
import java.util.Arrays;

import java.lang.Comparable;

public class GPA_Mehtalia
{

   public Student[] stu = new Student[10];   
   //Constructor for initializing all 10 students
   public GPA_Mehtalia() {
      
      stu[0] = new Student("Perry", 8);
      stu[1] = new Student("Johnny", 10);
      stu[2] = new Student("Lawrence", 12);
      stu[3] = new Student("Jacob", 11);
      stu[4] = new Student("Chang", 9);
      stu[5] = new Student("Miguel", 7);
      stu[6] = new Student("Rajesh", 13);
      stu[7] = new Student("Alexander", 11);
      stu[8] = new Student("Mutumbo", 9);
      stu[9] = new Student("Christopher", 12);
      
      for(int i = 0; i < 10; i++) {
         stu[i].updateGPA(Math.random() * 4);
     }  
   
   }
      //finding the maximum and minimum
       public double getMax( ) {
         double maxGPA = 0;
         for(int i = 0; i < 10; i++) {
           double x = stu[i].getGPA();
           if(x>maxGPA) {
              maxGPA = x;
           }
         }
          return maxGPA;
     }
     
      public double getMin()  {
         double minGPA = 10.0;
         for(int i = 0; i < 10; i++) {
           double y = stu[i].getGPA();
           if(y < minGPA) {
              minGPA = y;
           }
           }
           
           return minGPA;
         }
      //Finding the mean/average of the list
      public double getMean() {
         double mean = 0;
         double total = 0;
         for(int i = 0; i < 10; i++) {
           double x = stu[i].getGPA();
           
           total = total + x;
           
         }
         mean = total/10;
         return mean;
         
      }
      
      /**Finding the median of the list: for arrays of even-length,
      the median is the average of the 2 values in the middle
      */
      
      public double getMedian() {
         double median = 0;
         
         double added = 0;
         
         Arrays.sort(stu);
        
         added = stu[4].getGPA() + stu[5].getGPA();
               
         
                  
         median = added/2;
         
         return median;
      }
         
         
   //printing all the values 
   public void printAll() {
      for(int i = 0; i < 10; i++) {
          stu[i].toString();
          
     }
  }
  //main method to run the program
   public static void main(String[] args) {
    
     GPA_Mehtalia gpaChecker = new GPA_Mehtalia(); 
     
     gpaChecker.printAll();
     
     System.out.println("Max GPA = " + gpaChecker.getMax());            
      
     System.out.println("Min GPA = " + gpaChecker.getMin());
     
     System.out.println("The average of them is: " + gpaChecker.getMean());
     
     System.out.println("The median of the GPAs is: " + gpaChecker.getMedian());
     
          
 }  
}

//Student class with all the data and methods
class Student implements Comparable
{
   
   private String name;
   private int grade;
   private double gpa;
   
   public Student(String n, int gr) {
      name = n;
      grade = gr;
   }
   
   public Student() {
      name = "John Smith";
      grade = 10;
      gpa = 3.8;
   }
   
   public String toString() {
      System.out.println("Name is: " + name + " Grade: " + grade + " GPA is: " + gpa);
      return name + "" + grade + "" + gpa;
   }
   
   public double getGPA() {
        return gpa;
   }
   
   public double updateGPA(double newStuff) {
      gpa = gpa + newStuff;
      return gpa;
   }      
    
   public int compareTo(Object other){
   Student student1 = (Student)(this);
   Student stu2 = (Student)(other);
       if(stu2.getGPA() == student1.getGPA()) {
          return 0;
       }
       
       if(stu2.getGPA() > student1.getGPA()) {
          return 1;
       }
       
       else {
          return -1;
       }
   }
    
}