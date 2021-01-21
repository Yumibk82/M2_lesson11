import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data){
        head=new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public void add(int index,Object data){
        Node temp=head;
        Node holder;

        for (int i = 0; i < index-1&&temp.next!=null; i++) {
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;

        Stack<String> s=new Stack<>();
        Queue<String> q=new LinkedList<>();
        List q1=new ArrayList();
        List s1=new Stack();
        Set s3=new TreeSet();
        List l=new List;
        Queue h=new PriorityQueue();


    }


}
