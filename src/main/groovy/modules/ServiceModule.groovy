package modules

import com.google.inject.AbstractModule
import com.google.inject.Singleton
import groovy.transform.CompileStatic
import services.impl.RoomServiceImp
import services.interfaces.RoomService

@CompileStatic
class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(RoomService).to(RoomServiceImp).in(Singleton)
    }
}
