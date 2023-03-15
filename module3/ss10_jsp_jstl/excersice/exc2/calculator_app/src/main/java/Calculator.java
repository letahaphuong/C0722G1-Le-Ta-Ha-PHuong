public class Calculator {
    private float firstOperand;
    private float secondOperand;
    private String match;

    public Calculator() {
    }

    public Calculator(float firstOperand, float secondOperand, String match) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.match = match;
    }

    public float getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(float firstOperand) {
        this.firstOperand = firstOperand;
    }

    public float getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(float secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }
}
