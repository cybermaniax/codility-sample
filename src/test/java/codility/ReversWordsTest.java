package codility;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author ghalajko
 *
 */
public class ReversWordsTest {
	/**
	 * T.
	 */
	@Test
	public void test01() {
		String s = ReversWords.solution("asd asd");
		Assert.assertEquals("dsa dsa", s);
	}
	
	@Test
	public void test02() {
		String s = ReversWords.solution("asd");
		Assert.assertEquals("dsa", s);
	}
	
	@Test
	public void test03() {
		String s = ReversWords.solution("a");
		Assert.assertEquals("a", s);
	}
}
