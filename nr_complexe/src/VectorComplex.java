public class VectorComplex {
    NrComplex[] vec;

    public VectorComplex(int elemente)
    {
        vec=new NrComplex[elemente];
    }

    public NrComplex adunare()
    {
        NrComplex rezultat=new NrComplex(0, 0);
        for(int i=0; i<vec.length; i++)
        {
            rezultat=rezultat.adunare(vec[i]);
        }
        return rezultat;
    }
    public VectorComplex adunareVectori(VectorComplex v)
    {
        VectorComplex rezultat= new VectorComplex(vec.length);
        for(int i=0; i< vec.length; i++)
        {
            rezultat.vec[i]=vec[i].adunare(v.vec[i]);
        }
    }

}
