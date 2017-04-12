import groovy.transform.CompileStatic
import modules.ApplicationPropertiesModule
import modules.DaoModule
import modules.ServiceModule
import restling.guice.modules.RestlingApplicationModule
import routers.RootRouter
/**
 * Created by webonise on 25-02-2017.
 */
@CompileStatic
class Application extends RestlingApplicationModule {
    Class<RootRouter> routerClass = RootRouter

    @Override
    void configureCustomBindings() {
        install(new DaoModule())
        install(new ServiceModule())
        install(new ApplicationPropertiesModule())
    }
}