package com.lenonmerlo.iniflex.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatUtils {
    private FormatUtils() {}

    public static final DateTimeFormatter BR_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static final DecimalFormatSymbols BR_SYM;
    public static final DecimalFormat BR_NUM;

    static {
        BR_SYM = new DecimalFormatSymbols(new Locale("pt", "BR"));
        BR_SYM.setDecimalSeparator(',');
        BR_SYM.setGroupingSeparator('.');
        BR_NUM = new DecimalFormat("#,##0.00", BR_SYM);
    }
}
