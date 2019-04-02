package com.kallepaulsson.greetingservice;

import org.junit.Assert;
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
    public void mockTest() {
        Assert.assertEquals(4, 4);
    }

}
