import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class AdjacenyList{
    Linkedlist a[];
    int vertices;

    AdjacenyList(int vertices){
        this.vertices=vertices;
        a=new Linkedlist[vertices];
        for(int i=0;i<vertices;i++){
            a[i]= new Linkedlist();
            
        }
    }

    public void addEdge(int source, int destination){
        a[source].addNode(destination);
        a[destination].addNode(source);
    }

    public void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.println(i+" is connected to :");
            for (int j=0;j<a[i].getSize();j++){
                System.out.println(a[i].getDataAtAnyPos(j)+"");
            }
            System.out.println("");
        }
    }
    public void BFS(int rootnode){
        boolean visited[]=new boolean[vertices];
        QueueExample q= new QueueExample(vertices);
        visited[rootnode]=true;
        q.enqueue(rootnode);
        while(!q.isEmpty()){
            int x=q.dequeue();
            int [] list = getAdjacentNode(x);
            for(int i=0;i<list.length;i++){
                int adjnode=list[i];
                if(!visited[adjnode]){
                    q.enqueue(adjnode);
                    visited[adjnode]=true;
                }
            }
            System.out.println(x);

        }
    }
    public void DFS(int rootnode, boolean []visited){
        System.out.println("traversing in DFS manner");
        // boolean visited[]= new boolean[vertices];
        visited[rootnode]=true;
        System.out.println(rootnode);
        // Iterator<Integer> iterator=Arrays.stream(getAdjacentNode(rootnode)).iterator();
        // getAdjacentNode(rootnode).iterator();
        int [] list=getAdjacentNode(rootnode);
        for(int i=0;i<list.length;i++){
            int adjval=list[i];
            if(!visited[adjval]){
                DFS(adjval,visited);
            }
        }
    }
    public void toposort(){
        int indegree[]=new int[vertices];
        for(int i=0;i<vertices;i++){
            //i=0 list[1,2] list[j]=list[0]=1=adjval
            int [] list=getAdjacentNode(i);
            for(int j=0;j<list.length;j++){
                int adjval=list[j];
                indegree [adjval]++;
                // indegree [adjval]=indegree[adjval]+1;
            }
        }
        QueueExample q= new QueueExample(vertices);

        for(int i=0;i<vertices;i++){
            if(indegree[i]==0){
                q.enqueue(i);
                
            }
        }
        int cnt=0;
        while(!q.isEmpty()){
            int x=q.dequeue();
            System.out.println(x);
            int [] list=getAdjacentNode(x);
            for(int i=0;i<list.length;i++){
                int adjval=list [i];
                indegree[adjval]--;
                if(indegree[adjval]==0){
                    q.enqueue(adjval);
                }
            }
        }
    }

    

    public void depthfirstsearch(int rootnode){
        System.out.println("");
        boolean []visited=new boolean[vertices];
        DFS(rootnode, visited);
    }
    public int [] getAdjacentNode(int i){
        int list[]=new int[a[i].getSize()];
        Linkedlist.Node current=a[i].head;
        int indx=0;
        while(current!=null){
            list[indx++]=current.data;
            current=current.next;
        }
        return list;
    }
    public static void main(String[] args) {
        AdjacenyList g=new AdjacenyList(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.printGraph();
        g.BFS(0);

    }
}

