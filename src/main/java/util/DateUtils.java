package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static LocalDate getLocaldate() {
        return LocalDate.now(ZoneId.of("America/Sao_Paulo"));
    }

    public static LocalDateTime getLocalDateTime() {
        return LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    public static String convertLocalDateToString_yyyy_MM_dd(LocalDate localDate) {
        if (localDate == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return localDate.format(formatter);
    }

    public static String convertLocalDateTimeToString_yyyy_MM_dd(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return localDateTime.format(formatter);
    }

    public static String convertLocalDateTimeToString() {
        LocalDateTime now = getLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy_MM_dd_hh_mm_ss");
        return now.format(formatter);
    }

    public static String convertLocalDateTimeToString_dd_MM_yyyy_hh_mm_ss(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return localDateTime.format(formatter);
    }

    public static LocalDate convertStringToLocalDate_yyyy_MM_dd_T_HH_mm_ssX(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX");
        return LocalDate.parse(date, formatter);
    }
}
