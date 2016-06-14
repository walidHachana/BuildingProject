package Mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import utilities.MessageUtil;
import EjbLocal.ProjectEjbLocal;
import entities.Project;


@ManagedBean(name="projectBean")
@SessionScoped
public class ProjectBean {
	
	@EJB
	ProjectEjbLocal projectEjb;	
	
	private List<Project> projectList = new ArrayList<Project>();
	private Project project = new Project();
	
	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	

	public void clearProject() {
		this.project = new Project();
	}
	

	public String deleteProject(Project project) {
		
		try {
			projectEjb.deleteProject(project);
			MessageUtil.addSuccessMessage("Post was successfully deleted.");
		} catch (Exception e) {
			MessageUtil.addErrorMessage("Could not delete Customer.");
		}
	    
	    return "index";
	}
	

	public String createProject() {
		try {
			projectEjb.createProject(this.project);
			MessageUtil.addSuccessMessage("Post was successfully created.");
		} catch (Exception e) {
			MessageUtil.addErrorMessage("Post could not be saved. A Persisting error occured.");
		}
	    
	    return "index";
	}
	

	
}