package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

public class Discount {

    // derived variable
    // 기존의 discount, baseTotal 두 데이터로 부터 파생된 변수
//    private double discountedTotal;
    private double discount;

    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }

    public double getDiscountedTotal() {
//        assert this.discountedTotal == this.baseTotal - this.discount; //검증 절차
//        return this.discountedTotal;
        return this.baseTotal - this.discount;
    }

    public void setDiscount(double number) {
        this.discount = number;
//        this.discountedTotal = this.baseTotal - this.discount;
    }
}
