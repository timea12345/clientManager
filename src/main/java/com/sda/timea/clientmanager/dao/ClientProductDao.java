package com.sda.timea.clientmanager.dao;

import com.sda.timea.clientmanager.model.ClientProduct;
import com.sda.timea.clientmanager.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClientProductDao {

    public ClientProduct getProductWithId(int idProduct) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        ClientProduct clientProduct = session.get(ClientProduct.class, idProduct);
        transaction.commit();
        session.close();
        return clientProduct;
    }

//    public List<ClientProduct> getProductsFromMonth() {
//
//    }

}
