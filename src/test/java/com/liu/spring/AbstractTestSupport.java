package com.liu.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author Somnus
 * @version 1.0
 * @Description 后台单元测试基类
 * @date 2012-11-19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-basic.xml")
public abstract class AbstractTestSupport {

    @Rule
    public TestName name = new TestName();

    @Before
    public void setUp() {
        System.out.println("调用测试方法:" + name.getMethodName());
    }

    @After
    public void tearDown() {
    }
}