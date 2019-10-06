import java.util.Scanner;
public class program
{
	public static void main(String[]args)
	{
	Scanner key = new Scanner(System.in);
	double goudD=1.00;
	double toM = 0.25;
	double total = 0.0;
	double tax =(total*0.06)+total;
	double subtotal;
	double sandCost =0.0;
	double cheeseCost=
	0.0;
	String sandname = "";
	String breadname = "";
	String topname = "";
	String conname = "";
	String cheesename = "";
	String name="";
	System.out.print("Plese input 1 for liverwrust, 2 for turkey, 3 for ham, 4 for baloney, 5 for veggie patty, 6 for liverwrust");
	int choiceSan = key.nextInt();
	System.out.print("Plese input 1 for gouda, 2 for swiss, 3 for american, 4 for munster, 5 for cheddar, 6 for none");
	int choiceChe = key.nextInt();
	System.out.print("Plese input 1 for white, 2 for rye, 3 for whole wheat, 4 for hard roll");
	int choiceBre = key.nextInt();


	if (choiceSan == 1)
	{
		sandname= "Liverwurst";
		sandCost = 6.95;
	}
	else if (choiceSan== 2)
	{
		sandname = "turkey";
		sandCost = 5.95;
	}
	else if (choiceSan == 3)
	{
		sandname="ham ";
		sandCost = 7.95;
	}
	else if (choiceSan == 4)
	{
		sandname="Baloney ";
		sandCost = 3.95;
	}
	else if (choiceSan == 5)
	{
		sandname="Veggie Patty";
		sandCost = 0.0;
	}
	else if (choiceSan == 6)
	{
		sandname="A roast beef ";
		sandCost = 8.95;
	}
	// cheese
	if (choiceChe == 1)
	{
		cheesename="Gouda";
		cheeseCost = goudD;
	}
	else if (choiceChe== 2)
	{
		cheesename="Swiss";
		cheeseCost = 0.0;

	}
	else if (choiceChe == 3)
	{
		cheesename="American";
		cheeseCost = 0.0;
	}
	else if (choiceChe == 4)
	{
		cheesename="Munster";
		cheeseCost = 0.0;
	}
	else if (choiceChe == 5)
	{
		cheesename="Cheddar ";
		cheeseCost = 0.0;
	}
	else
	{
		cheesename="none";
		cheeseCost =0.0;
	}

	// toppings
	System.out.print("If you want Lettuce input 1 and if not input 2");
	int choiceTop = key.nextInt();
	if (choiceTop == 1)
		{
		name = "Lettuce";


		}
	else
		{
		name="no Lettuce";

		}
	System.out.print("If you want Onion input 1 and if not input 2");
	choiceTop = key.nextInt();
	if (choiceTop == 1)
		{
		name = "Onion";

		}
	else
		{
		name="no Onion";

		}
	System.out.println(sandname+cheesename+name+cheeseCost+sandCost);



	}
}