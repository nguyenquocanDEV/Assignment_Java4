package com.poly.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
    private static EntityManagerFactory factory;

    static public EntityManager getEntityManager() {

	if (factory == null || !factory.isOpen()) {
	    factory = Persistence.createEntityManagerFactory("PolyOEAsm");
	}
	System.out.println("Connect");
	return factory.createEntityManager();
    }

    static public void closeConnect() {

	if (factory != null && factory.isOpen()) {
	    factory.close();
	}
    }
}
