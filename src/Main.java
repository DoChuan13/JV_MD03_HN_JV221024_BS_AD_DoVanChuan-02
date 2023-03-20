import utils.InputMethods;

import java.util.Stack;

public class Main {
    static Stack<String> urlStack = new Stack<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập URL muốn truy cập\n" +
                    "2. Quay lại\n" +
                    "3. Thoát");
            System.out.print("Nhập lựa chọn phù hợp: ");
            byte option = InputMethods.getByte();
            switch (option) {
                case 1:
                    accessUrl();
                    break;
                case 2:
                    backUrl();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng thử lại...");
            }
//            System.out.print("Nhấn phím bất kỳ để tiếp tục.");
            InputMethods.pressAnyKey();
        }
    }

    private static void backUrl() {
        if (urlStack.isEmpty()) {
            System.err.println("\nKhông có lịch sử URL trong Stack\n");
        } else {
            urlStack.pop();
            System.out.println("URL trên cùng đã bị xoá");
            if (urlStack.isEmpty()) {
                System.err.println("\nKhông còn lại url nào cả: \n");
                return;
            }
            System.out.println("URL tiếp theo là: " + urlStack.peek());
        }
    }

    private static void accessUrl() {
        System.out.print("Nhập Url: ");
        String url = InputMethods.getString();
        urlStack.push(url);
        System.out.println("----------Url Truy cập thành công---------");
    }
}
