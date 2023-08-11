# Factory pattern

The underlying idea of the factory pattern is to decouple the creation of 
object instances from the code that uses them. This becomes especially useful
if only an instance of a certain interface is required but the concrete type is
not available or know to the calling code. Consider the following interface

![InputFile.java](InputFile.java "InputFile.java")

This interface specifies methods to read a collection of numbers from a file.
Our application contains two implementations for this interface one for text
files that contain one number per line

![TextFile.java](TextFile.java "TextFile.java")

and another implementation that reads numbers from a binary file

![BinaryFile.java](BinaryFile.java "BinaryFile.java")

Depending on the file to be read we need to decide which implementation to use.
For that purpose we write a factory that given a file name creates a 
appropriate instance of the `InputFile` interface.

![InputFileFactory.java](InputFileFactory.java "InputFileFactory.java")

Now we can use the `InputFileFactory` in our application to get an appropriate
implementation for the `InputFile` interface depending on the filename. 

![Application.java](Application.java "Application.java")
