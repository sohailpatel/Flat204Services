package daos

import com.google.inject.Inject
import com.webonise.Flat_204_Service.Tables
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.jooq.DSLContext
import pojos.RoomServicePojo
import com.webonise.Flat_204_Service.tables.records.RoomServiceRecord
/**
 * Created by webonise on 25-02-2017.
 */
@Slf4j
@CompileStatic
class UserDao {

    private static final String ID_PARAMETER = "ID_PARAMETER"
    private final DSLContext dslContext

    @Inject
    UserDao(DSLContext dslContext) {
        this.dslContext = dslContext
    }

    BigDecimal finalResult(int takeFrom) {
        log.info "Room Service Table - "+dslContext.select().from(Tables.ROOM_SERVICE).fetch().into(Tables.ROOM_SERVICE)
        List<RoomServiceRecord> finalResult = dslContext.select().from(Tables.ROOM_SERVICE).fetch().into(Tables.ROOM_SERVICE)
        BigDecimal finalAmount=0;
        for (int rowCounter = 0; rowCounter < finalResult.size(); rowCounter++) {
            if(finalResult.get(rowCounter).get(2) == takeFrom){
               // finalAmount+=finalResult.get(rowCounter).get(3);
            }
        }
        return finalAmount;
    }

    int enterData(RoomServicePojo roomServicePojo) {
        log.info "Student Pojo Name - "+roomServicePojo.getAmount()
        return dslContext.insertInto(Tables.ROOM_SERVICE).values(roomServicePojo.give_to,roomServicePojo.take_from,roomServicePojo.amount).execute()
    }

    int updateData(int entryId, RoomServicePojo roomServicePojo) {
        log.info "Entry ID - "+entryId
        log.info "Room Service Pojo - "+" "+roomServicePojo
        return dslContext.update(Tables.ROOM_SERVICE).set(Tables.ROOM_SERVICE.GIVE_TO , roomServicePojo.give_to).
                set(Tables.ROOM_SERVICE.TAKE_FROM , roomServicePojo.take_from).
                set(Tables.ROOM_SERVICE.AMOUNT , roomServicePojo.amount).
                where(Tables.ROOM_SERVICE.ID.equal(entryId)).execute()
    }

    int resetData() {
        return dslContext.truncate(Tables.ROOM_SERVICE).execute()
    }
}
