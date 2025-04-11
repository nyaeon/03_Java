package HOMEWORK2_week.chep06.api03;

public class Application1 {
    public static void main(String[] args) {

            // 기본생성자를 이용해서 객체를 생성
            ModelDTO dto = new ModelDTO();
            System.out.println(dto.getId());
            System.out.println(dto.getPwd());
            System.out.println(dto.getName());
            System.out.println(dto.getAge());
            System.out.println(dto.getGender());
            System.out.println(dto.getPhone());
            System.out.println(dto.getEmail());

        /*
        변경 후 id :
        변경 후 pwd :
        변경 후 name :
        변경 후 age :
        변경 후 gender :
        변경 후 phone :
        변경 후 email :
        */
            dto.setId("user01");
            dto.setPwd("pass01");
            dto.setName("홍길동");
            dto.setAge(20);
            dto.setGender('M');
            dto.setPhone("010-1234-5678");
            dto.setEmail("hong123@greedy.com");

            System.out.println("변경 후 id : "+ dto.getId());
            System.out.println("변경 후 pwd : "+ dto.getPwd());
            System.out.println("변경 후 name : "+ dto.getName());
            System.out.println("변경 후 age : "+ dto.getAge());
            System.out.println("변경 후 gender :"+ dto.getGender());
            System.out.println("변경 후 phone : "+ dto.getPhone());
            System.out.println("변경 후 email : "+ dto.getEmail());
    }
}
