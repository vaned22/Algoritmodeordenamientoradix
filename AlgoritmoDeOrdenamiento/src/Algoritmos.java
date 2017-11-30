/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanessa albarran
 */
public class Algoritmos {
    public static void main(String[] args) {
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
        int vector1[] = {5, 6, 3, 44, 22, 1};
        int vector2[] = {55, 4, 43, 44, 2, 10};

        /*System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo ordenado con burbuja 1");
        ordenar.burbuja1(vector1);
        ordenar.mostrarArreglo(vector1);
        System.out.println();
        System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo ordenado con burbuja 2");
        ordenar.burbuja1(vector2);
        ordenar.mostrarArreglo(vector2);*/

        System.out.println("Arreglo orginal");
        ordenar.mostrarArreglo(vector2);
        ordenar.radix(vector2);

    }
}

