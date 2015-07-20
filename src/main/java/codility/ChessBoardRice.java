package codility;

/**
 * 
 * @author ghalajko
 *
 */
public class ChessBoardRice {
	/**
	 * 
	 * @param A
	 * @return
	 */
	public static int solution(int[][] A) {
		int max = 0;
		
		for (int P = 0; P < A.length; P++) {
			for (int Q = 0; Q < A[P].length; Q++) {

				if (P == 0 && Q > 0) {
					A[P][Q] += A[P][Q - 1];
				} else if (Q == 0 && P > 0) {
					A[P][Q] += A[P - 1][Q];
				} else if (P > 0 && Q > 0) {
					A[P][Q] += Math.max(A[P - 1][Q], A[P][Q - 1]);
				}
				
				max = A[P][Q];
			}
		}

		return max;
	}
}
