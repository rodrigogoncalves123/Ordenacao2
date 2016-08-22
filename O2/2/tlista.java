


public class tlista {
	int size;
	tno head;
	
	public tlista(){//cria lista
		size = 0;
		head = null;
	}
	
	public int add(int pos, int dado){
		int i;
		
		if(pos > size + 1 || pos < 0) return 0;
		
		tno novo = new tno();
		novo.dado = dado;
		

		
		tno aux = head;

		if(novo == null) return 0;
		

		if(pos == 1 && head == null){
			head = novo;
			novo.prox = null;
			head = novo;
			size++;
			return 1;
		}
		
		for(i = 1; i < pos - 1; i++){
			aux = aux.prox;
		}
		
		if(pos == 1){
			novo.prox = head;
			
			head = novo;
			size++;
			return 1;
		}
		
		novo.prox = aux.prox;
		aux.prox = novo;
		
		size++;
		return 1;
	}

	public int removeData(int pos){
		if(pos < 0 || pos > size) return 0;
		if(pos == 1){
			head = (head.prox);
			size--;
			return 1;
		}
		tno n = getEnd(pos - 1);
		n.prox = (n.prox).prox;	
		size--;
		return 1;
	}//remove o elemento do referido nó
	
	
	public tno getEnd(int pos){
		if(pos > size && pos < 0){
			return null;		
		}
		tno aux = head;
		for(int i = 1; i < pos; i++){
			aux = aux.prox;		
		}
		return aux;
	}

	
	public int get(int pos){
		if(pos <= size && pos > 0){
			tno aux = head;
			for(int i = 1; i < pos; i++){
				aux = aux.prox;		
			}
		return (aux.dado);
		}
		return 0;
	}
	
	public void print(){
		tno aux = head;
		while(aux != null){ System.out.print(aux.dado + " "); aux = aux.prox;}
	}
	
	public static void main(String []args){
		tlista x = new tlista();
		x.add(1,10);
		x.add(2,38);
		
		x.removeData(2);
		//x.removeData(1);
		
		/*x.add(1, 15);
		x.add(3,21);

		x.add(2, 28);
		x.removeData(3);
		x.removeData(2);

		x.removeData(1);
		x.removeData(2);
		x.removeData(1);*/
		
		x.print();
		//System.out.println(x.size);
		

		/*tno tt= x.getEnd(2);
		System.out.println(tt.dado);

		int retorno = x.get(2);
		System.out.println(tt.dado);*/
	}
}
