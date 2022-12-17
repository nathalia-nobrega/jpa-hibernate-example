package com.nnobrega.jpa;

import com.nnobrega.jpa.entities.Car;
import com.nnobrega.jpa.entities.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveCarExec {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // creating and persisting new car with the client with id 2 attached to it
        Client client = new Client();
        client.setId(4);


        Car car = new Car();
        car.setClient(client);
        car.setBrand("Citroen");
        car.setModel("GS");


        em.persist(car);

        em.getTransaction().commit();

        em.close();
        emf.close();


    }

}


