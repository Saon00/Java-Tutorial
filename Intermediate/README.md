## This MarkDown file created for providing extra informations about this folder.

- [ArrayList](/Intermediate/01_Collections/ArrayListExamples/)
    - It is in Jdk since 1.2
    - Not Syncronised
    - If you don't need to syncronise any code. Just simply use this.
- Vector
    - It is in Jdk since 1.0
    - Syncronised
    - [Thead Safe] - It means it's ok to use it from different threads without we having to syncronise the code
    - If you need to syncronise any code. Just simply use this. But it makes code slow

`Vector and Arraylist's methods are almost same. So I don't upload any Vector's examples.`

- [Singly Linked Lists]
    - time complexity O(1) `Because it don't depends how many items in the list. As long you inserting/removing at the front of the list.`
    - Only have a refference to the head of the list
- [Doubly Linked Lists](/Intermediate/01_Collections/DoublyLinkedLIst/
) - Ref: [One], [Two]
    - time complexity O(1) `Because we've a pointer, or a refference, to the tail of the list.`
    - Each item in the list has Next and Previous Field
    - This list has a HEAD and a TAIL
    
- [Linked List](/Intermediate/01_Collections/LinkedListExamples/)
    - Actually Liked List is one kind of Doubly Linked Lists.
    - We should use Linked Lists if we want to insert/delete something from the head or tail. Cz, if you try to do something from the middle, then we'll lose the advantages of using Linked Lists.
    - [Oracle Documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedList.html)
- [Circular Linked List](https://www.baeldung.com/java-circular-linked-list)
    - A circular linked list is a variation of a linked list in which the last node points to the first node, completing a full circle of nodes. In other words, this variation of the linked list doesn't have a null element at the end.
    

    
<!-- important links -->
[One]: https://www.softwaretestinghelp.com/doubly-linked-list-in-java/
[Two]: https://dzone.com/articles/doubly-linked-list-in-java
[Singly Linked Lists]: https://examples.javacodegeeks.com/singly-linked-list-java-example/
[Thead Safe]: https://www.codejava.net/java-core/collections/understanding-collections-and-thread-safety-in-java
