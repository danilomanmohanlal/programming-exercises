package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public int solution(int[] A) {
		
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		for(int i = 0; i < A.length; i++) {
			
			int key = A[i];
			if(map.containsKey(key))
				map.remove(key);
			else 
				map.put(key, i);
			
		}
		
		result = map.keySet().iterator().next();
		
		return result;
	}
}
