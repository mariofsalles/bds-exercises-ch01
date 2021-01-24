package com.bds.msalles.exercises.chapter01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bds.msalles.exercises.chapter01.entities.Client;
import com.bds.msalles.exercises.chapter01.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}
	
}
