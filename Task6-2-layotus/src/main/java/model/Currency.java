package model;

public class Currency {
    private String abbreviation;
    private String name;
    private double rateToUsd;

    public Currency(String abbreviation, String name, double rateToUsd) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.rateToUsd = rateToUsd;
    }

    public String getAbbreviation() { return abbreviation; }
    public double getRateToUsd() { return rateToUsd; }

    @Override
    public String toString() {
        return abbreviation + " (" + name + ")";
    }
}