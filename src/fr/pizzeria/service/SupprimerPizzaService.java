package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.model.PizzaMemDao;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner input, PizzaMemDao dao) {
		String codeInput;
		ListerPizzasService listeService = new ListerPizzasService();
		
		//Listage des pizzas
		listeService.executeUC(input, dao);
		
		//Demande le code de la pizza
		System.out.println("Entrez le code de la pizza � supprimer : ");
		codeInput = input.next();
		
		//Supression
		dao.deletePizza(codeInput);
	}

}
