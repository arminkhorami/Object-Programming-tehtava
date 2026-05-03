package dao;

import datasource.MariaDbJpaConnection;
import entity.Currency;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CurrencyDao {

    public List<Currency> findAll() {
        EntityManager em = MariaDbJpaConnection.getInstance();
        return em.createQuery("SELECT c FROM Currency c", Currency.class)
                .getResultList();
    }

    public double getRate(String abbr) {
        EntityManager em = MariaDbJpaConnection.getInstance();

        Currency c = em.createQuery(
                        "SELECT c FROM Currency c WHERE c.abbreviation = :abbr",
                        Currency.class)
                .setParameter("abbr", abbr)
                .getSingleResult();

        return c.getRateToUsd();
    }

    public void persist(Currency c) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
}