package com.poly.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.poly.common.JPAUtils;
import com.poly.model.User;

public class UserDAO extends AbstractEntityDAO<User> {
    public UserDAO() {
	super(User.class);

    }

    public void changePassword(String id, String oldpassword, String newpassword) throws Exception {

	EntityManager em = JPAUtils.getEntityManager();
	EntityTransaction trans = em.getTransaction();

	String jpql = "select u from User u where u.id =: id and u.password =: password";

	try {
	    trans.begin();
	    TypedQuery<User> query = em.createQuery(jpql, User.class);
	    query.setParameter("id", id);
	    query.setParameter("password", oldpassword);

	    User user = query.getSingleResult();

	    if (user == null) {
		throw new Exception("Current password is incorrect");
	    }
	    user.setPassword(newpassword);
	    em.merge(user);

	    trans.commit();
	} catch (Exception e) {

	    trans.rollback();
	    throw e;
	} finally {

	    em.close();
	}
    }

    public User findByIdandEmail(String id, String email) {
	EntityManager em = JPAUtils.getEntityManager();

	String jpql = "select u from User u where u.id = : id and u.email = : email";
	try {
	    TypedQuery<User> query = em.createQuery(jpql, User.class);
	    query.setParameter("id", id);
	    query.setParameter("email", email);

	    return query.getSingleResult();
	} finally {
	    em.close();
	}
    }
}
