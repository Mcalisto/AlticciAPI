package org.acme;

public class CalculatorSimple {

    public double sum(double A, double B){
        double result = A+B;
        return result;
    }
    public double multiply (double A, double B){
        double result = A*B;
        return result;
    }

    public double split (double A, double B){
        if(B > 0) {
            double result = A / B;
            return result;
        }else{
            System.out.println("O valor do divisor não pode ser 0");
            return 0;
        }
    }

    public double subtract(double A, double B){
        double result = A - B;
        return result;
    }

    public double potency(double A, double B){
        double result = Math.pow(A,B);
        return result;
    }

}
