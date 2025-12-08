package br.com.contabil.unidades.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.contabil.unidades.adapter.ContabilUnidadesAdapter;
import br.com.contabil.unidades.dto.ContabilUnidadesDto;
import br.com.contabil.unidades.entity.ContabilUnidadesEntity;
import br.com.contabil.unidades.exception.InternalServerError;
import br.com.contabil.unidades.exception.NotFoundException;
import br.com.contabil.unidades.repository.ContabilUnidadesRepository;

@Service
public class ContabilUnidadesService {

	@Autowired
	ContabilUnidadesRepository repository;
	
	@Autowired
	ContabilUnidadesAdapter adapter;
	
	public List<ContabilUnidadesDto> findAllByCourseId (int courseId) throws Exception{
		List<ContabilUnidadesDto> dtos = new ArrayList<>();
		
		try {
			List<ContabilUnidadesEntity> entities = repository.findAllByCourseId(courseId);
			notFoundChecker(entities.size());
			entities.forEach(entity -> dtos.add(adapter.adapterEntitytoDto(entity)));
		} catch (Exception e) {
			throw new InternalServerError(e.getMessage());
		}
		
		return dtos;
	}
	
	private static void notFoundChecker(int paramForCheck) throws NotFoundException {
		if (paramForCheck == 0) {
			throw new NotFoundException("Nenhum registro encontrado.");
		}
	}
}
