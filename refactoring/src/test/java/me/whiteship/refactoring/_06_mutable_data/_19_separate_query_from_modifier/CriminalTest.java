package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CriminalTest {

    @Test
    void alertForMiscreant() {
        Criminal criminal = new Criminal();
        String found = criminal.findMiscreant(List.of(new Person("Keesun"), new Person("D0on")));
        assertEquals("Don", found);

        found = criminal.findMiscreant(List.of(new Person("John"), new Person("Don")));
        assertEquals("John", found);

        // modifier와 query가 섞여 있으면 test하기 어렵다. 어디서 set off alarm이 울렸는지 모름
        found = criminal.findMiscreant(List.of(new Person("Junho"), new Person("Hwang")));
        assertEquals("", found);
    }

}