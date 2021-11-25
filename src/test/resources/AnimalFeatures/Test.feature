@tag
Feature: Connaitre le nom dun animal
  En tant que client,
	Je veux connaitre le nom dun animal
	Afin de choisir mon animal

  @tag1
  Scenario Outline: Je cherche a connaitre le nom dun animal
    Given je demande le nom de animal
    When je clique sur Tu veux savoir son nom
    Then le nom de lanimal apparait <nom>
    
    
    Examples: 
      | animal  | nom   |
      | "chien"   | "bobi"   |
      | "chat"    | "choupi" |
    

  @tag2
  Scenario Outline: Je cherche a connaitre le nom dun animal qui na pas de nom
    Given je demande le nom dun animal <animal>
    When je clique sur Tu veux savoir son nom
    Then un message Pas de nom apparait

    Examples: 
      | animal  | nom   |
      | "chien"   | "bobi"   |
      | "chat"    | "choupi" |
