package com.arasakumar.lakshmanan.model.identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "increment_id")
public class IncrementIdEntity {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;
	
	private String field;
}
