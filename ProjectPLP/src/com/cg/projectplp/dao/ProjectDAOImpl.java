package com.cg.projectplp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.projectplp.beans.Inventory;

@Repository("projectdao")
public class ProjectDAOImpl implements ProjectDAO{
	
	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Inventory> getProductList() {
		// TODO Auto-generated method stub
		Query getQuery = em.createQuery("FROM Inventory");
		List<Inventory> getProduct = getQuery.getResultList();
		return getProduct;
	}
	
}
