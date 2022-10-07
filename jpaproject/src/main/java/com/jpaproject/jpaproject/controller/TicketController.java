package com.jpaproject.jpaproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpaproject.jpaproject.dao.TicketDao;
import com.jpaproject.jpaproject.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao dao;
	@PostMapping("/bookTickets")
public String bookTicket(List<Ticket> tickets) {
      dao.save(tickets);
	return"ticket book: " +tickets.size();
}
	@GetMapping("/getTickets")
	public List<Ticket> getTickets (){
		return (List<Ticket>) dao.findAll();
	}
}
