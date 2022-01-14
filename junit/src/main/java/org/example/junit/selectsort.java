package org.example.junit;

 class selectsort {
     void swap(int[] arr, int i, int j) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }

     boolean Long(int[] arr){
         if (arr.length>5)
             return true;
         else
             return false;
     }

     void sortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int cur = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    cur = j;
                    min = array[j];
                }
            }
            swap(array, cur, i);
        }
    }
     void sortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int cur = i;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    cur = j;
                    max = array[j];
                }
            }
            swap(array, cur, i);
        }
    }
}
