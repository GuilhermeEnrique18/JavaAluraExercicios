package desafioJavaToStringListas;

import java.util.ArrayList;

public class MainClasses {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gui", 21);
        Pessoa p2 = new Pessoa("Rob", 22);
        Pessoa p3 = new Pessoa("Juli", 18);

//        p1.setNome("Gui");
//        p1.setIdade(21);
//        p2.setNome("Rob");
//        p2.setIdade(22);
//        p3.setNome("Juli");
//        p3.setIdade(18);

        ArrayList<Pessoa> listaPessoas= new ArrayList<>();

        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);

        System.out.println(listaPessoas.size());
        System.out.println(listaPessoas.get(0));
        System.out.println(listaPessoas.toString());


    }
}
