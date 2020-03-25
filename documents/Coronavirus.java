
public class Coronavirus{

    private float infeccio;
    private float mortaldat;

    //constructor buit
    Coronavirus(){
        infeccio = 0;
        mortaldat = 0;
    }
     
    Coronavirus(float x, float y) {
        infeccio = x;
        mortaldat = y;
    }
    
    //costructor copiador
    Coronavirus(Coronavirus c) {
        infeccio = c.infeccio;
        mortaldat = c.mortaldat;  
    }

    public float getInfeccio() {
        return infeccio;
    }

    public void setInfeccio(float infeccio) {
        this.infeccio = infeccio;
    }

    public float getMortaldat() {
        return mortaldat;
    }

    public void setMortaldat(float mortaldat) {
        this.mortaldat = mortaldat;
    }   
    
}

class Covid_19 extends Coronavirus{
    
    private int diesDeQuarentena;

    //constructor buit
    Covid_19(){
        super();
        diesDeQuarentena = 0;
    }
     
    Covid_19(int x) {
        super();
        diesDeQuarentena = x;
    }
    
    //costructor copiador
    Covid_19(Covid_19 cv) {
        super();
        diesDeQuarentena = cv.diesDeQuarentena;
    }
}
