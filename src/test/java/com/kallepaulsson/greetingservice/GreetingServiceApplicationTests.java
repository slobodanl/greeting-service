package com.kallepaulsson.greetingservice;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void dummyTest() {
        assertEquals(4, 4);
    }

}
