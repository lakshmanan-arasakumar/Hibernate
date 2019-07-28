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
@Table(name = "sequence_style_id")
public class SequenceStyleIdEntity {
	
    @Id
    @GeneratedValue( generator="IdGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.SequenceStyleGenerator",name="IdGen", 
			parameters = {
            @Parameter(name = "sequence_name", value = "seq_id_gen"),
			@Parameter(name = "optimizer", value = "pooled"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "10") 
            })

    public Long id;
    
    public String field;

}
