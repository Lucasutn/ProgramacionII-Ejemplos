package Grafos;

public class Dijkstra {
    
    public static String vertices[]={"a","b","c","d","e","f"};
    public static int[][] pesos= {
        {0,4,2,999,999,999},
        {4,0,1,5,999,999},
        {2,1,0,8,10,999},
        {999,5,8,0,2,6},
        {999,999,10,2,0,2},
        {999,999,999,6,2,0}};
    
    public static void main(String[] args){
        Grafo grafo = new Grafo(vertices, pesos);
        
        grafo.imprimir();
        
        grafo.calcularDijkstra();

        System.out.println("\n");

        String [] Agrafo = {"a","b","c","d","f"};
        Grafo grafo1 = new Grafo(Agrafo);

        grafo1.conectar("a","b",1);
        grafo1.conectar("a","c",1);
        grafo1.conectar("a","d",1);
        grafo1.conectar("b","f",1);
        grafo1.conectar("d","f",1);

        grafo1.imprimir();
    }
    
}