abstract class Animals
{
	String breed;
	String color;
	String name;
	abstract void eat();
	void speak()
	{
		System.out.println("Dog barks!");
	}
}
class Doggy extends Animals
{
	
	public void eat()
	{
		super.speak();
		System.out.println("Dog eats pedigree!.");
	}
	public void info(String name,String color,String breed)
	{
		System.out.println("I have a "+color+" "+breed+" dog and his name is "+name+".");
	}
	public static void main(String args[])
	{
		Doggy d = new Doggy();
		d.info("Swish","White","Pomerian");
		d.eat(); 
	}
} 