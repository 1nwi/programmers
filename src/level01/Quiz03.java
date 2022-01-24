package level01;

public class Quiz03 {

    public static String solution(int num) {
        String answer = "";

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = solution(3);

        System.out.println(s);
    }
}
