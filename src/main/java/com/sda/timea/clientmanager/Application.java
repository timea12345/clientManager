package com.sda.timea.clientmanager;

import com.sda.timea.clientmanager.dao.ClientDao;
import com.sda.timea.clientmanager.model.Client;
import com.sda.timea.clientmanager.model.ClientProduct;
import com.sda.timea.clientmanager.service.ClientDisplayService;
import com.sda.timea.clientmanager.service.ClientProductDisplayService;
import com.sda.timea.clientmanager.view.ClientManagerMainView;

import java.util.Date;

public class Application extends ClientManagerMainView {

    public static void main(String[] args) {
        ClientManagerMainView.launch();

//        ClientProductDisplayService clientProductDisplayService = new ClientProductDisplayService();
//        Date dateInput = new Date(119, 0, 15);
//        System.out.println(dateInput);
//        System.out.println(clientProductDisplayService.getProductsByMonthAndYear(dateInput));

        ClientDisplayService clientDisplayService = new ClientDisplayService();
//        int salaryInput = 2000;
//        System.out.println(clientDisplayService.getClientsWithSalaryBiggerThan(salaryInput));
        System.out.println(clientDisplayService.getAllClients());
    }

}
