package controller;

import model.Currency;
import model.CurrencyModel;
import java.util.List;

public class CurrencyController {
    private CurrencyModel model;

    public CurrencyController() {
        this.model = new CurrencyModel();
    }

    public List<Currency> getCurrencies() {
        return model.getCurrencies();
    }

    public double convert(double amount, Currency from, Currency to) {
        if (from == null || to == null) return 0.0;
        // now change
        return (amount / from.getRateToUsd()) * to.getRateToUsd();
    }
}