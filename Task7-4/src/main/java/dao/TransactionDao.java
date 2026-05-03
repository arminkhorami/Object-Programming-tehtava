package dao;

import datasource.MariaDbJpaConnection;
import entity.Transaction;
import jakarta.persistence.EntityManager;

public class TransactionDao {

    public void save(Transaction t) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }
}