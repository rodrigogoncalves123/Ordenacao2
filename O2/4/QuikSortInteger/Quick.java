package QuikSortInteger;

import java.util.Scanner;

public class Quick{
	public static void quick_sort(int v[],int ini,int fim){
		int meio;
		if(ini < fim) {
			meio = partition(v, ini, fim);
			quick_sort(v, ini, meio);
			quick_sort(v, meio + 1, fim);
		}
	}
	
	public static int partition(int v[], int ini,int fim) {
		int pivo, topo, i;
		pivo = v[ini];
		topo = ini;
		for(i = ini + 1; i <= fim; i++) {
			if(v[i] < pivo) {
				v[topo] = v[i];
				v[i] = v[topo + 1];
				topo++;
			}
		}
		v[topo] = pivo;
		return topo;
	}
	
	public static void main(String []args){
		int v[];
		System.out.println("Insira o tamanho de vetor:");
		Scanner x = new Scanner(System.in);
		int tamanho = x .nextInt();
		v = new int[tamanho];
		System.out.println("Teste:");
		for(int i = 0; i < tamanho; i++){
			
			v[i] = x.nextInt();
			
		}
		quick_sort(v,0,tamanho - 1);
		for(int i = 0; i < tamanho; i++){
			System.out.println(v[i]);
		}
		
		
		
	}
}