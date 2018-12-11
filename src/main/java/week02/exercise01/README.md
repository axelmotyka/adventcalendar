# Week02, Exercise 01

For given number of drivers and cars create app generating random car assigned for drivers and starting lineup.

## Subtasks
 
 1. define Class `Driver` with following member variables:    
    * _first name_
    * _last name_
    * _starting number_
 2. define Class `Car` with following  member variables:
    * _number_
    * _car type_
 3. create class `Assigment` storing assigment `Car`<=>`Driver`
 4. define Class `Race` with following member variables
    * _drivers_ list of Driver instances
    * _cars_ list of cars
    * _assigment_ = data structure storing assigment `Car`<=>`Driver`
 
 5. add and implement following methods to class `Race`
    * _addDriver(Driver drive)_
    * _addCar(Car car)_
    * _ generateStartingLineup()_ 
    * _printStartingLineup()_ => starting lineup as list of strings (one string one assigned)

 
 6. visualize created classes with plantuml as class diagram, inclusive associations.
  
 ## Hints, requirements
 
 * Consider class Car and Driver to be 'immutable'
 * Driver's starting number and car's number has to be unique.
 * One driver can drive only one car.
 * One car can be drive only by one driver.
 