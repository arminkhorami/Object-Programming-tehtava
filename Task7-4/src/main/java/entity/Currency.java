package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String abbreviation;
    private String name;
    private double rateToUsd;

    public Currency() {}

    public Currency(String abbreviation, String name, double rateToUsd) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.rateToUsd = rateToUsd;
    }

    public String getAbbreviation() { return abbreviation; }
    public String getName() { return name; }
    public double getRateToUsd() { return rateToUsd; }

    @Override
    public String toString() {
        return abbreviation + " (" + name + ")";
    }
}