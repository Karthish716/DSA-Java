/**
 * 
 */
package sample2;



public class GraphDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               final int[][] graph = {
                		{0,1,0,0,1},
                		{1,0,1,0,1},
                		{0,1,0,1,0},
                		{0,0,1,0,1},
                		{1,1,0,1,0}
                };
               
               for(int i=0;i<graph.length;i++) {
            	   for(int j=0;j<graph[i].length;j++) {
            		   System.out.print(graph[i][j]);
            	   }
            	   System.out.println();
               }
               
              
               
               
                Graphclass g = new Graphclass(5);
	
	             g.addEdge(0,1);
	             g.addEdge(2,3);
	             g.addEdge(1,2);
	             g.addEdge(3,4);
	             g.addEdge(0,4);
	             g.addEdge(1,4);
	             g.addEdge(1, 3);
	        
	             
	             g.printadjList();
	             
	             g.bfs(0);
	             
	             System.out.println();
	             
	           
	       
	             
	             
	
	}

}
