package dailyassignments;

public class Assign_140 {
	private int otp=1234;
      public  void setOtp(int otp) {
        	this.otp=otp;
        }
      public  int getOtp() {
      	return otp;
      }
	public static void main(String[] args) {
		Assign_140 obj =new Assign_140();
		obj.setOtp(1234);
		System.out.println("the changed otp is " + obj.getOtp());
	}

}
