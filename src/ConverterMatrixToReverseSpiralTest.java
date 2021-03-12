import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ConverterMatrixToReverseSpiralTest {

    ConverterMatrixToReverseSpiral converterMatrixToReverseSpiral = new ConverterMatrixToReverseSpiral();

    @Test
    @DisplayName("It should return matrix to single dimensional array as a reverse spiral")
    void testConvert() {

        int[][] exampleArray = new int[][]{
                {1, 16, 15, 14, 13},

                {2, 17, 24, 23, 12},

                {3, 18, 25, 22, 11},

                {4, 19, 20, 21, 10},

                {5, 6, 7, 8, 9}

        };


        System.out.println("!!!!!!!!!!!!! All Example Array Elements !!!!!!!!!!");
        for (int i = 0; i < exampleArray.length; i++) {
            for (int j = 0; j < exampleArray[i].length; j++) {
                System.out.print(exampleArray[i][j] + " ");
            }
        }

        int[] convertedArray = converterMatrixToReverseSpiral.convert(exampleArray);
        System.out.println("\n !!!!!!!!!!!!! Reverse Spiral !!!!!!!!!!");
        for (int element : convertedArray) {
            System.out.print(element + " ");
        }

    }
}