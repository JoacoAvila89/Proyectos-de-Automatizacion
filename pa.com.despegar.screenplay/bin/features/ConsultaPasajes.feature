#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Consulta de pasajes aereos
  Como un usuario frecuente de despegar
  Yo quiero ver pasajes economicos para vuelo de mis padres a Panamá
  y que vengan a visitarme varias veces

  Scenario: find economic tickets
    Given Joaquin needs to check the availability of flights
    When he search for economic tickets from Caracas, Caracas, Venezuela to Panamá, Panamá, Panamá on 02/04/2019 and returning on 22/04/2019
    Then he should see the list of available flights
