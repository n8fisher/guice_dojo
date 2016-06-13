package hello;

import com.google.inject.Guice;
import com.google.inject.Injector;

import modules.GuicingModule;

public class GuicingMain {
    
    public static void main(String[] args) {
        //Step one
        Injector injector = Guice.createInjector(new GuicingModule());

        Guicer svc = injector.getInstance(Guicer.class);
        svc.makeGuice();
    }
}
