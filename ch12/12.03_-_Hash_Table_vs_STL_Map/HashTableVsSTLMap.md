Compare and constrast a hash table and an STL map. How is a hash table implemented? If the number of inputs is small, which data structure options can be used instead of a hash table?

STL map in c++ is backed by a red black tree, and so the keys are sorted. Because its a red black tree, insert is O(log_2(n)), delete is O(log_2(n)), etc. A hash table is typically implemented using an array of linked lists. With few collisions in the hash table, a hash table gives O(1) inserts and O(1) deletes.
