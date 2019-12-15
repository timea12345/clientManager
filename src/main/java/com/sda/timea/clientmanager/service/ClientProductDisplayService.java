package com.sda.timea.clientmanager.service;

import com.sda.timea.clientmanager.dao.ClientProductDao;
import com.sda.timea.clientmanager.model.ClientProduct;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class ClientProductDisplayService {
    private ClientProductDao clientProductDao = new ClientProductDao();

    public List<ClientProduct> getProductsByMonthAndYear(Date dateDisb) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dateDisb);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        Date startDate = new GregorianCalendar(year, month, 01).getTime();
        if (month == 12) {
            Calendar endDateCalendar = new GregorianCalendar(year+1, 01, 01);
            Date endDate = endDateCalendar.getTime();
            return clientProductDao.getProductsByMonthAndYear(startDate, endDate);
        } else {
            Calendar endDateCalendar = new GregorianCalendar(year, month+1, 01);
            Date endDate = endDateCalendar.getTime();
            return clientProductDao.getProductsByMonthAndYear(startDate, endDate);
        }
    }
}
