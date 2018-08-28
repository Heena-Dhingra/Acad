abstract class Vehicle
{
	public abstract void start();
	
	public void stop()
	{
		System.out.println("This is stop fn of vehicle");
	}
}
class Twowheeler extends Vehicle
{
	public void start()
	{
		System.out.println("This is start fn of twowheeler");
	}
	public void stop()
	{
		System.out.println("This is stop fn of twowheeler");
	}
}
class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("This is start fn of fourwheeler");
	}
	public void stop()
	{
		System.out.println("This is stop fn of fourwheeler");
	}
}
class Demo
{
	public static void main(String args[])
	{
	Twowheeler t = new Twowheeler();
	t.start();
	t.stop();
	Fourwheeler f = new Fourwheeler();
	f.start();
	f.stop();}
}