
import java.util.*;
class Node
{
 	public LinkedList<Integer> edges;
	public int value;
  	Node(int val)
    {
      edges = new LinkedList<Integer>();
      value=val;
    }
    void setValue(int val)
    {
      value = val;
    }
}

class Graph
{
    private int V;                               
	private ArrayList<Node> adj;
    private Queue<Integer> queue;                   
 	private int minPath = 100000;
    Graph(int v)
    {
        V = v;
        adj = new ArrayList<Node>();
        for (int i=0; i<v; i++)
        {
          	Random randGen = new Random();
          	int nodeVal = randGen.nextInt(100000);
          	adj.add(new Node(nodeVal));
        }
        queue = new LinkedList<Integer>();
    }

 
    void addEdge(int v,int w)
    {
        adj.get(v).edges.add(w);                          
    }
    void setValue(int node,int val)
    {
      adj.get(node).value = val;
    }
  
    
  
    int DFSHelper(int n,int searchVal,int currPath, boolean visited[])
    {
      if(visited[n]==true)
      {
      	return 0;
      }
      if(adj.get(n).value==searchVal)
      {
        if(currPath<minPath)
        {
          minPath=currPath;
        }
        return 1;
      }
      
      LinkedList<Integer> foundNodes = adj.get(n).edges;
      int totalNodesFound = 0;
      visited[n]=true;
      for(int i = 0;i<foundNodes.size();i++)
      {
        int tempResult = DFSHelper(foundNodes.get(i),searchVal,currPath+1,visited);
        totalNodesFound+=tempResult;
      }
      //visited[n]=false;
      return totalNodesFound+1;
    }
  	
    int[] BFSHelper(int n,int searchedVal)
    {

        boolean nodes[] = new boolean[V];       
        int a = 0;
 
        nodes[n]=true;                  
        queue.add(n);                   
      	int currPath = 0;
        
      	int totalNodes = 0;

        
        while (queue.size() != 0)
        {
            Queue<Integer> tempQueue = new ArrayDeque<Integer>();
          	while(queue.size() != 0) 
            {
              	n = queue.poll();                        
 				totalNodes++;
                for (int i = 0; i < adj.get(n).edges.size(); i++)  
                {
                    a = adj.get(n).edges.get(i);
                    if (!nodes[a])                    
                    {
                        nodes[a] = true;
                        tempQueue.add(a);
                    }
                  
                }  
        		if(adj.get(n).value==searchedVal)
                {
                  int stats[] = new int[2];
                  stats[0]=currPath;
                  stats[1]=totalNodes;
                    
                  return stats;
                }
           }
           queue = tempQueue;
           currPath++;
          	
        }
      	int stats[] = new int[2];
        stats[0]=-1;
        stats[1]=totalNodes;

        return stats;
    }
	int[] BFS(int n,int searchVal)
    {
      int stats[] = BFSHelper(n,searchVal);
      int returningResult[] = new int[3]; 
      if(stats[0] == -1)
      {
        returningResult[0]=0;
        stats[0]=0;
      } 
      else 
      {
        returningResult[0]=1;
      }
      returningResult[1]=stats[0];
      returningResult[2]=stats[1];
      //Returns an int array where the first element==whether the search value was found. ==0 if it Fails, 1 if Success.
      //Second element: Min Path found. Returns 0 if no path found.
      //Third Element: Total number of nodes visited.
      return returningResult;
    }
    int[] DFS(int n,int searchVal)
    {
      boolean nodes[] = new boolean[V];  
      int foundTotal = DFSHelper(n,searchVal,0,nodes);
      int returningResult[]=new int[3];
      if(minPath==100000)
      {
        returningResult[0]=0;
        minPath=0;
      }
      else
      {
        returningResult[0]=1;
      }
      returningResult[1]=minPath;
      returningResult[2]=foundTotal;
      minPath=100000;
      //Returns an int array where the first element==whether the search value was found. ==0 if it Fails, 1 if Success.
      //Second element: Min Path found. Returns 0 if no path found.
      //Third Element: Total number of nodes visited.
      return returningResult;
    }
    public static void main(String args[])
    {
        Graph graph = new Graph(1000);
      	int start = 0;
      
      	for(int i = 0; i < 1000; i++)
        {
          Random randEdge = new Random();
       	  int randEdges = randEdge.nextInt(5);
          
          for(int j = 0; j <= randEdges; j++)
          {
			Random randConnect = new Random();
      		int randomConnect = randConnect.nextInt(1000);
            graph.addEdge(i, randomConnect);
          }
          
         
     	}
      
      
        
 
        /*graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);
        graph.setValue(4,22);*/
      
      	int bfsStats[] = new int[2];
        bfsStats = (graph.BFS(0, 33));
      	System.out.println(bfsStats);
      	int dfsStats[] = new int[2];
      	dfsStats = (graph.DFS(0,22));
        System.out.println(bfsStats);
      	System.out.println("BFS:");
        if(bfsStats[0] == 0)
        {
          System.out.println("Failure");
        } else {
          System.out.println("Success");
        }
      	System.out.println("Minimum path found: " + bfsStats[1]);
      	System.out.println("Total nodes: " + bfsStats[2]);
      	System.out.println("DFS:");
        if(dfsStats[0] == 0)
        {
          System.out.println("Failure");
        } else {
          System.out.println("Success");
        }
      	System.out.println("Minimum path found: " + dfsStats[1]);
      	System.out.println("Total nodes: " + dfsStats[2]);
 
       
    }
  
}