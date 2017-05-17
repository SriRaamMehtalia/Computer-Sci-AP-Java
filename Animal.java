//SriRaam A. Mehtalia Period 5
//Inherits-A9: Zoo

public class Animal
{
   private String species;
   private String name;
   private int age;
   
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
    
    
    
    public void speak() {
       System.out.println("Hello my name is " + name + "and I am a " + species);
       System.out.println("I am " + age + "years old");
       System.out.println("");
    }
}

class Elephant extends Animal
{
   public Elephant(String species, String name, int age) {
      super(species, name, age);
      
   }

}