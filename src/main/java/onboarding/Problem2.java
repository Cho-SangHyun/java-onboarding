package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        return answer;
    }
}

/*
<<요구사항>>
1. 소문자로만 이루어진 길이 1이상 1000이하의 문자열이 주어진다
2. 연속하는 중복 문자들을 전부 제거해나가서 최종적으론 연속되는 중복문자가 없는 문자열을 리턴한다
 */

/*
<<기능 목록>>
- [] 문자열을 왼쪽부터 읽는다
- [] 연속되는 문자가 있는지 체크한다.
  - [] 연속되는 문자가 있다면 어디까지 연속되는지 체크한다
  - [] 연속되는 구간을 빈 문자열로 대체한다
  - [] label break를 통해 다시 처음단계로 돌아간다
- [] 연속되는 문자가 없다면 그 문자열을 answer에 담고 반복문을 벗어난다
 */
