package br.com.contabil.unidades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.contabil.unidades.dto.ContabilUnidadesDto;
import br.com.contabil.unidades.dto.ResponseDto;
import br.com.contabil.unidades.service.ContabilUnidadesService;

@Validated
@RestController
@RequestMapping("/contabil-unidades/v1")
public class ContabilUnidadesController {

	@Autowired
	ContabilUnidadesService service;
	
	@GetMapping("/{courseId}/")
	public ResponseEntity<ResponseDto<List<ContabilUnidadesDto>>> findAllByCourseId (@PathVariable("courseId")int courseId) throws Exception{
		return ResponseEntity
			.ok(new ResponseDto<List<ContabilUnidadesDto>>(service.findAllByCourseId(courseId), null));
	}
}
