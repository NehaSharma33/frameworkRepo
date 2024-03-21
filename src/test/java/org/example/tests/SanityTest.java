package org.example.tests;

import org.example.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SanityTest {


    public void sanityTest1(String test1,String test2) {
        System.out.println("Sanity test case1");
        System.out.println("TestData from data provider" +test1+ "and"+test2);
    }

    @Test
    public void sanityTest2() {
        System.out.println("Sanity test case2");
    }


}
