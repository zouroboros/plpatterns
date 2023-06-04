# Builder pattern

Suppose we have a record that represents a email

![EMail.java](EMail.java "EMail")

In order to create a new instance we need to provide all information at once.

![EMailTest.java](EMailTest.java "EMailTest")

The builder pattern provides a elegant solution that is also more explicit. We
implement a `EMailBuilder` class that collects all the information needed to 
create new instances of `EMail`.

![EMailBuilder.java](EMailBuilder.java "EMailBuilder")

The `EMailBuilder` allows us to easily create instances of `EMail`.

![EMailBuilderTest.java](EMailBuilderTest.java "EMailBuilderTest")