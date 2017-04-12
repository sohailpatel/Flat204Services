package resources

import com.google.inject.Inject
import org.restlet.resource.Delete
import org.restlet.resource.Get
import org.restlet.resource.Post
import org.restlet.resource.Put
import org.restlet.resource.ServerResource
import services.interfaces.RoomService
import pojos.RoomServicePojo

/**
 * Created by webonise on 25-02-2017.
 */
class RoomServiceResource extends ServerResource{
    private RoomService roomService

    @Inject
    RoomServiceResource(RoomService roomService) {
        this.roomService = roomService
    }

    @Get
    BigDecimal finalResult() {
        return roomService.finalResult()
    }

    @Post
    int enterData(RoomServicePojo roomServicePojo) {
        return roomService.enterData(roomServicePojo)
    }

    @Put
    int updateData(RoomServicePojo roomServicePojo) {
        int entryId = getQueryValue("entryId") as int
        return roomService.updateData(entryId, roomServicePojo)
    }

    @Delete
    int resetData() {
        int entryId = getQueryValue("entryId") as int
        return roomService.resetData()
    }

}
