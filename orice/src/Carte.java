public class Carte {
    private String titlu;
    private int id;
    private int copiiDisponibile;

    public Carte(String titlu, int id, int copiiDisponibile)
    {
        this.titlu=titlu;
        //this.autor=autor;
        this.id=id;
        this.copiiDisponibile=copiiDisponibile;
    }
    public String getTitlu()
    {
        return titlu;
    }
    public int getId()
    {
        return id;
    }
    /*public void setAutor(Autor x)
    {
        this.autor=x;
    }
    public Autor getAutor()
    {
        return autor;
    }*/
    public void setCopiiDisponibile(int c)
    {
        this.copiiDisponibile=c;
    }
    public int getCopiiDisponibile()
    {
        return copiiDisponibile;
    }

}
