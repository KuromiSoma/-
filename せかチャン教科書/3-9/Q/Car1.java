class Car1{
  int no;
  int speed;

  void setNo(int n){
    no = n;
  }
  void run(int s){
    speed = s;
  }
  // brakeメソッドを定義する

  void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}
