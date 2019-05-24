package fr.pizzeria.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import fr.pizzeria.exception.PizzaException;
import fr.pizzeria.model.IPizzaDao;

public class ResetBddService extends MenuService {

	@Override
	public void executeUC(Scanner input, IPizzaDao dao) throws PizzaException {
		ResultSet data = null;
		Statement requete = null;
		Connection connection = null;
		boolean answer = false;
		
		System.out.println("Remise � z�ro de la base de donn�es");
		dao.reset();
	}

}
