package com.nnobrega.jpa;

import com.nnobrega.jpa.entities.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveClientExec {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // creating and persisting a new client
        Client client = new Client(null, "Gene Hackman");
        em.persist(client);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }

}