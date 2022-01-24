package level01;

public class Quiz08 {

    public int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }


    //  함수사용이 아닌 알고리즘으로 해결한 풀이
    public int getStrToInt(String str) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                Sign = false;
            else if(ch !='+')
                result = result * 10 + (ch - '0');
        }
        return Sign?1:-1 * result;
    }


    public static void main(String[] args) {
        Quiz08 t = new Quiz08();
        System.out.println(t.solution("-1234"));

        System.out.println(t.getStrToInt("-4321"));
    }
}
