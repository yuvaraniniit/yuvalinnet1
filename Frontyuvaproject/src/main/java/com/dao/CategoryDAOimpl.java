package com.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Category;
import org.h2.command.dml.*;

@Repository
public class CategoryDAOimpl  implements CategoryDAO{
	
	@Autowired
		private SessionFactory sessionfactory;
		

		@Transactional
		public List<Category> list() {

			@SuppressWarnings("unchecked")
			List<Category> listCategory = (List<Category>) sessionfactory.getCurrentSession().createCriteria(Category.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

			return listCategory;
		}

		@Transactional
		public Category get(String id) {

			String hql = "from category where id " + id + " ";

			Query query = (Query) sessionfactory.getCurrentSession().createQuery(hql);
			List<Category> listCategory = (List<Category>) query.list();

			if (listCategory != null || listCategory.isEmpty()) {
				return listCategory.get(0);
			}

			return null;
		}

		@Transactional
		public void saveOrUpdate(Category category) {
			// TODO Auto-generated method stub
			sessionfactory.getCurrentSession().saveOrUpdate(category);
		}

		@Transactional
		public void delete(String id) {
			// TODO Auto-generated method stub
			Category CategoryToDelete = new Category();
			(CategoryToDelete).setId(id);
			sessionfactory.getCurrentSession().delete(CategoryToDelete);
		}

	}



