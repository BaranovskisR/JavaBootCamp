package sef.FinalActivity.SecondActivity;

public class CalculatorClient {
    public static void main(String[] args) {

        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");

        int result = normalCalc.add(25, 30);
        System.out.println("1) Add result is " + result);

        int[] mul = {2, 3, 4};
        result = normalCalc.multiply(mul);
        System.out.println("2) Multiplication result is " + result);

        result = normalCalc.divide(100 , 5);
        System.out.println("3) Divide result is " + result);

        result = normalCalc.subtract(10 , 5);
        System.out.println("4) Subtract result is " + result);
    }
}
