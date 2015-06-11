/*package java.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import model.Project;

import org.junit.Before;
import org.junit.Test;

import dao.DAOProject;

public class DAOProjectTest {

	private DAOProject projectDAO= new DAOProject();;

	public void conn() {
		projectDAO.reConnect();
	}

	@Before
	public void clean() {
		projectDAO.deleteProject("test_project");

		
	}

	@Test
	public void shouldBeNotNull_whenDaoGetProject() {

		Project p = projectDAO.readProject(1);
		assertNotNull(p);
	}

	@Test
	public void shouldCreateProject_whenDaoCreateProject() {
	
		int lengthBefore = projectDAO.getLength();
		Project p = new Project(6, "test_project", "this is a description",
				null, null, 999, 0, 0);
		projectDAO.createProject(p);
		int lengthAfter = projectDAO.getLength();

		assertEquals(lengthBefore + 1, lengthAfter);
	}
	
	@Test
	public void shouldDeleteProject_whenDaoDeleteProject() {
		Project p = new Project(6, "test_project", "this is a description",
				null, null, 999, 0, 0);
		projectDAO.createProject(p);
		int lengthBefore = projectDAO.getLength();
		projectDAO.deleteProject("test_project");
		int lengthAfter = projectDAO.getLength();

		assertEquals(lengthBefore - 1, lengthAfter);
	}

}
*/