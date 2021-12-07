package Lesson6;

import java.util.Comparator;

public class MyTree <T extends Comparable> {
    private MyNode root;

    public void  insert (T person){
        MyNode node = new MyNode();
        node.myNode = person;
        if (root == null){
            root = node;
        } else {
            MyNode current = root;
            MyNode parent;
            while (true){
                parent = current;
                if (person.compareTo(current.myNode)<0){
                    current = current.leftChild;
                    if(current==null){
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null){
                        parent.rightChild = node;
                        return;
                    }
                }

            }
        }

    }

    public MyNode find (T person){
        MyNode current = root;
        while (!current.myNode.equals(person)){
            if (person.compareTo(current)< 0){
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current==null){
                return null;
            }
        }
        return current;
    }
    public void inOrder (MyNode rootNode){
        if (rootNode!= null){
            inOrder(rootNode.leftChild);
            rootNode.display();
            inOrder(rootNode.rightChild);
        }
    }

    public void preOrder (MyNode rootNode){
        if (rootNode!=null){
            rootNode.display();
            preOrder(rootNode.leftChild);
            preOrder(rootNode.rightChild);
        }
    }

    public void postOrder(MyNode rootNode){
        if (rootNode!=null){
            postOrder(rootNode.leftChild);
            postOrder(rootNode.rightChild);
            rootNode.display();
        }
    }

    public MyNode min (){
        MyNode current;
        MyNode last = null;
        current = root;
        while (current!=null){
            last=current;
            current=current.leftChild;
        }
        return last;
    }

    public  MyNode max(){
        MyNode current;
        MyNode last = null;
        current= root;
        while (current!=null){
            last = current;
            current = current.rightChild;
        }
        return last;
    }
    public boolean delete (T person){
        MyNode current = root;
        MyNode parent = root;

        boolean isLeftChild = true;
        while (!current.myNode.equals(person)){
            parent = current;
            if (person.compareTo(current)< 0){
                isLeftChild = true;
                current = current.leftChild;
            } else{
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current==null){
                return false;
            }
        }
        if (current.leftChild == null && current.rightChild == null){
            if (current == root){
                root = null;
            } else if (isLeftChild){
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (current.rightChild == null){
            if (current==null){
                root= current.leftChild;
            } else if (isLeftChild){
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null){
            if (current == null){
                root = current.rightChild;
            } else if (isLeftChild){
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }

        } else {
            MyNode successor = getSuccessor (current);
            if (current==root){
                root= successor;
            } else if (isLeftChild){
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }
    public MyNode getSuccessor(MyNode node){
        MyNode successorParent = node;
        MyNode successor = node;
        MyNode current = node.rightChild;
        while (current!=null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor!=node.rightChild){
            successorParent.leftChild =successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }

    public void displayTree(){
        MyNode current = root;
        System.out.println("Симметричный");
        inOrder(root);
        System.out.println("Прямой");
        preOrder(root);
        System.out.println("Обратный");
        postOrder(root);
    }
}
