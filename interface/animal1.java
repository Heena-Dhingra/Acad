interface Animals
{
	void speak();
	void eat();
}
class Dog implements Animals
{
	public void speak()
	{
		System.out.println("barks");
	}
	public void eat()
	{
		System.out.println("Dogs eat pedigree.");
	}
}
class Cat implements Animals
{
	public void speak()
	{
		System.out.println("purrs");
	}
	public void eat()
	{
		System.out.println("Cats drink milk.");
	}
}
class Demo
{
	public static void main(String args[])
	{
		Cat c = new Cat();
		c.speak();
		c.eat();
		Dog d = new Dog();
		d.speak();
		d.eat();
	}
}