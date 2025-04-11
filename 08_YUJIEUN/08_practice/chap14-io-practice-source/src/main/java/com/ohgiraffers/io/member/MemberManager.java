package com.ohgiraffers.io.member;

import java.io.*;


public class MemberManager {
    // 홍길동, 유지은, 이석진, asdf, null,  null,  null, ...
    private static final String FILE_PATH = "src/main/java/com/ohgiraffers/io/member/members.ser";
    private static final int CAPACITY = 10;        // 배열 정원
    private Member[] members = new Member[CAPACITY];


    public void readMembers() {

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            System.out.println("저장된 회원 목록이 없습니다.");
            return;
        }


        ObjectInputStream oin = null;
        try {
            oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(FILE_PATH)));
            members = (Member[]) oin.readObject();

            // members의 크기는 10
            // 이 중 몇 개는 객체가 있고, 나머지는 null임
        } catch (EOFException e) {
            for (Member member : members) {
                System.out.println(member);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            members = new Member[0];
        } finally {
            if (oin != null) {
                try {
                    oin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // ---- 출력 ----
        for (Member m : members) {
            if (m != null) System.out.println(m);
        }


    }

    public void addMember(Member newMember) {
        int index = findFirstEmptyIndex();
        if (index == -1) {
            throw new IllegalStateException("회원 배열이 가득 찼습니다. (정원 " + CAPACITY + ")");
        }
        members[index] = newMember;
        saveMembers();

    }


    private int findFirstEmptyIndex() {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 배열을 그대로 FILE_PATH에 overwrite 저장
     */
    private void saveMembers() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(FILE_PATH)));
            oos.writeObject(members); //덮어쓰기
        } catch (IOException e) {
            throw new RuntimeException("회원 정보 저장 실패", e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}