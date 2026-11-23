import Java.util.Scanner;

Map <String, String> key = new HashMap <String, String>();
class Homework8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    key.put("myId","myPass1");
    key.put("myId2","myPass2");
    key.put("myId3","myPass3");
    System.out.println("id와 password를 입력해주세요.");
    while (idandpassword_input){
      System.out.print("ID:");
      String id_input = sc.nextLine();    
      if(id_input.compareTo(String key[0] == 0){
        System.out.print("password:");
        if(pw_input.compareTo(String key[0] == 0
          System.out.println("id와 비밀번호가 일치합니다.");
        }
        else{
          System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
          continue;
        }
      }
      else{
        System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
        continue;
      }
    }

  }   
}
