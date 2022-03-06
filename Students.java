package Assignment.week2;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID is "+id);
		return;
	}
     public void getStudentInfo(int id , String name) {
    	 System.out.println("Student ID is "+id);
    	 System.out.println("Student name is "+name);
		return;
	}
     public void getStudentInfo(String email , String phoneNumber) {
    	 System.out.println("Student email is "+email);
    	 System.out.println("Student phone number is "+phoneNumber);
    	 return;
    }
     public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo(106);
		st.getStudentInfo(106, "Sanjula");
		st.getStudentInfo("sanjula@gmail.com", "9876543551");
		
	}
     

}
