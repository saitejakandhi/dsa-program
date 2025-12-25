public class LinkedList<T> implements List<T> {
private Node<T> root;
private int size;
@Override
public void insert(T data) {
Node<T> node = new Node<>(data);
node.setNextNode(root);
root = node;
size++;
}
@Override
public void remove(T data) {
if (root.getData().equals(data)) {
root = root.getNextNode();
} else {
Node<T> previousNode = root;
Node<T> currentNode = root.getNextNode();
while (currentNode != null) {
if (currentNode.getData().equals(data)) {
previousNode.setNextNode(currentNode.getNextNode());
break;
}
previousNode = currentNode;
currentNode = currentNode.getNextNode();
}
}
size--;
}
@Override
public void removeRecursively(T data) {
if (root.getData().equals(data)) {
root = root.getNextNode();
} else {
removeRecursively(data, root,
root.getNextNode());
}
size--;
}
private void removeRecursively(T data, Node<T>
previousNode, Node<T> currentNode) {
if (currentNode == null) {
return;
}
if (currentNode.getData().equals(data)) {
previousNode.setNextNode(currentNode.getNextNode());
return;
}
removeRecursively(data, currentNode,
currentNode.getNextNode());
}
@Override
public void traverse() {
if (isEmpty()) {
System.out.println("List is empty!");
}
Node<T> currentNode = root;
while (currentNode != null) {
System.out.print(currentNode);
currentNode = currentNode.getNextNode();
}
System.out.println();
}
@Override
public void traverseRecursively() {
if (isEmpty()) {
System.out.println("List is empty!");
}
traverse(root);
System.out.println();
}
void traverse(Node<T> node) {
if (node == null) {
return;
}
System.out.print(node);
traverse(node.getNextNode());
}
@Override
public boolean isEmpty() {
return size == 0;
}
}
public interface List<T> {
void insert(T data);
void remove(T data);
void removeRecursively(T data);
void traverse();
void traverseRecursively();
boolean isEmpty();
}
@Data
public class Node <T> {
private final T data;
@ToString.Exclude
private Node<T> nextNode;
@Override
public String toString() {
return data.toString() + " -> ";
}
}
public class SingleLinkedList {
public static void main(String[] args) {
List<Integer> linkedList = new LinkedList<>();
linkedList.insert(10);
linkedList.insert(20);
linkedList.insert(30);
linkedList.insert(40);
linkedList.traverse();
linkedList.remove(20);
linkedList.traverseRecursively();
System.out.println(linkedList.isEmpty());
}
}