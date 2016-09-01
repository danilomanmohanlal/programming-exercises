package codility;

public class FrogJump {

	public static void main(String[] args) {
		
		int r = new FrogJump().solution(10, 85, 30);
		System.out.println(r);
	}
	
	public int solution(int X, int Y, int D) {
		
		int result = 0;
		int aux1 = 0;
		int aux2 = 0;
		aux1 = (Y - X) / D;
		aux2 = (Y - X) % D;
		
		result = aux1 + (aux2 > 0 ? 1 : 0);
		
		return result;
	}
}
