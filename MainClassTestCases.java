package junit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class MainClassTestCases
{
	MainClass mainclass;
	@Before
	public void setup()
	{
		mainclass=new MainClass();
	}
	@Test
	public void firstChar()
	{
		assertEquals("BCD",mainclass.removeChar("ABCD"));
	}
	@Test
	public void firstTwoChar()
	{
		assertEquals("CD",mainclass.removeChar("AACD"));
	}
	@Test
	public void secondChar()
	{
		assertEquals("BCD",mainclass.removeChar("BACD"));
	}
	@Test
	public void noChar()
	{
		assertEquals("BBAA",mainclass.removeChar("BBAA"));
	}
	@Test
	public void nextChar()
	{
		assertEquals("BAA",mainclass.removeChar("AABAA"));
	}

}
