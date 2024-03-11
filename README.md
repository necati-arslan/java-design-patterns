# java-design-patterns
java design patterns examples
# java-design-patterns
java design patterns examples

# Observer pattern
- This pattern is useful in scenarios where you have one-to-many relationships between objects and you want to ensure that changes in one object are reflected in multiple other objects without them being tightly coupled.
  1. Subject: This is the object that holds the state being observed.
  2. Observer: This is the interface or abstract class implemented by the observers.
  3. Concrete Subject: This is a specific implementation of the subject interface. It holds the actual state and triggers notifications to its observers when the state changes.
  4. Concrete Observer: These are the dependent objects that are interested in the state changes of the subject.
 
## SOLID
-  These principles aim to make software designs more understandable, flexible, and maintainable.
# Single Responsibility Principle (SRP):

- : A class should have only one reason to change, meaning it should have only one responsibility.
