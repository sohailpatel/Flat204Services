package modules

import com.google.inject.AbstractModule
import com.google.inject.Singleton
import providers.ApplicationPropertiesProvider

/**
 * Created by webonise on 25-02-2017.
 */
class ApplicationPropertiesModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Properties).toProvider(ApplicationPropertiesProvider).in(Singleton)
    }
}
