package com.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;

@Repository
public class ProductDAOimpl implements ProductDAO{

		@Autowired
		private SessionFactory sessionfactory;

		@Transactional
		public List<Product> list() {

			@SuppressWarnings("unchecked")
			List<Product> listProduct = (List<Product>) sessionfactory.getCurrentSession().createCriteria(Product.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

			return listProduct;
		}

		@Transactional
		public Product get(String id) {

			String hql = "from product where id " + id + " ";

			Query query = (Query) sessionfactory.getCurrentSession().createQuery(hql);
			List<Product> listProduct = (List<Product>) query.list();

			if (listProduct != null || listProduct.isEmpty()) {
				return listProduct.get(0);
			}

			return null;
		}

		@Transactional
		public void saveOrUpdate(Product product) {
			// TODO Auto-generated method stub
			sessionfactory.getCurrentSession().saveOrUpdate(product);
		}

		@Transactional
		public void delete(String id) {
			// TODO Auto-generated method stub
			Product ProductToDelete = new Product();
			ProductToDelete.setId(id);
			sessionfactory.getCurrentSession().delete(ProductToDelete);
		}

	}


