// Java class for graphs based on adjacency lists. We require that each node is associated with an ID which is an integer number. 
//Therefore, the nodes in an adjacency list should be of the type EndNode
//A method for performing a BFS on the graph, a nonstatic method in the graph class and returning a queue which keeps the resulting sequence


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
public class EndNode
{ 
 
	private Queue<Node> queue;
	static ArrayList<Node> nodes=new ArrayList<Node>(); 
	
	//creating a class for queues
	static class Node
	{
		int end_node_id;
		boolean visited;  //to keep track if node is visited or not.
		List<Node> next;
 
		Node(int data)
		{
			this.end_node_id=data;
			this.next=new ArrayList<>();
		}
		
		//first adding a node  
		public void addnextnode(Node nextNode)
		{
			this.next.add(nextNode);
		}
		
		//extracts node and return its neighbour 
		public List<Node> getnextnode() 
		{
			return next;
		}	
	  }
 
	public EndNode()
	{
		queue = new LinkedList<Node>(); // Create a queue for BFS 
	}
 
	
	//performing a BFS on the graph
	public void bfs(Node node)  //Nonstatic method in the graph class
	{
		queue.add(node);
		node.visited=true;
		// checking if the queue is not empty
		while (!queue.isEmpty())
		{
 
			Node element=queue.remove();  // popping the front node of the queue (dequeue )
			//removing a node from queue to print it.
			System.out.print(element.end_node_id + "    ");
			
			//Find the next node in the queue and checking if node is already visited or not.
			List<Node> nextnode=element.getnextnode(); 
			//lets say we start with node i, then we will visit next node of i, then next node of adjacent node i and so on.
			for (int i = 0; i < nextnode.size(); i++) 
			{
				Node n=nextnode.get(i);
				//Adding the next node to queue 
				//In a queue we always insert the data at REAR (enqueue) 
				if(n!=null && !n.visited)
				{
					queue.add(n);
					n.visited=true;
 
				}
			}
 
		}
	}
 
	public static void main(String arg[])
	{
		//test case 1 for the following graph
		//creating vertices
		Node node1 =new Node(1);
		Node node2 =new Node(2);
		Node node3 =new Node(3);
		Node node4 =new Node(4);
		Node node5 =new Node(5);
		Node node6 =new Node(6);
 
		//creating adjacent vertices of each node in a graph
		node1.addnextnode(node4);
		node1.addnextnode(node2);
		node2.addnextnode(node5);
		node3.addnextnode(node5);
		node3.addnextnode(node6);
		node4.addnextnode(node2);
		node5.addnextnode(node4);
		node6.addnextnode(node6); //self cycles, so we come to the same node 
		
		System.out.println("The BFS traversal for Test Case 1 is ");
		EndNode test1 = new EndNode();
		test1.bfs(node3); //traversal starting from vertex 3
		
		//test case 2 for the following graph
		//creating vertices	
		Node nod1 =new Node(1);
		Node nod2 =new Node(2);
		Node nod3 =new Node(3);
		Node nod4 =new Node(4);
		Node nod5 =new Node(5);
		Node nod6 =new Node(6);
 
		//creating adjacent vertices of each node in a graph
		nod2.addnextnode(nod1);
		nod3.addnextnode(nod1);
		nod4.addnextnode(nod3);
		nod4.addnextnode(nod2);
		nod5.addnextnode(nod4);
		nod5.addnextnode(nod2);
		nod6.addnextnode(nod3);
		nod6.addnextnode(nod4);
		nod6.addnextnode(nod5);
		
		System.out.println("\nThe BFS traversal for Test Case 2 is ");
		EndNode test2 = new EndNode();
		test2.bfs(nod6); //traversal starting from vertex 6		
	}
}
/*explaination for Test Case2 
The queue is initially is empty. We start with node 6. We mark the visited of node 6 as true and put it into queue. 
We print this 6 and pop the front node of the queue. Now we look at the adjacent vertices of node 6. 
Then we check if the adjacent vertex is visited or not. If not visited then we put in queue.
We have vertex 4,5 and 3 adjacent to node 6. Since they are not visited we visit them and put in queue. 
Then we print it and remove it from the queue. Then we look at the adjacent vertices of node 3. 
Node 1, node 6 and node 4 are the adjacent vertices. Since 6 and 4 are visited, we dont do anything for it. 
Node 1 is not visited so we visit this and push it to queue. We print this value and remove it from the queue. 
Now look at the adjacent vertices of 1, it is node 2 and 3. Since node 3 is already visited we dont put this into loop. 
Node 2 is not visited so we visit this and push it to queue. We print this value and remove it from the queue. */
