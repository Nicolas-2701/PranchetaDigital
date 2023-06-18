package com.Bolinhas.Prancheta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bolinhas.Prancheta.repository.CarroRepository;

@Service
public class CarroService {
	@Autowired
	private CarroRepository carroRepository;
}
