class Animal
{
	String breed;
	String colour;
	public void speak()
	{
		System.out.println("every animal has its own sound.");
	}
}
class Dog extends Animal{
	public void speak()
	{
		System.out.println("Dogs bark! (bow bow!)");
	}
}
class Cat extends Animal{
	public void speak()
	{
		System.out.println("Cats purr! (meow meow!)");
	}
}
class Demo
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.speak();
		Cat c = new Cat();
		c.speak();
	}
}