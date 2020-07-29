package com.example.junitsamples

import com.nhaarman.mockitokotlin2.*
import org.junit.Assert
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.never
import org.mockito.Mockito.verifyNoMoreInteractions
import java.util.*


class MockitoTests{
    @Mock
    var myDataBase : MyDatabase = mock()

    @BeforeEach
    fun setUp() {
        Mockito.reset(myDataBase)

    }

    @Test
    fun test(){
        whenever(myDataBase.getUsers()).thenReturn(listOf("Ahmed,Galal"))
        Assert.assertEquals(myDataBase.getUsers(),listOf("Ahmed,Galal"))
    }


    @Test
    fun testReturnValueDependentOnMethodParameter(){
        whenever(myDataBase.getUserById(1)).thenReturn("Ahmed")
        whenever(myDataBase.getUserById(2)).thenReturn("Galal")

        val user1 = myDataBase.getUserById(1)
        Assert.assertEquals("Ahmed",user1)


        val user2 = myDataBase.getUserById(2)
        Assert.assertEquals("Galal",user2)
    }

    @Test
    fun testReturnValueInDependentOnMethodParameter(){
        whenever(myDataBase.getUserById(anyInt())).thenReturn("Ahmed")


        val user2 = myDataBase.getUserById(200)
        Assert.assertEquals("Ahmed",user2)
    }

    @Test
    fun testReturnValueDependentOnMethodParameter2(){
        whenever(myDataBase.getIdByUser(isA())).thenReturn(102)

        val userId = myDataBase.getIdByUser(User("Ahmed"))
        Assert.assertEquals(102,userId)

    }

    @Test
    fun testLinkedListSpy() { // Lets mock a LinkedList
        val list: List<String> = LinkedList()
        val spy: List<String> = spy(list)
        // You have to use doReturn() for stubbing
       // whenever(spy[0]).thenReturn("foo")

        doReturn("foo").`when`(spy).get(0)
        assertEquals("foo", spy[0])
    }

    @Test
    fun testVerify() { // create and configure mock

        whenever(myDataBase.getUsers()).thenReturn(listOf())


        // was the method called twice?
//        verify(myDataBase, times(2)).getUsers()
        // other alternatives for verifiying the number of method calls for a method
        verify(myDataBase, never()).getUsers()
//        verify(myDataBase, atLeastOnce()).getUsers()
//        verify(myDataBase, atLeast(2)).getUsers()
//        verify(myDataBase, times(5)).getUsers()
//        verify(myDataBase, atMost(3)).getUsers()
        myDataBase.getUsers()

        verifyNoMoreInteractions(myDataBase)
    }
}