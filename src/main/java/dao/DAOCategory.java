package dao;

import javax.transaction.Transactional;

import model.Category;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DAOCategory {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	 @Transactional
	public Category getCategory(int id) {
		  Category category = (Category) getSession().get(Category.class, id);
		  
		  return category;
		 }

	 
}
