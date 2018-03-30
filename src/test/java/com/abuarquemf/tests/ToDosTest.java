package com.abuarquemf.tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToDosTest {

    @Test
    public void shouldBeTrueForNumberLessThan15() {
        ToDos toDos = new ToDos();
        final int NUMBER = 15;
        assertTrue(toDos.situation(NUMBER) == 30);
    }

    @Test
    public void shouldBeFalsePassing15() {
        ToDos toDos = new ToDos();
        final int NUMBER = 15;
        assertFalse(toDos.situation(NUMBER) == 31);
    }

    @Test
    public void shouldBeTrueForANumberDiferentOf15() {
        ToDos toDos = new ToDos();
        assertTrue(toDos.situation(20) == 16);
    }

}