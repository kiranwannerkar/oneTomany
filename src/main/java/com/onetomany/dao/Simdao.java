package com.onetomany.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onetomanybi.dto.Phone;
import com.onetomanybi.dto.Sim;
public class Simdao {

	public void savePhone(Phone phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(phone);
		List<Sim> sim = phone.getSim();
		for (Sim sims : sim) {
			entityManager.persist(sims);
		}
		entityTransaction.commit();

	}

}

