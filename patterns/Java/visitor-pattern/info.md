# Visitor pattern

The aim of the visitor pattern is to emulate 
[double dispatch](https://en.wikipedia.org/wiki/Double_dispatch) in Java. 
Double dispatch means that the implementation of a method is chosen based on 
the runtime types of not only the receiver but also the runtime types of the 
arguments. Imagine the following scenario:

We have a abstract base class Animal

![Animal.java](Animal.java "Animal.java")

and two deriving classes Cat and Horse.

![Cat.java](Cat.java "Cat.java")

![Horse.java](Horse.java "Horse.java")

Now we want show the information about each animal to user. In order to 
keep implementation of how we show an animal separated from our animal 
classes. We create an interface `AnimalWriter`.

![AnimalWriter.java](AnimalWriter.java "AnimalWriter.java")

Now we can create a implementation of the interface

![SimpleConsoleWriter.java](SimpleConsoleWriter.java "SimpleConsoleWriter.java")

Now we can use the `save` method of the `Animal` class to show information 
about the animals on the console. However, what if we want to show the extra
information include in the `Cat` and `Horse` classes we need to use the 
`instanceof` operator to check the concrete type of the `animal` parameter.

The visitor pattern offers a nice alternative. We create a interface for the visitor.

![AnimalVisitor.java](AnimalVisitor.java "AnimalVisitor.java")

This interface includes a overloaded version of the `visitAnimal` method for 
all leaves of our class tree. In addition each leave class has to implement
the `accept` method from the `Animal` class and call the supplied visitor.

This allows us to provide an implementation that also show the additional information provided by the `Cat` and `Horse` class.

![ConsoleWriter](ConsoleWriter.java "ConsoleWriter.java")