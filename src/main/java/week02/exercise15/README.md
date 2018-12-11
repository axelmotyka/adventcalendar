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
  