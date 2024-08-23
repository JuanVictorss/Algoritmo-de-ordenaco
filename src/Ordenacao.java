import java.util.Arrays;
import java.util.Random;

public class Ordenacao {
	private int[] vetor;
	private int tamanho;
	
	public Ordenacao(int tamanho) {
		this.vetor = new int[tamanho];
		this.tamanho = tamanho;
		preencherVetor();
	}
	
	public void preencherVetor() {
		Random valorAleatorio = new Random();
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = valorAleatorio.nextInt(10001);
		}
	}
	
    public void mostrarVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + " = " + vetor[i]);
        }
    }
    
    public int[] getVetor() {
    	return this.vetor;
    }
		
	public void bubbleSort() {
		for(int i = 1; i < tamanho; i++) {
			for(int j = 0; j < tamanho-1; j++) {
				if (vetor[j] > vetor[j+1]) {
					int temporario = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = temporario;
				}
			}
		}
	}
	
	public void quickSort(int[] vetor, int lb, int ub) {
		if (lb < ub) {
			int localDoPivo = posicionarPivo(vetor, lb, ub);
			quickSort(vetor, lb, localDoPivo - 1);
			quickSort(vetor, localDoPivo + 1, ub);
		} 
	}
	
	public int posicionarPivo(int[] vetor, int lb, int ub) {
	    int pivo = vetor[lb];
	    int down = lb;
	    int up = ub;

	    while (true) {
	        while (down <= ub && vetor[down] <= pivo) {
	            down++;
	        }
	        while (up >= lb && vetor[up] > pivo) {
	            up--;
	        }
	        if (down >= up) {
	            break;
	        }
	        swap(vetor, down, up);
	    }

	    swap(vetor, lb, up);
	    return up;
	}

	private void swap(int[] vetor, int i, int j) {
	    int temp = vetor[i];
	    vetor[i] = vetor[j];
	    vetor[j] = temp;
	}
	
	//MERGESORT
	
	public void mergeSort(int[] vetor, int aux[], int low, int high) {
		
		if(low >= high) {
			return;
		}
		
		int mid = (low + high) / 2;
		mergeSort(vetor, aux, low, mid);
		mergeSort(vetor, aux, mid + 1, high);
		
		merge(vetor, aux, low, mid, high);
	}
	
	public void merge(int vetor[], int aux[], int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		
		for (int k = low; k <= high; k++) {
			aux[k] =  vetor[k];
		}
		for (int k = low; k <= high; k++) {
			if(i > mid) {
				vetor[k] = aux[j++];
			}else if(j > high) {
				vetor[k] = aux[i++];
			}else if(aux[j] < aux[i]) {
				vetor[k] = aux[j++];
			}else {
				vetor[k] = aux[i++];
			}
		}
	}
}
