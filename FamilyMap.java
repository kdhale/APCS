//Kenia Hale
//FamilyMap

import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class FamilyMap
{
	
	private TreeMap<String, TreeSet<String>> map;
	
	// 0
	public FamilyMap()
	{
		map = new TreeMap<String, TreeSet<String>>();
	}
	
	// 1 
	public void addFamily()// adds without parameter, until enter done
	{
		KeyboardReader reader = new KeyboardReader();
		String key = reader.readLine("Please enter a last name:\t");
		String temp = "";
		TreeSet<String> Treebrown = new TreeSet<String>();
		while(!temp.equals("done"))// run till done
		{
			temp = reader.readLine("Please enter a family member's name (enter done if finished):\t");
			if(temp.equals("done"))// break if done
				break;
			else
				Treebrown.add(temp);
		}
		map.put(key,Treebrown);	
	}
	
	// 2
	public void addFamily(String surname, ArrayList<String> firstnames)// add with parameter
	{
		TreeSet<String> Treebrown = new TreeSet<String>();// for all the names in arraylist, add to treebrown 
		for(String name:firstnames)
			Treebrown.add(name);
		map.put(surname, Treebrown);	
	}
	
	// 3
	public boolean removeFamily(String surname)
	{
		if(map.containsKey(surname))// if the name exists, take away the key
		{
			map.remove(surname);
			return true;
		}	
		else
		{
			System.out.println("Hey, the name " + surname + " isn't in here! Removal unsuccessful!");
			return false;
		}
	}
	
	// 4
	public String[] getFirstnames(String surnames)
	{
		if(map.containsKey(surnames))
		{
			String[] first = new String[map.get(surnames).size()];// bc it's going to be the size of the #surnames
			int i = 0;
			for(String name: map.get(surnames))// cycling through the set and reassigning values to array
			{
				first[i] = name;
				i++;
			}
			return first;
		}
		else
		{
			System.out.println("Hey! the surname " + surnames + " isn't in here!");
			return new String[0];
		}	
	}
	
	// 5
	public String[] getSurnames()
	{
		String[] first = new String[map.size()];
		int i = 0;
		for(String name: map.keySet())// cycling through the set and reassigning values to array
		{
			first[i] = name;
			i++;
		}
		return first;
	}
	
	// 6
	public String moreMembers(String famname1, String famname2)
	{
		boolean exists1 = map.containsKey(famname1), exists2 = map.containsKey(famname2);// if they exist
		
		if(exists1 && exists2)
		{
			if(map.get(famname1).size() > map.get(famname2).size()) // fam1 more than fam 2
				return famname1;
			else if(map.get(famname1).size() < map.get(famname2).size()) // fam2 more than fam1
				return famname2;
			else// same amount
				return "They both have " + map.get(famname1).size() + " members";
		}
		else
		{
			if(!exists1)
				System.out.println("The surname " + famname1 + " doesn't exist!");
			if(!exists2)
				System.out.println("The surname " + famname2 + " doesn't exist!");
			return "";
		}
	}
	
	// 7
	public String[] commonFirst(String famname1, String famname2)
	{
		boolean exists1 = map.containsKey(famname1), exists2 = map.containsKey(famname2);
		
		if(exists1 && exists2)// create an arraylist, get an array of fam1 names, compare to fam2 names, add same names to arraylist, then add vals from arraylist to new array
		{
			ArrayList<String> jacob = new ArrayList<String>();
			String[] kenia = this.getFirstnames(famname1);// array of names in 1
			for(int i = 0; i < kenia.length; i++)// running through the set of fam2
				if(map.get(famname2).contains(kenia[i]))// if both have name, add to jacob
					jacob.add(kenia[i]);
			String[] done = new String[jacob.size()];
			for(int i = 0; i< done.length; i++)// transfer names in jacob to done
				done[i] = jacob.get(i);
			return done;	
		}
		else
		{
			if(!exists1)
				System.out.println("The surname " + famname1 + " doesn't exist!");
			if(!exists2)
				System.out.println("The surname " + famname2 + " doesn't exist!");
			return new String[0];
		}
	}
	
	// 8
	public String[] longestName(String famname)// find longest length, then add all names that have that length
	{
		int max = 0;
		if(map.containsKey(famname))
		{
			for(String s: map.get(famname))// running through all names, first find 
			{
				if((int)s.length() > max)// find the max length
					max = s.length();
			}
			ArrayList<String> maxlength = new ArrayList<String>();
			for(String s: map.get(famname))// running through all names, adding long names to arraylist
			{
				if(s.length() == max)
					maxlength.add(s);
			}
			String[] done = new String[maxlength.size()];
			for(int i = 0; i< done.length; i++)// place arraylist values into array
				done[i] = maxlength.get(i);
			return done;
		}
		else
		{
			System.out.println("The surname " + famname + " doesn't exist!");
			return new String[0];
		}
	}
	
	// 9
	public String[] listAll()
	{
		
		int k = 0;
		for(String s:map.keySet())
		{
			k+= map.get(s).size();
		}
		String[] families = new String[k];// final string array
		String temp = "";
		int i = 0;
		for(String s: map.keySet())// run through all keys
		{
			for(Object o: map.get(s))// for every value in each key
			{
				temp = s + ", " + o + "   ";
				families[i] = temp;// so every family is a new section of the array
				temp = "";// so will be new for every family
				i++;
			}

		}
		return families;
	}
}