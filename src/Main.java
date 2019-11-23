import Arboles.*;
import Grafos.Grafo;


public class Main {

    public static void main(String[] args) {

    String[] vertices= {"A","B","C","D","E","F","G","H","I","J"};
    int[][] aristas={
            {0,2,4,3,999,999,999,999,999,999},
            {2,0,999,999,7,4,6,999,999,999},
            {4,999,0,999,3,2,4,999,999,999},
            {3,999,999,0,4,1,5,999,999,999},
            {999,7,3,4,0,999,999,1,4,999},
            {999,4,2,1,999,0,999,6,3,999},
            {999,6,4,5,999,999,0,3,3,999},
            {999,999,999,999,1,6,3,0,999,3},
            {999,999,999,999,4,3,3,999,0,4},
            {999,999,999,999,999,999,999,3,4,0}
    };
        Grafo grafo = new Grafo(vertices,aristas );
      //  grafo.imprimir();
        grafo.calcularDijkstra();




//        Grafo lucasGrafo= new Grafo(vertices,aristas);
//
//        lucasGrafo.conectar("A","B",2);
//        lucasGrafo.imprimir();

       // lucasGrafo.calcularDijkstra();
//    ArbolBinario arbolBinario = new ArbolBinario();
//
//    arbolBinario.agregar("+");
//    arbolBinario.agregar("*");
//    arbolBinario.agregar("1");
//    arbolBinario.agregar("3");
//    arbolBinario.agregar("-");
//    arbolBinario.agregar("1");
//    arbolBinario.agregar("6");
//

  //  arbolBinario.imprimirEnAnchura();
   // arbolBinario.imprimirInOrder();
  //  arbolBinario.imprimirPostOrder();
//    arbolBinario.imprimirPreOrder();



//        grafo.conectar("A","B",2);
//        grafo.conectar("A","C",4);
//        grafo.conectar("A","D",3);
//        grafo.conectar("B","A",2);
//        grafo.conectar("B","E",7);
//        grafo.conectar("B","F",4);




    }
}
