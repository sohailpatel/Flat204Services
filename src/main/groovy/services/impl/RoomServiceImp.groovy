package services.impl

import com.google.inject.Inject
import daos.UserDao
import groovy.transform.CompileStatic
import pojos.RoomServicePojo
import services.interfaces.RoomService

@CompileStatic
class RoomServiceImp implements RoomService{

    private UserDao userDao

    @Inject
    RoomServiceImp(UserDao userDao) {
        this.userDao = userDao
    }

    @Override
    int enterData(RoomServicePojo roomServicePojo) {
        return userDao.enterData(roomServicePojo)
    }

    @Override
    BigDecimal finalResult(int takeFrom) {
        return userDao.finalResult(takeFrom)
    }

    @Override
    int updateData(int roomServiceId, RoomServicePojo roomServicePojo) {
        return userDao.updateData(roomServiceId,roomServicePojo)
    }

    @Override
    int resetData() {
        return userDao.resetData()
    }

}
