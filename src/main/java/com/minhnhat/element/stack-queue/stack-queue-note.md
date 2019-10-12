Stacks
A stack supportstwo basic operations—push and pop. Elements are added (pushed)
and removed (popped) in last-in, first-out order, asshown in Figure 9.1. If the stack
is empty, pop typically returns null or throws an exception.
When the stack is implemented using a linked list these operations have 0(1)
time complexity. If it is implemented using an array, there is maximum number of
entriesit can have—push and pop are still 0(1). If the array is dynamically resized,
the amortized time for both push and pop is 0(1). A stack can support additional
operationssuch as peek, which returns the top of the stack without popping it.

Stacks boot camp
The last-in, first-out semantics of a stack make it very useful for creating reverse
iterators for sequences which are stored in a way that would make it difficult or
impossible to step back from a given element. This a program uses a stack to print
the entries of a singly-linked list in reverse order.
public static void printLinkedListlnReverse(ListNodednteger> head) {
Deque<Integer> nodes = new LinkedList <>();
while (head != null) {nodes.addFirst(head.data);
head = head.next ;
}
while (!nodes.isEmpty()){
System.out.printIn(nodes.poll());
}
}
The time and space complexity are0(n),where n is the number of nodesin the list.
As an alternative, we could form the reverse of the list using Solution 8.2 on
Page 116, iterate through the list printing entries, then perform another reverse to
recover the list—this would have0(n) time complexity and 0(1)space complexity.
Learn to recognize when the stack LIFO property is applicable. For example,
parsing typically benefits from a stack. [Problems 9.2 and 9.6]
Consider augmenting the basic stack or queue data structure tosupport additional
operations,such as finding the maximum element. [Problem 9.1]
Know your stack libraries
The preferred way to represent stacks in Java is via the Deque interface. The
LinkedList classis a doubly linked list that implements thisinterface, and provides
efficient (£?(1) time) stack (and queue) functionality.
The key stack-related methods in the Deque interface are push(42), peek(), and
pop(). The Deque methods addFirst(42), peekFirstO, and removeFirstO are
identical to push(42), peek(), and pop(). We use them in our solutions in place of
push(42), peek(), and pop().
•
push(e) pushes an element onto the stack. Not much can go wrong with a call
to push: some implementing classes may throw an IllegalStateException if
the capacity limit is exceeded, or a NullPointerException if the element being
inserted is null. LinkedList has no capacity limit and allowsfor null entries,
though as we will see you should be very careful when adding null.
•
peekf) will retrieve, but does not remove, the element at the top of the stack.
If the stack is empty, it returns null. Since null may be a valid entry, thisleads
to ambiguity. Therefore a better test for an empty stack isisEmpty().
•
pop() will remove and return the element at the top of the stack. It throws
NoSuchElementException if the deque is empty. To avoid the exception, first
test with isEmpty().
Other usefulstack-related methods are descendinglteratorO and iteratorf).