package random;

public class EnhancedPhoneNumber extends PhoneNumber {

	EnhancedPhoneNumber(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String... agrs) {
		EnhancedPhoneNumber ep = new EnhancedPhoneNumber(650992);
		System.out.println(ep);
	}

}
