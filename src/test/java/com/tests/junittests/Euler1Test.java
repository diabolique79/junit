package com.tests.junittests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class Euler1Test {

    //given
    Euler1 euler1 = new Euler1();
    int result;

    @Test
    public void shouldReturn23For10() {


        result = euler1.calc(10);
        //then
        assertThat(result, CoreMatchers.is(23));
    }

    @Test
    public void shouldReturn2318For10() {

        //when
        result = euler1.calc(100);
        //then
        assertThat(result, CoreMatchers.is(2318));
    }

    @Test
    public void shouldReturn233168For10() {

        result = euler1.calc(1000);

        assertThat(result, CoreMatchers.is(233168));

    }
}
