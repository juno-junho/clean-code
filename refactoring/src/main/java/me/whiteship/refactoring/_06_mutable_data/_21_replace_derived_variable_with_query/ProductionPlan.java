package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private double production; // adjustments의 합계를 구하는 것
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
//        this.production += adjustment;
    }

    public double getProduction() {
        //        return adjustments.stream().mapToDouble(Double::valueOf).sum();
        return adjustments.stream().reduce((double) 0, Double::sum);
//        return this.production;
    }

    // query 헷갈림.
    // 어떨때는 조회하는 메서드를 말하기도 하고, 어떤 값을 return 하는 메서드를 말하기도함.
    private double calculatedProduction() {
        return adjustments.stream().reduce((double) 0, Double::sum);
//        return adjustments.stream().mapToDouble(Double::valueOf).sum();
    }
}
