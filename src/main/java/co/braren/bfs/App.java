package co.braren.bfs;

import co.braren.bfs.algorithm.BreadthFirstSearch;
import co.braren.bfs.commons.MockData;
import co.braren.bfs.model.Node;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("El resultado del análisis de los nodos con BFS fue:\n\t" + App.initBFS() + "\n");
    }

    public static String initBFS() {
        Node nodeA = new Node(MockData.TEST_DATA_A);
        Node nodeB = new Node(MockData.TEST_DATA_B);
        Node nodeC = new Node(MockData.TEST_DATA_C);
        Node nodeD = new Node(MockData.TEST_DATA_D);
        Node nodeE = new Node(MockData.TEST_DATA_E);
        Node nodeF = new Node(MockData.TEST_DATA_F);
        Node nodeG = new Node(MockData.TEST_DATA_G);
        Node nodeH = new Node(MockData.TEST_DATA_H);
        Node nodeI = new Node(MockData.TEST_DATA_I);

        nodeA.setNeighbor(nodeB);
        nodeA.setNeighbor(nodeF);
        nodeB.setNeighbor(nodeC);
        nodeB.setNeighbor(nodeD);
        nodeD.setNeighbor(nodeE);
        nodeF.setNeighbor(nodeG);
        nodeG.setNeighbor(nodeH);
        nodeG.setNeighbor(nodeI);

        BreadthFirstSearch bfsExample = new BreadthFirstSearch();
        return bfsExample.init(nodeA);
    }
}
