package org.webp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FirmaEJB {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Firma firma) {
        entityManager.persist(firma);
    }

    public Firma find(long id) {
        return entityManager.find(Firma.class, id);
    }

    public void update(Firma firma) {
        entityManager.merge(firma);
    }

    public void delete(long id) {
        Firma firma = find(id);
        if (firma != null) {
            entityManager.remove(firma);
        }
    }
}
