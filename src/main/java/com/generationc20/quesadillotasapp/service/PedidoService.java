package com.generationc20.quesadillotasapp.service;

import java.util.List;

import com.generationc20.quesadillotasapp.model.Quesadillota;

public interface PedidoService {
	
	List<Quesadillota> getAll();
	void save(Quesadillota quesadillota);
	Quesadillota getById(Integer id);
	Quesadillota updateById(Integer id, Quesadillota quesadillota);
	void removeById(Integer id);
}
