package org.webp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsertTest {

    private EntityManagerFactory factory;
    private EntityManager em;

    @BeforeEach
    public void init() {
        //her bir test calismadan once BeforeEach calistirilir
        factory = Persistence.createEntityManagerFactory("Hibernate");
        em = factory.createEntityManager();
    }

    @AfterEach
    public void tearDown() {
        //her bir test calistiktan sonra BeforeEach calistirilir

        em.close();
        factory.close();
    }

    private boolean persistInATransaction(Object obj) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("FAILED TRANSACTION: " + e.toString());
            tx.rollback();
            return false;
        }

        return true;
    }


    @Test
    public void test() {


    }

}
