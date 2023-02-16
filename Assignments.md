# Java Collections Assignments
The [DataRepo](./src/main/java/Repo/DataRepo.java) class contains static methods that return data for the exercises.

# Ex 1. Range of People
Use the `DataRepo.getPeople()` method to create an `ArrayList` of people between the ages of 20 and 40 inclusive and display
this list on the console.

Example Output:
```
[{3: Charlie Daniels 20}, {4: Dave Campbell 25}, {5: Egar Winter 30}, {6: Frank Zappa 35}, {7: Gary Hoey 40}]
```

# Ex 2. Average Displacement
Use the `DataRepo.getCarsWithEngines()` method to determine the average displacement size of all the engines.  Display
the result on the console:

Example Output:
```
2.74
```

# Ex 3. Uppercase People
Use the `DataRepo.getPeople()` method in conjunction with the `.forEach()` method to change the firstname and lastname
to uppercase for all the people.  Display the list on the console.

Example Output:
```
[{1: ALICE JONES 10}, {2: BOB MARLEY 15}, {3: CHARLIE DANIELS 20}, {4: DAVE CAMPBELL 25}, {5: EGAR WINTER 30}, {6: FRANK ZAPPA 35}, {7: GARY HOEY 40}, {8: IGOR SMITH 45}, {9: JACK WHITE 50}, {10: LARRY SAME 55}]
```

# Ex 4. Word Counter
Use the `DataRepo.readFile()` method to read all the words from a file.  Create a `HashMap` that contains the count for
each word.  Display the count for each word on the console (in no particular order):

Example Output:
```
the 2
a 1
system 1
test 3
testing 1
of 1
This 1
is 2
```

# Ex 5. Sorted Word Counter
Repeat Ex 4, but display the word count in ascending order.  The [Word](./src/main/java/Model/Word.java) class may
help you.

Example Output:
```
a: 1
system: 1
testing: 1
of: 1
This: 1
the: 2
is: 2
test: 3
```
