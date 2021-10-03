package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		boolean isPrime = true;
		if (n <= 1)
			isPrime = false;
		else if (n == 2)
			isPrime = true;
		else if (n % 2 == 0)
			isPrime = false;
		else

			for (int i = 3; i <= Math.sqrt(n); i += 2) {
				if (n % i == 0)
					isPrime = false;
				break;
			}
		if (isPrime == true)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}
