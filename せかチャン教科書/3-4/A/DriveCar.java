class DriveCar{
  public static void main(String[] args){
    //Carクラスのオブジェクトc1を生成
    Car c1 = new Car();

    //c1のナンバーを2525に設定
    c1.setNo(2525);

    //c1の速度を30に設定
    c1.run(30);

    //c1のナンバー、速度を表示
    c1.display();

    //c1の速度を0に設定
    c1.stop();

    //c1のナンバー、速度を表示
    c1.display();
  }
}
