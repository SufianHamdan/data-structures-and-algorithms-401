# Challenge Summary
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?

## Whiteboard Process
<!-- Embedded whiteboard image -->
![image](../businessTripCost.jpg)

## Approach & Efficiency
1. add node
- Time: O(n * m): where n is the cities in the itinerary and m is the available paths in that city
- Space: O(1)

## Solution
1. Write a function called business trip
2. Arguments: graph, array of city names
3. get the current city and see if the next city if it is available in that city air line
4. if it is available increment the totalCost if it is not return 0
5. Return: cost or null