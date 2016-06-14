package EjbLocal;

import java.util.List;

import javax.ejb.Local;

import entities.Project;


@Local
public interface ProjectEjbLocal {
	
	/**
	 * 
	 * @return Returns the list of customers
	 */
	public List<Project> findAllProjects();
	
	
	/**
	 * Creates a customer in the database
	 * @param customer
	 */
	public void createProject(Project project);
	
	/**
	 * deletes the customer from the database
	 * @param customer
	 */
	public void deleteProject(Project project);
	
	/**
	 * updates the customer in the database
	 * @param customer
	 */
	public void updateProject(Project project);
}
