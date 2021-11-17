/*
 * Copyright (c) 2021: Daniel Szankovich
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;

public class EqualityArrays {

    static void checkEquality(int[] arr1, int[] arr2){

        if(arr1.length != arr2.length){
            System.out.println("Arrays need to have equal length!");
            return;
        }
        boolean isEqual = true;
        for (int i=0; i<arr1.length; i++){
                if (arr1[i] != arr2[i]){
                isEqual = false;
                }
        }

        if (isEqual){
            System.out.println("Two arrays are equal");
        }
        else {
            System.out.println("Two arrays are not equal");
        }



    }
    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 9, 11};
        int[] array2 = {2, 5, 7, 8, 11};
        int[] array3 = {2, 5, 7, 9, 11};

        checkEquality(array1, array2);
        checkEquality(array1, array3);

    }
}
