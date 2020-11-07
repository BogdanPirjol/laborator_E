package facc.mta.ro;

public class proiect1 {
    public static void main(String[] arg)
    {
        biblioteca biblioteca_mea1=new biblioteca();
        biblioteca_mea1.add(new carte("Programare in C", "Mihai Togan", 237, 2005));
        biblioteca_mea1.add(new carte("Nmap essentials", "NmapOrg", 467, 2009));
        carte c=new carte("moara cu noroc", "ioan slavici", 223, 1910);
        biblioteca_mea1.add(c);

        biblioteca_mea1.sort();
        biblioteca biblioteca_mea2=new biblioteca();
        biblioteca_mea2.add(new carte("amintiri din copilarie", "Ion Creanga", 152, 1877));
        biblioteca_mea2.add(new carte("idiotul", "doftoiesky", 540, 1923));
        biblioteca_mea2.sort();
        System.out.println(biblioteca_mea1.toString());
        System.out.println(biblioteca_mea2.toString());

        biblioteca biblioteca_mea3=new biblioteca();
        biblioteca_mea3.add(biblioteca_mea1, biblioteca_mea2);
        System.out.println(biblioteca_mea3.toString());
    }
}
