package com.Bolinhas.Prancheta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bolinhas.Prancheta.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
	Carro findById(long id);
}
