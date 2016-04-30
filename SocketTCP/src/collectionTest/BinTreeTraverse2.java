package collectionTest;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.List;

/**
 * 功能：把一个数组的值存入二叉树中，然后进行3种方式的遍历
 * 
 * 参考资料0:数据结构(C语言版)严蔚敏
 * 
 * 参考资料1：http://zhidao.baidu.com/question/81938912.html
 * 
 * 参考资料2：http://cslibrary.stanford.edu/110/BinaryTrees.html#java
 * 
 * @author ocaicai@yeah.net @date: 2011-5-17
 * 
 */
public class BinTreeTraverse2 {

	private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private static List<Node> nodeList = null;

	/**
	 * 内部类：节点
	 * 
	 * @author ocaicai@yeah.net @date: 2011-5-17
	 * 
	 */
	private static class Node {
		Node leftChild;
		Node rightChild;
		int data;

		Node(int newData) {
			leftChild = null;
			rightChild = null;
			data = newData;
		}
	}

	public void createBinTree() {
		nodeList = new LinkedList<Node>();
		// 将一个数组的值依次转换为Node节点
		for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
			nodeList.add(new Node(array[nodeIndex]));
		}
		// 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树
		for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
			// 左孩子
			nodeList.get(parentIndex).leftChild = nodeList
					.get(parentIndex * 2 + 1);
			// 右孩子
			nodeList.get(parentIndex).rightChild = nodeList
					.get(parentIndex * 2 + 2);
		}
		// 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理
		int lastParentIndex = array.length / 2 - 1;
		// 左孩子
		nodeList.get(lastParentIndex).leftChild = nodeList
				.get(lastParentIndex * 2 + 1);
		// 右孩子,如果数组的长度为奇数才建立右孩子
		if (array.length % 2 == 1) {
			nodeList.get(lastParentIndex).rightChild = nodeList
					.get(lastParentIndex * 2 + 2);
		}
	}

	/**
	 * 先序遍历
	 * 
	 * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
	 * 
	 * @param node
	 *            遍历的节点
	 */
	public static void preOrderTraverse(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrderTraverse(node.leftChild);
		preOrderTraverse(node.rightChild);
	}

	/**
	 * 中序遍历
	 * 
	 * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
	 * 
	 * @param node
	 *            遍历的节点
	 */
	public static void inOrderTraverse(Node node) {
		if (node == null)
			return;
		inOrderTraverse(node.leftChild);
		System.out.print(node.data + " ");
		inOrderTraverse(node.rightChild);
	}

	/**
	 * 后序遍历
	 * 
	 * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
	 * 
	 * @param node
	 *            遍历的节点
	 */
	public static void postOrderTraverse(Node node) {
		if (node == null)
			return;
		postOrderTraverse(node.leftChild);
		postOrderTraverse(node.rightChild);
		System.out.print(node.data + " ");
	}

	public static void main(String[] args) {
		BinTreeTraverse2 binTree = new BinTreeTraverse2();
		binTree.createBinTree();
		// nodeList中第0个索引处的值即为根节点
		Node root = nodeList.get(0);

		System.out.println("先序遍历：");
		preOrderTraverse(root);
		System.out.println();

		System.out.println("中序遍历：");
		inOrderTraverse(root);
		System.out.println();

		System.out.println("后序遍历：");
		postOrderTraverse(root);
	}

}


/*
@SuppressWarnings("rawtypes")
class BinaryTree2 {
	private class Node{
		
		
		private Comparable data; //排序的依据
		private Node left;
		private Node right;
		
		public Node( Comparable data){
			this.data = data;
		}
		
		@SuppressWarnings("unchecked")
		public void addNode(Node node){
			if(this.data.compareTo(node) > 0){
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
public class BinaryTree{
public static void main(String[] args) {
		
		BinaryTree2 bTree = new BinaryTree2();
		bTree.add(100);
		bTree.add(90);
		bTree.add(80);
		bTree.add(95);
		bTree.add(120);
		bTree.add(110);
		bTree.add(new Book2("Java", 50));
		bTree.add(new Book2("C", 40));
		bTree.add(new Book2("J2ee",60));
		bTree.add(new Book2("php", 35));
		bTree.add(new Book2("C++", 45));
		Object[] object = bTree.toArray();
		System.out.println(Arrays.toString(object));
	}
	
}
class Book2 implements Comparable<Book2>{
	private String name;
	private double price;
	public Book2(String name, double price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return "name:"+name+",price:"+price;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if (obj instanceof Book) {
			Book2 book = (Book2)obj;
			if(book.name==name&&book.price==price)
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(Book2 o) {
		if(this.price > o.price){
			return 1;
		}else if(this.price < o.price){
			return -1;
		}else{
			return 0;
		}
	}
	
}*/