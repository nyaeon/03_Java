package com.ohgiraffers.member;

import java.io.*;

public class MemberManager {
    private Member[] members;

    // 생성자
    public MemberManager() {
        members = new Member[0];  // 초기 배열 크기 0
    }

    public void readMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("members.ser"))) {
            members = (Member[]) ois.readObject();
            // 배열 출력
            for (Member member : members) {
                System.out.println(member);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다. 새로 시작합니다.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }

    public void addMember(Member newMember) {
        Member[] newMembers = new Member[members.length + 1];

        System.arraycopy(members, 0, newMembers, 0, members.length);

        newMembers[members.length] = newMember;

        members = newMembers;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("members.ser"))) {
            oos.writeObject(members);
        } catch (IOException e) {
            System.out.println("파일 저장 오류: " + e.getMessage());
        }
    }
}
