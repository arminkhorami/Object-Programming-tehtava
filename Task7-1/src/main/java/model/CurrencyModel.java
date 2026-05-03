package model;

import java.util.ArrayList;
import java.util.List;

public class CurrencyModel {
    private List<Currency> currencies = new ArrayList<>();

    public CurrencyModel() {
        // inset currency
        currencies.add(new Currency("USD", "US Dollar", 1.0));
        currencies.add(new Currency("EUR", "Euro", 0.92));
        currencies.add(new Currency("GBP", "British Pound", 0.79));
        currencies.add(new Currency("IRR", "Iranian Rial", 128000));
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }
}