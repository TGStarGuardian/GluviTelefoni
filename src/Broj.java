public class Broj {
    private String kodDrzave;
    private String pozivniBroj;
    private String brojTelefona;
    private boolean fiksniTelefon;


    public Broj(String broj) throws IllegalArgumentException {
        String[] brojevi = broj.split(" ");
        if(brojevi.length != 3) {
            throw new IllegalArgumentException();
        } else {
            if(brojevi[0].charAt(0) != '+') {
                throw new IllegalArgumentException();
            }
            kodDrzave = brojevi[0];
            pozivniBroj = brojevi[1];
            brojTelefona = brojevi[2];
            if(brojevi[0].charAt(1) == '6') {
                fiksniTelefon = false;
            } else if(Character.isDigit(brojevi[0].charAt(1))) {
                fiksniTelefon = true;
            } else {
                throw new IllegalArgumentException();
            }
        }

    }
    public String getKodDrzave() {
        return kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public boolean isFiksniTelefon() {
        return fiksniTelefon;
    }

    public boolean istaDrzava(Broj b) {
        return kodDrzave.equals(b.getKodDrzave());
    }

    @Override
    public String toString() {
        return  kodDrzave + " " + pozivniBroj + " " + brojTelefona;
    }
}
