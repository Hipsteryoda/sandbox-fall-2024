# Facade patterns
- Facade patterns provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

# Creating a Stack interface
- [Stack class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Stack.html)
- `Stack<E>` <-- E is an element type
- Stack as an interface is an API

# Creating an implementaion of the Stack interface
- `ArrayListStack` <-- the "Stack" at the end is a naming convention to describe what it is implementing
- The stack field in this class replicates the stack interface using ArrayList methods
- This is a demonstration of the facade pattern in that the ArrayList methods are hidden from the user

