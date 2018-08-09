
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Hale_FamilyMap
{
	public static void main(String[] args)
	{
		ArrayList hale = new ArrayList<String>();
		hale.add("kenia");
		hale.add("mom");// hale and wenk both have mom
		ArrayList wenk = new ArrayList<String>();
		wenk.add("jacob");
		wenk.add("mom");
		ArrayList rand = new ArrayList<String>();
		rand.add("johnny");// johnny and rascal same size
		rand.add("jami");
		rand.add("rascal");
		
		KeyboardReader reader = new KeyboardReader();
		int choice = 300;
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 1. tests both adds and listall\n"
				+ "\t 2. tests remove family (both true and false)\n"
				+ "\t 3. tests getfirstnames, plus error message, and getsurnames\n"
				+ "\t 4. test moremembers(equal members, error message) and commonFirst(error message)\n"
				+ "\t 5. longest name in rand(error message) and list all\n"
				+ "\t 0. Exit\n"
				+ "\t Your Choice: ");
				
			if(choice == 1)// tests both adds and listall
			{
				FamilyMap fam = new FamilyMap();
				fam.addFamily();
				fam.addFamily("hale",hale);
				fam.addFamily("wenk",wenk);
				
				String[] list = fam.listAll();
				for(int i = 0; i < list.length; i++)
				{
					System.out.println(list[i]);
				}
				reader.pause();
			}
			else if(choice == 2) // tests remove family (both true and false), and list all
			{
				FamilyMap fam = new FamilyMap();
				fam.addFamily("hale",hale);
				fam.addFamily("wenk",wenk);
				
				if(fam.removeFamily("wenk"))
					System.out.println("removal of wenk is successful");
				if(!fam.removeFamily("dog"))
					System.out.println("removal of dog is false");
				String[] list = fam.listAll();
				for(int i = 0; i < list.length; i++)
				{
					System.out.println(list[i]);
				}
				reader.pause();
			}
			else if(choice == 3)// tests getfirstnames, plus error message, and getsurnames
			{
				FamilyMap fam = new FamilyMap();
				fam.addFamily("hale",hale);
				fam.addFamily("wenk",wenk);
				
				String[] list = fam.getFirstnames("hale");
				System.out.println("First names in hale include:");
				for(int i = 0; i < list.length; i++)
				{
					System.out.println(list[i]);
				}
				
				String[] wrong = fam.getFirstnames("john");
				
				System.out.println("\nLast names include ");
				String[] last = fam.getSurnames();
				for(int i = 0; i < last.length; i++)
				{
					System.out.println(last[i]);
				}
				reader.pause();
			}
			else if(choice == 4)// test moremembers(equal members, error message) and commonFirst(error message)
			{
				FamilyMap fam = new FamilyMap();
				fam.addFamily("hale",hale);
				fam.addFamily("wenk",wenk);
				fam.addFamily("rand",rand);
				
				System.out.println("out of hale and rand, " + fam.moreMembers("hale","rand") + " has more members(should be rand)");
				fam.moreMembers("hale","dog");
				System.out.println("out of hale and wenk " + fam.moreMembers("hale","wenk"));
				System.out.print("hale and wenk share the name(s) ");
				String[] last = fam.commonFirst("hale","wenk");
				for(int i = 0; i < last.length; i++)
				{
					System.out.println(last[i]);
				} 
				fam.commonFirst("hale","dog");
				reader.pause();
			}
				
			else if(choice == 5)//longest name in rand(error message) and list all
			{
				FamilyMap fam = new FamilyMap();
				fam.addFamily("hale",hale);
				fam.addFamily("wenk",wenk);
				fam.addFamily("rand",rand);
				
				String[] longest = fam.longestName("rand");
				System.out.println("The longest name(s) in rand: ");
				for(int i = 0; i < longest.length; i++)
				{
					System.out.println(longest[i]);
				} 
				fam.longestName("dog");
				
				
				String[] list = fam.listAll();
				for(int i = 0; i < list.length; i++)
				{
					System.out.println(list[i]);
				}
				reader.pause();	
			}
				
				
		}while(choice != 0);
		
	}
	
}