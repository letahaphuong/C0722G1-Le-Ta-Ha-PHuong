package ss19_string_regular_exception.excercise.ex1_validate_name_of_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASSNAME_REGEX = "^[CAP]{1}\\d{4}[GHIKLM]$";

    public ClassNameExample() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static class ClassNameExampleTest {
        private static ClassNameExample classNameExample;
        public static final String[] validClassName = new String[]{"C0318G"};
        public static final String[] inValidClassName = new String[]{"M0318G", "P0323A"};

        public static void main(String[] args) {
            classNameExample = new ClassNameExample();
            for (String name : validClassName) {
                boolean isValid = classNameExample.validate(name);
                System.out.println("Class name is : " + name + " is valid : " + isValid);
            }
            for (String name : inValidClassName) {
                boolean isValid = classNameExample.validate(name);
                System.out.println("Class name is : " + name + " is valid : " + isValid);
            }
        }
    }
}
