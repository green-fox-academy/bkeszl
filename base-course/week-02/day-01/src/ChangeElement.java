public class ChangeElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 5, 6};
        int index =0 ;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==8){
                array[i]=4;
                index = i;
            }
        }

        System.out.println(array[index]);
    }
}
