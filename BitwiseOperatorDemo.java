class BitwiseOperatorDemo{

public static void main(String[] args){

  int a = 10;
  int b = 20;

  System.out.println( a>b && ++a>b); // false
  System.out.println(a); //10
  System.out.println(b); //20

  System.out.println( a>b & ++a>b); // false
  System.out.println(a);// 11
  System.out.println(b); //20

 System.out.println( a<b || ++a<b); // true
  System.out.println(a); // 11
  System.out.println(b); //20

  System.out.println( a<b | ++a<b); // true
  System.out.println(a);// 12
  System.out.println(b); //20

}
}