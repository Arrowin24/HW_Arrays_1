public class Main {
    public static void main(String[] args) {
        //Task1+Task2
        System.out.println("Задача 1 + 2:");
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        for (int value : intArr) {
            System.out.print(value);
            if (value != intArr[intArr.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] doubleArr = {1.57, 7.654, 9.986};
        for (double value : doubleArr) {
            System.out.print(value);
            if (value != doubleArr[doubleArr.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println();
        boolean[] boolArr = {false, true, false, false};
        for (int i = 0; i < boolArr.length; i++) {
            System.out.print(boolArr[i]);
            if (i != boolArr.length - 1) System.out.print(", ");
        }
        System.out.println();

        //Task3
        System.out.println("Задача 3:");
        for (int i= intArr.length-1;i>=0;i--){
            System.out.print(intArr[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (int i= doubleArr.length-1;i>=0;i--){
            System.out.print(doubleArr[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (int i= boolArr.length-1;i>=0;i--){
            System.out.print(boolArr[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();

        //Task4
        System.out.println("Задача 4:");
        for (int i=0;i<intArr.length;i++){
            if(intArr[i]%2==1){
                intArr[i]+=1;
            }
            System.out.print(intArr[i]);
            if(i!=intArr.length-1){
                System.out.print(", ");
            }
        }
    }
}