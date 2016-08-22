package ordenacao5;

import java.util.Scanner;

public class buscaBinaria {
	public static int buscaBinaria(int []v, int dado){
		int tamanho = v.length;

		
		
		int pos = recursao(v, 0, tamanho - 1,dado);
		return pos;
	}
	
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
		n = x.nextInt();
		int v[] = new int[n];
		for (int i = 0; i < n; i++) v[i] = x.nextInt();
		//System.out.println(v.length);
		int pos = buscaBinaria(v,4);
		System.out.println(pos);
		
	}
}
