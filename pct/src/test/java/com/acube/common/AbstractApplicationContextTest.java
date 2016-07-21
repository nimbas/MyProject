package com.acube.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:/root-context.xml", 
        "classpath:/servlet-context.xml", 
        "classpath:/spring-security.xml"
            })
@ActiveProfiles("test") /*프로파일을 test로 선택*/
public class AbstractApplicationContextTest {
    @Autowired ApplicationContext ctx;
    
    @Test
    public void voidTest(){
    	
    }
}

