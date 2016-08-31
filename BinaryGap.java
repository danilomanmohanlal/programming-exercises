package codility;

public class BinaryGap {

	public static void main(String[] args) {
		
		BinaryGap bg = new BinaryGap();
		bg.solution(156);
		bg.solution(9);
		bg.solution(20);
		bg.solution(529);
	}
	
	public void solution(int n, int a) {
		
		String binaryString = Integer.toBinaryString(n);
		int gap = 0;
		int aux = 0;

		for(int i = 0; i < binaryString.length(); i++) {
			
			if(binaryString.charAt(i) == '1') {

				//this is done here to check that the gap is between positive integer
				if(gap < aux)
					gap = aux;
				
				aux = 0;
			}
			
			else if(binaryString.charAt(i) == '0') 
				aux++;
			
		}
		
		System.out.println(binaryString + " - " + gap);
	}
	
	 public int solution(int N) {
         int rem;
         int maxGap = 0;
         int curGap = -1;
         while (N>0) {
           rem = N%2;
           N /= 2;
           
           if (rem==0 && curGap!=-1){
              curGap++;
           }else if (rem==1) {
              if (curGap>maxGap)
                 maxGap = curGap;
              curGap=0;             
           }
         }
         
         return maxGap;
     }
	
}
