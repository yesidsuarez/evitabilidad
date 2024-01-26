package com.evitabilidad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evitabilidad.entity.CardioSafe;
import com.evitabilidad.repository.CardioSafeRepository;
import com.evitabilidad.service.CardioSafeService;

@Service
public class CardioSafeImpl implements CardioSafeService {

	@Autowired
	private CardioSafeRepository cardioSafeRepository;

	@Override
	public List<CardioSafe> searchCardioSafe() {
		
		List<CardioSafe> cardioSafe = (List<CardioSafe>) cardioSafeRepository.findAll();
		return cardioSafe;
	}
}
