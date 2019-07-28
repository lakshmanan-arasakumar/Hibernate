package com.arasakumar.lakshmanan.model.identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "hilo_id")
public class HiloIdEntity {

	@Id
	@GeneratedValue(generator = "hilo")
	private Long id;
	
	private String field;
}
