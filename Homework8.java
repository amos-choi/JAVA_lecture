//202411535 최민서
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> key = new HashMap<String, String>();

        key.put("myId", "myPass");
        key.put("myId2", "myPass2");
        key.put("myId3", "myPass3");

        System.out.println("ID와 password를 입력해주세요.");

        while (true) {
            System.out.print("ID: ");
            String id_input = sc.nextLine().trim();

            if (key.containsKey(id_input)) {
                System.out.print("password: ");
                String pw_input = sc.nextLine().trim();

                if (pw_input.equals(key.get(id_input))) {
                    System.out.println("ID와 비밀번호가 일치합니다.");
                    break;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                    continue;
                }
            }
            else {
                System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }
        }

        sc.close();
    }
}
