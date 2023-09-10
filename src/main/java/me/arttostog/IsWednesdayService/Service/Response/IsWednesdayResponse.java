package me.arttostog.IsWednesdayService.Service.Response;

import com.google.gson.Gson;

import java.util.Date;

public class IsWednesdayResponse {
	public final boolean IsWednesday;

	public IsWednesdayResponse() {
		IsWednesday = isWednesday();
	}

	public String createResponse() {
		return new Gson().toJson(this);
	}

	private boolean isWednesday() {
		return new Date().toString().split(" ")[0].equalsIgnoreCase("Wed");
	}
}
