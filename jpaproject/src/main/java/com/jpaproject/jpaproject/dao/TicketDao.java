package com.jpaproject.jpaproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpaproject.jpaproject.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

	void save(List<Ticket> tickets);

}
