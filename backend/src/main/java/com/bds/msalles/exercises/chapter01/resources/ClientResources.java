package com.bds.msalles.exercises.chapter01.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bds.msalles.exercises.chapter01.entities.Client;
import com.bds.msalles.exercises.chapter01.services.ClientService;

@RestController
@RequestMapping(value="/clients")
public class ClientResources {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> clients = service.findAll();
		
		return ResponseEntity.ok().body(clients);
	}
}

