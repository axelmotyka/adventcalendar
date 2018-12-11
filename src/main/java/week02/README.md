# DevAcademy Practices

## Week 2 - 13.12.2018 - 11.01.2019

Main goal of this exercises for this week is to learn and exercise basic principals of OOP (Object oriented programming)

* Encapsulation
* Polymorphism
* Inheritance

Most of exercises are going to be build on analogy of a cars race.

#### Platuml

PlantUML is an open-source tool allowing users to create UML diagrams from a plain text language. 

Plugin for InteliJ:
https://plugins.jetbrains.com/plugin/7017-plantuml-integrationIntelij

Plugin for Visual Studio Code
https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml

### Hints, requirements
 
 * Every exercise use the previous solution, so copy your implementation from one exercise to the next one.
 * Use `RacingGame` as the operational class through all exercises. That means we handle all racing stuff from this class.
 * Consider class `Vehicle` and `Driver` to be 'immutable'.
 * Driver's starting number and name has to be unique.
 * One driver can drive only one vehicle.
 * One vehicle can be driven by only one driver.
 * Implement useful Getter and Setter methods.

### Exercise 11 - Racing game base classes

Implement basic class lineup.

 1. Define Class `Driver` with following methods:    
    * _getName()_ => returns Lastname, Firstname as String
    * _getStartingNumber()_ => returns the starting number as an int
    * _toString()_ => generates a String like '(1) Joe Cewl' 
 2. Define Class `Vehicle` with following  methods:
    * _getManufacturer()_ - returns the manufacturer like 'Skoda' as String
    * _getName()_ - returns the vehicle name like 'Fabia' as String
    * _getHorsepower()_ - returns the engines horsepower as int
    * _getEngineType_ - returns one of `[electric, diesel, gasoline]` as an Enum
    * _toString()_ - returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'
 3. Add useful unit tests
 4. Visualize created classes with plantuml as class diagram, inclusive associations.
 
### Exercise 12 - Racing game with different vehicles

Implement different types of vehicle.
 
 1. Derive different types of vehicles from the base class `Vehicle`, like a _motorcycle_ or a _trike_.
 2. Add specific attributes to each of the new derived classes.
 4. Add get methods for the new attributes
 5. Enhance toString() method with the new attributes 
 3. Visualize created classes with plantuml as class diagram, inclusive associations.
 
### Exercise 13 - Racing game competitors
 
 Generate a CompetitorsList which holds a Competitor with a Driver and Vehicle.
  
  1. Create class `CompetitorsGenerator`, which randomly generates drivers and related vehicles as a `Competitor`.
  2. Create class `Competitor` storing assigment `Vehicle`=>`Driver` with:
     * _getPoints()_ => returns the actual points as int
     * _addPoints(int)_ => add's points from a race
  3. Create class `CompetitorsList` storing `Competitor`:
     * _getCompetitors()_ => which returns a list of `Competitor`
     * _toString()_ => method, which concatenate the contained toString() methods. This will generate a String like '[Points] [Driver] [Vehicle]'
  4. Add useful unit tests
  5. Visualize created classes with plantuml as class diagram, inclusive associations.
  
### Exercise 14 - Racing game lineup
  
  Implement the race with it's starting lineup.
   
  1. Add and implement following methods to class `Race`:
      * _addCompetitor(Competitor competitor)_
      * _generateStartingLineup()_ => in the 1st race, the starting lineup is ordered by _drivers last name_, _drivers first name_, _vehicles manufacturer_.
      * _toString()_ => starting lineup as String, like '[Position in StartingLineup] [Competitor]'
  2. Add useful unit tests
  3. Visualize created classes with plantuml as class diagram, inclusive associations.
  
### Exercise 15 - Racing game race()
  
  Let'em race!
   
  1. Add and implement following methods to class `Race`:
      * _race()_ => run's the race - generate the final placement randomly
      * _getResult()_ => race result as an ordered list of competitors. The list is ordered by the placement, like 1s is first, 2nd is second, ....
      * _toString()_ => race result as string, like '[Result Position] [Competitor]'
  2. Store the race result points to the `Competitor`
      * for the first place the driver gets '[count of drivers - place + 1] * 2' points
      * all other placements gives the drivers '[count of drivers - place + 1] * 1' points
  3. Generate the next starting lineup from the drivers last race position.
  4. Add useful unit tests
  3. Visualize created classes with plantuml as class diagram, inclusive associations.
  
### Exercise 16 - Racing game season
  
  Implement and a race season. In one season 1..n races can happen. Compute the final result.
  
  2. Add and implement following methods to class `RacingGame`
      * enhance the constructor with the amounts of races.
      * _runSeason()_ => run's the amount of races that are happening this season.
      * _getStanding()_ => holds the competitors in their actual standing as a List, order this list by:
        * without a race by _drivers last name_, _drivers first name_, _vehicles manufacturer_
        * after a race has happened by the competitors points
        * Store the placements shift after a race, means if a competitor went places up, down or remained.
      * _toString()_ => the standing as String like '[Place] [Placement shift] [Competitor]'
        * for the shift up &#8593;
        * for shift down &#8595;
        * for a remained placement &#8594;
  3. Add useful unit tests
  4. Visualize created classes with plantuml as class diagram, inclusive associations.