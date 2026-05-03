import dao.CurrencyDao;
import dao.TransactionDao;
import entity.Currency;
import entity.Transaction;

public class CurrencyController {

    private CurrencyDao dao = new CurrencyDao();
    private TransactionDao tdao = new TransactionDao();

    public double convert(double amount, Currency from, Currency to) {

        double fromRate = from.getRateToUsd();
        double toRate = to.getRateToUsd();

        double result = (amount / fromRate) * toRate;

        Transaction t = new Transaction(amount, from, to, result);
        tdao.save(t);

        return result;
    }
}