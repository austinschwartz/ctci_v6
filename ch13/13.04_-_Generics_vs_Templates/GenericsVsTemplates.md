Explain the difference between templates in C++ and generics in Java.

Java generics are pretty much just syntactic sugar. Once compiling to byte code, something called 'type erasure' takes place. Any parameterized types are eliminated.

For example, suppose you have the Java code below:
    Vector<String> vector = new Vector<String>();
    vector.add(new String("hello"));
    String str = vector.get(0);

During compilation, this code is re-written into:
    Vector vector = new Vector();
    vector.add(new String("hello"));
    String str = (String) vector.get(0);

However, in C++, templates are essentially a glorified macro set, with the compiler creating a new copy of the template code for each type.

There are more differences:

- C++ templates can use primitive types, like int. Java must used wrappers like Integer.
- In C++, the type parameter can be instantiated, whereas Java does not support this.
- In Java, all instances of a Class, regardless of their type parameters, are the same type. The type parameters are erased at runtime. 
