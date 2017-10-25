public class Studerende {

    // Deklarerer de forskellige variabler

    private String name = "";

    private int age = 0;

    private String gender = "";

    private String hairColor = "";

    private double height = 0.0;

    public Studerende(String name){
        this.name = name;
        System.out.println("nyt studenter navn tilføjet: " + name);
    }
//Laver en constructor med "arguments" til de studerende
    public Studerende(String name, int age, String gender, String hairColor, double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hairColor = hairColor;
        this.height = height;
        System.out.println("nyt studenter navn tilføjet: " + name + " aged: " + age + " med haircolor: " + hairColor + " og med height" +height + ". " + gender );


    }

    //Laver metoder der returnere de forskellige variabler som henholdsvis String,Int & double

    public String getName() {return name;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}

    public void setGender ( String gender){this.gender = gender;}

    public String getGender() {return gender;}

    public void setHairColor(String hairColor){this.hairColor = hairColor;}

    public String getHairColor(){return hairColor;}

    public void setHeight(double height){this.height = height;}
    public double getHeight(){return height;}

}
