package br.com.contabil.unidades.dto;

import java.io.Serializable;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContabilUnidadesDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Min(message = "Id inválido.", value = 1)
	private int id;
	
	@NotBlank(message = "Insira um título válido.")
	private String titulo;
	
	@NotBlank(message = "Insira uma descrição válida.")
	private String descricao;
	
	@Min(message = "Id do curso inválido.", value = 1)
	private int courseId;
	
	@Min(message = "Ordem inválida.", value = 1)
	private int ordem;
}
