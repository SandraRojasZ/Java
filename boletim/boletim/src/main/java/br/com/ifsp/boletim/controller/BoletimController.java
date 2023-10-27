package br.com.ifsp.boletim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifsp.boletim.model.NotaModel;
import br.com.ifsp.boletim.repository.NotaRepository;

@RestController
@RequestMapping("boletim/api")
public class BoletimController {

	@Autowired
	private NotaRepository notaRepository;
	
	@GetMapping
	public List<NotaModel> findAllNotas() {
		return notaRepository.findAll();
	}

}
