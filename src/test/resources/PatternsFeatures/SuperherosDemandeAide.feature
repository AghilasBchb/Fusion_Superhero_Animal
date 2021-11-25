@tag1
Feature: US04 Superheros demande aide
  en tant que utilisateur
  je veux que un superheros puisse demander de laide (animal ou nouriture)
  afin que il augmente sa force ou sa vie

  Scenario Outline: demande aide nourriture
    Given un superheros de force <power>
    And une nourriture de famille <food>
    When le superheros mange la nourriture
    Then le niveau de vie de superheros va augmenter selon la longueur du typeNourriture
    
    Examples: 
  | power |  food |
	| 80    | "boisson"|
	| 65    | "produits laitiers"|
	
	
	Scenario Outline: demande aide animal
	  Given un superheros de force <power>
    And un animal de nom <name> et son cri <sound>
    When le superheros demande de laide de lanimal
    Then la force de superheros va augmenter selon la longueur du cri
    
    Examples: 
  | power |  name | sound |
	| 80    | "REX"  | "hawawwwwwww"    |
	| 65    | "Darty"| "baaaaaaaaaaaaaa"    |
	
	
	