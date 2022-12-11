package com.masai.Usecases;

import com.masai.Dao.DaoImpl;
import com.masai.Dao.FitnessDao;
import com.masai.Exception.TrainerException;
import com.masai.model.Trainer;

public class addtrainer {
    public static void main(String[] args) {
        Trainer tr=new Trainer();
        tr.setEmail("trainer1@xyz");
        tr.setYear_of_experience(5);
        tr.setTrainer_name("Abhi");
        FitnessDao f=new DaoImpl();
        f.registerTrainer(tr);
    }
}
