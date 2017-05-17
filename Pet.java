//Evan Rittenhouse and SriRaam Mehtalia
//Inherits - A15

import java.util.*;

public abstract class Pet 
{
private String name;

public Pet (String petName)
{
name = petName;
}

public String getName()
{
return name;
}

public abstract String speak();
}

class Dog extends Pet
{
public Dog (String petName)
{super(petName);}

public String speak()
{
return "dog-sound";
}

}

class Cat extends Pet
{
public Cat (String petName)
{
super(petName);
}

public String speak()
{
return "meow";
}
}

class LoudDog extends Dog
{
public LoudDog(String petName)
{
super(petName);
}

public String speak()
{
return super.speak() + super.speak();
}
}

class Kennel
{
private List<Pet> petList;

public void allSpeak()
{
for (int i = 0; i < petList.size(); i++)
{ 
System.out.println(petList.get(i).getName() + " " + petList.get(i).speak());
}
}
}