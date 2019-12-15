package com.sda.timea.clientmanager.dao;

import com.sda.timea.clientmanager.model.Client;
import com.sda.timea.clientmanager.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class ClientDao {

    public List<Client> getAllClients() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Client> query = session.createQuery("from Client");
        List<Client> clientList = query.list();
        transaction.commit();
        session.close();
        return clientList;
    }

    public void deleteClientById(int clientId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete from Client where id = ?1");
        query.setParameter(1, clientId);
//        Client client = session.get(Client.class, clientId);
        query.executeUpdate();
//        session.delete(client);
        transaction.commit();
        session.close();
    }

    public Client getClient(int idClient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //CRUD OPERATIONS;
        //READ
        Client client = session.get(Client.class, idClient);
        //INSERT / UPDATE
//        session.saveOrUpdate(client);
        transaction.commit();
        session.close();
        return client;
    }

    public List<Client> getClientsWithSalaryBiggerThan(double salary) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Client> query = session.createQuery("from Client where salary >= ?1");
        query.setParameter(1, salary);
        List<Client> clientsBySalary = query.list();
        transaction.commit();
        session.close();
        return clientsBySalary;
    }



}
