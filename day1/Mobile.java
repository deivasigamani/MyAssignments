package Week1.day1;

public class Mobile {
	
	public void sendMessage() {
		
		System.out.println("hello");
	}
	public void makeCall() {
		System.out.println("tring tring");

	}

	public static void main(String[] args) {
		Mobile mobObj = new Mobile();
		mobObj.sendMessage();
		mobObj.makeCall();

	}

}
