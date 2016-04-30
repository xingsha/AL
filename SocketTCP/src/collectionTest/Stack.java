package collectionTest;

import java.util.Arrays;

public class Stack implements StackADT{
	private LinearNode top;
	private int count;
	public Stack(){
		top = null;
		count = 0;
	}
	@Override
	public void push(Object element) {
		LinearNode node = new LinearNode(element);
		node.setNext(top);
		top = node;
		count++;
		
	}

	@Override
	public Object pop() {
		if(isEmpty()){
			System.out.println("stack is empty");
			System.exit(1);
		}
		Object rs = top.getElement();
		top = top.getNext();
		count--;
		return rs;
	}

	@Override
	public int size() {
		
		return count;
	}

	@Override
	public boolean isEmpty() {
		
		return (size() == 0);
	}

	@Override
	public Object peek() {
		Object rs = top.getElement();
		return rs;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		String str = "1234567890";
		boolean flag = true;
		String[] sb = str.split("");
		for(int i=0;i<sb.length;i++){
			stack.push(sb[i]);
			System.out.print(stack.peek().toString()+",");
		}
		System.out.println();
		for(int i=sb.length-1;i>=0;i--){
			System.out.print(stack.pop().toString()+",");
		}
		/*for(int i=0;i<sb.length;i++){
			if((sb[i].equals("("))||(sb[i].equals("["))||(sb[i].equals("{"))){
				stack.push(sb[i]);
				String peek = stack.peek().toString();
				System.out.println(peek);
			}
			if((sb[i].equals(")"))||(sb[i].equals("]"))||(sb[i].equals("}"))){
				String peek = stack.peek().toString();
				System.out.print(" "+peek);
				
				
			}*/
			/*else{
				String pop =stack.peek().toString();
				System.out.println(pop);
				if(((pop.equals("("))&&(sb[i].equals(")")))||((pop.equals("["))&&(sb[i].equals("]")))||((pop.equals("{"))&&(sb[i].equals("}")))){
					stack.pop();
					continue;
				}else{
					flag = false;
					System.out.println("输入的字符串不完整");
					break;
				}
			}*/
		/*}
		System.out.println();
		if(flag){
			System.out.println("字符串完整");
		}*/
		
		System.out.println(stack.isEmpty()+"==>"+stack.size());
	}
	
}

interface StackADT{
	public void push(Object element);
	public Object pop();
	public int size();
	public boolean isEmpty();
	public Object peek();             //返回栈顶对象的一个引用
	public String toString();
}
class LinearNode<T>{
	private LinearNode next;
	private T element;
	public LinearNode() {
		next = null;
		element = null;
	}
	public LinearNode(T elem){
	       next=null;
	       element=elem;
	}
	public LinearNode getNext() {
		return next;
	}
	public void setNext(LinearNode next) {
		this.next = next;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	
	
}