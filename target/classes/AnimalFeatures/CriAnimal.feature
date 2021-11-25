@tag
Feature: Connaitre le cri de mon animal
 En tant que client
 Je veux connaitre le cri dun animal 
 Afin de choisir mon animal
 

  @tag1
  Scenario Outline: Je cherche a connaitre le cri de mon animal
		Given Je demande le cri de mon animal <animal>
		When Je clique sur Quel est le cri de cet animal
		Then le cri de mon animal apparait <cri> avec son nom <nom>
  
    Examples: 
      | animal | cri        | nom |
      | "chien"  | "waouf waouf"| "bobby" |
      | "chat"   | "miaouh"     | "choupi" |

  @tag2
  Scenario Outline: Je demande le cri inconnu
  	Given Je demande le cri de mon animal <animal>
		When Je clique sur Quel est le cri de cet animal
		Then un message souvre avec ecrit Le cri nest pas connu
		  	

    Examples: 
      | animal   | cri          | nom     |
      | "chien"  | "waouf waouf"|" bobby" |
      | "chat"   | "miaouh"     | "choupi" |
