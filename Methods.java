public class Methods{
public static void main(String[]args)
{
	sayHelloWorld();
	sayHelloWorld();
	sayHelloWorld();
	sayHelloWorld();
	sayHelloWorld();
	sayHelloTo("Charlie");
	sayHelloTo("John");
	int x =returnFive();
	System.out.println(x);
	int result = sqaure(5);
	System.out.println(result);
}
static int returnFive()
{
	return 5;
	// return int withvalue 5
}

static void sayHelloTo(String name)
{
	System.out.println("Hello , "+ name);
	// return name called
}


static void sayHelloWorld()
// method print out hello world
{
 System.out.println("Hello World");

}
static int sqaure(int x)
{
	return x*x;
}
}