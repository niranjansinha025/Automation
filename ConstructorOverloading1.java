package Testing1;

public class ConstructorOverloading1 {
	private String name;
	private int age;
	private int height;
	private int weight;
	public ConstructorOverloading1()
	{
		System.out.println("Testing - ");
		this.name = name;
		this.age = 0;
		this.height = 0;
		this.weight = 0;
	}
	ConstructorOverloading1(int a)
	{
		System.out.println("Testing1234567");
	}

	public static void main(String[] args) 
	{
		
		ConstructorOverloading1 object1 = new ConstructorOverloading1();
		ConstructorOverloading1 object2 = new ConstructorOverloading1(10);
	}

}
