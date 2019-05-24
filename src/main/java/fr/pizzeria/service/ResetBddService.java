package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.exception.PizzaException;
import fr.pizzeria.model.IPizzaDao;

public class ResetBddService extends MenuService {

	@Override
	public void executeUC(Scanner input, IPizzaDao dao) throws PizzaException {
		
		System.out.println("Remise � z�ro de la base de donn�es");
		dao.reset();
	}

}
