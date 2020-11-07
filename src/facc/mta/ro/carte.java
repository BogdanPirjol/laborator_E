package facc.mta.ro;

public class carte implements Comparable<carte>{
    private String titlu;
    private String autor;
    private int an_aparitie;
    private int numar_pagini;

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + " publicata in anul " + this.an_aparitie;
    }

    @Override
    public int compareTo(carte o) {
        if(this.numar_pagini < o.numar_pagini)
            return -1;
        if(this.numar_pagini>o.numar_pagini)
            return 1;
        return 0;
    }

    public carte(String titlu, String autor, int nr_pagini, int an_aparitie)
    {
        this.titlu=titlu;
        this.autor=autor;
        this.numar_pagini=nr_pagini;
        this.an_aparitie=an_aparitie;
    }

}
