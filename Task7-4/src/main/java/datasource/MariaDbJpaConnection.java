package datasource;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MariaDbJpaConnection {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("CurrencyUnit");

    private static EntityManager em;

    public static EntityManager getInstance() {
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }
}