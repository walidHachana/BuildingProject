package Challenge;



import java.text.ParseException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Beans.ChallengeDaoRemote;
import entities.Challenge;



public class ChallengeTest {

	public static void main(String[] args) throws ParseException {
		Context context;
		Challenge challenge = new Challenge();
		
		challenge.setDesignation("1111");
		challenge.setCategorie("2222");
		challenge.setYear(2016);
		
Challenge challenge2 = new Challenge();
		
		challenge2.setDesignation("3333");
		challenge2.setCategorie("4444");
		challenge2.setYear(2016);
		
Challenge challenge3 = new Challenge();
		
		challenge3.setDesignation("5555");
		challenge3.setCategorie("6666");
		challenge3.setYear(2016);
		
		
Challenge challenge4 = new Challenge();
		
		challenge4.setDesignation("7777");
		challenge4.setCategorie("8888");
		challenge4.setYear(2016);
		
		
	
	
		
		
		
		ChallengeDaoRemote challengeDaoRemote;

		try {
			context = new InitialContext();
			challengeDaoRemote = (ChallengeDaoRemote) context
					.lookup("building-project-ear/building-project-ejb/ChallengeDao!Beans.ChallengeDaoRemote");
			System.out.println("step 1 : resolution jndi");
			challengeDaoRemote.addChallenge(challenge);
			challengeDaoRemote.addChallenge(challenge2);
			challengeDaoRemote.addChallenge(challenge3);
			challengeDaoRemote.addChallenge(challenge4);
			
		
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
