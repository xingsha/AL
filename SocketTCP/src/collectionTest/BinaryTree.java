package collectionTest;

import java.util.Arrays;

public class BinaryTree {
	
	public static void main(String[] args) {
		/*BookTree[] bt = new BookTree[]{
				new BookTree("java", 79.8),
				new BookTree("C++", 69.8),
				new BookTree("php", 59.8),
				new BookTree("linux", 89.8)
		};
		Arrays.sort(bt);
		System.out.println(Arrays.toString(bt));*/
		BinaryTree2 bt2 = new BinaryTree2();
		bt2.add(new BookTree("java", 69.8));
		bt2.add(new BookTree("C++", 49.8));
		bt2.add(new BookTree("php", 59.8));
		bt2.add(new BookTree("linux", 89.8));
		
		Object[] obj = bt2.toArray();
		Arrays.sort(obj);
		System.out.println(Arrays.toString(obj));
	}
}

class BookTree implements Comparable<BookTree>{
	private String title;
	private double price;
	public BookTree(String title, double price) {
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return "title："+this.title+"price:"+this.price+"\n";
	}

	@Override
	public int compareTo(BookTree o) {
		if(this.price > o.price){
			return 1;
		}else if(this.price < o.price){
			return -1;
		}else
			return 0;
	}
}
@SuppressWarnings("rawtypes")
class BinaryTree2 {
	private class Node{		
		
		private Comparable data; //排序的依据
		private Node left;
		private Node right;
		public Node(Comparable data){
			this.data = data;
		}
		
		@SuppressWarnings("unchecked")
		public void addNode(Node node){
			if(this.data.compareTo(node) < 0){
				if(this.left == null){
					this.left = node;
				}else{
					this.left.addNode(node);
				}
			}else{
				if(this.right == null){
					this.right = node;
				}else{
					this.right.addNode(node);
				}
			}
		}
		public void toArrayNode(){
			if(this.left != null){
				this.left.toArrayNode();
			}
			BinaryTree2.this.retData[BinaryTree2.this.foot++] = this.data;
			if(this.right != null){
				this.right.toArrayNode();
			}
		}
	}
	private Node root;
	private int count;
	private Object[] retData;
	private int foot;
	
	public void add(Object obj){
		Comparable com = (Comparable)obj;
		Node newNode = new Node(com);
		if(this.root == null){
			this.root = newNode;
		}else{
			this.root.addNode(newNode);
		}
		this.count++;
	}
	public Object[] toArray(){
		if(this.root == null){
			return null;
		}
		this.foot = 0;
		this.retData = new Object[this.count];
		this.root.toArrayNode();
		return this.retData;
	}
	

}