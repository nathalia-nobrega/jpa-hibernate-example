package com.nnobrega.jpa;

import com.nnobrega.jpa.entities.Car;
import com.nnobrega.jpa.entities.Fine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class SaveFineExec {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // creating and persisting a new fine and attatching it to a car
        Car car = new Car();
        car.setId(5);


        Fine fine = new Fine();
        fine.setValue(1040.00);
        fine.setDate(LocalDateTime.now());
        fine.setCar(car);

        em.persist(fine);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
