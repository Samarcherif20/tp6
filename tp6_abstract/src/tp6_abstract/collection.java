package tp6_abstract;



public class collection {

    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new asietteRonde(1926, 8.4);
        us[1] = new Cuillere(1881, 7.3);
        us[2] = new AssietteCaree(1935, 5.6);
        us[3] = new Cuillere(1917, 8.8);
        us[4] = new asietteRonde(1837, 5.4);

        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
    }

    static void afficherCuilleres(Ustensile[] us) {
        int nbc = 0;
        for  (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Cuillere) {
                nbc++;
            }
        }
        System.out.println("Il y a " + nbc + " cuillères.");
    }

    static void afficherSurfaceAssiettes(Ustensile[] us) {
        double st = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Asiette) {
                st += ((Asiette) us[i]).calculerSurfaceAssiettes();
            }
        }
        System.out.println("Surface totale des assiettes : " + st);
    }

    static void afficherValeurTotale(Ustensile[] us) {
        double vt = 0;
        for  (int i = 0; i < us.length; i++)  {
            vt += us[i].calculerTotal();
        }
        System.out.println("Valeur totale de la collection : " + vt);
    }
}



