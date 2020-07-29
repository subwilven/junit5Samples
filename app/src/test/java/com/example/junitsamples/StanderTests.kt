package com.example.junitsamples

import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.*

class StanderTests {

    @BeforeAll
    fun initAll() {
    }

    @AfterAll
    fun tearDownAll() {
    }


    @BeforeEach
    fun init() {
    }

    @AfterEach
    fun tearDown() {

    }

    @Test
    fun addition() {
        val firstNum = 1
        val secondNum = 2
        Assert.assertEquals(3, firstNum.plus(secondNum))
//      assertArrayEquals compares the contents of an actual array to an expected array.
//      assertEquals compares an actual value to an expected value.
//      assertNotEquals compares two values to validate that they are not equal.
//      assertTrue validates that the provided value is true.
//      assertFalse validates that the provided value is false.
//      assertLinesMatch compares two lists of Strings.
//      assertNull validates that the provided value is null.
//      assertNotNull validates that the provided value is not null.
//      assertSame validates that two values reference the same object.
//      assertNotSame validates that two values do not reference the same object.
//      assertThrows validates that the execution of a method throws an expected exception
    }

    @Test
    fun succeedingTest() {
    }

    @Test
    fun failingTest() {

        // Assert.fail("a failing test")
    }

    @Test
    @Disabled("for demonstration purposes")
    fun skippedTest() { // not executed
        Assert.fail("a failing test")
    }



}