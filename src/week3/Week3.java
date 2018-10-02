package week3;

public class Week3 {
    /**
     * tìm số lớn hơn
     * @param m số nguyên
     * @param n số nguyên
     * @return 1 số nguyên là số lớn hơn
     */

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m>n) return m;
        else return n;

    }

    /**
     *
     * @param array là mảng số nguyên
     * @return phần tử nhỏ nhất trong mảng
     */
    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int i ;
        int min = array[0];
        for (i = 0;i<array.length;i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight/(height * height);
        if (BMI < 18.5) return "Thiếu cân";
            else if(BMI <= 22.99) return "Bình thường";
                else if( BMI<=24.99) return "Thừa cân";
                    else  return "Béo phì";


       // else return null;
    }

   /* public static void main(String[] a){
        int array[] = {1, 9,7,4,3,12,0,-2};
        System.out.println(max(6,7));
        System.out.println(minOfArray(array));
        System.out.println(calculateBMI(60.0, 1.7));
    }*/
}
