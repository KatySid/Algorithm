package Lesson7;

public class Graph {
    private final int MAX_VERTS = 32;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int size;
    private Stack stack;


    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        size = 0;
        stack = new Stack(MAX_VERTS);
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j]=0;
            }
        }
    }

    private int getAdjUnvisitedVertex(int ver){
        for (int i = 0; i < size; i++) {
            if (adjMat[ver][i] == 1 && vertexList[i].wasVisited == false){
                return i;
            }
        }
        return -1;
    }

    public void addVertex (char label){
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge (int start, int end){
        adjMat[start][end]=1;
        adjMat[end][start]=1;
    }

    public void displayVertex(int vertex){
        System.out.println(vertexList[vertex].label);
    }

    public void dfs(){
        vertexList[0].wasVisited =true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()){
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v==-1){
                stack.pop();
            } else{
                vertexList[v].wasVisited= true;
                displayVertex(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
          vertexList[i].wasVisited = false;
        }
    }

    public void dfs2(int f){
        vertexList[f].wasVisited=true;

        for (int i = 0; i < size; i++) {
            int v = getAdjUnvisitedVertex(f);
            if(!vertexList[i].wasVisited && v!=-1){
                fullDisplayVertex(f,v);
                dfs2(i);
            }
        }
    }

    public void cleaner(){
        for (int j = 0; j < size; j++) {
            vertexList[j].wasVisited = false;
        }
    }

    public void bfs(int s){
        cleaner();
        bfs2(s);
    }
    public void bfs2 (int s) {
        int v = 0;
        Queue queue = new Queue(MAX_VERTS);
        vertexList[s].wasVisited = true;
        for (int j = 0; j < size; j++) {
            if (adjMat[s][j] == 1 && vertexList[j].wasVisited == false) {
                queue.insert(j);
                vertexList[j].wasVisited = true;
                fullDisplayVertex(s, j);
            }
        }
        while(!queue.isEmpty()){
        v = queue.remove();
        bfs2(v);
        }
    }
    private void fullDisplayVertex(int vertex1, int vertex2) {
        System.out.println("Вершины "+ vertexList[vertex1].label + "-" + vertexList[vertex2].label);
    }
}
