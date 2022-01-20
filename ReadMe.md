# Part 1: Number Loops
* Ensure each of the test cases in the class com.codedifferently.labs.lab14a.partA.NumberLoopsTest successfully passes upon completion of each of the method stubs in the class com.codedifferently.labs.lab14a.partA.NumberLoopsTest.
    * `String getEvenNumbers(int start, int stop)`
    * `String getOddNumbers(int start, int stop)`
    * `String getSquareNumbers(int start, int stop, int step)`
    * `String getRange(int start, int stop, int step)`
    * `String getExponentiations(int start, int stop, int step, int exponent)`

#### getEvenNumbers

**Description**

Given two integers, `start`, and `stop`, return a `String` concatenation of all even integers between `start` up to and not including `stop`.

##### Example

Sample Script

```
// : Given
int start = 5;
int stop = 20;
    
// : When
String outcome = NumberUtilities.getOddNumbers(min, max);
    
// : Then
System.out.println(outcome);
```

##### Sample Output

```
681012141618
```

#### getOddNumbers

**Description**

Given two integers, `start`, and `stop`, return a `String` concatenation of all even integers between `start` up to and not including `stop`.

##### Example

Sample Script

```
// : Given
int start = 5;
int stop = 20;
    
// : When
String outcome = NumberUtilities.getOddNumbers(min, max);
    
// : Then
System.out.println(outcome);
```

Sample Output

```
5791113151719
```

#### getSquareNumbers 

**Description**

Given two integers, `start`, and `stop`, return a `String` concatenation of all values squared between `start` up to and not including `stop`.

##### Example

Sample Script

```
// : Given
int start = 5;
int stop = 20;
    
// : When
String outcome = NumberUtilities.getOddNumbers(min, max);
    
// : Then
System.out.println(outcome);
```

Sample Output

```
25100225
```



#### getRange 

**Description**

Given an integer, `stop`, return a `String` concatenation of all integers between `0` up to and not including `stop`.

##### Example

Sample Script

```
// : Given
int stop = 11;
    
// : When
String outcome = NumberUtilities.getRange(stop);
    
// : Then
System.out.println(outcome);
```

Sample Output

```
012345678910
```

#### String getRange(int start, int stop)

**Description**

Given two integers, `start`, and `stop`, return a `String` concatenation of all integers between `start` up to and not including `stop`.

##### Example

Sample Script

```
// : Given
int start = 5;
int stop = 11;
    
// : When
String outcome = NumberUtilities.getRange(start, stop);
    
// : Then
System.out.println(outcome);
```

Sample Output

```
5678910
```

#### getRange(int start, int stop, int step)

**Description**

Given three integers, `start`, `stop`, and `step` return a `String` concatenation of all integers between `start`, incrementing by `step`, up to and not including `stop`.

##### Example
Sample Script

```
// : Given
int start = 5;
int stop = 20;
int step = 5;
    
// : When
String outcome = NumberUtilities.getRange(min, max, step);
    
// : Then
System.out.println(outcome);
```
Sample Output

```
51015
```

#### getExponentiations(int start, int stop, int step, int exponent)

**Description**

Given four integers, `start`, `stop`, `step`, and `exponent`, return a `String` concatenation of all values, raised to the specified `exponent`, between `start` up to and not including `stop`, incrementing by the specified `step`.

##### Example

Sample Script

```
// : Given
int start = 5;
int stop = 20;
int step = 5;
int exponent = 2;
    
// : When
String outcome = NumberUtilities.getOddNumbers(min, max);
    
// : Then
System.out.println(outcome);
```

Sample Output

```
25100225
```

# Part 2 Ex02_TriangleLoops
* Ensure each of the test cases in the class `Ex02_TriangleLoopsTest` successfully passes upon completion of each of the method stubs in the class `Ex02_TriangleLoopsTest`.
    * `String getRow(int width)`
    * `String getSmallTriangle()`
    * `String getLargeTriangle()`
    * `String getTriangle(int n)`
    


#### getRow(int width)

**Description**

In the class, `Triangles` Write a method that returns a `String` representation of a row of asterisks whose length is equal to the `width` specified.
    
##### Example

Sample Script

```
// : Given
int width = 10;
    
// : When
String outcome = Triangles.getRow(width);
    
// : Then
System.out.println(outcome);
```

Sample Output

```
**********
```

#### getSmallTriangle()

**Description**

In the class, `Triangles` Write a method that returns a `String` representation of a small triangle, whose base height and base width is 4 asterisks.
    
##### Example

Sample Script

