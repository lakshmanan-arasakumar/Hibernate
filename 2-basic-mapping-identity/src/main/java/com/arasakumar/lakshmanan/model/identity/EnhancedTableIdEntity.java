package com.arasakumar.lakshmanan.model.identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;

@Data
@Entity
@Table(name = "enhanced_table_id")
public class EnhancedTableIdEntity {
	
    @Id
    @GeneratedValue( generator="TableIdGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.TableGenerator",name="TableIdGen", 
			parameters = {
			@Parameter(name = "table_name", value = "enhanced_hibernate_sequences"),
            @Parameter(name = "segment_value", value = "id"),
            @Parameter(name = "optimizer", value = "pooled"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "10") 
            })
    public Long id;

    public String field;

}
