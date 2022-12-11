package com.masai.Dao;

import com.masai.model.employee;

public interface Empdao {
    public void save(employee emp);
    public String getAddressOfEmployee(int empId);
    public String giveBonusToEmployee(int empId, int bonus);
    public boolean deleteEmployee(int empId);
}
