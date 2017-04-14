# SWE4403Project
A text editor implementing 13 GoF design patterns, for SWE4403, Winter 2017 term

An outline of how different patterns are used will be outlined below

1. Composite - for building the document structure internally. Row, Columns, Documents are composites. Characters are leaves.
2. Facade - for masking the internal document model
3. Observer - implementing the model as an observer of the UI
4. Flyweight - font data is saved as a flyweight
5. Command - a command pattern is used for user commands passed from the interface to the facade
6. Memento - used for undo/redo functionality
7. Iterator - used for iterating through the document structure
8. Builder - used for constructing the document structure
9. Singleton - the builder is a singleton
10. Visitor - used for implementing certain functions, such as a spellchecker
11. (abstract?) Factory - for creating nodes in the document structure
12. Chain of responsibility - Used in the implementation of the decorator pattern, to add new UI elements to the JFrame
13.

Documents are saved in XML format with the .swe extension by default
