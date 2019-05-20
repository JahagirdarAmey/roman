package com;

import java.util.Arrays;
import java.util.List;

/**
 * Created by USER on 18/05/2019.
 */
class RomanNumberConverter {

    private List<String> tenthPlaces = Arrays.asList("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "LC", "C", "CX", "CXX", "CXXX", "CXL",
        "CL", "CLX", "CLXX", "CLXXX", "CXC", "CC");

    String getRomanNumber(int digit) {

        int reminder = digit % 10;
        int result = digit / 10;


        switch (reminder) {
            case 0:
                return getInsertedString(result, "");
            case 1:
            case 2:
            case 3:
                return IAppender(this.tenthPlaces.get(result), reminder);
            case 4:
                return getInsertedString(result, "IV");
            case 5:
            case 6:
            case 7:
            case 8:
                return IAppender(getInsertedString(result, "V"), reminder - 5);
            case 9:
                return getInsertedString(result, "IX");
        }
        return "";
    }

    private String getInsertedString(int result, String reminderPlace) {
        return new StringBuilder(reminderPlace).insert(0, this.tenthPlaces.get(result)).toString();
    }

    private String IAppender(String initialString, int digit) {
        StringBuilder result = new StringBuilder(initialString);

        for (int i = 0; i < digit; i++) {
            result.append("I");
        }

        return result.toString();
    }
}
