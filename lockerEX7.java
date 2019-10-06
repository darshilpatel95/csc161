public class Exercise07_23
{
	public static void main(String[] args)
	{
		String[] lockers = new String[100];

		closeLocks(lockers);

		stuLChange(lockers);

		print(lockers);
	}
	public static boolean isOpen(String l) {
		return l == "OPEN";
	}
	public static void closeLocks(String[] lockers)
	{
		for (int i = 0; i < lockers.length; i++)
		{
			lockers[i] = "CLOSED";
		}
	}
	public static void stuLChange(String[] lockers)
	{
		int start = 0;

		for (int s = 1; s <= lockers.length; s++) {
			for (int l = 0; l < lockers.length; l += s)
			{
				if (isOpen(lockers[l]))
					lockers[l] = "CLOSED";
				else
					lockers[l] = "OPEN";
			}
			start++;
		}
	}
	public static void print(String[] lockers)  // print open locker
	{
		for (int i = 0; i < lockers.length; i++)
		{
			if (isOpen(lockers[i]))
			{
				System.out.print("L" + (i + 1) + " ");
			}
		}
		System.out.println();
	}
}


/*

Problem is to make a program that will outut open lockers


in order to solve the probelm we have to see that first studet enter and open all locker and second tudnrt entrrs and closes and it goes on. using that we can wetie progrma to figiure it ouyt
*/