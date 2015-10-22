In terms of inheritance, what is the effect of keeping a constructor private?

If class A has a private constructor, it can only be called from A, A's inner classes, and any inner classes of a parent of A.
What this means is that since a subclass calls its parent's constructor, A can only be inherited by its own inner classes or it's parent's inner classes.
