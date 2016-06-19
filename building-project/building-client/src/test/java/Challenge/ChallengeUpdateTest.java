package Challenge;

import java.text.ParseException;

import javax.naming.Context;
import javax.naming.InitialContext;

import Beans.ChallengeDaoRemote;
import entities.Challenge;

public class ChallengeUpdateTest {
	
	public static void main(String[] args) throws ParseException {
		Context context;
		try {
			context = new InitialContext();
			ChallengeDaoRemote challengeDaoRemote = (ChallengeDaoRemote) context
					.lookup("building-project-ear/building-project-ejb/ChallengeDao!Beans.ChallengeDaoRemote");
			System.out.println("step 1 : resolution jndi");
			
			Challenge challenge = challengeDaoRemote.findChallengeByID(2);
			challenge.setDesignation("Batiment");
			challengeDaoRemote.updateChallenge(challenge);
			
			Challenge challenge2 = challengeDaoRemote.findChallengeByID(3);
			challenge2.setDesignation("Electrique");
			challengeDaoRemote.updateChallenge(challenge2);
			System.out.println("step 2 : c bonn");
			System.out.println("step 3 : c bonn");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}

