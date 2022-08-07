class Solution {
    public static void main(String[] args) {

        System.out.println ("============task 1089=============");
        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 }; // входные данные  к задаче 1089
        duplicateZeros(arr); // вызоа метода к задаче 1089

        System.out.println ("============task 27===============");

        int[] nums = new int[] {3,2,2,3};   // входные данные  к задаче 27
        int val = 3;                        // входные данные  к задаче 27
        System.out.println ("Kol elements =" + removeElement(nums, val));//вызоа метода к задаче 27

        System.out.println ("============task 151===============");

        String s = "   the    sky    is    blue   ";

        System.out.println (reverseWords(s));
    }


    // Задача 1089  Duplicate Zeros (метод)
    public static void duplicateZeros(int[] arr) {
        int l = arr.length;
        int[] arrNew = new int[l];
        int j = 0;
        for (int i = 0; i < l; i++) {
            arrNew[j] = arr[i];
            if (arr[i] == 0 && j < l - 1){
                arrNew[j + 1] = 0;
                j++;
            }
            j++;
            if (j  == l) break;
        }
        for (int i = 0; i < l; i++) {
            arr[i] = arrNew [i];
            System.out.println(arr [i]);
        }
    }


    // Задача 27  Remove Element (метод)
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
                System.out.println("nums [" + i + "] = " +  nums [i]);
            }
        }
        return i;
    }


    // Задача 151    Reverse Words in a String
    public static String reverseWords(String s) {
        s = s.trim(); // удаляет пробелы до и после строки
        s = s.replaceAll("\\s+", " "); // замена всех пробелов на один пробел

        String[] sArray  = s.split (" ");
        String sNew =  "";

        for (int i = sArray.length - 1; i >= 0; i--) {
            sNew = sNew + " " + sArray[i] ;
        }
        sNew = sNew.trim();
        return sNew;
    }

}