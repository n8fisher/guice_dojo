package hello;

import com.google.inject.Inject;

public class GuicingService {
    private final Guicer guicer;
    
    @Inject
    GuicingService(Guicer injectedGuicer){
        guicer=injectedGuicer;
    }

}
