package ngves.asiainfo.core.common.bo;

import java.sql.Timestamp;

import ngves.asiainfo.core.common.ivalues.IQBOAllegeAssignQueryInfoValue;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;

public class QBOAllegeAssignQueryInfoBean extends DataContainer implements DataContainerInterface,IQBOAllegeAssignQueryInfoValue{

  /**
	 * 
	 */
	private static final long serialVersionUID = -1528145574609616654L;



private static String  m_boName = "ngves.asiainfo.core.common.bo.QBOAllegeAssignQueryInfo";



  public final static  String S_AllegeId = "ALLEGE_ID";
  public final static  String S_AllegeLevelId = "ALLEGE_LEVEL_ID";
  public final static  String S_UrgentName = "URGENT_NAME";
  public final static  String S_OverTimeFlag = "OVER_TIME_FLAG";
  public final static  String S_DealResult = "DEAL_RESULT";
  public final static  String S_DealOpId = "DEAL_OP_ID";
  public final static  String S_SendStaffId = "SEND_STAFF_ID";
  public final static  String S_PartnerType = "PARTNER_TYPE";
  public final static  String S_AllegeKindId = "ALLEGE_KIND_ID";
  public final static  String S_AllegeLevelName = "ALLEGE_LEVEL_NAME";
  public final static  String S_DealDate = "DEAL_DATE";
  public final static  String S_AllegeParentKind = "ALLEGE_PARENT_KIND";
  public final static  String S_AllegeAssignId = "ALLEGE_ASSIGN_ID";
  public final static  String S_SendNote = "SEND_NOTE";
  public final static  String S_SendTpId = "SEND_TP_ID";
  public final static  String S_DealTpId = "DEAL_TP_ID";
  public final static  String S_ToStaffId = "TO_STAFF_ID";
  public final static  String S_Note = "NOTE";
  public final static  String S_SendDate = "SEND_DATE";
  public final static  String S_ProvinceCode = "PROVINCE_CODE";
  public final static  String S_ComTypeId = "COM_TYPE_ID";
  public final static  String S_AssignStatus = "ASSIGN_STATUS";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_DealDesc = "DEAL_DESC";
  public QBOAllegeAssignQueryInfoBean() throws AIException{
      super(ServiceManager.getObjectTypeFactory().getInstance(m_boName));
  }


 public static ObjectType getObjectTypeStatic() throws AIException{
   return ServiceManager.getObjectTypeFactory().getInstance(m_boName);
 }

 public void setObjectType(ObjectType  value) throws AIException{
   throw new AIException("此种数据容器不能重置业务对象类型");
 }


  public void initAllegeId(long value){
     this.initProperty(S_AllegeId,new Long(value));
  }
  public  void setAllegeId(long value){
     this.set(S_AllegeId,new Long(value));
  }
  public  void setAllegeIdNull(){
     this.set(S_AllegeId,null);
  }

