package zuoye3;

public class Submarine implements Swimmer {
	private String name;
	public Submarine(String name){
		this.name=name;
		
		
	}
	
	public String getName(){
		return name;
	}
	@Override
	public void swim(){
		
		System.out.printf("Ǳˮͧ  %s Ǳ��%n",name);
	}

}
