package dao;

import datasource.MariaDbConnection;
import entity.Currency;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDao {

    public double getRate(String abbreviation) {
        String sql = "SELECT rateToUsd FROM Currency WHERE abbreviation=?";

        try {
            Connection conn = MariaDbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, abbreviation);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getDouble(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0.0;
    }

    public List<Currency> getAllCurrencies() {
        List<Currency> list = new ArrayList<>();

        String sql = "SELECT * FROM Currency";

        try {
            Connection conn = MariaDbConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                list.add(new Currency(
                        rs.getString("abbreviation"),
                        rs.getString("name"),
                        rs.getDouble("rateToUsd")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}