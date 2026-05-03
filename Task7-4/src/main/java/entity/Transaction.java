package entity;

import jakarta.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;

    @ManyToOne
    private Currency fromCurrency;

    @ManyToOne
    private Currency toCurrency;

    private double result;

    public Transaction() {}

    public Transaction(double amount, Currency fromCurrency, Currency toCurrency, double result) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.result = result;
    }
}