import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args){
      List melonList=  new ArrayList();
       melonList.add("WaterMelon");
       melonList.add("Wintermelon");
        System.out.println(melonList);
       ArrayList fruitList= new ArrayList() ;
        fruitList.add("mango");
        fruitList.add("apple");
        fruitList.add("kiwi");
        fruitList.add("orange");
        System.out.println(fruitList);
        fruitList.addAll(melonList);
        System.out.println(fruitList);
        //String s1= fruitList.get(2);

        fruitList.remove(1);
        System.out.println(fruitList);
        boolean exists = fruitList.contains("Plum") ;
        System.out.println("plum contains in FruitList : "+exists);

        for(int i=0;i<fruitList.size();i++ ){
            System.out.println(fruitList.get(i));

        }

        fruitList.forEach(fruit -> System.out.println(fruit) );





    }
}
