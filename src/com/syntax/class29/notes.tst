Set in java:
    set is an interface in collections framework which is implemented by many classes for example
    Hashset, LinkedHashSet and TreeSet (name of the interface before the class)
Properties of set:
    All the Sets don't allow duplicates.
HashSet:
    1) HashSet does not maintain the insertion order
    2) You can insert one null value if you add another one
    it will be removed cuz its a duplicate
    3) it is the fastest in all Sets
    3) most widely used Set.
LinkedHashSet:
    1) Maintains the insertion order
    2) Slower than HashSet but faster than TreeSet especially the insertions
TreeSet:
    1) Sorts the data in natural order for numbers in increasing order.
    2) It is the slowest when it comes to store the data.
When to use which type of set:
    1) If we don't care about insertion order and data being sorted always use HashSet.
    2) If we need the insertion order we don't have much choice
    we have to use the linkedHashSet but if we don't care about the insertion order
    we can compare it with TreeSet
    LinkedHashSet                       vs        TreeSet
    Insertion is not slow                         Slowest insertion
    Retrieval is super super slow                 moderate slower than HashSet faster than LinkedHashSet
I don't care about insertion order but, I care about retrieval speed which set i should use?
HashSet provides us both
I don't care about insertion order but, I don't care about retrieval speed which set i should use?
LinkedHashSet
There are many different types of sets and list interface.
If i want to have sorted data all the time?
======================================================================================================
Maps in Java:
