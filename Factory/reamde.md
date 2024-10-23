The Factory Method pattern provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. Instead of calling a constructor directly, the pattern uses a factory method to delegate the creation process. This approach is useful when:

You want to avoid specifying the exact class of objects to be created.
The object creation process involves logic that can vary depending on the subclass or context.
This pattern promotes loose coupling by making the creation of objects more flexible and avoiding direct dependency on specific classes.

Recognizing Factory Method in an Scenario

You should think about using the Factory Method when:
The scenario talks about creating different types of objects (like animals, cars, notifications, etc.) but doesn’t want the main code to know or depend on specific classes.
There is a mention of adding new types of objects in the future without changing the existing code.
The problem involves creating objects based on runtime conditions (e.g., a user selects an option, and the system needs to create an object accordingly).

Look for clues like:
"Different types of the same kind of object" (e.g., different kinds of animals, notifications, or products).
A requirement for flexibility when new types might be added in the future without changing the core logic.