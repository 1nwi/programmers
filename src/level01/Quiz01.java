package level01;

public class Quiz01 {

    public String solution(int num) {

        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
