package me.whiteship.refactoring._06_mutable_data._18_split_variable;

public class Order {

    public double discount(double inputValue, int quantity) {
        double result = inputValue;
//        if (inputValue > 50) inputValue = inputValue - 2;
        if (inputValue > 50) return result -= 2;
//        if (quantity > 100) inputValue = inputValue - 1;
        if (quantity > 100) return result -= 1;
        //입력 값이 return 값으로 재사용됨.
//        return inputValue;
        return result;
    }

}
