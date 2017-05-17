//SriRaam A. Mehtalia Period 5
//Inherits-A9: Zoo

import java.util.ArrayList;
import java.util.Collections;


class Animal 
{
   private String species;
   private String name;
   private int age;
   private String sound;
   private String favFood;
   
   public Animal(String s, String n, int a) {
      species = s;
      name = n;
      age = a;
   }
   
  public String getSpecies() {
       return species;
   }
   
   public String getName() {
       return name;
   }
   
   public int getAge() {
       return age;
    }
    
    //Method for making animals speak
    
    public void speak() {
       System.out.println("Asuh dude. My name is " + name + " and I am a " + species);
       System.out.println("I am " + age + " years old");
       System.out.println("");
    }
    
    //Setting and getting animal's sounds, foods, etc.
    
    public void setSound(String rawr) {
        sound = rawr;
        
     }
     
     public void makeSound() {
         System.out.println(sound);
         System.out.println("");
      }
      
      
      public String setFood(String rawr) {
        favFood = rawr;
        return favFood;
     }
     
     public void sayFood() {
         System.out.println("The best thing to eat is " + favFood);
         System.out.println("");
      }
      
      


}

//Creating the animal subclasses

class Elephant extends Animal
{
   public Elephant(String species, String name, int age) {
      super(species, name, age);
      
   
      
      
   }

}

class Meerkat extends Animal
{
   public Meerkat(String species, String name, int age) {
      super(species, name, age);
      
   }

}


class Tiger extends Animal
{
   public Tiger(String species, String name, int age) {
      super(species, name, age);
      
   }

}

class Gorilla extends Animal
{
   public Gorilla(String species, String name, int age) {
      super(species, name, age);
      
   }

}

class Snake extends Animal
{
   public Snake(String species, String name, int age) {
      super(species, name, age);
      
      
   }

}

public class ZooTester_Mehtalia 
{
   public static void main(String[] args) {
      
      //An arraylist of animal objects
      ArrayList<Animal> a1 = new ArrayList<Animal>();
      
      //Initializing animal objects
      Animal toiger = new Tiger("Tiger", "Stefan", 16);
      Animal ellie = new Elephant("Elephant", "Ella", 15);
      Animal Kaa = new Snake("Snake", "Kaa", 10);
      Animal Caesar = new Gorilla("Gorilla", "Caesar", 20);
      Animal Mee = new Meerkat("Meerkat", "James", 7);
      Animal x = (Animal)Mee;
      
      
      ellie.setSound("WYAHHHHHHH");
      ellie.setFood("Tree Leaves");
      
      toiger.setSound("ROAR");
      toiger.setFood("deer");
      
      Kaa.setSound("HISS");
      Kaa.setFood("Mice");
      
      Caesar.setSound("OOH OOH OOh");
      Caesar.setFood("Bananas");
      
      Mee.setSound("Eek Eek");
      Mee.setFood("Straight grass");
      
      a1.add(toiger);
      a1.add(ellie);
      a1.add(Kaa);
      a1.add(Caesar);
      a1.add(Mee);
      
      //Testing all methods for these objects
      
      for(int i = 0; i < a1.size(); i++) {
          a1.get(i).makeSound();
          a1.get(i).speak();
          a1.get(i).sayFood();
      }
      
      x.setSound("JJ");
      x.speak(); 
      
   }
}