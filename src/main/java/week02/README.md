# DevAcademy Practices

## Week 2 - 10.12. - 14.12.

Main goal of this exercises for this week is to learn and exercise basic pricinpals of OOP (Object oriented programming)

* Encapsulation
* Polymorphism
* inheritance

Most of exercises are going to be build on analogy of a cars race.

#### Platuml

PlantUML is an open-source tool allowing users to create UML diagrams from a plain text language. 

Plugin for InteliJ:
https://plugins.jetbrains.com/plugin/7017-plantuml-integrationIntelij

Plugin for Visual Studio Code
https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml

### Hints, requirements
 
 * Consider class `Vehicle` and `Driver` to be 'immutable'
 * Driver's starting number and vehicle's number has to be unique.
 * One driver can drive only one vehicle.`
 * One vehicle can be drive only by one driver.

### Exercise 11 - Racing game

Implement basic class lineup.

 1. define Class `Driver` with following member variables:    
    * _first name_
    * _last name_
    * _starting number_
 2. define Class `Vehicle` with following  member variables:
    * _manufacturer_ - like `Skoda`
    * _vehicle name_ - like `Fabia`
    * _horsepower_ - like `25`
    * _engine type_ - one of `[electric, diesel, gasoline]`
 3. add useful unit tests
 4. visualize created classes with plantuml as class diagram, inclusive associations.
 
### Exercise 12 - Racing game

Implement different types of vehicle.
 
 1. Derive different types of vehicles from the base class `Vehicle`, like a _motorcycle_ or a _trike_.
 2. Add specific attributes to each of the new derived classes.
 3. visualize created classes with plantuml as class diagram, inclusive associations.
 
### Exercise 13 - Racing game
 
 Generate a `CompetitorsList` which holds `Driver` and `Vehicle`.
  
  1. create class `CompetitorsGenerator`, which randomly generates drivers and related vehicles.
  2. create class `Competitor` storing assigment `Vehicle`<=>`Driver`
  3. create class `CompetitorsList` storing `Competitor`
  4. add useful unit tests
  5. visualize created classes with plantuml as class diagram, inclusive associations.
  
### Exercise 14 - Racing game
  
  Implement the race with it's starting lineup.
   
  1. define Class `Race` with following member variables
      * _competitors_ list of Competitors instances
      * _startingLineup_ 
  2. add and implement following methods to class `Race`
      * _addCompetitor(Competitor competitor)_
      * _generateStartingLineup()_ => in the 1st race, the starting lineup is ordered by _drivers last name_, _drivers first name_, _vehicles manufacturer_.
      * _List<String> printStartingLineup()_ => starting lineup as list of strings (one string one assigned)
  3. add useful unit tests
  4. visualize created classes with plantuml as class diagram, inclusive associations.
  
### Exercise 15 - Racing game
  
  Let'em race!
   
  1. Add and implement following methods to class `Race`
      * _race()_ 
      * _printResult()_ => race result as list of strings (one string one assigned)
  2. Store the race result to the `Competitor`
  3. Generate the next `Race` from the drivers last race position.
  4. add useful unit tests
  3. visualize created classes with plantuml as class diagram, inclusive associations.
  
### Exercise 16 - Racing game
  
  Implement and a race season. In one season 1..n races can happen. Compute the final result.
  
  1. Add and implement following attributes to class `RacingGame`:
      * _raceList_ 
  2. Add and implement following methods to class `RacingGame`
      * _runSeason()_ => run's the amount of races that are happening this season.
      * _List<String> printSeasonResult()_ => overall result as list of strings (one string one assigned)
  3. add useful unit tests
  4. visualize created classes with plantuml as class diagram, inclusive associations.