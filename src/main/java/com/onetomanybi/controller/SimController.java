package com.onetomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import com.onetomany.dao.Simdao;
import com.onetomanybi.dto.Phone;
import com.onetomanybi.dto.Sim;

public class SimController {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.setId(1);
		phone.setModel("Samsung");
		phone.setStorage(4);
		phone.setEmi("sj7438");

		Sim sim = new Sim();
		sim.setId(1);
		sim.setName("jio");
		sim.setSimno(947383);
		sim.setPhone(phone);

		Sim sim1 = new Sim();
		sim1.setId(2);
		sim1.setName("Airtel");
		sim1.setSimno(2437829);
		sim1.setPhone(phone);

		List<Sim> siml= new ArrayList<Sim>();
		siml.add(sim);
		siml.add(sim1);

		phone.setSim(siml);

		Simdao dao = new Simdao();
		dao.savePhone(phone);
	}

}

