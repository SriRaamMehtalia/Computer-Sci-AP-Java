//SriRaam A. Mehtalia Period 5
//Inherits-A7: Inheritance Project

/**
   A class to keep track of a single appointment.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Appointment_Mehtalia
{
   public static void main(String[] args) {
      ArrayList<Appointment> days = new ArrayList<Appointment>();
      
      //Lists of monthly appointments
      Appointment a1 = new Monthly(16,1,2,"Dentist");
      Appointment a2 = new Monthly(16,5,16,"Doctors office");
      Appointment a3 = new Monthly(16,5,7,"Check in with squaaaad");
      
      //List of oneTime appointments
      Appointment o1 = new Onetime(16,12,16,"Bank run for cash");
      Appointment o2 = new Onetime(16,9,11, "Meeting with Boss");
      
      //List of daily appointments
      Appointment d1 = new Daily(16,1,20, "Pick up kid from school");
      Appointment d2 = new Daily(16,3,10, "Give report on stuff");
      Appointment d3 = new Daily(16,7,29, "Go get lunch from Subway");
      
      //Adding all the appointments to an arraylist
      
      days.add(a1);
      days.add(a2);
      days.add(a3);
      days.add(o1);
      days.add(o2);
      days.add(d1);
      days.add(d2);
      days.add(d3);
      
      
      //Test to make sure the descriptions get printed 
      
      System.out.println("All appointments are : ");
      
      for(int i = 0; i < days.size(); i++) {
         System.out.println(days.get(i));
      }
      
      //Running the occursOn method for inputted date 
      
      System.out.println("");
      
      System.out.println("Now testing for specific dates");
      
      System.out.println("");
      
      Scanner check = new Scanner(System.in);
      
      System.out.println("Input a year");
      int y1 = check.nextInt();
      
      System.out.println("Input a month of the year");
      int mon = check.nextInt();
      
      System.out.println("Input a day of the month");
      int dia = check.nextInt();
      
      
      System.out.println("Your appointments on this date are: ");
      System.out.println("");
      
      for(int i = 0; i < days.size(); i++) {
         if(days.get(i).occursOn(y1,mon,dia)) {
             System.out.println(days.get(i));
         }
      } 
      
      
      
      
      
      //Method for adding new appointments, which is P9.2, in appointment class
            
      
      
      
      
      
   }
}

class Appointment
{
   private String description;
   private int year;
   private int month;
   private int day;
   

   /**
      Initializes appointment for a given date.
      @param year the year
      @param month the month
      @param day the day
      @param description the text description of the appointment
   */
   public Appointment(int year, int month, int day, String description)
   {
      this.year = year;
      this.month = month;
      this.day = day;
      this.description = description;
   }

   /**
      Returns the year of the appointment.
      @return the year
   */
   public int getYear()
   {
     return year;
   }

   /**
      Returns the month of the appointment.
      @return the month
   */
   public int getMonth()
   {
      return month;
  }

   /**
      Returns the day of the appointment.
      @return the day
   */
   public int getDay()
   {
      return day;
   }

   /**
      Determines if the appointment is on the date given.
      @param year the year to check
      @param month the month to check
      @param day the day to check
      @return true if the appointment matches all three parameters
   */
   public boolean occursOn(int year, int month, int day)
   {
      return (year == this.year) && (month == this.month) && (day == this.day);
   }
   
   //Method for user adding appointments, as per P9.2
   
   private String type;
   
   public void addNewAppointment(String t, String des, int yr, int mont, int dai) {
       type = t;
       description = des;
       year = yr;
       month = mont;
       day = dai;
    }
   
   
   /**
      Converts appointment to string description.
   */
   public String toString()
   {
      return description;
   }
}

class Onetime extends Appointment
{
   public Onetime(int year, int month, int day, String description)
   {
      super(year, month, day, description);
   }
   
   
}

class Daily extends Appointment
{
   public Daily(int year, int month, int day, String description)
   {
     super(year, month, day, description);
      
   }
   
   public boolean occursOn(int year, int month, int day)
   {
      return true;
   }


}

class Monthly extends Appointment
{
   public Monthly(int year, int month, int day, String description)
   {
      super(year, month, day, description);
      
   }
   
   public boolean occursOn(int day)
   {
      if(day == getDay()) {
         return true;
      }
      
      else {
         return false;
      }
   }


}
