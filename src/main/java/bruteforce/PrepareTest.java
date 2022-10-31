package bruteforce;

public class PrepareTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int firstStudentAnswerCnt = 0;
        int secondStudentAnswerCnt = 0;
        int thirdStudentAnswerCnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i%first.length]){
                firstStudentAnswerCnt++;
            }
            if(answers[i] == second[i%second.length]){
                secondStudentAnswerCnt++;
            }
            if(answers[i] == third[i%third.length]){
                thirdStudentAnswerCnt++;
            }
        }



        System.out.println(firstStudentAnswerCnt);
        System.out.println(secondStudentAnswerCnt);
        System.out.println(thirdStudentAnswerCnt);

        return answer;
    }

    public static void main(String[] args) {
        int[]arr = {1,3,2,4,2};
        PrepareTest prepareTest = new PrepareTest();
        System.out.println(prepareTest.solution(arr));
    }
}
