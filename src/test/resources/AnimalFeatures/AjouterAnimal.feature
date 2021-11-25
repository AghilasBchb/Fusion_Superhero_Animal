@tag
Feature: Ajouter un animal
  En tant que maitre
	Je souhaite ajouter un animal
	Afin detoffer les offres

  @tag1
  Scenario: je souhaite ajouter un animal sur le catalogue
		Given ajouter un animal a une liste
		When jajoute un animal
		Then je dois remplir les informations de lanimal

  @tag2
  Scenario: Je souhaite ajouter un animal sur le catalogue et des informations sont manquantes
		Given ajouter un animal a une liste
		When je confirme le formule
		Then un message derreur apparait
	
	@tag3
	Scenario: Je souhaite ajouter un animal sur le catalogue et cet animal existe deja
		Given ajouter un animal a une liste
		When jajoute un animal
		Then un message derreur apparait
	
	@tag4
	Scenario: Je souhaite ajouter un animal sur le catalogue
		Given ajouter un animal a une liste
		When jajoute un animal
		Then les informations sont enregistrees en base
		

