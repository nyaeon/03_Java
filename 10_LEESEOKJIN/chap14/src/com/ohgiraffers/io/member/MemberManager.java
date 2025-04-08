package com.ohgiraffers.io.member;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MemberManager {
    private static final String filename = "members.ser";
    private final ArrayList<Member> members = new ArrayList<>();

    public void readMembers() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            var arr = (Member[]) ois.readObject();
            members.clear();
            members.addAll(Arrays.stream(arr)
                    .filter(Objects::nonNull)
                    .toList());

            for (Member member : members) {
                System.out.println(member);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addMember(Member member) {
        if (member == null) return;

        members.add(member);

        try (var oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(members.toArray(new Member[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
