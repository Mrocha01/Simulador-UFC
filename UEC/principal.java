package UEC;

public class principal {
    public static void main(String[] args) {

        UecClass[] L = new UecClass[6];

        L[0] = new UecClass("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        L[1] = new UecClass("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        L[2] = new UecClass("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        L[3] = new UecClass("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        L[4] = new UecClass("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        L[5] = new UecClass("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);

    
        // for (int i = 0; i < L.length; i++) {
        //     L[i].status();
        // }

        Luta fight = new Luta();

        fight.marcarLuta(L[1], L[0]);
        fight.lutar();

        // fight.marcarLuta(L[1], L[4]);
        // fight.marcarLuta(L[2], L[2]);
    }
}
