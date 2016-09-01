package codility;

public class CyclicRotation {
	
	public static void main(String[] args) {
		int[] t = {3,8,9,7,6};
		new CyclicRotation().solution(t, 3);
	}
	
	public int[] solution(int[] A, int K) {
		
		if(A == null || A.length < 2 || K == 0)
			return A;

		int arraySize = A.length;
		
		if(K >= arraySize)
			K = K % arraySize;
		
		int aux = arraySize - K;
		int[] result = new int[arraySize];
		


		for(int i = 0; i < arraySize; i++) {
			
			if(i < K)
				result[i] =  A[aux + i];
			else
				result[i] =  A[i - K];
		}
		
		return result;
	}

}
