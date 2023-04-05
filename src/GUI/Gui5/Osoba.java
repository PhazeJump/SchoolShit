package GUI.Gui5;

import java.util.Collection;

public class Osoba implements Comparable<Osoba>{
    private static String imie;
    private static int rokUrodzenia;
    public Osoba(String imie, int rokUrodzenia) {
        Osoba.imie = imie;
        Osoba.rokUrodzenia = rokUrodzenia;
    }

    public static String getImie() {
        return imie;
    }

    public static int getRokUrodzenia() {
        return rokUrodzenia;
    }
    public static boolean wKolekcji(Collection<Osoba> kol, String imie, int rokUrodzenia) {
        return kol.contains(new Osoba(imie, rokUrodzenia));
    }

    @Override
    public int compareTo(Osoba o) {
        if (imie.equals(o.imie)) return 0;
        else return imie.compareTo(o.imie);
    }
}
