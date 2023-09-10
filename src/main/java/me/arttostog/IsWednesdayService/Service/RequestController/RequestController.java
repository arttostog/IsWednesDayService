package me.arttostog.IsWednesdayService.Service.RequestController;

import me.arttostog.IsWednesdayService.Service.Response.IsWednesdayResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	@RequestMapping(
		value = "/api/is_wednesday",
		produces = "application/json"
	)
	public String SendIsWednesday() {
		return new IsWednesdayResponse().createResponse();
	}
}