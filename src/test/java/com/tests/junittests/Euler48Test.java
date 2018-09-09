package com.tests.junittests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertThat;

public class Euler48Test {

    Euler48 euler48 = new Euler48();
    BigInteger result = BigInteger.ZERO;

    @Test
    public void shouldReturn3413For5() {

        result = euler48.power(5);
        assertThat(result, CoreMatchers.is(3413));
    }
}
