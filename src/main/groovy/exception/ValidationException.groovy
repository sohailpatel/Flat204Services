package exception

import org.restlet.data.Status

/**
 * Created by webonise on 25-02-2017.
 */
class ValidationException {
    ValidationException(String description) {
        super(Status.CLIENT_ERROR_BAD_REQUEST, description)
    }
}
