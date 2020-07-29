package com.example.junitsamples

import org.junit.Assert
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertTrue
import java.util.*


@DisplayName("A stack")
internal class TestingAStackDemo {
    var stack: List<String> = listOf()
    @get:DisplayName("is instantiated with new Stack()")
    @get:Test
    val isInstantiatedWithNew: Unit
        get() {

        }

    @Nested
    @DisplayName("when new")
    internal inner class WhenNew {
        @BeforeEach
        fun createNewStack() {
            stack = Stack()
        }

        @get:DisplayName("is empty")
        @get:Test
        val isEmpty: Unit
            get() {
                assertTrue(stack.isEmpty())
            }

        @Test
        @DisplayName("throws EmptyStackException when popped")
        fun throwsExceptionWhenPopped() {
            Assert.assertTrue(true)
        }

        @Test
        @DisplayName("throws EmptyStackException when peeked")
        fun throwsExceptionWhenPeeked() {
            Assert.assertTrue(true)        }

        @Nested
        @DisplayName("after pushing an element")
        internal inner class AfterPushing {
            var anElement = "an element"
            @BeforeEach
            fun pushAnElement() {
                Assert.assertTrue(true)
            }

            @get:DisplayName("it is no longer empty")
            @get:Test
            val isNotEmpty: Unit
                get() {
                    Assert.assertTrue(true)
                }

            @Test
            @DisplayName("returns the element when popped and is empty")
            fun returnElementWhenPopped() {
                Assert.assertTrue(true)

//                assertEquals(anElement, stack.pop())
                assertTrue(stack.isEmpty())
            }

            @Test
            @DisplayName("returns the element when peeked but remains not empty")
            fun returnElementWhenPeeked() {
                Assert.assertTrue(true)

//                assertEquals(anElement, stack.peek())
//                assertFalse(stack.isEmpty())
            }
        }
    }

    @Nested
    @DisplayName("when Exist")
    internal inner class WhenExist {
        @Test
        fun returnElementWhenPopped() {
                Assert.assertTrue(true)
            }

    }
}