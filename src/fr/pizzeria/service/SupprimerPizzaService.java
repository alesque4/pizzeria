package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.PizzaMemDao;

public class SupprimerPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner input, PizzaMemDao dao) throws DeletePizzaException{
		String codeInput;
		ListerPizzasService listeService = new ListerPizzasService();
		
		//Listage des pizzas
		listeService.executeUC(input, dao);
		
		//Demande le code de la pizza
		System.out.println("Entrez le code de la pizza � supprimer : ");
		codeInput = input.next();
		
		//Exception si le code n'est pas pr�sent dans le DAO
		if(!dao.pizzaExists(codeInput)) {
			throw new DeletePizzaException("/!\\ La pizza � supprimer est introuvable.");
		}
		
		//Supression
		dao.deletePizza(codeInput);
	}

}
