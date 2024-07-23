package org.akv.two_pointers.easy;


/**
 * method : shortestDistanceToChar, Time : 1Hr
 */


public class TwoPointerProblem {


    public int[] shortestDistanceToChar(String s, char c) {
        int[] answer = new int[s.length()];
        char[] sArr = s.toCharArray();
        int currIndex = s.indexOf(c, 0);


        while (currIndex != -1) {
            int left = currIndex - 1, right = currIndex + 1;
            answer[currIndex] = 0;

            boolean isLeftFinished = true, isRightDone = true;

            for (int i = 0; i <= (s.length() - currIndex) + 1; i++) {
                if (left < 0) {
                    isLeftFinished = false;
                }

                if (isLeftFinished && sArr[left] != c) {
                    if (answer[left] == 0)
                        answer[left] = Math.abs(currIndex - left);
                    answer[left] = Math.min(Math.abs(currIndex - left), answer[left]);

                }

                if (right > s.length() - 1) {
                    isRightDone = false;
                }

                if (isRightDone && sArr[right] != c) {
                    if (answer[right] == 0) {

                        answer[right] = Math.abs(currIndex - right);

                    } else
                        answer[right] = Math.min(Math.abs(currIndex - right), answer[right]);

                }

                answer[currIndex] = 0;
                right++;
                left--;

            }


            for (int i = 0; i < sArr.length; i++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
            for (int i = 0; i < sArr.length; i++) {
                System.out.print(answer[i] + " ");
            }
            currIndex = s.indexOf(c, currIndex + 1);
            System.out.println();
        }
        return answer;

    }


    public long findArrConcatValue(int[] arr) {
        int left = 0, right = arr.length - 1;
        long answer = 0;

        while (left <= right) {
            String s = "";
            if (left != right) {
                s += arr[left] + "" + arr[right];
            } else {
                s += arr[left];
            }
            System.out.print(s + " ");
            System.out.println();
            answer += Long.parseLong(s);
            System.out.print(answer + " ");
            left++;
            right--;
        }
        return answer;
    }


}
