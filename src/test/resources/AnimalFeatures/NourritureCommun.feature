@tag
Feature: Connaitre la nourriture en commun de la liste des animaux
  En tant que client,
	Je veux connaitre la liste des animaux qui mangent un certain type de nourriture
	Afin de savoir la nourriture en commun de ces animaux
 
  

  @tag1
  Scenario: : Je cherche a connaitre le type de nourriture commun a la liste des animaux et que la liste des animaux est vide
		Given je demande la liste des animaux qui mange un type de nourriture commun
		When la liste danimaux est vide
		Then un message derreur apparait a la liste est vide
		
	
	@tag2
  Scenario Outline: Je cherche a connaitre le type de nourriture commun a la liste des animaux 
		Given je demande la liste des animaux qui mange un type de nourriture commun
		When je renseigne une liste danimaux  
		Then la nourriture en commun de ces animaux saffiche <nourriture>
  
     | nourriture | 
     | "croquette" |  
      | "os" |  
  

