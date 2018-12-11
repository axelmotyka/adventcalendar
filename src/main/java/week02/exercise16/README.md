### Exercise 16 - Racing game season
  
  Implement and a race season. In one season 1..n races can happen. Compute the final result.
  
  2. Add and implement following methods to class `RacingGame`
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