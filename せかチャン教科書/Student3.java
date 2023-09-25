class Student3{
  String name;
  int engScore;
  int mathScore;

  Student3(String n){
    name = n;
  }
  Student3(String n, int e, int m){
    name = n;
    engScore = e;
    mathScore = m;
  }
  void setScore(int e, int m){
    engScore = e;
    mathScore = m;
  }
  void display(){
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }
}
