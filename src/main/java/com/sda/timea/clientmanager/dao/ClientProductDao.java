package com.sda.timea.clientmanager.dao;

import com.sda.timea.clientmanager.model.ClientProduct;
import com.sda.timea.clientmanager.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.*;

public class ClientProductDao {

    public ClientProduct getProductWithId(int idProduct) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        ClientProduct clientProduct = session.get(ClientProduct.class, idProduct);
        transaction.commit();
        session.close();
        return clientProduct;
    }

    public List<ClientProduct> getProductsByMonthAndYear(Date startDate, Date endDate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<ClientProduct> query = session.createQuery("from ClientProduct where dateDisb >= ?1 and date_disb < ?2");
        query.setParameter(1, startDate);
        query.setParameter(2, endDate);
        List<ClientProduct> clientProducts = query.list();
        transaction.commit();
        session.close();
        return clientProducts;
    }
}
