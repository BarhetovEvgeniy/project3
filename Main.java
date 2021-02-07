package Task3_Main;

import Task3_Cat.Cat;

public class Main {


    public static void main(String[] args) {

        int index = 1;
        while (index <= 10) {
            Cat myCat = new Cat();

            System.out.println(myCat.toString());
            index ++;
        }
        System.out.println ();

        for (index = 1; index <= 10; index ++) {
            Cat hisCat = new Cat();
            hisCat.setAge(index);
            hisCat.setName("Жорик");

            System.out.println(hisCat.toString());
        }
        System.out.println ();

        index = 1;
        do {
            Cat herCat = new Cat (index, "Durik");
            System.out.println(herCat.toString());
            index ++;
        }while (index <= 10);

        System.out.println ();


        int[] arrayCat = new int[5];

        for (int cat: arrayCat)
              {
                  Cat ourCat = new Cat();

                  System.out.println(ourCat.toString());
        }



    }






}
