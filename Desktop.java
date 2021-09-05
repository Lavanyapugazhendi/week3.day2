package week3.day2;

public class Desktop implements HardWare , Software{


	private static void desktopModel(String BrandName, String Model) {
     System.out.println(BrandName + Model);		
	}

	public void softwareResources(int RAM) {
		System.out.println("RAM : " + RAM);
		
	}

	public void hardwareResources(String keyboard, String mouse, float screensize) {
		System.out.println(keyboard   +  mouse   +   screensize);
		
	}

	public static void main(String[] args) {
		Desktop computer = new Desktop();
		computer.desktopModel("Lenova","Lenova W520" );
		computer.softwareResources(4);
		computer.hardwareResources("Keyboard","mouse", 15.6f);
		
	}
	
}
