# Singleton

In Java there are two common ways of implementing the singleton pattern. The one below uses enums:

![Singleton.java](Singleton.java "Singleton")

The other, older, approach is to use an ordinary class with a static instance field:

![StaticSingleton.java](StaticSingleton.java "Singleton using a static field.")

This approach has the drawback that it is not thread safe whereas with the first approach the
JVM guarantees that the singleton is only initialized once. You can find a more detailed comparison
[here](https://drdobbs.com/jvm/creating-and-destroying-java-objects-par/208403883?pgno=3).