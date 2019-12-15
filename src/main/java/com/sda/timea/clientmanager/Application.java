package com.sda.timea.clientmanager;

import com.sda.timea.clientmanager.dao.ClientDao;

public class Application {

    public static void main(String[] args) {
        System.out.println("Starting Application");

        ClientDao clientDao = new ClientDao();

        System.out.println(clientDao.getClient(1));
        System.out.println(clientDao.getClientsWithSalaryBiggerThan(2000));

    }

}
