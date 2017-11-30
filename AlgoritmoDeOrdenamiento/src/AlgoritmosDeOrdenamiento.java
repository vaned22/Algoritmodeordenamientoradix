/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

/**
 *
 * @author vanessa albarran
 */
public class AlgoritmosDeOrdenamiento {
    int i,j,temporal,pasadas;
    public AlgoritmosDeOrdenamiento(){
        this.i=0;
        this.j=0;
        this.temporal=0;
    }

    public void burbuja1(int [] arreglo){
        pasadas=0;
        for(i=0; i<arreglo.length; i++){
            for(j=i+1; j<arreglo.length;j++){
                if (arreglo[i]>arreglo[j]){
                    temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en "+pasadas+" pasadas");
    }

    public void burbuja2(int[] arreglo){
        pasadas=0;
        for(i=1; i<arreglo.length; i++){
            for(j=0; j<arreglo.length-1;j++){
                if (arreglo[j]>arreglo[j+1]){
                    temporal=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en "+pasadas+" pasadas");

    }

    public void mostrarArreglo(int [] arreglo){
        int k=0;
        for(k=0;k<arreglo.length; k++){
            System.out.print("["+arreglo[k]+"]");
        }
        System.out.println();
    }

    public void radix(int[] arreglo){
        int x ,i,j;
        for(x=Integer.SIZE-1; x>=0; x--){
            int auxiliar[]=new int[arreglo.length];
            j=0;
            for(i=0;i<arreglo.length; i++){
                boolean mover=arreglo[i]<<x>=0;
                if (x==0 ? !mover:mover){
                    auxiliar[j]=arreglo[i];
                    j++;
                }else {
                    arreglo[i-j]=arreglo[i];
                }
            }
            for(i=j;i<auxiliar.length;i++){
                auxiliar[i]=arreglo[i-j];
            }
            arreglo=auxiliar;
        }
        System.out.println("El Arreglo Ordenado con Radix es: ");
        mostrarArreglo(arreglo);

    }

}
