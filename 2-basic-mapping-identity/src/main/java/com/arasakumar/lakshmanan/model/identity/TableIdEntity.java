package com.arasakumar.lakshmanan.model.identity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

public class TableIdEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @TableGenerator(name = "tableIdentities")
    public Long id;
    
    public String field;

}
