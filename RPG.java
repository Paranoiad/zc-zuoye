package zuoye2;

public class RPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwordsMan swordsMan =new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		System.out.printf("½£Ê¿£º(%s,%d,%d)%n",swordsMan.getName(),
				swordsMan.getLevel(),swordsMan.getBlood());
		
		
		Magician magician=new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("Ä§·¨Ê¦£º(%s,%d,%d)%n",magician.getName(),
				magician.getLevel(),magician.getBlood());

	}

}
