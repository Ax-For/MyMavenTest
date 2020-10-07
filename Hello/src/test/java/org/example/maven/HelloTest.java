package org.example.maven;

import org.junit.Test;

public class HelloTest
{
    @Test
    public void TestHello()
    {
        Hello hello = new Hello();
        String mavenTest = hello.sayHello("Maven");
        System.out.println(mavenTest);
    }
}
