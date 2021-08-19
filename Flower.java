class Flower{
  String name;
  String color;
  int noOfPetals;

  void blooming(){
   System.out.println(color+" "+name+" is blooming...!");
  }

  void shedFragrance(){
   System.out.println(color+" "+name+
          " is shedding fragrance...!");
   }

  public static void main(String args[]){
        Flower rose = new Flower();
          rose.name = "Rose";
          rose.color = "Red";
          rose.noOfPetals = 15;
        rose.blooming();
        rose.shedFragrance();
   }
}