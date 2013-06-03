public class VectorAdd{
	public static void main(String[] args){
		int numElements = 50000;

		int[] vectorA = new int[numElements];
		int[] vectorB = new int[numElements];

		long start = System.nanoTime();
		
		for(int i = 0; i < numElements; i++){
			vectorA[i] = (int)(10 * Math.random());
			vectorB[i] = (int)(10 * Math.random());
		}

		int[] vectorC = new int[numElements];

		for(int i = 0; i < numElements; i++){
			vectorC[i] = vectorA[i] + vectorB[i];
		}
		long time = System.nanoTime() - start;
		
		System.out.printf("Execution time %,d ns%n", time);
	}
}