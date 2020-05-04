package com.generationc20.quesadillotasapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationc20.quesadillotasapp.model.Quesadillota;

@Repository
public interface PedidoRepository extends JpaRepository<Quesadillota, Integer>{
	
}