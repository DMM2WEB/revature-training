package com.dmm;

public class EmployeeDaoFactory {
    public static EmployeeDao dao;

    private EmployeeDaoFactory () {

    }

    public static EmployeeDao getEmployeeDao () {
        if (dao == null)
            dao = new EmployeeDaoImpl();
        return dao;
    }
}
