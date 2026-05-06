package question07;

public class Question7 {

	public static void main(String[] args) {
		//Question 7
		
		double h = 0;
		int num = 1, den = 1;
		while (den <= 50) {
			h = h + (num / den);
			num = num + 2;
			den = den + 1;
		}
		
		System.out.println(h);
		
	}

}
