package level01;

public class Quiz04 {

    public double solution(int[] arr) {
        double answer;
        int total = 0;
        for (int a : arr) {
            total += a;
        }

        answer = (double) total / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Quiz04 a = new Quiz04();

        System.out.println("평균값 : " + a.solution(arr));
    }
}
