package com.arasakumar.lakshmanan.model.identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sequence_id")
public class SequenceIdEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	
	public String field;
	
}
