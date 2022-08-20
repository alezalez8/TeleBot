package ua.kiev.prog.bot;

import org.apache.commons.validator.EmailValidator;
import org.apache.commons.validator.routines.IntegerValidator;

public class Utils {
    private static final int AGE_MIN = 18;

    public static boolean isValidEmailAddress(String email) {
        return EmailValidator.getInstance().isValid(email);
    }

    public static boolean isAgeMoreThanSixtinth(String age) {
        return IntegerValidator.getInstance().minValue(Integer.parseInt(age), AGE_MIN);
    }

    public static boolean isAgeValid(String age) {
        return IntegerValidator.getInstance().isValid(age);
    }


}
