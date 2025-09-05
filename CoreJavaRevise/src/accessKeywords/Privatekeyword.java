package accessKeywords;

class person{
	private String name;
	
	private person(){
		System.out.println("I am private constructor");
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public static person name() {
		return new person();
	}
	  
}

public class Privatekeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person.name();
	}

}
