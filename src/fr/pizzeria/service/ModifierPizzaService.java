package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaMemDao;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner input, PizzaMemDao dao) throws UpdatePizzaException {
		Pizza pizzaInput;
		String codeInput;
		
		//Demande le code de la pizza
		System.out.println("Mise � jour d'une pizza");
		System.out.println("Entrez le code de la pizza � modifier : ");
		codeInput = input.next();
		
		//Si la pizza n'existe pas on l�ve une exception
		if(!dao.pizzaExists(codeInput)) {
			throw new UpdatePizzaException("/!\\ La pizza � modifier est introuvable.");
		}
		
		//Demande la nouvelle pizza
		System.out.println("Entrez la nouvelle pizza");
		pizzaInput = demandePizza(input);
		
		//Maj
		dao.updatePizza(codeInput, pizzaInput);
	}
}
