class Solution {
    public static int repeats(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean encontrado = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] == num) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                suma += num;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 5, 4, 8};
        System.out.println(repeats(array));
    }
}
