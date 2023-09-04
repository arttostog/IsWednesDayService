package me.arttostog.IsWednesdayService.Service.Response;

import me.arttostog.IsWednesdayService.Service.Utils.Utils;

public class IsWednesdayResponse {
	public boolean IsWednesday;

	public IsWednesdayResponse() {
		this.IsWednesday = Utils.IsWednesday();
	}
}
