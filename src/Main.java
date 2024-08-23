import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------");
		ordenar50();
		System.out.println("-----------------------------------------");
		ordenar100();
		System.out.println("-----------------------------------------");
		ordenar200();
	}
	
	//VETOR DE 50.000 POSIÇÕES
	public static void ordenar50() {
		long[] resultadoBubble10 = new long[30];
		long[] resultadoQuick10 = new long[30];
		long[] resultadoMerge10 = new long[30];
		long tempoBubbleTotal = 0;
		long tempoQuickTotal = 0;
		long tempoMergeTotal = 0;
		
		for(int i = 0; i < 30; i++) {
			int TAMANHO = 50000;
			
			Ordenacao vetor50 = new Ordenacao(TAMANHO);
			int[] aux = new int[TAMANHO];
			
			int tamanho = TAMANHO - 1;
			
			Ordenacao bubble = vetor50;
			Ordenacao quick = vetor50;
			Ordenacao merge = vetor50;
			
			
			long inicioBubble = System.currentTimeMillis();
			bubble.bubbleSort();
			long fimBubble =System.currentTimeMillis();
			long tempoBubble = fimBubble - inicioBubble;
			tempoBubbleTotal += tempoBubble;
			resultadoBubble10[i] = tempoBubble;
			
			long inicioQuick = System.currentTimeMillis();
			quick.quickSort(quick.getVetor(), 0, tamanho);
			long fimQuick = System.currentTimeMillis();
			long tempoQuick = fimQuick - inicioQuick;
			tempoQuickTotal += tempoQuick;
			resultadoQuick10[i] = tempoQuick;
			
			long inicioMerge = System.currentTimeMillis();
			merge.mergeSort(merge.getVetor(), aux, 0, tamanho);			
			long fimMerge = System.currentTimeMillis();
			long tempoMerge = fimMerge - inicioMerge;
			tempoMergeTotal += tempoMerge;
			resultadoMerge10[i] = tempoMerge;
			
		}
		System.out.println(tempoBubbleTotal+" ms Tempo do BubbleSort com 10.000 elementos = "+Arrays.toString(resultadoBubble10));
		System.out.println();
		System.out.println(tempoQuickTotal+" ms Tempo do QuickSort com 10.000 elementos = "+Arrays.toString(resultadoQuick10));
		System.out.println();
		System.out.println(tempoMergeTotal+" ms Tempo do MergeSort com 10.000 elementos = "+Arrays.toString(resultadoMerge10));
	}
	
	//VETOR DE 100.000 POSIÇÕES
	public static void ordenar100() {
		long[] resultadoBubble100 = new long[30];
		long[] resultadoQuick100 = new long[30];
		long[] resultadoMerge100 = new long[30];
		long tempoBubbleTotal = 0;
		long tempoQuickTotal = 0;
		long tempoMergeTotal = 0;
		
		for(int i = 0; i < 30; i++) {
			int TAMANHO = 100000;
			
			Ordenacao vetor100 = new Ordenacao(TAMANHO);
			int[] aux = new int[TAMANHO];
			
			int tamanho = TAMANHO - 1;
			
			Ordenacao bubble = vetor100;
			Ordenacao quick = vetor100;
			Ordenacao merge = vetor100;
			
			
			long inicioBubble = System.currentTimeMillis();
			bubble.bubbleSort();
			long fimBubble =System.currentTimeMillis();
			long tempoBubble = fimBubble - inicioBubble;
			tempoBubbleTotal += tempoBubble;
			resultadoBubble100[i] = tempoBubble;
			
			long inicioQuick = System.currentTimeMillis();
			quick.quickSort(quick.getVetor(), 0, tamanho);
			long fimQuick = System.currentTimeMillis();
			long tempoQuick = fimQuick - inicioQuick;
			tempoQuickTotal += tempoQuick;
			resultadoQuick100[i] = tempoQuick;
			
			long inicioMerge = System.currentTimeMillis();
			merge.mergeSort(merge.getVetor(), aux, 0, tamanho);			
			long fimMerge = System.currentTimeMillis();
			long tempoMerge = fimMerge - inicioMerge;
			tempoMergeTotal += tempoMerge;
			resultadoMerge100[i] = tempoMerge;
			
		}
		
		System.out.println(tempoBubbleTotal+" ms Tempo do BubbleSort com 100.000 elementos = "+Arrays.toString(resultadoBubble100));
		System.out.println();
		System.out.println(tempoQuickTotal+" ms Tempo do QuickSort com 100.000 elementos = "+Arrays.toString(resultadoQuick100));
		System.out.println();
		System.out.println(tempoMergeTotal+" ms Tempo do MergeSort com 100.000 elementos = "+Arrays.toString(resultadoMerge100));
	}
	
	
	//VETOR DE 200.000 POSIÇÕES
	public static void ordenar200() {
		long[] resultadoBubble200 = new long[30];
		long[] resultadoQuick200 = new long[30];
		long[] resultadoMerge200 = new long[30];
		long tempoBubbleTotal = 0;
		long tempoQuickTotal = 0;
		long tempoMergeTotal = 0;
		
		for(int i = 0; i < 30; i++) {
			int TAMANHO = 200000;
			
			Ordenacao vetor200 = new Ordenacao(TAMANHO);
			int[] aux = new int[TAMANHO];
			
			int tamanho = TAMANHO - 1;
			
			Ordenacao bubble = vetor200;
			Ordenacao quick = vetor200;
			Ordenacao merge = vetor200;
			
			
			long inicioBubble = System.currentTimeMillis();
			bubble.bubbleSort();
			long fimBubble =System.currentTimeMillis();
			long tempoBubble = fimBubble - inicioBubble;
			tempoBubbleTotal += tempoBubble;
			resultadoBubble200[i] = tempoBubble;
			
			long inicioQuick = System.currentTimeMillis();
			quick.quickSort(quick.getVetor(), 0, tamanho);
			long fimQuick = System.currentTimeMillis();
			long tempoQuick = fimQuick - inicioQuick;
			tempoQuickTotal += tempoQuick;
			resultadoQuick200[i] = tempoQuick;
			
			long inicioMerge = System.currentTimeMillis();
			merge.mergeSort(merge.getVetor(), aux, 0, tamanho);		
			long fimMerge = System.currentTimeMillis();
			long tempoMerge = fimMerge - inicioMerge;
			tempoMergeTotal += tempoMerge;
			resultadoMerge200[i] = tempoMerge;
			
		}
		
		System.out.println(tempoBubbleTotal+" ms Tempo do BubbleSort com 200.000 elementos = "+Arrays.toString(resultadoBubble200));
		System.out.println();
		System.out.println(tempoQuickTotal+" ms Tempo do QuickSort com 200.000 elementos = "+Arrays.toString(resultadoQuick200));
		System.out.println();
		System.out.println(tempoMergeTotal+" ms Tempo do MergeSort com 200.000 elementos = "+Arrays.toString(resultadoMerge200));
	}

}
