public class TestBiblioteki {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Władca Pierścieni", 1954, "J.R.R. Tolkien", 1178);
        Ksiazka k2 = new Ksiazka("Mały Książę", 1943, "Antoine de Saint-Exupéry", 96);
        Film f1 = new Film("Incepcja", 2010, "Christopher Nolan", 148);
        Film f2 = new Film("Shrek", 2001, "Andrew Adamson", 90);

        MediaBiblioteczne[] media = {k1, k2, f1, f2};

        System.out.println("=== Informacje o mediach ===");
        for (MediaBiblioteczne m : media) {
            m.wyswietlInformacje();
            System.out.println();
        }

        System.out.println("=== Operacje wypożyczania ===");
        k1.wypozycz();
        k1.wypozycz(); // powinno nie zadziałać
        k1.zwroc();

        System.out.println("\n=== Metody specyficzne ===");
        k1.sprawdzLiczbeStron();
        f1.sprawdzCzasTrwania();

        System.out.println("\n=== Polimorfizm i rzutowanie ===");
        for (MediaBiblioteczne m : media) {
            if (m instanceof Ksiazka) {
                ((Ksiazka) m).sprawdzLiczbeStron();
            } else if (m instanceof Film) {
                ((Film) m).sprawdzCzasTrwania();
            }
        }
    }
}
