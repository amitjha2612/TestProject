package com.springboot.web.loyaltyhomework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.awt.PageAttributes.MediaType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.web.loyaltyhomework.Messageservice.UserMessageService;

import com.springboot.web.loyaltyhomework.models.User;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LoyaltyHomeworkApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserMessageService messageService;
	
	
	@Test
	public void testInput() throws Exception
	{
		User inputText = new User();
		inputText.setName(("Hello World 123"));
		//inputText.setId(1);
				
		String inputinJson= this.mapToJson(inputText);
				
		String URI = "/savedetails";
		//Mockito.when(messageService.saveOrUpdate((Mockito.any(User.class))).thenReturn(inputText);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post(URI)
				.accept(org.springframework.http.MediaType.APPLICATION_JSON).content(inputinJson)
				.contentType(org.springframework.http.MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String outputJSON = response.getContentAsString();
		
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		JSONAssert.assertEquals(outputJSON, inputinJson, false);
		
		
	}
	
	private String mapToJson(Object object) throws JsonProcessingException{
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}
}
