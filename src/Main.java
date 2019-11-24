import Arboles.*;
import Grafos.Grafo;


public class Main {

    public static void main(String[] args) {
//
//        String vertices1[]={"a","b","c","d","e","f"};
//
//    String[] vertices= {"A","B","C","D","E","F","G","H","I","J"};
//    int[][] aristas={
//            {0,2,4,3,999,999,999,999,999,999},
//            {2,0,999,999,7,4,6,999,999,999},
//            {4,999,0,999,3,2,4,999,999,999},
//            {3,999,999,0,4,1,5,999,999,999},
//            {999,7,3,4,0,999,999,1,4,999},
//            {999,4,2,1,999,0,999,6,3,999},
//            {999,6,4,5,999,999,0,3,3,999},
//            {999,999,999,999,1,6,3,0,999,3},
//            {999,999,999,999,4,3,3,999,0,4},
//            {999,999,999,999,999,999,999,3,4,0}
//    };
//
//        int[][] pesos= {
//                {0,4,2,999,999,999},
//                {4,0,1,5,999,999},
//                {2,1,0,8,10,999},
//                {999,5,8,0,2,6},
//                {999,999,10,2,0,2},
//                {999,999,999,6,2,0}};
//
//        int[][] pesos1= {
//                {0,5,3,999,999,999},
//                {4,0,1,5,999,999},
//                {2,1,0,8,10,999},
//                {999,5,8,0,2,6},
//                {999,999,10,2,0,2},
//                {999,999,999,6,2,0}};
//
//        Grafo grafo = new Grafo(vertices,aristas );
//        Grafo grafo1 = new Grafo(vertices1,pesos );
        //Grafo grafo2 = new Grafo(vertices1,pesos1 );

      //  grafo.imprimir();
      //  grafo.calcularDijkstra();
       //System.out.println("\n");


//       grafo1.calcularDijkstra();


       // System.out.println("\n");
     //   grafo2.calcularDijkstra();






//        Grafo lucasGrafo= new Grafo(vertices,aristas);
//
//        lucasGrafo.conectar("A","B",2);
//        lucasGrafo.imprimir();

       // lucasGrafo.calcularDijkstra();


    ArbolBinario arbolBinario = new ArbolBinario();

    arbolBinario.agregar("4");
    arbolBinario.agregar("2");
    arbolBinario.agregar("5");
    arbolBinario.agregar("1");
    arbolBinario.agregar("3");
    arbolBinario.agregar("6");
    arbolBinario.agregar("7");





  //  arbolBinario.imprimirEnAnchura();
//    arbolBinario.imprimirInOrder();
//        System.out.println(arbolBinario.getCont());


//        System.out.println(arbolBinario.countChildren(arbolBinario.getRaiz()));
        //System.out.println(arbolBinario.sumDepthOfAllChildren(arbolBinario.getRaiz(),0));
//        System.out.println("\n");
//        System.out.println(arbolBinario.calculoProfundidad());


  //  arbolBinario.imprimirPostOrder();
    arbolBinario.imprimirPreOrder();
        System.out.println(arbolBinario.getNumeroHojas());



//       grafo.conectar("A","B",2);
//        grafo.conectar("A","C",4);
//        grafo.conectar("A","D",3);
//        grafo.conectar("B","A",2);
//        grafo.conectar("B","E",7);
//        grafo.conectar("B","F",4);







    }
}
