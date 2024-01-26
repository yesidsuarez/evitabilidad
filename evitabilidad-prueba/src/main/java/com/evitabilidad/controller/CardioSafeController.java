package com.evitabilidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evitabilidad.entity.CardioSafe;
import com.evitabilidad.service.CardioSafeService;

@RestController
@RequestMapping("/api/cardio")
public class CardioSafeController {

	@Autowired
	private CardioSafeService cardioSafeService;
	
	@GetMapping
	public List<CardioSafe> getCardioSafe(){ 
		
		return cardioSafeService.searchCardioSafe();
	}
}