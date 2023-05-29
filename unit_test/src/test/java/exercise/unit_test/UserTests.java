package exercise.unit_test;


import com.fasterxml.jackson.databind.ObjectMapper;
import exercise.unit_test.Controller.UserController;
import exercise.unit_test.Entity.User;
import exercise.unit_test.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class UserTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		assertThat(userService).isNotNull();
	}




	@Test
	public void TestUser() throws Exception {
		User user = new User();
		user.setId(1);
		user.setFirstName("Gabri");
		user.setLastName("Casti");

		//save
		this.mockMvc.perform(post("/users/save")
						.contentType("application/json")
						.content(objectMapper.writeValueAsString(user)))
				.andDo(print())
				.andExpect(status().isOk());


		//getOne
		this.mockMvc.perform(get("/users/findId/1")
						.contentType("application/json")
						.content(objectMapper.writeValueAsString(user)))
				.andDo(print())
				.andExpect(status().isOk());

		//update
		User user2 = new User();
		user.setId(1);
		user.setFirstName("luigi");
		user.setLastName("Casti");


		this.mockMvc.perform(put("/users/update/1")
						.contentType("application/json")
						.content(objectMapper.writeValueAsString(user2)))
				.andDo(print())
				.andExpect(status().isOk());

		//delete
		this.mockMvc.perform(delete("/users/delete/1")
						.contentType("application/json")
						.content(objectMapper.writeValueAsString(user2)))
				.andDo(print())
				.andExpect(status().isOk());

	}


}
