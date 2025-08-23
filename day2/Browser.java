package week1.day2;

public class Browser {
	
	public String launchBrowser(String browsername)
	{
		System.out.println("browser Launches Successfully");
		System.out.println("The browsername is:" + browsername);
		return browsername;
		
	}

	public void loadurl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser objectName=new Browser();
		objectName.launchBrowser("Firefox");
		objectName.loadurl();
		
	}

	
	
}
