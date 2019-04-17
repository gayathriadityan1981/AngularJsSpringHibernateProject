package com.project.shoponline1.repository.product;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
	import javax.persistence.criteria.CriteriaQuery;
	import javax.persistence.criteria.Root;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.query.Query;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.project.shoponline1.model.Product;

	@Repository
	public class ProductDaoImpl implements ProductDao {

		@Autowired
		   private SessionFactory sessionFactory;

	   @Override
	   public List<Product> list() {
	      Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<Product> cq = cb.createQuery(Product.class);
	      Root<Product> root = cq.from(Product.class);
	      cq.select(root);
	      Query<Product> query = session.createQuery(cq);
	      return query.getResultList();
	   }

	  
	 

	

	}
