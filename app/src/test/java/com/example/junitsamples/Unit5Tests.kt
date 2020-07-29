package com.example.junitsamples

import android.util.Log
import android.view.textservice.TextInfo
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class ExampleUnitTest {



    @Test
    fun `Given isValid() is true and listener null and user is logged out, When button is clicked, Then activity is launched and listener not called`(){  }


    @Test
    @DisplayName("Given contacts are loaded but the ID is invalid, When we find a contact, Then no contact is returned.")
    fun findContact_givenExistingId(){}


    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeat!")
    fun repeatedTest(testInfo :TestInfo ,repetitionInfo: RepetitionInfo ) { // ...
        assertEquals("Repeat! ${repetitionInfo.currentRepetition}/" +
                "${repetitionInfo.totalRepetitions}", testInfo.getDisplayName());
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    )
    fun add(first: Int, second: Int, expectedResult: Int) {
       Assertions.assertEquals(expectedResult, first.plus(second))
   }

    @TestFactory
    fun testDynamicAdd() = listOf(
        1 to 2,
        2 to 4,
        3 to 6,
        4 to 8,
        5 to 10,
        6 to 12,
        7 to 14,
        8 to 16
    )
        .map { (input, expected) ->
            DynamicTest.dynamicTest("when I calculate $input + $input then I get $expected") {
                Assertions.assertEquals(expected, input.plus(input))
            }
        }
}
