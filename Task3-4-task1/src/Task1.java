import java.io.*;
import java.net.*;

public class Task1 {
    public static void main(String[] args) {
        String urlStr = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        double sum = 0;
        int count = 0;

        try {
            URL url = new URL(urlStr);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );

            String line;
            boolean header = true;
            int columnIndex = -1;

            while ((line = reader.readLine()) != null) {
                String[] cols = line.split(";");

                if (header) {
                    for (int i = 0; i < cols.length; i++) {
                        if (cols[i].equals("UlkoTalo")) {
                            columnIndex = i;
                        }
                    }
                    header = false;
                } else {
                    if (cols[0].contains("01.01.2023")) {
                        double temp = Double.parseDouble(cols[columnIndex].replace(",", "."));
                        sum += temp;
                        count++;
                    }
                }
            }

            reader.close();

            System.out.println("Average Temp = " + (sum / count));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}