package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        /*  포비나 크롱이 펼친 페이지들이 1만큼 차이나지 않으면 -1을 리턴 */
        boolean isValidPages = true;
        if(pobi.get(1) - pobi.get(0) != 1 || crong.get(1) - crong.get(0) != 1)
            isValidPages = false;
        if(!isValidPages)
            return -1;

        /* 각자 왼쪽 페이지 번호의 각 자리수를 더한 것과 곱한 것중 가장 큰 수 취하기 */
        String pobiLeftPage = Integer.toString(pobi.get(0));
        String crongLeftPage = Integer.toString(crong.get(0));

        int pobiLeftAdd = 0;
        int pobiLeftMultiply = 1;
        int pobiLeftMax = -1;
        int crongLeftAdd = 0;
        int crongLeftMultiply = 1;
        int crongLeftMax = -1;

        for (int i=0; i<pobiLeftPage.length(); i++) {
            pobiLeftAdd += Character.getNumericValue(pobiLeftPage.charAt(i));
            pobiLeftMultiply *= Character.getNumericValue(pobiLeftPage.charAt(i));
        }
        for (int i=0; i<crongLeftPage.length(); i++) {
            crongLeftAdd += Character.getNumericValue(crongLeftPage.charAt(i));
            crongLeftMultiply *= Character.getNumericValue(crongLeftPage.charAt(i));
        }

        pobiLeftMax = Math.max(pobiLeftAdd, pobiLeftMultiply);
        crongLeftMax = Math.max(crongLeftAdd, crongLeftMultiply);

        /* 각자 오른쪽 페이지 번호의 각 자리수를 더한 것과 곱한 것중 가장 큰 수 취하기 */
        String pobiRightPage = Integer.toString(pobi.get(1));
        String crongRightPage = Integer.toString(crong.get(1));

        int pobiRightAdd = 0;
        int pobiRightMultiply = 1;
        int pobiRightMax = -1;
        int crongRightAdd = 0;
        int crongRightMultiply = 1;
        int crongRightMax = -1;

        for (int i=0; i<pobiRightPage.length(); i++) {
            pobiRightAdd += Character.getNumericValue(pobiRightPage.charAt(i));
            pobiRightMultiply *= Character.getNumericValue(pobiRightPage.charAt(i));
        }
        for (int i=0; i<crongRightPage.length(); i++) {
            crongRightAdd += Character.getNumericValue(crongRightPage.charAt(i));
            crongRightMultiply *= Character.getNumericValue(crongRightPage.charAt(i));
        }

        pobiRightMax = Math.max(pobiRightAdd, pobiRightMultiply);
        crongRightMax = Math.max(crongRightAdd, crongRightMultiply);
        /* 각자 왼쪽 오른쪽 페이지에서 구한 점수 중 큰 점수를 최종점수로 취하기 */
        int pobiFinalScore = Math.max(pobiLeftMax, pobiRightMax);
        int crongFinalScore = Math.max(crongLeftMax, crongRightMax);
        return answer;
    }
}

/*
<<요구사항>>
1. 포비와 크롱이 펼친 페이지가 들어있는 배열이 주어진다.
2. 각자 왼쪽 페이지 번호의 각 자리 수를 모두 더하거나 모두 곱한 것 중 가장 큰 수를 취한다
3. 각자 오른쪽 페이지 번호의 각 자리 수를 모두 더하거나 모두 곱한 것 중 가장 큰 수를 취한다
4. 각자 2,3에서 구한 것 중 더 큰 수를 본인 점수로 한다
5. 포비가 더 크면 1, 크롱이 이기면 2, 무승부는 0, 예외사항은 -1을 리턴한다
 */

/*
<<기능 목록>>
- [V] 포비 또는 크롱의 왼쪽 페이지와 오른쪽 페이지가 1차이가 나지 않을 경우 -1을 리턴한다
- [V] 포비와 크롱의 왼쪽 페이지 번호에 대해 각 자리 수를 모두 더하거나 모두 곱한 것 중 가장 큰 수를 구한다
- [V] 포비와 크롱의 오른쪽 페이지 번호에 대해 각 자리 수를 모두 더하거나 모두 곱한 것 중 가장 큰 수를 구한다
- [V] 포비와 크롱이 각자 왼쪽 오른쪽 페이지에 대해 구한 값 중 더 큰 값을 자신의 최종점수로 갖게 한다
- [] 포비와 크롱의 최종점수를 비교해 포비가 이기면 1, 크롱이 이기면 2, 무승부는 0을 리턴한다.
 */