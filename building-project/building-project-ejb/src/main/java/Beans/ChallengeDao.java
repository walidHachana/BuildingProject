package Beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Challenge;


@Stateless
@LocalBean
public class ChallengeDao implements ChallengeDaoRemote, ChallengeLocal{

@PersistenceContext
EntityManager em;
	
	public ChallengeDao(){
		
	}

	@Override
	public void addChallenge(Challenge c) {
		em.persist(c);
		
	}

	@Override
	public void updateChallenge(Challenge c) {
		em.merge(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Challenge findChallengeByID(int id) {
		// TODO Auto-generated method stub
		return em.find(Challenge.class, id);
	}

	@Override
	public void deleteChallenge(Challenge c) {
		em.remove(em.merge(c));
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Challenge> findAllChallenge() {
		Query query = em.createQuery("select c from Challenge c");
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
		
}
