@Rover
Feature: Mars rover movement
  Mars rover can perform two activities and single knowledge.
  	Know its position 
  	Can move forward and can turn right or left.

  @Move
  Scenario: Mars rover should move forward to facing direction when recieved M command
    Given Current position is 3,5 and facing "N"
    When I execute Move command
    Then Mars rover positions should be 3,4 and facing "N"
    
  
  @Left
  Scenario: Mars rover should turn left when recieved L(Left) command
    Given Current position is 2,2 and facing "E"
    When I execute Left command
    Then Mars rover positions should be 2,2 and facing "N"
    
  @Right
  Scenario: Mars rover should turn right when recieved R(Right) command
    Given Current position is 1,1 and facing "S"
    When I execute Right commant
    Then Mars rover positions should be 1,1 and facing "W"
