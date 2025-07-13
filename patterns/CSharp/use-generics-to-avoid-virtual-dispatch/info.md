# Use generics to avoid virtual dispatch

Suppose you have a method that accepts as an argument an instance of a particular interface:

![WithVirtualDispatch.cs](WithVirtualDispatch.cs "WithVirtualDispatch.cs")

We can avoid the overhead of virtual dispatch by adding a generic parameter to our method and a constraint that constrains the generic parameter to be a subtype of the interface in question.

![WithoutVirtualDispatch.cs](WithoutVirtualDispatch.cs "WithoutVirtualDispatch.cs")