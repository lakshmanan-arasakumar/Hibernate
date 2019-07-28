package com.arasakumar.lakshmanan.model.identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "uuid_id")
public class UUIDIdEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	private String id;
	
	private String field;
}
