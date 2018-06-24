package com.coco.trybamboo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.fail;

import org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrybambooApplicationTests {

	@Test
	public void contextLoads() {

		System.out.println("HH-4:unit test3");
		System.out.println("HH-4:finished to junit test,can able to pull request");
	}

}
