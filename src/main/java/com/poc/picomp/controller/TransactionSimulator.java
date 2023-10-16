package com.poc.picomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.picomp.messaging.PubSubHandler.PubsubOutboundGateway;
import com.poc.picomp.model.TransactionEvent;

@RestController
@RequestMapping("/transaction")
public class TransactionSimulator {
	
	@Autowired
	private PubsubOutboundGateway messageGateway;
	
	@RequestMapping("/execute")
	public String executeTransaction(@RequestBody TransactionEvent event) {
		// write to pubsub
		messageGateway.sendToPubsub(event.toString());
		return "Transaction Successful";
	}
}
