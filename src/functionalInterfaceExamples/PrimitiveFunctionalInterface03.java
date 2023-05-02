package functionalInterfaceExamples;


import java.util.function.IntSupplier;

/* Primitive version of Supplier - generate 6 digit random OTP */
public class PrimitiveFunctionalInterface03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSupplier s = () -> (int) (Math.random() * 10);
		String otp = "";
		for (int i = 0; i < 6; i++) {
			otp = otp + s.getAsInt();
		}
		System.out.println("The 6 digit OTP: " + otp);

	}

}
