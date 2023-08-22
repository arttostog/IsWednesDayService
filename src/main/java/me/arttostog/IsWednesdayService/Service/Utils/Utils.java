package me.arttostog.IsWednesdayService.Service.Utils;

import com.google.gson.Gson;
import me.arttostog.IsWednesdayService.Service.API.IsWednesdayResponse;

import java.util.Date;

public class Utils {
	private static final Gson gson = new Gson();

	public static boolean IsWednesday() {
		return new Date().toString().split(" ")[0].equalsIgnoreCase("Wed");
	}

	public static String CreateResponse() {
		return gson.toJson(new IsWednesdayResponse());
	}
}
