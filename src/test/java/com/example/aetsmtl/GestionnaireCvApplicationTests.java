package com.example.aetsmtl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJpaTest
public class GestionnaireCvApplicationTests {

	private Cv cvDavid;
	private Cv cvKevin;
	
	@Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CvRepository cvs;
    
    @Before
    public void setup ()
    {
    	cvDavid = new Cv("David", "Developer");
        cvKevin = new Cv("Kevin", "Production Eng");
        entityManager.persist(cvDavid);
        entityManager.persist(cvKevin);
    }
    
    
    @Test
    public void testFindByLastName() 
    {
        List<Cv> findByName = cvs.findByName(cvDavid.getName());
        assertThat(findByName).extracting(Cv::getName).containsOnly(cvDavid.getName());
    }
    
    @Test
    public void testCountElementIntoDB() 
    {
    	assertEquals(4, cvs.count());      
    }
    
    @Test
	public void contextLoads() {
    	
	}

}
