package br.com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fernando Godóy
 */
public  class ManagerPersist {

	@PersistenceContext
    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("aulaPU");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
