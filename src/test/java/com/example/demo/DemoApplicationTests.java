package com.example.demo;

import com.example.controller.UserController;
import com.example.pojo.User;
import com.sun.corba.se.spi.logging.LogWrapperBase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
class DemoApplicationTests {
	@Test
	void contextLoads() {
		int num = new Integer(1);
		Assert.assertEquals(num,1);
	}

	@Test
	void testPutUser(){

	}

}
