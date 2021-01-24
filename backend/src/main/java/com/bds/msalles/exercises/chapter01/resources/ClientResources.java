package com.bds.msalles.exercises.chapter01.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bds.msalles.exercises.chapter01.entities.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResources {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> clients = new ArrayList<>();
		clients.add(new Client(1L, "Mario Salles","514.714.236-38", 10000.00, Date.from(Instant.parse("1979-09-03T06:00:00Z")).toInstant(), 2));
		clients.add(new Client(2L, "Thalita Silva","452.162.866-40", 10000.00, Date.from(Instant.parse("1980-09-09T06:00:00Z")).toInstant(), 2));
		clients.add(new Client(3L, "Gustavo Salles","596.424.326-68", 10000.00, Date.from(Instant.parse("1978-05-31T06:00:00Z")).toInstant(), 0));
		return ResponseEntity.ok().body(clients);
	}
}

