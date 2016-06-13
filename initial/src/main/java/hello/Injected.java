package hello;

public class Injected {
    private final Guicer guicer;
    
    @Inject
    Injected(Guicer injectedGuicer){
        guicer=injectedGuicer;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
