package com.sda.timea.clientmanager.dao;

import com.sda.timea.clientmanager.model.Client;
import com.sda.timea.clientmanager.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class ClientDao {

    public Client getClient(int idClient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //CRUD OPERATIONS;
        //READ
        Client client = session.get(Client.class, idClient);
        //INSERT / UPDATE
//        session.saveOrUpdate(client);
        //DELETE
//        session.delete(client);
        //DELETE using query
//        Query query = session.createQuery("delete from Client where married is false");
//        query.executeUpdate();
        transaction.commit();
        session.close();
        return client;
    }

    public List<Client> getClientsWithSalaryBiggerThan(double salary) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Client> query = session.createQuery("from Client where salary >= ?1");
        query.setParameter(1, salary);
        transaction.commit();
        session.close();
        return query.list();
    }

}
