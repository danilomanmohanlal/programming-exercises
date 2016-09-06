package codility;

public class TapeEquilibrium {
	
	
	public static void main(String[] args) {
		
		int[] arr = {-10, -20, -30, -40, 100};
		int res = new TapeEquilibrium().solution(arr);
		System.out.println(res);
	}
	
		public int solution(int[] arr) {
			
			int leftSum = 0;
			int rightSum = 0;
			int aux = 0;
			int minimumValue = Integer.MAX_VALUE;
			
			if(arr.length == 2) {
				return Math.abs(arr[0] - arr[1]);
			}
			
			for(int a : arr)
				leftSum += a;
			
			
			for(int i = arr.length -1 ; i > 0; i--) {
				
				leftSum -= arr[i];
				rightSum += arr[i];
				
				aux = Math.abs(leftSum - rightSum);
				
				if(aux == 0)
					return 0;
				
				if(minimumValue > aux)
					minimumValue = aux;
			}
	
			return minimumValue;
		}

}
