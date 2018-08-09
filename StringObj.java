

public class StringObj
{
	KeyboardReader reader = new KeyboardReader();
	
	// private instance variables
	private String rope;
	private int vowels;
	
	//Constructor
	public StringObj(String words)
	{
		rope = words;
		String lower = rope.toLowerCase();
		int sum = 0;
		for(int i = 0; i < rope.length(); i++)
		{
			char at = lower.charAt(i);
			if(at == 'a' || at == 'e' || at == 'i' ||at == 'o' ||at == 'u')
				sum++;
		}
		vowels = sum;
	}
	
	
	// PARTY MATHODS
	
	public boolean areAlphabetized(StringObj str)	
	{
		String first = this.rope.toLowerCase();
		String second = str.rope.toLowerCase();
		if(first.compareTo(second) < 0)
			return true;
		else if(first.compareTo(second) > 0)
			return false;
		else
			return true;		
	}
	
	public boolean isPalindrome()
	{
		String word = this.rope.toLowerCase();
		String reverse = "";
		String first = ""; 
		int i = 0;
		if(rope.length()%2 == 0)
		{
			first = word.substring(0,rope.length()/2);
			for(i = rope.length()-1; i > rope.length()/2 - 1; i--)
			{
				reverse+=word.charAt(i);
			}
			if(first.equals(reverse))
				return true;
			else
				return false;
		}
		else
		{
			first = word.substring(0,word.length()/2);
			for(i = rope.length()-1; i > rope.length()/2; i--)
			{
				reverse+=word.charAt(i);
			}
			if(first.equals(reverse))
				return true;
			else
				return false;
		}
	}
	
	public boolean isPalindromeBONUS()
	{
		String word = rope.toLowerCase();
		String copy = "";
		int i = 0;
		for(i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) != ',' && word.charAt(i) != '.' &&word.charAt(i) != ';' &&word.charAt(i) != ':' &&word.charAt(i) != '\'' && word.charAt(i) != ' ')
				copy += word.charAt(i);
		}
		StringObj copycopy = new StringObj(copy);
		return copycopy.isPalindrome();
	}
	
	public int wordCount(String str)
	{
		String phrase = this.rope.toLowerCase();
		str = str.toLowerCase();
		String beg = str + " ";
		String mid = " " + str + " ";
		String end = " " + str + ".";
		int i = 0, sum = 0;
		for(i = 0; i < phrase.length(); i++)
		{
			if(i == 0 && phrase.charAt(i) == beg.charAt(0))
			{
				if(phrase.substring(0,beg.length()).equals(beg))
					sum++;
			}
			else if(i == phrase.length()-end.length() && phrase.charAt(i) == end.charAt(0))
			{
				if(phrase.substring(i,phrase.length()).equals(end))
					sum++;
			}
			else if(phrase.charAt(i) == mid.charAt(0) && i < phrase.length()-mid.length())
			{
				if(phrase.substring(i,i+mid.length()).equals(mid))
					sum++;
			}
			else if(str.length() == phrase.length()-1)
			{
				if(phrase.substring(0,str.length()).equals(str))
					sum++;
				break;	
			}
			else
				continue;
		}
		return sum; 
	}
	
	public int wordCountBONUS(String str)
	{

		String phrase = this.rope.toLowerCase();
		str = str.toLowerCase();
		int i = 0, sum = 0;
		for(i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == str.charAt(0))
			{
				if(phrase.substring(i,i+str.length()).equals(str))
					sum++;
			}
			else
				continue;
		}
		return sum; 
		
	}
	
	//Accessors
	
	public String toString()
	{
		return rope;
	}
	
	public int getNumVowels()
	{
		return vowels;
	}
	
	public void displayAnalysisBONUS()
	{
		System.out.println("\n\nSentence\t|\t" + this.rope);
		String word = this.rope.toLowerCase();
		int i = 0, spaces = 0;
		
		// NUMBER OF WORDS
		for(i = 0; i < word.length(); i++)
			if(word.charAt(i) == ' ')
				spaces++;
		spaces++;
		System.out.println("# of words\t|\t" + spaces);
	}
//		// NUMBER OF UNIQUE WORDS
//		int wordCount = 0;
//		String nword; // new word
//		for(i = 0; i < word.length(); i++)
//		{
//			if(i == 0)
//			{
//				while(word.chatAt(i) != ' ')
//				{
//					nword += charAt(i);
//				}
//				if(word)
//			}
//		}
//			
				
}