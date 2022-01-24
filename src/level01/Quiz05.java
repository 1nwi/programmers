package level01;

public class Quiz05 {
    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }

        return answer + phone_number.substring(phone_number.length() -4);
    }




    public static void main(String[] args) {
        Quiz05 t = new Quiz05();
        System.out.println(t.solution("01036383797"));


    }
}
