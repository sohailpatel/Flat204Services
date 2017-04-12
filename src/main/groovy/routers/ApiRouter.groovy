package routers

import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter
import resources.RoomServiceResource
/**
 * Created by webonise on 25-02-2017.
 */
@CompileStatic
class ApiRouter extends RestlingRouter {

    @Override
    void init() throws Exception {
        attach("/roomservice", RoomServiceResource)
    }
}