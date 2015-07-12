A shallow copy copies all values from one object to another. For any pointers, just the reference is copied. In a deep copy, every pointer will be followed, and whatever they point to will also be copied.

Book example:

      struct Test {
        char * ptr;
      };
      
      void shallow_copy(Test & src, Test & dest) {
        dest.ptr = src.ptr;
      }

      void deep_copy(Test & src, Test & dest) {
        dest.ptr = (char*)malloc(strlen(src.ptr) + 1);
        strcpy(dest.ptr, src.ptr);
      }

