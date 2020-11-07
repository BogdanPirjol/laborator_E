package facc.mta.ro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class biblioteca {
    private ArrayList<carte> carti;

    @Override
    public String toString() {
        StringBuilder cartile = new StringBuilder();
        cartile.append("biblioteca contine urmatoarele carti:\n");
        for (carte c : carti) {
            cartile.append(c.toString());
            cartile.append("\n");
        }
        return cartile.toString();
    }

    public void add(carte c)
    {
        carti.add(c);
    }


    public void add(biblioteca bib1, biblioteca bib2)
    {

        for(carte c: bib1.getCarti())
        {
            this.add(c);
        }
        for(carte c: bib2.getCarti())
        {
            this.add(c);
        }

    }

    public ArrayList<carte> getCarti() {
        return carti;
    }

    public biblioteca()
    {
        carti=new ArrayList<carte>();
    }

    public void sort()
    {
        Collections.reverse(carti);
    }


}
