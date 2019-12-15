package com.sda.timea.clientmanager.service;

import com.sda.timea.clientmanager.dao.ClientDao;
import com.sda.timea.clientmanager.model.Client;

public class ClientDisplayService {

    private ClientDao clientDao = new ClientDao();

    public Client getClient(int idClient) {
        return clientDao.getClient(idClient);
    }
}
