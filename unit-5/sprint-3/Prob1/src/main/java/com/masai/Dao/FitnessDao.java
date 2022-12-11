package com.masai.Dao;

import com.masai.Exception.GymException;
import com.masai.Exception.TrainerException;
import com.masai.model.Gym;
import com.masai.model.Person;
import com.masai.model.Trainer;

import java.util.List;

public interface FitnessDao {
    public void addGym(Gym gym);
    public void registerPerson(Person person,int gym_id)throws GymException;
    public void registerTrainer(Trainer trainer);
    public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException;
    public List<Person> getAllthePersonByGymName(String gym_name)throws GymException;
}
