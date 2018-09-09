package com.tests.junittests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class Euler2Test {

    Euler2 euler2 = new Euler2();
    int result;

    @Test
    public void shouldReturn0For0() {

        result = euler2.fibonacci(0);
        assertThat(result, CoreMatchers.is(0));
    }

    @Test
    public void shouldReturn3382For5300() {

        result = euler2.fibonacci(5300);
        assertThat(result, CoreMatchers.is(3382));
    }

    @Test
    public void shouldReturn4613732For4000000() {

        result = euler2.fibonacci(4000000);
        assertThat(result, CoreMatchers.is(4613732));
    }

}
