The Command Design Pattern is a behavioral design pattern that turns a request into a stand-alone object called a command. With the help of this pattern, you can capture each component of a request, including the object that owns the method, the parameters for the method, and the method itself. By doing this, you can easily pass, queue, or log requests and support operations like undo/redo.

How to Identify the Command Pattern

You should use the Command pattern when:
Encapsulating Requests: You need to encapsulate a request or an action as an object (such as turning on or off a device).
Decoupling Sender and Receiver: If the scenario mentions that the object sending the request (e.g., a remote) should not be tightly coupled to the object performing the action (e.g., a TV).
Queueing or Undoable Operations: The scenario may mention the need for queuing operations (such as executing a list of commands) or supporting undo/redo functionality.

Key Clues:
You need to encapsulate a request as an object.
There is a need for decoupling between the invoker and the receiver.
The system may need to support undoable or queueable commands.