package Min3Method;

public class Main {
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min)
			min = b;
		
		if(c < min)
			min = c;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.print(min3(3,2,1));

	}

}
