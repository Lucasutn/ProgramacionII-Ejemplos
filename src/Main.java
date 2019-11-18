import Arboles.*;


public class Main {

    public static void main(String[] args) {


    ArbolBinario arbolBinario = new ArbolBinario();

    arbolBinario.agregar("+");
    arbolBinario.agregar("*");
    arbolBinario.agregar("1");
    arbolBinario.agregar("3");
    arbolBinario.agregar("-");
    arbolBinario.agregar("1");
    arbolBinario.agregar("6");


  //  arbolBinario.imprimirEnAnchura();
   // arbolBinario.imprimirInOrder();
  //  arbolBinario.imprimirPostOrder();
        arbolBinario.imprimirPreOrder();



    }
}
