package com.example.velocities.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.velocities.entity.Velocity;
import com.example.velocities.repository.VelocityRepository;




/**
 * @author Dr. Friedrich-Karl Koschnick, Quality Management, Sybit GmbH
 */
@RunWith(SpringRunner.class)
@WebMvcTest(VelocityController.class)
@AutoConfigureMockMvc
public class VelocityControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	VelocityRepository velocityRepository;
	
	@Mock
	List<Velocity> velocities;
	
	@Before
	public void initializeData(){
		Velocity v1 = new Velocity();
		v1.setAnimal("Affe");
		v1.setVelocity("10");
		Velocity v2 = new Velocity();
		v2.setAnimal("Mensch");
		v2.setVelocity("20");
		velocities.add(v1);
		velocities.add(v2);
	}
	
	
	@Test
	public void testVelocity() throws Exception {
		when(velocityRepository.findAll()).thenReturn(velocities);
		
		mvc.perform(MockMvcRequestBuilders.get("/velocities"))
		.andExpect(status().isOk())
        .andExpect(jsonPath("$[1].animal").value("Mensch"));
	}
	

}