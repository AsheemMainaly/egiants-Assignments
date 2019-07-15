public class CrunchifyOM {



public static void main(String[] args) throws Exception{
    CrunchifyOM memoryTest = new CrunchifyOM();
    memoryTest.generateOM();
}

public void generateOM() throws Exception{
    int iteratorValue = 20;
    System.out.println("\n===started");
    for(int outerIterator = 1; outerIterator<20;outerIterator++) {

        System.out.println("Iteration" + outerIterator + "Free mem" +
        Runtime.getRuntime().freeMemory());
        int loop1 = 2;
        int[] memoryFillIntVar  = new int[iteratorValue];

        do{
            memoryFillIntVar[loop1] = 0;
            loop1--;

        } while(loop1>0);
        iteratorValue = iteratorValue * 5;
        System.out.println("\nRequired Memory for next loop: "
        + iteratorValue);
			//Thread.sleep(1000);
    }
}

}
