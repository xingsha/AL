package DevelopModal;

class testLinklist {
	
	class Node{
		Object data;
		Node next;
		public Node(Object data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	Node head;
	
	public testLinklist() {    //���췽��
		
		this.head = null;
	}

	public void clear(){             //�������
		head =null;
	}
	
	public int size(){               //������
		Node p = head;
		int num = 0;
		while(p != null){
			num++;
			p=p.next;	
			}
		return num;
		}
	
	public void print(){              //��ӡ����
		Node p = head;
		while(p != null){
			System.out.print(p.data+",");
				p = p.next;
		}
		System.out.println();
	}
	
	public boolean isempty(){         //�ж������Ƿ�Ϊ��
		if(head == null){
			return true;
		}else
			return false;
	}
	
	public void insertNode(Object d, int pos){ //�����½ڵ�
		if(pos<0||pos>size()){
			System.out.println("�����쳣");
			}
		Node newNode = new Node(d);
		if(pos == 0){
			newNode.next = head;
			head= newNode;
		}else if(pos >= size()-1){
			getNode(pos-1).next = newNode;
		}else{
			newNode.next = getNode(pos);
			getNode(pos-1).next = newNode;
		}
	}
	
	public Node getNode(int pos){
		if(pos<0||pos>size()){
			System.out.println("�����쳣===");
			}
		if(pos == 0){
			return head;
		}
		Node p = head;
		for(int i =0;i<pos;i++){
			p = p.next;
		}
		return p;
	}
}


public class Linklist{
	public static void main(String[] args) {
		
		testLinklist ll = new testLinklist();
		System.out.println(ll.isempty());
		ll.insertNode(40, 0);
		ll.insertNode(20, 1);
		
		ll.print();
		System.out.println(ll.size());
		ll.insertNode(30, 0);
		ll.insertNode(10, 0);
		ll.print();
		System.out.println(ll.size());
		ll.clear();
		System.out.println(ll.isempty());
		System.out.println(ll.size());	
		}
}





