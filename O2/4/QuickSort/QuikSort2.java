package QuickSort;

import java.util.Scanner;

public class QuikSort2{
	public static void quick_sort(char v[],int ini,int fim, int []x1){
		int meio;
		if(ini < fim) {
			meio = partition(v, ini, fim,x1);
			quick_sort(v, ini, meio,x1);
			quick_sort(v, meio + 1, fim,x1);
		}
	}
	
	public static int partition(char v[], int ini,int fim, int x1[]) {
		int topo, i;
		char pivo = v[ini];
		
		int pivoInt = x1[ini];
		
		topo = ini;
		for(i = ini + 1; i <= fim; i++) {
			if((int)v[i] > (int)pivo) {
				v[topo] = v[i];
				x1[topo] = x1[i];
				v[i] = v[topo + 1];
				x1[i] = x1[topo + 1];
				topo++;
			}
		}
		v[topo] = pivo;
		x1[topo] = pivoInt;
		
		return topo;
	}
			
}