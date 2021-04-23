package com.poly.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.poly.common.JPAUtils;

public class AbstractEntityDAO<T> {
    private Class<T> entityClass;

    public AbstractEntityDAO(Class<T> cls) {
	this.entityClass = cls;

    }

    EntityManager em = JPAUtils.getEntityManager();

    /*
     * Create
     */

    public void create(T entity) {

	try {
	    em.getTransaction().begin();
	    em.persist(entity);
	    em.getTransaction().commit();

	} catch (Exception e) {
	    em.getTransaction().rollback();
	} finally {
	    em.close();
	}

    }

    /*
     * Update
     */

    public void update(T entity) {

	try {
	    em.getTransaction().begin();
	    em.merge(entity);
	    em.getTransaction().commit();

	} catch (Exception e) {
	    em.getTransaction().rollback();
	} finally

	{
	    em.close();
	}

    }

    /*
     * Delete
     */
    public void delete(Object Id) {

	try {
	    em.getTransaction().begin();
	    T entity = em.find(entityClass, Id);
	    em.remove(entity);
	    em.getTransaction().commit();

	} catch (Exception e) {
	    e.printStackTrace();
	    em.getTransaction().rollback();

	} finally {
	    em.close();
	}
    }

    /*
     * Find by id
     */
    public T findId(Object Id) {

	T entity = em.find(entityClass, Id);
	return entity;

    }

    /*
     * Find All
     */
    public List<T> findAll() {
	CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
	cq.select(cq.from(entityClass));
	return em.createQuery(cq).getResultList();
    }

    /*
     * Phân trang
     */
    public List<T> findAll(boolean all, int firstResult, int maxResult) {
	CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
	cq.select(cq.from(entityClass));
	Query q = em.createQuery(cq);
	if (!all) {
	    q.setFirstResult(firstResult);
	    q.setMaxResults(maxResult);
	}
	return q.getResultList();
    }

    /*
     * Count Entity
     */
    public Long count() {
	CriteriaQuery cq = em.getCriteriaBuilder().createQuery();

	Root<T> rt = cq.from(entityClass);
	cq.select(em.getCriteriaBuilder().count(rt));
	Query q = em.createQuery(cq);
	return (Long) q.getSingleResult();

    }
}
