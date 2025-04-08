package HOMEWORK2_week.chep06.arrayhomework.hw1.model.dto;


public class Application1 {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Employee();
        emp[1] = new Employee(1,"홍길동",null,19,null,'M',0,0.0,"서울 잠실","01022223333");
        emp[2] = new Employee(2,"강말순","강사",20,"교육부",'F',10000000,0.01,"서울 마곡","01011112222");
        System.out.println(emp[0].information());
        System.out.println(emp[1].information());
        System.out.println(emp[2].information());
        System.out.println("======================================");
    Employee[] emp2 = new Employee[3];
        emp[0] = new Employee(0,"김말똥","팀장",30,"영업부",'M',30000000,0.2,"전라도 광주","01055551111");
        emp[1] = new Employee(1,"홍길동","부장",19,"기획부",'M',40000000,0.3,"서울 잠실","01022223333");
        System.out.println(emp[0].information());
        System.out.println(emp[1].information());

        System.out.println("======================================");
        Employee[] emp3 = new Employee[3];

          emp[0].getSalary();
          emp[0].getBonuspoint();
          emp[1].getSalary();
           emp[1].getBonuspoint();
          emp[2].getSalary();
          emp[2].getBonuspoint();
       int sum = 0;
       int avg = 0;
   //    emp.setSalary(Salary+(salary*bonuspoint))*12)
        for (int i = 0; i < emp.length; i++) {
            int salary = emp[i].getSalary();
            double bonuspoint = emp[i].getBonuspoint();
            sum =  ((salary+(salary*(int)bonuspoint))*12);
            System.out.print(emp[i].getEmpname()+"의 연봉 :");
            System.out.println(emp[i].getSalary()+"원 ");
        }
        System.out.println("======================================");
        avg = sum/emp.length;
        System.out.println("직원들의 연봉은 : "+avg);
      //  System.out.println(emp[0].information(Salary));
      //  int sum = Salary+(salary*bonuspoint))*12
//System.out.println(emp[0].toString(emp.length));
    }
  //   Employee emp[] = new Employee[10];
  //   emp.setEmpno(1);
  //   emp.setEmpname("길동이");
  // // emp.setDept();
  // // emp.setJob();
  //   emp.setAge(19);
  //   emp.setGender('M');
  //   emp.setSalary(0);
  //   emp.setBonuspoint(0.01);
  //   emp.setPhone("01022223333");
  //   emp.setAddress("서울 잠실");
  //}
}
