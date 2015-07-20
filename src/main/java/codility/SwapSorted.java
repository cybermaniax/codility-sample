package codility;

/**
 * Score 50%
 * Correctness 50%
 * 
 * @author ghalajko
 *
 */
public class SwapSorted {
	/**
	 * 
	 * @param A
	 * @return
	 */
	public static boolean solution(int[] A) {
		if (1 == A.length) {
			return true;
		}

		for (int i = 1; i < A.length; i++) {
			// check sorted pairs
			if (A[i - 1] <= A[i]) {
				continue;
			}

			int iLeft = i - 1;
			int vLeft = A[iLeft];

			// find start index of identical values
			while (iLeft - 1 >= 0 && A[iLeft - 1] == vLeft) {
				iLeft--;
			}

			// find index last no bigest than vLeft
			i++;
			for (; i < A.length; i++) {
				if (A[i] >= vLeft) {
					break;
				}
			}

			int iRight = i - 1;
			int vRight = A[iRight];

			// SWAP VALUES
			A[iLeft] = vRight;
			A[iRight] = vLeft;
			// sort check from left swap element.
			for (i = (iLeft == 0 ? 1 : iLeft); i < A.length; i++) {
				if (A[i - 1] > A[i]) {
					return false;
				}
			}
			break;
		}
		return true;
	}
}
