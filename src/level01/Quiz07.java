package level01;

public class Quiz07 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz07 t = new Quiz07();
        System.out.println(t.solution(12));
    }
}
