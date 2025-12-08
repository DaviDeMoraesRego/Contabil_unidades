package br.com.contabil.unidades.adapter;

import org.springframework.stereotype.Component;

import br.com.contabil.unidades.dto.ContabilUnidadesDto;
import br.com.contabil.unidades.entity.ContabilUnidadesEntity;

@Component
public class ContabilUnidadesAdapter {

	public ContabilUnidadesEntity adapterDtoToEntity (ContabilUnidadesDto dto, int id) {
		
		ContabilUnidadesEntity entity = new ContabilUnidadesEntity();
		
		entity.setId(id);
		entity.setTitulo(dto.getTitulo());
		entity.setDescricao(dto.getDescricao());
		entity.setCourseId(dto.getCourseId());
		entity.setOrdem(dto.getOrdem());
		
		return entity;
	}
	
	public ContabilUnidadesDto adapterEntitytoDto (ContabilUnidadesEntity entity) {
		
		ContabilUnidadesDto dto = new ContabilUnidadesDto();
		
		dto.setId(entity.getId());
		dto.setTitulo(entity.getTitulo());
		dto.setDescricao(entity.getDescricao());
		dto.setCourseId(entity.getCourseId());
		dto.setOrdem(entity.getOrdem());
		
		return dto;
	}
}
