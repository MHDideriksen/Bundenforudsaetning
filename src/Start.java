public class Start {

    public static void main(String[] args) {

        // Laver et objekt af DatHoldet
        DatHoldet datHoldet = new DatHoldet();

        // Bruger objektet Datholdet så vi kan bruge getStuderende og få udskrevet de studerende
        System.out.println("getStuderende:");
        System.out.println();
        datHoldet.getStuderende();

        // Laver et objektet MineMetoder klassen
        MineMetoder metoder = new MineMetoder();

        // Bruger objeketet metoder til at kalde getWhile frem
        System.out.println("getWhile:");
        metoder.getWhile();
        System.out.println();

        // Bruger objektet metoder til at kalde getFor frem
        System.out.println();
        System.out.println("getFor:");
        metoder.getFor();
        System.out.println();

        // Bruger objektet metoder til at kalde getRandom frem
        System.out.println();
        System.out.println("getRandom:");
        metoder.getRandom();
        System.out.println();

        // Bruger objektet metoder til at kalde getScanner frem
        System.out.println("getScanner:");
        metoder.getScanner();
        System.out.println();

        // Bruger objektet metoder til at kalde getArray frem
        System.out.println("getArray:");
        metoder.getArray();

    }
}
