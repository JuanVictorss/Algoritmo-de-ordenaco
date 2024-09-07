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
	    long[] resultadoBubble20 = new long[30];
	    long[] resultadoQuick20 = new long[30];
	    long[] resultadoMerge20 = new long[30];
	    long tempoBubbleTotal = 0;
	    long tempoQuickTotal = 0;
	    long tempoMergeTotal = 0;
	    
	    for(int i = 0; i < 30; i++) {
	        int TAMANHO = 50000;
	        
	        Ordenacao vetor50 = new Ordenacao(TAMANHO);
	        int[] aux = new int[TAMANHO];
	        
	        int tamanho = TAMANHO - 1;
	        
	        int[] bubbleArray = vetor50.getVetor().clone();
	        int[] quickArray = vetor50.getVetor().clone();
	        int[] mergeArray = vetor50.getVetor().clone();
	        
	        Ordenacao bubble = new Ordenacao(bubbleArray);
	        Ordenacao quick = new Ordenacao(quickArray);
	        Ordenacao merge = new Ordenacao(mergeArray);
	        
	        
	        // BubbleSort
	        long inicioBubble = System.currentTimeMillis();
	        bubble.bubbleSort();
	        long fimBubble = System.currentTimeMillis();
	        long tempoBubble = fimBubble - inicioBubble;
	        tempoBubbleTotal += tempoBubble;
	        resultadoBubble20[i] = tempoBubble;
	        
	        // QuickSort
	        long inicioQuick = System.currentTimeMillis();
	        quick.quickSort(quick.getVetor(), 0, tamanho);
	        long fimQuick = System.currentTimeMillis();
	        long tempoQuick = fimQuick - inicioQuick;
	        tempoQuickTotal += tempoQuick;
	        resultadoQuick20[i] = tempoQuick;
	        
	        // MergeSort
	        long inicioMerge = System.currentTimeMillis();
	        merge.mergeSort(merge.getVetor(), aux, 0, tamanho);            
	        long fimMerge = System.currentTimeMillis();
	        long tempoMerge = fimMerge - inicioMerge;
	        tempoMergeTotal += tempoMerge;
	        resultadoMerge20[i] = tempoMerge;
	    }
	    

	    System.out.println(tempoBubbleTotal + " ms Tempo do BubbleSort com 50.000 elementos");
	    System.out.println();
	    System.out.println(tempoQuickTotal + " ms Tempo do QuickSort com 50.000 elementos");
	    System.out.println();
	    System.out.println(tempoMergeTotal + " ms Tempo do MergeSort com 50.000 elementos");
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
	        
	        int[] bubbleArray = vetor100.getVetor().clone();
	        int[] quickArray = vetor100.getVetor().clone();
	        int[] mergeArray = vetor100.getVetor().clone();
	        
	        Ordenacao bubble = new Ordenacao(bubbleArray);
	        Ordenacao quick = new Ordenacao(quickArray);
	        Ordenacao merge = new Ordenacao(mergeArray);

	        // BubbleSort
	        long inicioBubble = System.currentTimeMillis();
	        bubble.bubbleSort();
	        long fimBubble = System.currentTimeMillis();
	        long tempoBubble = fimBubble - inicioBubble;
	        tempoBubbleTotal += tempoBubble;
	        resultadoBubble100[i] = tempoBubble;

	        // QuickSort
	        long inicioQuick = System.currentTimeMillis();
	        quick.quickSort(quick.getVetor(), 0, tamanho);
	        long fimQuick = System.currentTimeMillis();
	        long tempoQuick = fimQuick - inicioQuick;
	        tempoQuickTotal += tempoQuick;
	        resultadoQuick100[i] = tempoQuick;
	        
	        // MergeSort
	        long inicioMerge = System.currentTimeMillis();
	        merge.mergeSort(merge.getVetor(), aux, 0, tamanho);            
	        long fimMerge = System.currentTimeMillis();
	        long tempoMerge = fimMerge - inicioMerge;
	        tempoMergeTotal += tempoMerge;
	        resultadoMerge100[i] = tempoMerge;
	    }
	    

	    
	    System.out.println(tempoBubbleTotal+" ms Tempo do BubbleSort com 100.000 elementos");
	    System.out.println();
	    System.out.println(tempoQuickTotal+" ms Tempo do QuickSort com 100.000 elementos");
	    System.out.println();
	    System.out.println(tempoMergeTotal+" ms Tempo do MergeSort com 100.000 elementos");
	}
	
	// VETOR DE 200.000 POSIÇÕES
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
	        
	  
	        int[] bubbleVetor = vetor200.getVetor().clone();
	        int[] quickVetor  = vetor200.getVetor().clone();
	        int[] mergeVetor  = vetor200.getVetor().clone();
	        
	        Ordenacao bubble = new Ordenacao(bubbleVetor);
	        Ordenacao quick  = new Ordenacao(quickVetor);
	        Ordenacao merge  = new Ordenacao(mergeVetor);
	        
	        // BubbleSort
	        long inicioBubble = System.currentTimeMillis();
	        bubble.bubbleSort();
	        long fimBubble = System.currentTimeMillis();
	        long tempoBubble = fimBubble - inicioBubble;
	        tempoBubbleTotal += tempoBubble;
	        resultadoBubble200[i] = tempoBubble;
	        
	        // QuickSort
	        long inicioQuick = System.currentTimeMillis();
	        quick.quickSort(quick.getVetor(), 0, tamanho);
	        long fimQuick = System.currentTimeMillis();
	        long tempoQuick = fimQuick - inicioQuick;
	        tempoQuickTotal += tempoQuick;
	        resultadoQuick200[i] = tempoQuick;
	        
	        // MergeSort
	        long inicioMerge = System.currentTimeMillis();
	        merge.mergeSort(merge.getVetor(), aux, 0, tamanho);        
	        long fimMerge = System.currentTimeMillis();
	        long tempoMerge = fimMerge - inicioMerge;
	        tempoMergeTotal += tempoMerge;
	        resultadoMerge200[i] = tempoMerge;
	    }
	    
	    System.out.println(tempoBubbleTotal + " ms Tempo do BubbleSort com 200.000 elementos");
	    System.out.println();
	    System.out.println(tempoQuickTotal + " ms Tempo do QuickSort com 200.000 elementos");
	    System.out.println();
	    System.out.println(tempoMergeTotal + " ms Tempo do MergeSort com 200.000 elementos");
	}
}