package com.work.springboot.model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;


class MathUtilTest {
    MathUtil mathUtil ;

    @BeforeAll
   static void beforeInitialization(){
        System.out.println("it must work on before initialized anything");
    }

    @BeforeEach
    void init(){
       mathUtil = new MathUtil();
    }

    @AfterEach
    void cleanUp(){
        System.out.println("cleaning up.......!");
    }
    @Nested
    class TestAdd{
    @Test
    @DisplayName("test method for add +")
    void testPositiveAddition(){
        assertEquals(2,mathUtil.add(1,1),"the add method should add two positive numbers");
    }
    @Test
    @DisplayName("test method for add -")
    void testNegativeAddition(){
        assertEquals(-2,mathUtil.add(-1,-1),"the add method should add two negative numbers");
    }
    }
/*    @Test
    void testAdd() {
        int expected = 13;
        int actual = mathUtil.add(7,6);
        assertEquals(expected,actual,"the add method should add two numbers");
    }*/

    @Test
    @DisplayName("test method for multiplication")
    void testMultiply(){
       // assertEquals(4,mathUtil.multiply(2,2),"should return the product of digits");
   assertAll(
           () -> assertEquals(4,mathUtil.multiply(2,2)),
           () -> assertEquals(0,mathUtil.multiply(2,0)),
           () -> assertEquals(2,mathUtil.multiply(1,2)),
           () -> assertEquals(-2,mathUtil.multiply(2,-1))
   );

    }

    @Test
    @DisplayName("test method for division")
    void testDivide(){
        assertThrows(ArithmeticException.class,() -> mathUtil.divide(1,0),"Divide by Zero should thrown");
    }

    @RepeatedTest(5)
    void testComputeCircleArea(RepetitionInfo repetitionInfo){
        assertEquals(314.1592653589793 ,mathUtil.computeCircleArea(10),"should return circle area accurately");
    }

    @Test
    @DisplayName("the method TDD ... should be skipped")
    @Disabled
    void testDisabled(){
        fail("this method should be failed");
    }



}