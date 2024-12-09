package dailyassignments;
// which method access specifiers are accessable inside the package.
public class Assign_61_Accessspedifferntclass_SamePackage extends Assign_61_samepackage {

	public static void main(String[] args) {
		// 
		Assign_61_samepackage test=new Assign_61_samepackage();
		test.add();//can be access public
		test.div();//can access default
		test.mul();//can be access protected

		//  test.sub cannot access as  substraction method which is "private"
	}

}
