package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 500;
		int noOfdigits = 0;
		int temp;
		int lastDigit;
		int sum = 0;
		temp = n;

		while (temp > 0) { // to find the number of digits
			temp = temp / 10;
			System.out.println("temp:" + temp);
			noOfdigits++;
		}

		temp = n; // to find ArmstrongNumber
		sum = 0;
		while (temp > 0) {

			lastDigit = temp % 10;
			sum = sum + (int) Math.pow(lastDigit, noOfdigits); // Math.pow() returns a double
			System.out.println("Sum:" + sum);
			temp = temp / 10;
		}

		if (sum == n) {

			System.out.println(n + " is Armstrong Number");

		} else {

			System.out.println(n + " is not an Armstrong Number");
		}

	}
}
