@tag
Feature: Connaitre le type de nourriture dun animal
  En tant que client
  Je veux connaitre le type de nourriture dun animal
  Afin de sinformer sur lanimal
  

  @tag1
  Scenario Outline: je cherche a connaitre le type de nourriture dun animal
		Given je demande le type de nourriture dun animal <animal>
		When je clique sur : Tu veux savoir son type de nourriture
		Then un message avec le type de nourriture de lanimal apparait <nourriture>
		
		Examples: 
      | animal  | nourriture  |
      | "chien"   |  "os"  |
      | "chat"    |   "souris" |
 
  @tag2
  Scenario Outline: je cherche a connaitre le type de nourriture dun animal mais linformation est manquante
		Given je demande le type de nourriture dun animal <animal>
		When je clique sur : Tu veux savoir son type de nourriture
		Then une popup souvre avec ecrit : Information manquante
  

    Examples: 
      | animal  |
      | "chien"   |  
      | "chat"    | 
