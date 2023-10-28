package br.com.ifsp.boletim.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
@Entity(name = "nota")
public class NotaModel {
	
	public Long getIdNota() {
		return idNota;
	}

	public void setIdNota(Long idNota) {
		this.idNota = idNota;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idNota;
	
	@NotEmpty(message = "Matéria não pode estar vazia.")
	private String materia;
	
    @Min(value = 0, message="Nota deve ser maior ou igual 0.")
    @Max(value = 10, message="Nota deve ser menor ou igual 10.")
    @NotNull(message = "Nota não pode estar vazia.")
	private int nota;

	

}
