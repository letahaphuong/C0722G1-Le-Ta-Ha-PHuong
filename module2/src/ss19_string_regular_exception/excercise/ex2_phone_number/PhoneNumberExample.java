package ss19_string_regular_exception.excercise.ex2_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONENUMBER_REGEX = "^[(]\\d{2}[)][-][(]0\\d{9}[)]$";

    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static class PhoneNumberExampleTest {
        private static PhoneNumberExample phoneNumberExample;
        private static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
        private static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)"};

        public static void main(String[] args) {
            phoneNumberExample = new PhoneNumberExample();
            for (String phoneNumber : validPhoneNumber) {
                boolean isValid = phoneNumberExample.validate(phoneNumber);
                System.out.println("Phone number is : " + phoneNumber + " is Valid : " + isValid);
            }
            for (String phongeNumber : invalidPhoneNumber) {
                boolean isValid = phoneNumberExample.validate(phongeNumber);
                System.out.println("Phone number is : " + phongeNumber + " is valid : " + isValid);
            }
        }
    }
}
