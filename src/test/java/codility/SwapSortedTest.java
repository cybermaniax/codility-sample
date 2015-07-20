package codility;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author ghalajko
 *
 */
public class SwapSortedTest {
	/**
	 * T.
	 */
	@Test
	public void test01() {
		int t[] = {1,2,3,4,5};
		boolean s = SwapSorted.solution(t);
		Assert.assertTrue(s);
	}
	
	@Test
	public void test02() {
		int t[] = {1,2,2,3,4,5};
		boolean s = SwapSorted.solution(t);
		Assert.assertTrue(s);
	}
	
	@Test
	public void test03() {
		int t[] = {1,2,4,4,3};
		boolean s = SwapSorted.solution(t);
		Assert.assertTrue(s);
	}
	
	@Test
	public void test04() {
		int t[] = {2,1,4,4,3};
		boolean s = SwapSorted.solution(t);
		Assert.assertFalse(s);
	}
	
	@Test
	public void test05() {
		int t[] = {1,2,4,4,3,3};
		boolean s = SwapSorted.solution(t);
		Assert.assertFalse(s);
	}
}
