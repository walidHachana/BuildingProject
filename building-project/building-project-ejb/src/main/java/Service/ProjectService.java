package Service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Project;


@Stateless
public class ProjectService {

@PersistenceContext(unitName="category")
	EntityManager entityManager;



public void addProject(Project project){
	  
	  entityManager.persist(project);
	  
	  
}
}