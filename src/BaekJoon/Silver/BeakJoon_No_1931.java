
package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BeakJoon_No_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<time> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            list.add(new time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list, (o1, o2) -> {

            if (o1.end == o2.end) {
                return o1.start - o2.start;
            }
            return o1.end - o2.end;
        });

        int answer = 0;
        int end = 0;
        for (int i = 0; i < list.size(); i++) {
            time current = list.get(i);
            if (current.start >= end) {
                end = current.end;
                answer++;
            }
        }
        System.out.println(answer);
    }

    private static class time {
        int start;
        int end;

        public time(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
