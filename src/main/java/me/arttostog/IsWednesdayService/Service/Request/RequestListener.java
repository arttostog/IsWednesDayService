package me.arttostog.IsWednesdayService.Service.Request;

import me.arttostog.IsWednesdayService.Service.Response.IsWednesdayResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestListener {
	@RequestMapping(
		value = "/api/is_wednesday",
		produces = "application/json"
	)
	public String SendIsWednesday() {
		return new IsWednesdayResponse().createResponse();
	}
}