@tag
Feature: Connaitre la nourriture de mon animal
	En tant que client,
	Je souhaite savoir quelle nourriture mange un animal
	Afin de preparer larrive de mon animal
 
  @tag1
  Scenario: Je souhaite connaitre la nourriture dun animal
    Given je demande la nourriture dun animal
		When je vois la presentation dun animal
		Then son type de nourriture apparait

  @tag2
  Scenario Outline: Je souhaite connaitre la nourriture dun animal
    Given je demande la nourriture dun animal
		When je clique sur : Que mangetil
		Then un message : Cet animal mange avec sa nourriture <nourriture> apparait
 

    Examples: 
      | nourriture | 
      | "croquette" |  
      | "os" |     