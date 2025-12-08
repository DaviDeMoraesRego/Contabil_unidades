package br.com.contabil.unidades.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "tab_unidades", schema = "contabil")
public class ContabilUnidadesEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="titulo", unique= true, nullable = false)
	private String titulo;
	
	@Column(name="descricao", unique= true, nullable = false)
	private String descricao;
	
	@Column(name = "course_id", nullable = true)
	private int courseId;
	
	@Column(name = "ordem", nullable = true)
	private int ordem;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "dthr_create", nullable = false)
	private Date dthr_create;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "dthr_update", nullable = false)
	private Date dthr_update;
	
	@PrePersist
	public void prePersist() {
		Date date = new Date();
		this.dthr_create = date;
		this.dthr_update = date;
	}
	
	@PreUpdate
	public void preupdate() {
		this.dthr_update = new Date();
	}
}
