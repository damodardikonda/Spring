
public class GetSetMeth {

	private String name ;
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		System.out.println("Hii");
		return name ;
	}
	
	public String sayHello() {
		
		return "Hello " + name ;
	}
}
