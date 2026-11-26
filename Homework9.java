import java.util.*;
import java.io.*;

class Homework9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileReader fileopen = new FileReader("db.txt");
        BufferedReader f = new BufferedReader(fileopen);
        String line;
        String[] save = new String[6];

        Map<String, String> key = new HashMap<String, String>();

        for(int i = 0; (line = f.readLine()) != null; i++){

            save[i] = line.trim();
            if (i % 2 != 0)
            {
                key.put(save[i-1], save[i]);
            }
        }
        f.close();

        while (true) {
            System.out.println("ID와 password를 입력해주세요.");
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
                System.out.println("ID가 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }
        }

        sc.close();
    }
}