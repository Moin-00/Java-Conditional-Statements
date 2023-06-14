import java.util.Scanner;
public class ArraysExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a =new int[]{1,2,3};

        /*
        declaring an arrya can be done in two ways
        1. type[] var_name;
        2. type var_name[];
        initialising an array - when an array is decleared only a reference of array is createed
        general form of creating an array is
        var-name = new type[size];
        */
        int[] array;
        array =new int[20];
        // Or can be initialised by

        // int[] array =new int[20];//combinig both statements in one
        System.out.println("Enter array elements");
        System.out.println("enter the no of elements to be entered shuldbe less than or equal to 20");
        int no;
        no=sc.nextInt();
        if(no<=array.length){
            for(int i=0;i<no;i++) {
                array[i] = sc.nextInt();
            }
        }
        if(no<=array.length){
            for(int i=0;i<no;i++) {
                System.out.print(array[i]+"  ");
            }
        }
        System.out.println(" ");
        for(int j:a){

            System.out.println(j);
        }




        
    }
}
