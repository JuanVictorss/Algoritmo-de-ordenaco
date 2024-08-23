import java.util.Random;

public class Bubble {
	private int[] vetor;
	private int tamanho;
	
	public Bubble(int tamanho) {
		this.vetor = new int[tamanho];
		this.tamanho = tamanho;
		preencherVetor();
	}
	
	public void preencherVetor() {
		Random valorAleatorio = new Random();
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = valorAleatorio.nextInt(10001);
		}
		System.out.println(vetor.length);
	}
	
    public void mostrarVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("numeros[" + i + "] = " + vetor[i]);
        }
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
}
