package dreamschool.cscourse.chapter09;

public class DoctorTest {

	public static void main(String[] args) {
		Dentist den = new Dentist("ȫ�浿");
		
	System.out.println(den.getDepartment() + " : " + den.getName());
	den.treatPatient();
	den.pullOutTooth();

	}

}
