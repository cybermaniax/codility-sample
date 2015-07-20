package codility;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author ghalajko
 *
 */
public class ChessBoardRiceTest {
	/**
	 * T.
	 */
	@Test
	public void test01() {
		int[][] A = { { 1, 1 }, { 1, 1 } };

		int s = ChessBoardRice.solution(A);
		Assert.assertEquals(3, s);
	}

	/**
	 * T.
	 */
	@Test
	public void test02() {
		int[][] A = { { 1, 2 }, { 1, 1 } };

		int s = ChessBoardRice.solution(A);
		Assert.assertEquals(4, s);
	}

	@Test
	public void test03() {
		int[][] A = { { 1, 1, 1 }, { 1, 1, 1 } };

		int s = ChessBoardRice.solution(A);
		Assert.assertEquals(4, s);
	}
	
	@Test
	public void test04() {
		int[][] A = { { 0, 0, 0 }, { 1, 1, 1 } };
		int s = ChessBoardRice.solution(A);
		Assert.assertEquals(3, s);
	}
	
	@Test
	public void test05() {
		int[][] A = { { 1, 1, 1 }, { 0, 0, 0 } };
		int s = ChessBoardRice.solution(A);
		Assert.assertEquals(3, s);
	}
}
