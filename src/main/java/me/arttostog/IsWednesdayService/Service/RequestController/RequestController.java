package me.arttostog.IsWednesdayService.Service.RequestController;

import me.arttostog.IsWednesdayService.Service.Utils.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	@GetMapping(
		value = "/api/is_wednesday",
		produces = "application/json"
	)
	public String SendIsWednesday() {
		return Utils.CreateResponse();
	}
}