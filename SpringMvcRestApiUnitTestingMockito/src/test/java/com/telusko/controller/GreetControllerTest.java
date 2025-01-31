package com.telusko.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Tourist;
import com.telusko.service.IGreetingService;

@WebMvcTest(GreetController.class)
public class GreetControllerTest {

	@MockBean
	IGreetingService service;

	@Autowired
	MockMvc mockMvc;

	@Test
	@Disabled
	public void testGenerateGreet() throws Exception{
		//Mocking
		Mockito.when(service.greet()).thenReturn("Good Morning");

		//RequestObject
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/greet");
		ResultActions resultActions = mockMvc.perform(requestBuilder);
		MvcResult result = resultActions.andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();

		//Unit Testing
		assertEquals(200, status);
	}

	@Test
	public void testregisterTourist() throws Exception{

		//Mocking
		Mockito.when(service.acceptTourist(ArgumentMatchers.any())).thenReturn(true);

		Tourist tourist=new Tourist(101, "pawan", "Belagavi", "platinum", 20000.0);
		ObjectMapper mapper=new ObjectMapper();
		String json = mapper.writeValueAsString(tourist);
		
		MockHttpServletRequestBuilder requestBuilder = 
				MockMvcRequestBuilders.post("/api/registerTourist")
				.contentType(MediaType.APPLICATION_JSON)
				.content(json);
		ResultActions resultActions = mockMvc.perform(requestBuilder);
		MvcResult result = resultActions.andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		
		//Unit Testing
		assertEquals(201, status);
	}
}
