package controller;

import java.util.ArrayList;
import java.util.List;

import model.Category;


import model.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.DAOCategory;
import dao.DAOProject;


@Controller
public class RestController {

	@Autowired
	private DAOCategory DAOCategory;
	
	@Autowired
	private DAOProject DAOProject;
	
	@RequestMapping(value = "/")
	public String getMainPage() {
		return "index";
	}
	
	@RequestMapping(value = "/categories")
	public @ResponseBody List<Category> getCategory() {
		List<Category> categories = new ArrayList<Category>();
		categories.add(DAOCategory.getCategory(1));
		categories.add(DAOCategory.getCategory(2));
		categories.add(DAOCategory.getCategory(3));
		return categories;
	} 
	
	@RequestMapping(value = "/categories/{id}")
	public @ResponseBody Category getCategory(@PathVariable int id) {
		return DAOCategory.getCategory(id);
	}
	
	@RequestMapping(value = "/categories/{categoryId}/projects")
	public @ResponseBody List<Project> getProjectList(@PathVariable int categoryId) {
		List<Project> projects = DAOProject.getProjectList(categoryId);
		return projects;

	} 
	
	@RequestMapping(value = "/projects/{id}")
	public @ResponseBody Project getProject(@PathVariable int id) {
		return DAOProject.getProject(id);
	} 
}

