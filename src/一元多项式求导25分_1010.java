import java.util.Scanner;

/*
 * ����������ģ���ڴ棬��������±꼴λָ����ֵΪϵ����
 */
public class һԪ����ʽ��25��_1010 {
	public static void main(String[] args) {
		//Node[] ram = new Node[1001];//�ڴ�
		Scanner sca =new Scanner(System.in);
		Node l = new Node(-1, -1);
		//int length = 0;
		//String[] str = sca.nextLine().split(" ");
		
		//����
		while(sca.hasNextInt()){
			int a = sca.nextInt();//coe
			int b = sca.nextInt();//adrs
			Node n = new Node(b, a);
			l.add(n);
		}
		sca.close();
		//���������
		Node p = l;
		while(p.next!=null){
			if(p.next.adrs==0){
				p.next = null;
				break;
			}
			p=p.next;
			
			p.coe*=p.adrs;
			p.adrs--;
		}
		p=l;
		if(p.next==null){
			System.out.print(0+" "+0);
		}
		while(p.next!=null){
			p=p.next;
			if(p.next!=null)
				System.out.print(p.coe+" "+p.adrs+" ");
			else System.out.print(p.coe+" "+p.adrs);
		}
	}
}

class Node{
	int adrs;
	int coe;// ϵ��
	Node next;
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node(int adrs,int coe){
		this.adrs= adrs;
		this.coe = coe;
		this.next = null;
	}
	void add(int coe,int adrs){
		Node p = this;
		Node n = new Node();
		n.coe=coe;
		n.adrs=adrs;
		n.next=null;
		while(p.next!=null){
			p=p.next;
		}
		p.next = n;
	}
	void add(Node n){
		Node p = this;
		while(p.next!=null){
			p=p.next;
		}
		p.next = n;
	}
}