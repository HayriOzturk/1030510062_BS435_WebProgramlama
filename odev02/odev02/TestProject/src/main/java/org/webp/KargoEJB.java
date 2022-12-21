package org.webp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class KargoEJB {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Kargo kargo) {
        entityManager.persist(kargo);
    }

    public Kargo find(long id) {
        return entityManager.find(Kargo.class, id);
    }

    public void update(Kargo kargo) {
        entityManager.merge(kargo);
    }

    public void delete(long id) {
        Kargo kargo = find(id);
        if (kargo != null) {
            entityManager.remove(kargo);
        }
    }
}