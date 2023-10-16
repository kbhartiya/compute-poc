package com.poc.picomp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionEvent {
	private int id;
	private String email;
	private String phone;
	private boolean isReturn;
	@Override
	public String toString() {
		return "{\"id\":\""+ id +"\", \"email\":\"" + email + "\", \"phone\":\"" + phone + "\", \"isReturn\":\"" + isReturn + "\"}";
	}
	
	

}
