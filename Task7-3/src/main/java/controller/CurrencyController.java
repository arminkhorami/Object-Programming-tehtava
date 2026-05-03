package controller;

import dao.CurrencyDao;
import entity.Currency;

import java.util.List;

public class CurrencyController {

    private CurrencyDao dao = new CurrencyDao();

    public List<Currency> getCurrencies() {
        return dao.findAll();
    }

    public double convert(double amount, Currency from, Currency to) {

        double fromRate = from.getRateToUsd();
        double toRate = to.getRateToUsd();

        return (amount / fromRate) * toRate;
    }
}