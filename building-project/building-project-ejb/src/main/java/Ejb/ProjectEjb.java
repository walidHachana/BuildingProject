package Ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import EjbLocal.ProjectEjbLocal;
import entities.Project;



/**
 * Session Bean implementation class CustomerEJB
 */
@Stateless
@LocalBean
public class ProjectEjb implements ProjectEjbLocal{

	@PersistenceContext(unitName="primary")
    EntityManager em;
   
    public List<Project> projects = new ArrayList<Project>();
    
    
	@Override
	public void createProject(Project project) {
		em.persist(project);
		em.flush();
	}


	@Override
	public List<Project> findAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteProject(Project project) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	

	
}