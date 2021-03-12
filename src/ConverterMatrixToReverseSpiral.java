/**
 * @author Yusuf TANRIKULU
 * @since 12.03.2021
 */

public class ConverterMatrixToReverseSpiral {

    // It converts Multidimensional Array to Single dimensional array as a reverse spiral.
    public int[] convert(int[][] array) {

        // It creates new array's length according to parameters array length.
        int[] convertedNewArray = new int[array.length * array[0].length];

        // It sets Index numbers and Array Size Numbers.
        int startingRowIndex = 0;
        int startingColumnIndex = 0;

        int endingRowIndex = array.length - 1;
        int endingColumnIndex = array[0].length - 1;

        int convertingArrayIndex = 0;

        // It loops to adds all elements.
        // If starting indexes are greater than ending indexes, It stops.
        while (startingRowIndex <= endingRowIndex && startingColumnIndex <= endingColumnIndex) {

            // Adds elements first row to last row  in first column.
            // (not included last row element)
            for (int i = startingRowIndex; i < endingRowIndex; i++) {
                convertedNewArray[convertingArrayIndex] = array[i][startingColumnIndex];
                convertingArrayIndex++;
            }
            // Adds elements first column to last column in last row.
            // (not included last column element)
            for (int i = startingColumnIndex; i < endingColumnIndex; i++) {
                convertedNewArray[convertingArrayIndex] = array[endingRowIndex][i];
                convertingArrayIndex++;
            }
            // Adds elements last row to first row in last column.
            // (not included first row element)
            for (int i = endingRowIndex; i > startingRowIndex; i--) {
                convertedNewArray[convertingArrayIndex] = array[i][endingColumnIndex];
                convertingArrayIndex++;
            }
            // Adds elements last column to first column.
            // (not included first column element)
            for (int i = endingColumnIndex; i > startingColumnIndex; i--) {
                convertedNewArray[convertingArrayIndex] = array[startingRowIndex][i];
                convertingArrayIndex++;
            }

            // When All elements finished and element that is in last is remained,
            // I mean, It adds last element to array.
            if (startingRowIndex == endingRowIndex && startingColumnIndex == endingColumnIndex)
                convertedNewArray[convertingArrayIndex] = array[startingRowIndex][startingColumnIndex];

            // We need to loop again to add all elements
            // so we increases starting row and column index and decreases ending row and column index.
            startingRowIndex++;
            startingColumnIndex++;
            endingRowIndex--;
            endingColumnIndex--;

        }
        return convertedNewArray;
    }

}
