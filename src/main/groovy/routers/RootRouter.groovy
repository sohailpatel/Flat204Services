package routers

import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter

/**
 * Created by webonise on 25-02-2017.
 */
@CompileStatic
class RootRouter extends RestlingRouter {

    @Override
    void init() throws Exception {
        attachSubRouter("/api",ApiRouter);
    }
}
