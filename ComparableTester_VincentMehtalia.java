// Joshua Vincent
// Inherits-A9: Zoo
// Period 5

import java.util.ArrayList;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.Collections;

public class ComparableTester_VincentMehtalia
{
  public static void main(String[] args)
  {
    Zoo myZoo = new Zoo();
    
    // Animal nautilus = new Nautilus("Cephalopoda", "Nautilus", "c:/Documents/Computer Science/InheritsA9Zoo/bubble.wav");
    Animal nautilus = new Nautilus("Cephalopoda", "Nautilus", "nautilus.wav", 1000000);
    myZoo.addAnimal(nautilus);
    
    // Animal octopus = new Octopus("Cephalopoda", "Octopus", "c:/Documents/Computer Science/InheritsA9Zoo/bubble.wav");
    Animal octopus = new Octopus("Cephalopoda", "Octopus", "octopus.wav", 100);
    myZoo.addAnimal(octopus);
    
    // Animal squid = new Squid("Cephalopoda", "Squid", "c:/Documents/Computer Science/InheritsA9Zoo/bubble.wav");
    Animal squid = new Squid("Cephalopoda", "Squid", "squid.wav", 1000);
    myZoo.addAnimal(squid);
    
    nautilus.speak("I have a spirally shell.\n");
    octopus.speak("Now you see me. Now you do not.\n");
    squid.speak("I like calamarie.\n");
    
    for(int i = 0; i < myZoo.getSize()-1; i++)
    {
      System.out.println(i+1 + ". " + myZoo.getAnimal(i).getName()
             + " compared to " + myZoo.getAnimal(i+1).getName()
             + ": " + myZoo.getAnimal(i).compareTo(myZoo.getAnimal(i+1)));
    }
  }
}

class Zoo
{
  private ArrayList<Animal> animals;
  
  public Zoo()
  {
    animals = new ArrayList();
  }
  
  public void addAnimal(Animal animal)
  {
    animals.add(animal);
  }
  
  public Animal getAnimal(int index)
  {
    return animals.get(index);
  }
  
  public int getSize()
  {
    return animals.size();
  }
}

abstract class Animal implements Comparable
{
  private String genus;
  private String name;
  private String sound;
  private int age;
  
    
  public interface Comparable
  {
    int compareTo(Object obj);
  }
  
  public Animal(String genus, String name, String soundFile, int age)
  {
    this.genus = genus;
    this.name = name;
    this.sound = soundFile;
    this.age = age;
  }
  
  public int compareTo(Object obj)
  {
    Animal animal = (Animal) obj;
    return age - animal.getAge();
  }
  
  public String getGenus()
  {
    return genus;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getAge()
  {
    return age;
  }
  
  public void speak(String text)
  {
    System.out.println(text);
    try
    {
      File voice = new File(this.sound);
      Clip clip = AudioSystem.getClip();
      clip.open(AudioSystem.getAudioInputStream(voice));
      clip.start();
      Thread.sleep(clip.getMicrosecondLength()/1000);
    }
    catch (Exception e)
    {
      System.out.println("Exception.");
    }
  }
}

class Nautilus extends Animal
{
  public Nautilus(String genus, String name, String soundFile, int age)
  {
    super(genus, name, soundFile, age);
  }
  
  public void speak(String text)
  {
    System.out.println("Genus: " + super.getGenus() + "\n"
                       + "Name: " + super.getName()
                       + "Age: " + super.getAge());
    super.speak("Speak: " + text);
  }
}

class Octopus extends Animal
{
  public Octopus(String genus, String name, String soundFile, int age)
  {
    super(genus, name, soundFile, age);
  }
  
  public void speak(String text)
  {
    System.out.println("Genus: " + super.getGenus() + "\n"
                       + "Name: " + super.getName()
                       + "Age: " + super.getAge());
    super.speak("Speak: " + text);
  }
}

class Squid extends Animal
{
  public Squid(String genus, String name, String soundFile, int age)
  {
    super(genus, name, soundFile, age);
  }
  
  public void speak(String text)
  {
    System.out.println("Genus: " + super.getGenus() + "\n"
                       + "Name: " + super.getName()
                       + "Age: " + super.getAge());
    super.speak("Speak: " + text);
  }
}