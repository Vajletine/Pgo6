public class Film extends MediaBiblioteczne {
    private String rezyser;
    private int czasTrwania;

    public Film(String tytul, int rokWydania, String rezyser, int czasTrwania) {
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Reżyser: " + rezyser);
        System.out.println("Czas trwania: " + czasTrwania + " minut");
    }

    public void sprawdzCzasTrwania() {
        if (czasTrwania > 120) {
            System.out.println("To długi film (" + czasTrwania + " minut).");
        } else {
            System.out.println("To standardowy film (" + czasTrwania + " minut).");
        }
    }
}
