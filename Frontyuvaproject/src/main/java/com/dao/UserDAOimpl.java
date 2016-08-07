package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
import org.h2.command.dml.*;

@Repository("userDAO")

public class UserDAOimpl implements UserDAO{
		@Autowired
		private SessionFactory sessionfactory;

		@Transactional
		public List<User> list() {

			@SuppressWarnings("unchecked")
			List<User> listUser = (List<User>) sessionfactory.getCurrentSession().createCriteria(User.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

			return listUser;
		}

		@Transactional
		public User get(String id) {

			String hql = "from user where id " + id + " ";

			Query query = (Query) sessionfactory.getCurrentSession().createQuery(hql);
			List<User> listUser = (List<User>) query.list();

			if (listUser != null || listUser.isEmpty()) {
				return listUser.get(0);
			}

			return null;
		}

		@Transactional
		public void saveOrUpdate(User user) {
			// TODO Auto-generated method stub
			sessionfactory.getCurrentSession().saveOrUpdate(user);
		}

		@Transactional
		public void delete(String id) {
			// TODO Auto-generated method stub
			User UserToDelete = new User();
			UserToDelete.setId(id);
			sessionfactory.getCurrentSession().delete(UserToDelete);
		}

	}


