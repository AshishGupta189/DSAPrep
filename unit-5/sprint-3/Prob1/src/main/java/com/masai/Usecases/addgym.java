package com.masai.Usecases;

import com.masai.Dao.DaoImpl;
import com.masai.Dao.FitnessDao;
import com.masai.model.Gym;

public class addgym {
    public static void main(String[] args) {
        Gym gym=new Gym();
        gym.setGym_name("Gym1");
        gym.setMonthly_fee(1850);

        FitnessDao f=new DaoImpl();
        f.addGym(gym);
    }
}
