

import java.util.Scanner;

public class Quick{
	
	public static void quick_sort(tlista t,int ini,int fim){
		int meio;
		if(ini < fim) {
			meio = partition(t, ini, fim);
			//return ;
			quick_sort(t, ini, meio);
			quick_sort(t, meio + 1, fim);
		}
	}
	
	public static int partition(tlista t, int ini,int fim) {

		
		int pivo;
		pivo = t.get(ini);
		
		tno topo = t.getEnd(ini);
		int topo2 = ini;
		
		tno i;
		for(i = topo.prox; i!= null ; i = i.prox) {
			
			
			if(i.dado < pivo) {
				topo.dado = i.dado;
				i.dado = (topo.prox).dado;

				topo = topo.prox;
				topo2++;
			}
		}
		
		topo.dado = pivo;
		return topo2;
	}
	
	public static void main(String []args){
		
		tlista t = new tlista();
 		
		System.out.println("Insira o tamanho de vetor:");
		Scanner x = new Scanner(System.in);
		int tamanho = x .nextInt();
		int aux = 0;
		System.out.println("Teste:");
		for(int i = 1; i <= tamanho; i++){
			aux = x.nextInt();
			t.add(i,aux);	
			//v[i] = x.nextInt();
			
		}
		t.print();

		quick_sort(t,1,tamanho);
		System.out.println("\n");

		t.print();
		
	}
}
