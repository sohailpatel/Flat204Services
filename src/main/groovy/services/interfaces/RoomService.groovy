package services.interfaces

import pojos.RoomServicePojo

/**
 * Created by webonise on 25-02-2017.
 */
interface RoomService {
    BigDecimal finalResult(int takeFrom);
    int updateData(int roomServiceId, RoomServicePojo roomServicePojo);
    int resetData();
    int enterData(RoomServicePojo roomServicePojo);
}