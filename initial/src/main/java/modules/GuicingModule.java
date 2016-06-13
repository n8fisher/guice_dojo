package modules;

import com.google.inject.AbstractModule
;

import hello.Guicer;
import hello.HandGuicer;

public class GuicingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Guicer.class).to(HandGuicer.class);
    }

}
