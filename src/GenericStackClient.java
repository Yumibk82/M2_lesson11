public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1.Stack of integers");
        stackOfInteger();
        System.out.println("Stack of String");
        stackOfStrings();
    }
    private static void stackOfStrings(){
        MyGenericStack stack=new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1.1 Size of stack after push operations: "+stack.size());
        System.out.println("1.2 Pop element from stack ");
        while (stack.isEmpty()){
            System.out.println("stack is "+stack.pop());
        }
        System.out.println("size of stack after pop operations: "+stack.size());
    }
    private static void stackOfInteger(){
        MyGenericStack<Integer> stack=new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("2.1 size of stack after push operations" +stack.size());
        System.out.println("2.2 pop element from stack : ");
        while (stack.isEmpty()){
            System.out.println("---"+stack.size());
        }
        System.out.println("3.size of stack after pop operations: "+stack.size());
    }
}
