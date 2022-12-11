package com.masai.Dao;

import com.masai.Exception.GymException;
import com.masai.Exception.TrainerException;
import com.masai.model.Gym;
import com.masai.model.Person;
import com.masai.model.Trainer;
import com.masai.utility.emutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements FitnessDao{
    @Override
    public void addGym(Gym gym) {
        EntityManagerFactory emf= emutil.provide();
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(gym);
        em.getTransaction().commit();
        System.out.println("Added new gym");
        em.close();
    }

    @Override
    public void registerPerson(Person person, int gym_id) throws GymException {
        EntityManagerFactory emf= emutil.provide();
        EntityManager em=emf.createEntityManager();
        Gym gym=em.find(Gym.class,gym_id);
        if(gym==null){
            throw new GymException("Gym not found");
        }
        gym.getPerson().add(person);
        em.getTransaction().begin();
        em.persist(gym);
        em.getTransaction().commit();
        em.close();

        System.out.println("Added new person to gym");
    }

    @Override
    public void registerTrainer(Trainer trainer) {
        EntityManagerFactory emf= emutil.provide();
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(trainer);
        em.getTransaction().commit();
        System.out.println("Added new trainer");
        em.close();
    }

    @Override
    public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {
        EntityManagerFactory emf= emutil.provide();
        EntityManager em=emf.createEntityManager();
        Gym gym=em.find(Gym.class,gym_id);
        if(gym==null){
            throw new GymException("Gym not found");
        }
        Trainer tr=em.find(Trainer.class,trainer_id);
        if(tr==null){
            throw new TrainerException("Trainer not found");
        }
        tr.getGyms().add(gym);
        em.getTransaction().begin();
        em.persist(tr);
        em.getTransaction().commit();

        System.out.println("assigned new trainer to gym");
        em.close();
    }

    @Override
    public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
        List<Person> p=new ArrayList<>();
        EntityManagerFactory emf= emutil.provide();
        EntityManager em=emf.createEntityManager();
        Query q =em.createQuery("select e from gym e where gym_name=:name");
        q.setParameter("name",gym_name);

        Gym gym=(Gym) q.getSingleResult();
        if(gym==null){
            throw new GymException("Gym not found");
        }
        p=gym.getPerson();
        return p;
    }
}
