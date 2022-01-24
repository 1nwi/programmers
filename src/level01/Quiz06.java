package level01;

public class Quiz06 {

    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            for(int n = b; n <=a; n++) {
                answer += n;
            }
        } else if (b > a) {
            for(int m = a; m <=b; m++) {
                answer += m;
            }
        } else {
            answer = a;
        }

        return answer;
    }

    public static void main(String[] args) {


        Quiz06 q = new Quiz06();

        System.out.println(q.solution(3,5));
    }
}
