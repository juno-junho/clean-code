package me.whiteship.refactoring._04_long_parameter_list._14_replace_parameter_with_query;

// 질의 함수 : 연산을 통해 계산하여 반환하는 함수
public class Order {

    private int quantity;

    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        double basePrice = this.quantity * this.itemPrice;
        return this.discountedPrice(basePrice);
    }

    private int discountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    //discountLevel 계산하는 것이 함수 자체의 책임이 됨.
    // 전달해야할 parameter 하나로 줌.
    private double discountedPrice(double basePrice) {
        return discountLevel() == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }
}
