package me.arttostog.IsWednesdayService.Service.Response;

import com.google.gson.Gson;

import java.util.Date;

public class IsWednesdayResponse {
	private static final Gson gson = new Gson();
	public final boolean IS_WEDNESDAY;

	public IsWednesdayResponse() {
		IS_WEDNESDAY = new Date().toString().contains("Wed");
	}

	public String createResponse() {
		return gson.toJson(this);
	}
}
