import java.util.ArrayList;

public class Runner
	{
	static ArrayList <Uniform> roster = new ArrayList <Uniform>();

	public static void main(String[] args)
		{
		for (int i = 10; i < 100; i++)
			{
			roster.add(new Uniform(i, "Smith"));
			}
		System.out.println("Before Roster Cuts");
		printRoster();
		System.out.println();
		System.out.println("After Roster Cuts");
		for (int j = roster.size() - 1; j > 0; j--)
			{
			if (roster.get(j).getNumber() % 3 == 0)
				{
				roster.remove(j);
				}
			}
		printRoster();
		}

	private static void printRoster()
		{
		for (Uniform u : roster)
			{
			System.out.println(u.getName() + "   " + u.getNumber());
			}
		}
	}
