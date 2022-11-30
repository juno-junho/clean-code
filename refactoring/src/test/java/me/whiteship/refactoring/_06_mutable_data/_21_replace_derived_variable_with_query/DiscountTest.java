package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void discount() {
        Discount discount = new Discount(100);
//        계산이 setDiscount가 호출되었을 때만 값을 가져올 수 있음. (계산이 안되어 있기 때문)
        assertEquals(100, discount.getDiscountedTotal());

        discount.setDiscount(10);
        assertEquals(90, discount.getDiscountedTotal());
    }

}