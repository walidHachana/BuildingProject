package Challenge;



import java.text.ParseException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Beans.ChallengeDaoRemote;
import entities.Challenge;



public class findChallengeByID {

	public static void main(String[] args) throws ParseException {
		Context context;
		Challenge challenge = new Challenge();
		try {
			context = new InitialContext();
			ChallengeDaoRemote challengeDaoRemote = (ChallengeDaoRemote) context
					.lookup("building-project-ear/building-project-ejb/ChallengeDao!Beans.ChallengeDaoRemote");
			System.out.println("step 1 : resolution jndi");
			challenge = challengeDaoRemote.findChallengeByID(4);
			
			if (challenge != null) {
				System.out.println(challenge.getDesignation());
			} else {
				System.out.println("challenge null");
			}
		
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
		
	
	
		

}