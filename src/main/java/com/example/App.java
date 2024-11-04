package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        List<Todo> todos = new ArrayList<Todo>();

        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine();

            if (cmd.equals("add")) {
                System.out.print("할일 : ");
                String content = sc.nextLine();
                count++;
                Todo todo = new Todo(count, content);
                todos.add(todo);
                System.out.println(count + "번 할일이 생성되었습니다.");
                continue;
            } else if (cmd.equals("exit")) {
                System.out.println("앱 종료 명령이 입력되었습니다.");
                System.out.println("프로그램이 곧 종료됩니다.");
                break;
            } else if (cmd.equals("list")) {
                System.out.println("번호 / 내용");

                for (Todo todo : todos) {
                    System.out.print(todo.getId());
                    System.out.print(" / ");
                    System.out.println(todo.getContent());
                }
                continue;

            } else if (cmd.equals("del")) {
                System.out.print("삭제할 할일의 번호 : ");
                int id = Integer.parseInt(sc.nextLine());

                boolean isFound = false;

                for (Todo todo : todos) {
                    if (todo.getId() == id) {
                        todos.remove(todo);
                        isFound = true;
                        System.out.println(id + "번 할일이 삭제되었습니다.");
                        break;
                    }
                }
                if (!isFound) {
                    System.out.println(id + "번 할일은 존재하지 않습니다.");

                }
                continue;
            } else if (cmd.equals("modify")) {
                System.out.print("수정할 할일의 번호 : ");
                int id = Integer.parseInt(sc.nextLine());

                boolean isFound = false;

                for (Todo todo : todos) {
                    if (todo.getId() == id) {
                        System.out.println("기존 할일 : " + todo.getContent());
                        System.out.print("새 할일 : ");
                        String content = sc.nextLine();
                        todo.setContent(content);
                        System.out.println(id + "번 할일이 수정되었습니다.");
                        isFound = true;
                        break;

                    }
                }

                if (!isFound) {
                    System.out.println(id + "번 할일은 존재하지 않습니다.");
                }
                continue;

            }
        }
    }
}