  public long getAllegeId(){
        return DataType.getAsLong(this.get(S_AllegeId));
  
  }
  public long getAllegeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AllegeId));
      }

  public void initAllegeLevelId(String value){
     this.initProperty(S_AllegeLevelId,value);
  }
  public  void setAllegeLevelId(String value){
     this.set(S_AllegeLevelId,value);
  }
  public  void setAllegeLevelIdNull(){
     this.set(S_AllegeLevelId,null);
  }

  public String getAllegeLevelId(){
       return DataType.getAsString(this.get(S_AllegeLevelId));
  
  }
  public String getAllegeLevelIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AllegeLevelId));
      }

  public void initUrgentName(String value){
     this.initProperty(S_UrgentName,value);
  }
  public  void setUrgentName(String value){
     this.set(S_UrgentName,value);
  }
  public  void setUrgentNameNull(){
     this.set(S_UrgentName,null);
  }

  public String getUrgentName(){
       return DataType.getAsString(this.get(S_UrgentName));
  
  }
  public String getUrgentNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UrgentName));
      }

  public void initOverTimeFlag(String value){
     this.initProperty(S_OverTimeFlag,value);
  }
  public  void setOverTimeFlag(String value){
     this.set(S_OverTimeFlag,value);
  }
  public  void setOverTimeFlagNull(){
     this.set(S_OverTimeFlag,null);
  }

  public String getOverTimeFlag(){
       return DataType.getAsString(this.get(S_OverTimeFlag));
  
  }
  public String getOverTimeFlagInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OverTimeFlag));
      }

  public void initDealResult(String value){
     this.initProperty(S_DealResult,value);
  }
  public  void setDealResult(String value){
     this.set(S_DealResult,value);
  }
  public  void setDealResultNull(){
     this.set(S_DealResult,null);
  }

  public String getDealResult(){
       return DataType.getAsString(this.get(S_DealResult));
  
  }
  public String getDealResultInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DealResult));
      }

  public void initDealOpId(long value){
     this.initProperty(S_DealOpId,new Long(value));
  }
  public  void setDealOpId(long value){
     this.set(S_DealOpId,new Long(value));
  }
  public  void setDealOpIdNull(){
     this.set(S_DealOpId,null);
  }

  public long getDealOpId(){
        return DataType.getAsLong(this.get(S_DealOpId));
  
  }
  public long getDealOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DealOpId));
      }

  public void initSendStaffId(long value){
     this.initProperty(S_SendStaffId,new Long(value));
  }
  public  void setSendStaffId(long value){
     this.set(S_SendStaffId,new Long(value));
  }
  public  void setSendStaffIdNull(){
     this.set(S_SendStaffId,null);
  }

  public long getSendStaffId(){
        return DataType.getAsLong(this.get(S_SendStaffId));
  
  }
  public long getSendStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SendStaffId));
      }

  public void initPartnerType(String value){
     this.initProperty(S_PartnerType,value);
  }
  public  void setPartnerType(String value){
     this.set(S_PartnerType,value);
  }
  public  void setPartnerTypeNull(){
     this.set(S_PartnerType,null);
  }

  public String getPartnerType(){
       return DataType.getAsString(this.get(S_PartnerType));
  
  }
  public String getPartnerTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PartnerType));
      }

  public void initAllegeKindId(String value){
     this.initProperty(S_AllegeKindId,value);
  }
  public  void setAllegeKindId(String value){
     this.set(S_AllegeKindId,value);
  }
  public  void setAllegeKindIdNull(){
     this.set(S_AllegeKindId,null);
  }

  public String getAllegeKindId(){
       return DataType.getAsString(this.get(S_AllegeKindId));
  
  }
  public String getAllegeKindIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AllegeKindId));
      }

  public void initAllegeLevelName(String value){
     this.initProperty(S_AllegeLevelName,value);
  }
  public  void setAllegeLevelName(String value){
     this.set(S_AllegeLevelName,value);
  }
  public  void setAllegeLevelNameNull(){
     this.set(S_AllegeLevelName,null);
  }

  public String getAllegeLevelName(){
       return DataType.getAsString(this.get(S_AllegeLevelName));
  
  }
  public String getAllegeLevelNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AllegeLevelName));
      }

  public void initDealDate(Timestamp value){
     this.initProperty(S_DealDate,value);
  }
  public  void setDealDate(Timestamp value){
     this.set(S_DealDate,value);
  }
  public  void setDealDateNull(){
     this.set(S_DealDate,null);
  }

  public Timestamp getDealDate(){
        return DataType.getAsDateTime(this.get(S_DealDate));
  
  }
  public Timestamp getDealDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DealDate));
      }

  public void initAllegeParentKind(String value){
     this.initProperty(S_AllegeParentKind,value);
  }
  public  void setAllegeParentKind(String value){
     this.set(S_AllegeParentKind,value);
  }
  public  void setAllegeParentKindNull(){
     this.set(S_AllegeParentKind,null);
  }

  public String getAllegeParentKind(){
       return DataType.getAsString(this.get(S_AllegeParentKind));
  
  }
  public String getAllegeParentKindInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AllegeParentKind));
      }

  public void initAllegeAssignId(long value){
     this.initProperty(S_AllegeAssignId,new Long(value));
  }
  public  void setAllegeAssignId(long value){
     this.set(S_AllegeAssignId,new Long(value));
  }
  public  void setAllegeAssignIdNull(){
     this.set(S_AllegeAssignId,null);
  }

  public long getAllegeAssignId(){
        return DataType.getAsLong(this.get(S_AllegeAssignId));
  
  }
  public long getAllegeAssignIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AllegeAssignId));
      }

  public void initSendNote(String value){
     this.initProperty(S_SendNote,value);
  }
  public  void setSendNote(String value){
     this.set(S_SendNote,value);
  }
  public  void setSendNoteNull(){
     this.set(S_SendNote,null);
  }

  public String getSendNote(){
       return DataType.getAsString(this.get(S_SendNote));
  
  }
  public String getSendNoteInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SendNote));
      }

  public void initSendTpId(long value){
     this.initProperty(S_SendTpId,new Long(value));
  }
  public  void setSendTpId(long value){
     this.set(S_SendTpId,new Long(value));
  }
  public  void setSendTpIdNull(){
     this.set(S_SendTpId,null);
  }

  public long getSendTpId(){
        return DataType.getAsLong(this.get(S_SendTpId));
  
  }
  public long getSendTpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SendTpId));
      }

  public void initDealTpId(long value){
     this.initProperty(S_DealTpId,new Long(value));
  }
  public  void setDealTpId(long value){
     this.set(S_DealTpId,new Long(value));
  }
  public  void setDealTpIdNull(){
     this.set(S_DealTpId,null);
  }

  public long getDealTpId(){
        return DataType.getAsLong(this.get(S_DealTpId));
  
  }
  public long getDealTpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DealTpId));
      }

  public void initToStaffId(long value){
     this.initProperty(S_ToStaffId,new Long(value));
  }
  public  void setToStaffId(long value){
     this.set(S_ToStaffId,new Long(value));
  }
  public  void setToStaffIdNull(){
     this.set(S_ToStaffId,null);
  }

  public long getToStaffId(){
        return DataType.getAsLong(this.get(S_ToStaffId));
  
  }
  public long getToStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ToStaffId));
      }

  public void initNote(String value){
     this.initProperty(S_Note,value);
  }
  public  void setNote(String value){
     this.set(S_Note,value);
  }
  public  void setNoteNull(){
     this.set(S_Note,null);
  }

  public String getNote(){
       return DataType.getAsString(this.get(S_Note));
  
  }
  public String getNoteInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Note));
      }

  public void initSendDate(Timestamp value){
     this.initProperty(S_SendDate,value);
  }
  public  void setSendDate(Timestamp value){
     this.set(S_SendDate,value);
  }
  public  void setSendDateNull(){
     this.set(S_SendDate,null);
  }

  public Timestamp getSendDate(){
        return DataType.getAsDateTime(this.get(S_SendDate));
  
  }
  public Timestamp getSendDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SendDate));
      }

  public void initProvinceCode(String value){
     this.initProperty(S_ProvinceCode,value);
  }
  public  void setProvinceCode(String value){
     this.set(S_ProvinceCode,value);
  }
  public  void setProvinceCodeNull(){
     this.set(S_ProvinceCode,null);
  }

  public String getProvinceCode(){
       return DataType.getAsString(this.get(S_ProvinceCode));
  
  }
  public String getProvinceCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvinceCode));
      }

  public void initComTypeId(String value){
     this.initProperty(S_ComTypeId,value);
  }
  public  void setComTypeId(String value){
     this.set(S_ComTypeId,value);
  }
  public  void setComTypeIdNull(){
     this.set(S_ComTypeId,null);
  }

  public String getComTypeId(){
       return DataType.getAsString(this.get(S_ComTypeId));
  
  }
  public String getComTypeIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ComTypeId));
      }

  public void initAssignStatus(String value){
     this.initProperty(S_AssignStatus,value);
  }
  public  void setAssignStatus(String value){
     this.set(S_AssignStatus,value);
  }
  public  void setAssignStatusNull(){
     this.set(S_AssignStatus,null);
  }

  public String getAssignStatus(){
       return DataType.getAsString(this.get(S_AssignStatus));
  
  }
  public String getAssignStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AssignStatus));
      }

  public void initPartnerId(long value){
     this.initProperty(S_PartnerId,new Long(value));
  }
  public  void setPartnerId(long value){
     this.set(S_PartnerId,new Long(value));
  }
  public  void setPartnerIdNull(){
     this.set(S_PartnerId,null);
  }

  public long getPartnerId(){
        return DataType.getAsLong(this.get(S_PartnerId));
  
  }
  public long getPartnerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartnerId));
      }

  public void initDealDesc(String value){
     this.initProperty(S_DealDesc,value);
  }
  public  void setDealDesc(String value){
     this.set(S_DealDesc,value);
  }
  public  void setDealDescNull(){
     this.set(S_DealDesc,null);
  }

  public String getDealDesc(){
       return DataType.getAsString(this.get(S_DealDesc));
  
  }
  public String getDealDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DealDesc));
      }


 
 }

