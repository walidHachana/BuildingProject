package Beans;

import java.util.List;

import javax.ejb.Remote;

import entities.Challenge;

@Remote
public interface ChallengeDaoRemote {

	public void addChallenge(Challenge c);
	public void updateChallenge(Challenge c);
	public Challenge findChallengeByID(int id);
	public void deleteChallenge(Challenge c);
	public List<Challenge> findAllChallenge();
	
	
	
}
