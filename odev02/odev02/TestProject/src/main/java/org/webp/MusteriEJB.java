package org.webp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MusteriEJB {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Musteri musteri) {
        entityManager.persist(musteri);
    }

    public Musteri find(long id) {
        return entityManager.find(Musteri.class, id);
    }

    public void update(Musteri musteri) {
        entityManager.merge(musteri);
    }

    public void delete(long id) {
        Musteri musteri = find(id);
        if (musteri != null) {
            entityManager.remove(musteri);
        }
    }
}
