package service;


import java.util.List;

import model.Category;
import model.Project;


//import model.Project;


public class Output {

	public void print(String print) {
		System.out.println(print);
	}
	
	public void printCategory(Category category) {
		System.out.println(category);
	}
	
	public void printProject1(Project project) {
		System.out.println(project);
	}

	public void printProject(List<Project> readProjectList) {
		System.out.println(readProjectList);
	}



	/*public void showTitle(int choice) {
		System.out.println(ProjectLists.getProject(choice - 1).getTitle());
	}

	public void showProjects(int choice) {
		int k = 0;
		for (Project p : ProjectLists.ProjectList) {
			if (p.getCategoryIndex() == choice) {
				k = k + 1;
				System.out.println(k + ". " + p.toString());
			}
		}
	}

	public void showProjectFull(int choice) {
		System.out.println("You pick: \n"
				+ ProjectLists.ProjectList.get(choice).allToString());
	}*/
}