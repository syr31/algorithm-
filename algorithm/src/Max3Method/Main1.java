package Max3Method;

class Main1 {

	static int max4(int a, int b, int c, int d) {
		int max = a;

		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	public static void main(String[] args) {
		System.out.println("max4(4,3,2,1) = " + max4(4, 10, 2, 1));
		System.out.print("max4(4,2,2,1) = " + max4(4, 2, 2, 1));
	}

}
