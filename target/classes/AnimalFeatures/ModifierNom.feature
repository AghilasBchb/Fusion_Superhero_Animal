
@tag
Feature: Modifier le nom de mon animal
  En tant que maitre
	Je souhaite modifier le nom dun animal
	Afin de choisir le nom qui me plait pour mon animal de compagnie

  @tag1
	Scenario Outline: Je souhaite modifier le nom de mon animal
			Given je veux modifier le nom de mon animal
			When je clique sur Modifier le nom de cet animal <animal>
			Then une pop up permettant de modifier le nom souvre

    Examples: 
      | animal     | nom |
      | "chien"  | "bobby" |
      | "chat"   | "choupi" |
      
  @tag2
	Scenario: Je souhaite modifier le nom de mon animal
			Given je modifie le nom de mon animal
			When jenregistre le nouveau nom
			Then le nom est enregistre en bdd

      