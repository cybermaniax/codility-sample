package codility;

import java.util.regex.Pattern;

/**
 * 
 * @author ghalajko
 *
 */
public class ReversWords {
	/**
	 * 
	 * @param S
	 * @return
	 */
	public static String solution(String S) {
		return Pattern.compile(" ").splitAsStream(S).map(a -> revWord(a))
				.reduce((a, b) -> a + " " + b).get();

	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String revWord(String s) {
		char[] a = s.toCharArray();
		revWord(a, 0, a.length);
		return new String(a);
	}

	/**
	 * 
	 * @param nArray
	 * @param leftIdx
	 * @param rightIdx
	 */
	public static void revWord(char[] nArray, int leftIdx, int rightIdx) {
		for (int i = leftIdx, j = rightIdx - 1; i < j; i++, j--) {
			char swap = nArray[i];
			nArray[i] = nArray[j];
			nArray[j] = swap;
		}
	}

}
