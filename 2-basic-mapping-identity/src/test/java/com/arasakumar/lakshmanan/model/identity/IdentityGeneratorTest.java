package com.arasakumar.lakshmanan.model.identity;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IdentityGeneratorTest {
	
	@DataProvider(name = "idEntityClassNames")
	Object[][] getClassNames(){
		return new Object[][] {
            {"com.arasakumar.lakshmanan.model.identity.AutoIdEntity",},
            {"com.arasakumar.lakshmanan.model.identity.HiloIdEntity",},
            {"com.arasakumar.lakshmanan.model.identity.IdentityIdEntity",},
            {"com.arasakumar.lakshmanan.model.identity.IncrementIdEntity",},
            {"com.arasakumar.lakshmanan.model.identity.SequenceIdEntity",},
            {"com.arasakumar.lakshmanan.model.identity.TableIdEntity",},
            {"com.arasakumar.lakshmanan.model.identity.UUIDIdEntity",},
            {"com.arasakumar.lakshmanan.model.identity.SequenceStyleIdEntity",},
            {"com.arasakumar.lakshmanan.model.identity.EnhancedTableIdEntity",}
		};
	}
	
	@Test(dataProvider = "idEntityClassNames")
	public void idGenerationTest(String className) {
        Set<Object> generatedKeys = new HashSet<Object>();
        System.out.println("Testing the entity: " + className);
        Class<?> entityType = Class.forName(className);
        Field idField = entityType.getDeclaredField("id");
        Field fieldField = entityType.getDeclaredField("field");

        for (int i = 0; i < 10; i++) {
            Session session = SessionManager.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            for (int j = 0; j < 4; j++) {
                Object o = entityType.newInstance();
                fieldField.set(o, "" + (char) ('a' + i) + (char) ('b' + j));
                session.persist(o);
                generatedKeys.add(idField.get(o));
            }
            tx.commit();
            session.close();
        }
        for (Object key : generatedKeys) {
            System.out.println(key);
        }
        assertEquals(generatedKeys.size(), 40);
		
	}
	

}
