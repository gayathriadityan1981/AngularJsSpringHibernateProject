package com.project.shoponline1.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.project.shoponline1.repository.product.ProductDao;
import com.project.shoponline1.model.Product;

	@Service
	@Transactional(readOnly = true)
	public class ProductServiceImpl implements ProductService {

	   @Autowired
	   private ProductDao productDao;

	  /* @Transactional
	   @Override
	   public long save(Employee Employee) {
	      return employeeDao.save(Employee);
	   }

	   @Override
	   public Employee get(long id) {
	      return employeeDao.get(id);
	   }*/

	   @Override
	   public List<Product> list() {
	      return productDao.list();
	   }

	 /*  @Transactional
	   @Override
	   public void update(long id, Employee Employee) {
	      employeeDao.update(id, Employee);
	   }

	   @Transactional
	   @Override
	   public void delete(long id) {
	      employeeDao.delete(id);
	   }*/

	}
