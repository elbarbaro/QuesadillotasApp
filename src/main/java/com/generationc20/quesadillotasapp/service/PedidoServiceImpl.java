package com.generationc20.quesadillotasapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.quesadillotasapp.dao.PedidoRepository;
import com.generationc20.quesadillotasapp.model.Quesadillota;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	@Override
	public List<Quesadillota> getAll() {
		return repository.findAll();
	}
	
	@Override
	public void save(Quesadillota quesadillota) {
		repository.save(quesadillota);
	}
	
	@Override
	public Quesadillota getById(Integer id) {
		return repository.findById(id).get();
	}
	
	@Override
	public Quesadillota updateById(Integer id, Quesadillota quesadillota) {
		return null;
	}
	
	@Override
	public void removeById(Integer id) {
		repository.deleteById(id);
	}
}
