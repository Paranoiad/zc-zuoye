package zuoye3;

public class Human implements Swimmer {
	private String name;
	public Human(String name){
		
		this.name=name;
		
	}
	public String getName(){
		
		return name;
		
	}
	@Override
	public void swim(){
		
		System.out.printf("»À¿‡  %s ”Œ”æ%n",name);
	}

}
