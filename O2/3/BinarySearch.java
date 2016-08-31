//package RotatedArray;

import java.util.Scanner;
public class BinarySearch{
	
public static int BinarySearchRotated(int v[], int dado, int ini, int fim){

	int meio = (ini + fim)/2;

			if(ini > fim){
				return -1;
			}

			if(v[meio] == dado){
				return meio;
			}

			if(v[ini] <= v[meio]) {

		        if (v[ini] <= dado && v[meio] >= dado) 
		                return BinarySearchRotated(v,dado,ini,meio-1);
		
		        else                 
		                return BinarySearchRotated(v,dado,meio+1,fim);

			}
			else{    
				if(v[meio] <= dado && v[fim] >= dado) 
					return BinarySearchRotated(v,dado,meio+1,fim);

				else{
					return BinarySearchRotated(v,dado,ini,meio-1);
				}
			}
		}



//busca binária normal 
public static int recursao(int []v, int ini, int fim, int dado){
	int meio;
	int pos = -1;
	if(ini <= fim){
		meio = (ini + ini)/2;
		if(v[meio] == dado){
			//System.out.println("passei aqui");
			return meio;
		}
		else if(dado < v[meio])
			pos = recursao(v,ini,meio-1,dado);	
		else if(dado > v[meio])
			pos = recursao(v,meio + 1,fim,dado);
	}
	return pos;
}





public static void main(String []args){
	int n;
	Scanner x = new Scanner(System.in);
	System.out.println("Insira o tamanho do vetor ordenado:");
	n = x.nextInt();
	int v[] = new int[n];

	System.out.println("Insira os elementos ordenados no vetor:");
	for (int i = 0; i < n; i++) v[i] = x.nextInt();

	System.out.println("Insira o elemento de pesquisa:");
	int search = x.nextInt();
	int pos = BinarySearchRotated(v,search,0,n - 1);
	
	int pos2 = pos;
	int aux = 0;
	while(pos2 != - 1){
		aux = pos2;
		pos2 = BinarySearchRotated(v,search,0,pos2 - 1);
	}
	pos = aux; 
	System.out.println(pos);
}
}