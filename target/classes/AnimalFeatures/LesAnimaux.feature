@tag
Feature: Connaitre les animaux et leurs nourritures
  En tant que client,
Je veux connaitre la liste des animaux avec leurs informations
Afin dapprendre a  les connaitre
  

  @tag1
  Scenario: je cherche a connaitre la liste des animaux avec leur type de nourriture respective
		Given je demande la liste des animaux avec leurs nourritures
		When je clique sur : Tu veux connaitre la liste des animaux avec leur type de nourriture respective
		Then on a la liste des animaux avec le type de nourriture quil mange respectivement
		
  @tag2
	Scenario: je cherche a connaitre la liste des animaux avec leur type de nourriture respective et la liste est vide
		Given je demande la liste des animaux avec leurs nourritures
		When je clique sur : Tu veux connaitre la liste des animaux avec leur type de nourriture respective
		Then on a le message :La liste est vide
  