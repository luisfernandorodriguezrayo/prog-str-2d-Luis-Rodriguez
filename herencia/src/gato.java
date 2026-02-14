public class gato  extends animal{

    public gato(String name) {
        super(name);
    }

    @Override
    public void hacersonido(){
        System.out.println(name+" hace miau o rawrl");
    }
}
