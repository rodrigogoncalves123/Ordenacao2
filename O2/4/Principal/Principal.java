package Anagrama;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Scanner;

import QuickSort.QuikSort2;
import QuikSortInteger.Quick;


public class Principal{

    public static void main(String[] args) throws IOException {
    	
    	//exemplo
    	char x1[] = {'b','r','g','r','b'};
    	int x2[] = {2,30,10,9,5};
    	


    	QuikSort2.quick_sort(x1, 0, 4,x2);
    
    	
    	
    	char first = x1[0];
    	
    	int i = 0;//fim;
    	int ini = 0;
    	while(i < x1.length && x1[i] == first){
    		
    		if(i < (x1.length - 1) && x1[i + 1] != first){
    			first = x1[i+1];
    			Quick.quick_sort(x2,ini, i);
    			ini = i + 1;
    		}
    		i++;
    	}
    	i--;
    	Quick.quick_sort(x2,ini, i);
    	
    	
    	
    	for(int j = 0; j < 5; j++){
			System.out.print(x1[j] + " , ");
		}
    	System.out.println();
    	for(int j = 0; j < 5; j++){
			System.out.print(x2[j] + " , ");
		}
    	
    	
    	
    }
}