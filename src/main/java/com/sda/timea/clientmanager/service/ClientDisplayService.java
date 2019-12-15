package com.sda.timea.clientmanager.service;

import com.sda.timea.clientmanager.dao.ClientDao;
import com.sda.timea.clientmanager.model.Client;

import java.util.List;

public class ClientDisplayService {

    private ClientDao clientDao = new ClientDao();

    public Client getClient(int idClient) {
        return clientDao.getClient(idClient);
    }

    public List<Client> getClientsWithSalaryBiggerThan(double salary) {
        return clientDao.getClientsWithSalaryBiggerThan(salary);
    }

    public List<Client> getAllClients() {
        return clientDao.getAllClients();
    }

    public void deleteClientById(int id) {
        clientDao.deleteClientById(id);
    }
}
