package Max3Method;

public class Main2 {
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if (b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
	}

	public static void main(String[] args) {
		System.out.print(max4(3,4,5,1));

	}
}
