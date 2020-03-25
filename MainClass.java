package junit;
public class MainClass
{
	public String removeChar(String s)
	{
		char firstLetter=s.charAt(0);
		char secondLetter=s.charAt(1);
		if(firstLetter=='A')
			if(secondLetter=='A')
				return s.substring(2,s.length());
			else
				return s.substring(1,s.length());
		else
			if(secondLetter=='A')
				return firstLetter+""+s.substring(2,s.length());
		return s;
	}
}
