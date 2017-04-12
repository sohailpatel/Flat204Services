package modules

import com.google.inject.AbstractModule
import com.google.inject.Singleton
import org.jooq.DSLContext
import providers.DSLContextProvider

/**
 * Created by webonise on 25-02-2017.
 */
class DaoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DSLContext).toProvider(DSLContextProvider).in(Singleton)
    }
}
