package controller;

import dao.CurrencyDao;
import entity.Currency;

import java.util.List;

public class CurrencyController {

    private CurrencyDao dao = new CurrencyDao();

    public List<Currency> getCurrencies() {
        return dao.getAllCurrencies();
    }

    public double convert(double amount, Currency from, Currency to) {
        if (from == null || to == null) return 0.0;

        double fromRate = from.getRateToUsd();
        double toRate = to.getRateToUsd();

        return (amount / fromRate) * toRate;
    }
}