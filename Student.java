package Assignment.week2;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Sanjula");
	}
	public void studentDept() {
		System.out.println("Student dept is ECE");
	}
	public void studentId() {
		System.out.println("Student ID is 106");
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}

}
