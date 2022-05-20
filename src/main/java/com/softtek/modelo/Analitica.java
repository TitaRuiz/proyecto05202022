package com.softtek.modelo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "analiticas")
public class Analitica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAnalitica;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	@Column(name = "descripcion", nullable = true, length = 150)
	private String descripcion;

	

	public Integer getIdAnalitica() {
		return idAnalitica;
	}

	public void setIdAnalitica(Integer idAnalitica) {
		this.idAnalitica = idAnalitica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAnalitica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Analitica other = (Analitica) obj;
		return Objects.equals(idAnalitica, other.idAnalitica);
	}


	
	

}
