# TASK

Create a **Gradle** project containing a `SumCalculator` class with the `int sum(int n)` method. This method must return the sum of numbers from 1 to n, inclusive. 
For example, call `sum(3)` must return **6** (1 + 2 + 3).

Write a test class for `SumCalculator` where you test the following behavior of the `sum()` method:
 - call sum(1) return 1
 - call sum(3) return 6
 - call sum(0) throws IllegalArgumentException
   
Each item on the list MUST be implemented by a separate test.
Use the method with `@BeforeEach` annotation for construction `SumCalculator` class object before each test.

Make sure your code runs from the terminal by calling the `gradle test` command.