```
// : Given
// : When
String outcome = Triangles.getSmallTriangle();
    
// : Then
System.out.println(outcome);
```

Sample Output

```
*
**
***
****
    
```

#### getLargeTriangle()

**Description**

Write a method that returns a `String` representation of a large triangle, whose base height and base width is 10 asterisks.
    
##### Example

Sample Script

```
// : Given
// : When
String outcome = Triangles.getLargeTriangle();
    
// : Then
System.out.println(outcome);
```

Sample Output

```
*
**
***
****
*****
******
*******
********
*********
    
```

#### getTriangle(int n)

**Description**

Given one integer, `n`, generate a `String` representation of a triangle whose base height and width is equal to `n`.

	
##### Example

Sample Script

```
// : Given
int numberOfRows = 15;
    
// : When
String outcome = Triangles.createTriangle(numberOfRows);
    
// : Then
System.out.println(outcome);
```

Sample Output

```
*
**
***
****
*****
******
*******
********
*********
**********
***********
************
*************
**************
    
```

# Part 3 Table Loops

This is an extra challenge!!! To complete this you will need to do some research on String Formatting.

* Start here [Tutorial](https://www.geeksforgeeks.org/java-string-format-method-with-examples/)
* You may need to do some more googling to find the right way.

Ensure each of the test cases in the class `Ex03_TableLoopsTest` successfully passes upon completion of each of the method stubs in the class `Ex03_TableLoopsTest`.

#### `String getSmallMultiplicationTable()`
```
  1 |  2 |  3 |  4 |  5 |
  2 |  4 |  6 |  8 | 10 |
  3 |  6 |  9 | 12 | 15 |
  4 |  8 | 12 | 16 | 20 |
  5 | 10 | 15 | 20 | 25 |
```

#### `String getLargeMultiplicationTable()`

```
  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |
  2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 |
  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 |
  4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 |
  5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |
  6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 |
  7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 |
  8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 |
  9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 |
 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |
```

#### `String getMultiplicationTable(int width)`

```
  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |
  2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 | 22 | 24 | 26 | 28 | 30 | 32 | 34 | 36 | 38 | 40 |
  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 | 33 | 36 | 39 | 42 | 45 | 48 | 51 | 54 | 57 | 60 |
  4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 | 44 | 48 | 52 | 56 | 60 | 64 | 68 | 72 | 76 | 80 |
  5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 | 55 | 60 | 65 | 70 | 75 | 80 | 85 | 90 | 95 |100 |
  6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 | 66 | 72 | 78 | 84 | 90 | 96 |102 |108 |114 |120 |
  7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 | 77 | 84 | 91 | 98 |105 |112 |119 |126 |133 |140 |
  8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 | 88 | 96 |104 |112 |120 |128 |136 |144 |152 |160 |
  9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 | 99 |108 |117 |126 |135 |144 |153 |162 |171 |180 |
 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |110 |120 |130 |140 |150 |160 |170 |180 |190 |200 |
 11 | 22 | 33 | 44 | 55 | 66 | 77 | 88 | 99 |110 |121 |132 |143 |154 |165 |176 |187 |198 |209 |220 |
 12 | 24 | 36 | 48 | 60 | 72 | 84 | 96 |108 |120 |132 |144 |156 |168 |180 |192 |204 |216 |228 |240 |
 13 | 26 | 39 | 52 | 65 | 78 | 91 |104 |117 |130 |143 |156 |169 |182 |195 |208 |221 |234 |247 |260 |
 14 | 28 | 42 | 56 | 70 | 84 | 98 |112 |126 |140 |154 |168 |182 |196 |210 |224 |238 |252 |266 |280 |
 15 | 30 | 45 | 60 | 75 | 90 |105 |120 |135 |150 |165 |180 |195 |210 |225 |240 |255 |270 |285 |300 |
 16 | 32 | 48 | 64 | 80 | 96 |112 |128 |144 |160 |176 |192 |208 |224 |240 |256 |272 |288 |304 |320 |
 17 | 34 | 51 | 68 | 85 |102 |119 |136 |153 |170 |187 |204 |221 |238 |255 |272 |289 |306 |323 |340 |
 18 | 36 | 54 | 72 | 90 |108 |126 |144 |162 |180 |198 |216 |234 |252 |270 |288 |306 |324 |342 |360 |
 19 | 38 | 57 | 76 | 95 |114 |133 |152 |171 |190 |209 |228 |247 |266 |285 |304 |323 |342 |361 |380 |
 20 | 40 | 60 | 80 |100 |120 |140 |160 |180 |200 |220 |240 |260 |280 |300 |320 |340 |360 |380 |400 |
```