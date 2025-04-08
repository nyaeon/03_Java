package HOMEWORK2_week.chep10.api.member;

import java.lang.reflect.Member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        String data ="1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] members = data.split("\\|");  // '|'로 구분하여 회원 정보 분리 *****

        Question[] questions = new Question[members.length];

        for (int i = 0; i < members.length; i++) {
            String[] some = members[i].split(",");
            int memberNo = Integer.parseInt(some[0]);
            String memberName = some[1];
            int height = Integer.parseInt(some[2]);
            int weight = Integer.parseInt(some[3]);
            LocalDate birth = LocalDate.parse(some[4], DateTimeFormatter.ofPattern("yyyyMMdd"));
            questions[i] = new Question(memberNo, memberName, height, weight, birth);
           // questions[i] = memberNo,memberName,height,weight,birth;
        }
        for (Question q : questions) {
            System.out.println(q.information());
        }
    }
}



