package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.Project;

@Component
public class DAOProject {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public Project getProject(int id) {
		Project project = (Project) getSession().get(Project.class, id);

		return project;
	}
	
	@Transactional
	public List<Project> getProjectList(int id) {
		Query query = getSession().createQuery("from Project pr where pr.category = :category");
		query.setInteger("category", id);
		List<Project> projects = (List<Project>) query.list();
		return projects;
	}
}
