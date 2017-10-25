public class DatHoldet {

    public DatHoldet(){}

    void  getStuderende(){
//Laver en void der danner objekter af de studerende i klassen og giver dem nogle variabler
        Studerende studerende1 = new Studerende(" Mads" "Mand", "pølsefarvet", 170);
        Studerende studerende2 = new Studerende("Sebastian" "Mand", "Sort", 180);
        Studerende studerende3 = new Studerende("Daniel""Mand", "brunt", 175);
//Udskriver de gældende variabler for de gældende studerende
        System.out.println("Navn: " + studerende1.getName());
        System.out.println("gender: " + studerende1.getgender());
        System.out.println("hårfarve: " + studerende1.gethairColor());
        System.out.println("højde: " + studerende1.getheight());
        System.out.println();
        System.out.println("Navn: " + studerende2.getName());
        System.out.println("gender: " + studerende2.getgender());
        System.out.println("hårfarve: " + studerende2.gethairColor());
        System.out.println("højde: " + studerende2.getheight());
        System.out.println();
        System.out.println("Navn: " + studerende3.getName());
        System.out.println("gender: " + studerende3.getgender());
        System.out.println("hårfarve: " + studerende3.gethairColor());
        System.out.println("højde: " + studerende3.getheight());
        System.out.println();


    }

}