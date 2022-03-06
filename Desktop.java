package Assignment.week2;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop size is 1366x768");
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerMode();
		obj.desktopSize();
		
	}
	

}
