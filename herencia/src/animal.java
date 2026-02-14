public class animal {

    protected String name;
    public animal(String name) {
        this.name=name;
    }


    public void hacerSonido(){
        System.out.println(name+ "Hacer sonido x");
    }
    public void comer(){
        System.out.println(name+"Esta Comiendo.");
    }
}
