package com.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Supplier;
import org.h2.command.dml.*;

@Repository("supplierDAO")

public class SupplierDAOimpl implements SupplierDAO
{
	  

	@Autowired
	private SessionFactory sessionfactory;


	@Transactional
	public List<Supplier> list() {

		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>) sessionfactory.getCurrentSession().createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listSupplier;
	}

	@Transactional
	public Supplier get(String id) {

		String hql = "from supplier where id " + id + " ";

		Query query = (Query) sessionfactory.getCurrentSession().createQuery(hql);
		List<Supplier> listSupplier = (List<Supplier>) query.list();

		if (listSupplier != null || listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}

		return null;
	}

	@Transactional
	public void saveOrUpdate(Supplier supplier) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(supplier);
	}

	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		Supplier SupplierToDelete = new Supplier();
		SupplierToDelete.setId(id);
		sessionfactory.getCurrentSession().delete(SupplierToDelete);
	}

}
