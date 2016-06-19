package Challenge;



import java.text.ParseException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Beans.ChallengeDaoRemote;
import entities.Challenge;



public class ChallengeListTest {

	public static void main(String[] args) throws ParseException {
		Context context;
		try {
			context = new InitialContext();
			ChallengeDaoRemote challengeDaoRemote = (ChallengeDaoRemote) context
					.lookup("building-project-ear/building-project-ejb/ChallengeDao!Beans.ChallengeDaoRemote");
			System.out.println("step 1 : resolution jndi");
			List<Challenge> challenges = challengeDaoRemote.findAllChallenge();
			
			if (challenges != null) {
				System.out.println(challenges);
			} else {
				System.out.println("challenge null");
			}
		
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
	
}