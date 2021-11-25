@tag
Feature: Supprimer un animal
  En tant quadmistrateur
	Je souhaite supprimer un animal
	Afin que lanimal ne soit plus disponible a lachat
  

  @tag1
  Scenario Outline: Je souhaite supprimer un animal du catalogue
		Given je veux supprimer un animal
		When je demande a supprimer un animal
		Then un message animal nest plus disponible <nom>
		
		| nom |
    | "bobby" |
    | "choupi" |

  @tag2
  Scenario: Je souhaite supprimer un animal du catalogue
		Given je veux supprimer un animal
		When je demande a supprimer un animal
		Then un message de confirmation apparait
	
	@tag3
	Scenario: Je souhaite supprimer un animal sur le catalogue
		Given je veux supprimer un animal
		When je demande a supprimer un animal
		Then les informations sont supprimes en base
	
  

  