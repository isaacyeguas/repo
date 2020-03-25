
public class Coronavirus {

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
    
}
