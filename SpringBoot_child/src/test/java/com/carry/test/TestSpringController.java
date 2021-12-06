package com.carry.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.carry.controller.SpringController;

import junit.framework.TestCase;

@SpringBootTest(classes=SpringController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestSpringController {
	@Autowired
	private SpringController springController;
	
	@Test
	public void test1() {
		TestCase.assertEquals(this.springController.yes(), "Hello");
	}
}
