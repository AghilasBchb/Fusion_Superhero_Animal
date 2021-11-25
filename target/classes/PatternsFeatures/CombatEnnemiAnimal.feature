@tag1
Feature: US03 Combat ennemi animal
  en tant que utilisateur
  je veux mettre en combat un ennemie et un animal(en le transformant en superhero)
  afin que le plus fort gagne 

  Scenario Outline: ennemi versus animal
    Given un ennemi de <strength>
    And un animal appele <name> et son cri <sound>  
    When lennemi et lanimal sappretent au combat
    Then le plus fort gagnera ennemiVSanimal
    And lennemi nest plus relie a lanimal et vice versa
    
    Examples: 
  | strength | name   |sound|
	| 80       | "REX"  |"hawawwwww"|
	| 10       |"minou" |"miaawwwwwwww"|
	
	
	