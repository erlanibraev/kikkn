package kik.KN.service.impl;

/**
 * Создал Ибраев Ерлан 06.01.17.
 */
public class ValidateNumber {

    public static Double getDouble(String s) {
        Double result = null;
        if(isNumber(s)) {
            result = Double.parseDouble(s);
        }
        return result;
    }

    public static Integer getInteger(String s) {
        Integer result = null;
        if(isNumber(s)) {
            result = Double.valueOf(s).intValue();
        }
        return result;
    }

    public static Long getLong(String s) {
        Long result = null;
        if(isNumber(s)) {
            result = Double.valueOf(s).longValue();
        }
        return result;
    }

    public static boolean isNumber(String s) {
        return s.matches("\\d*\\.?\\d+");
    }
}
