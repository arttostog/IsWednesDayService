package me.arttostog.IsWednesdayService.Service.RequestController;

import me.arttostog.IsWednesdayService.Service.Utils.Utils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class RequestControllerTests {
	@Autowired
	private MockMvc mvc;

	@Test
	public void CheckAPI() throws Exception {
		MvcResult IsWednesdayResult = mvc.perform(get("/api/is_wednesday"))
				.andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andReturn();

		if (!IsWednesdayResult.getResponse().getContentAsString().equals(Utils.CreateResponse())) throw new Exception("Response error!");
	}
}
