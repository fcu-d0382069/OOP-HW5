package iecs.fcu.oop;

public class GYM {

	public static void fight(Pokemon p1, Pokemon p2){
		
		int winner,cp = 0;
		winner = (int)(Math.random()*2)+1;
		
		
		
		if(winner == 1){
			System.out.printf("Winner is %s",p1.getName());
			cp = p1.getCp() + 50;
			p1.setCp(cp);
		}
		else{
			System.out.printf("Winner is %s",p2.getName());
			cp = p2.getCp() + 50;
			p2.setCp(cp);
		}
	}
}
