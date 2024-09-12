package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
    private static final String FORMATO_DATA = "dd/MM/yyyy";

    public static Date parseData(String data) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(FORMATO_DATA);
            return format.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String formatData(Date data) {
        SimpleDateFormat format = new SimpleDateFormat(FORMATO_DATA);
        return format.format(data);
    }
}
