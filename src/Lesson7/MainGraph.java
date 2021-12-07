package Lesson7;

public class MainGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('H');

        graph.addEdge(0,1);//AB
        graph.addEdge(1,2);//BC
        graph.addEdge(0,3);//AD
        graph.addEdge(3,4);//DE
        graph.addEdge(0,5);
        System.out.println("Обход в глубину всех вершин без указания начала обхода");
        graph.dfs();

        System.out.println("Обход в глубину с указанием вершины начала обхода");
        graph.dfs2(3);


        graph.cleaner();
        System.out.println("Обход в ширину с указанием вершины начала обхода");
        graph.bfs(3);

    }
}
