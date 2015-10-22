In Java, does the finally block get executed if we insert a return statement inside the try block of a try-catch-finally?

The finally block will get executed regardless, unless the thread gets killed or the virtual machine exits.
