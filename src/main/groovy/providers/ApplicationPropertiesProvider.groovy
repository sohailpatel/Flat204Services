package providers

import com.google.inject.Provider
import groovy.transform.CompileStatic

/**
 * Created by webonise on 25-02-2017.
 */
@CompileStatic
class ApplicationPropertiesProvider implements Provider<Properties> {

    @Override
    Properties get() {
        Properties properties = new Properties()
        properties.load(new FileInputStream("application.properties"))
        return properties
    }
}
