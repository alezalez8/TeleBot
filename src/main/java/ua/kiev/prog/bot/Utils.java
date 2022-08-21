package ua.kiev.prog.bot;

import org.apache.commons.validator.EmailValidator;
import org.apache.commons.validator.routines.BigIntegerValidator;
import org.apache.commons.validator.routines.IntegerValidator;

public class Utils {
    private static final int AGE_MIN = 18;
    private static final int AGE_MAX = 100;

    public static boolean isValidEmailAddress(String email) {
        return EmailValidator.getInstance().isValid(email);
    }

    public static boolean isAgeMoreThanSixtinth(String age) {
        return IntegerValidator.getInstance().minValue(Integer.parseInt(age), AGE_MIN);
    }

    public static boolean isAgeLessThanOneHundred(String age) {
        return IntegerValidator.getInstance().maxValue(AGE_MAX, Integer.parseInt(age));
    }


    public static boolean isAgeValid(String age) {
        return IntegerValidator.getInstance().isValid(age);
    }

    public static boolean isPhoneValid(String phone) {
        return BigIntegerValidator.getInstance().isValid(phone);
    }


}
