package JavaLab6.HomeW6;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// 1.Scrieti o metoda Java, care sa primeasca parametru o Lista,
// si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

public class Method {
    public void showlist1(List<String> stringList, int number) {
        for (int i = number; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }


// 2. Scrieti o metoda Java, care sa primeasca doi parametrii:
// un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
// Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void showlist2(List<Integer> numberlist, int number) {
        numberlist.add(number);
    }


//  3. Scrieti o metoda Java, care sa primeasca doi parametrii:
//  un parametru de tip Lista, iar celalalt un numar intreg.
//  Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
//  pornind de la numarul intreg primit ca si parametru.

    public void showlist3(List<String> stringList, int number) {
        for (int i = number; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }

// 4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
// toate valorile din lista, dar invers(de la capat la inceput).

    public void showlist4(List<String> stringList) {
        Collections.reverse(stringList);
        System.out.println(stringList);
    }
//  5. Scrieti o metoda Java, care sa primeasca trei parametrii:
//  unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
//  Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia
//  la care sa fie pus acel String.

    public void showlist5(List<String> stringlist, int number, String newfruit) {
        stringlist.add(number, newfruit);}

//  6. Scrieti o metoda Java, care sa primeasca doi parametrii.
//   Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
     public void showlist6(List<String> stringlist, String evaluation){
         stringlist.add(0,evaluation);

         }

//    7. Scrieti o metoda Java care sa primeasca parametru o Lista,
//    si sa afiseze ce valori are lista, si ce pe ce pozitie.
//    (Ex: “Pe pozitia 1 valoare este 4”).


    public void showlist7(List<String> stringlist, int number) {
          System.out.println("Pe pozitia " + number + " se afla fructul " + (stringlist.get(number)) + ".");
    }
//    8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public void showlist8(List<Integer> numberlist){
        System.out.println(Collections.max(numberlist));

   }
//    Optional 1: Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista.
    public void showlist9(List<String> stringList) {
        Collections.swap(stringList, 1, 4);
        System.out.println(stringList);
    }


//   Optional 2: Scrieti o metoda Java care sa primeasca o Lista si sa
//   returneze o alta lista, care sa contina doar numerele pare din lista primita

    public void showlist10(List<Integer> numberlist2) {
//        for (int i = ; i<numberlist2.size(); i++) {
//        int even=numberlist2.get(i)%2;
//             System.out.println((even));

//    }

    }

}









