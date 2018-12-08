package ngves.asiainfo.core.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IAllegeInfoValue extends DataStructInterface{

  public final static  String S_AllegeResp = "ALLEGE_RESP";
  public final static  String S_ExgbackOrderId = "EXGBACK_ORDER_ID";
  public final static  String S_UserLevel = "USER_LEVEL";
  public final static  String S_SendProvince = "SEND_PROVINCE";
  public final static  String S_UserBrand = "USER_BRAND";
  public final static  String S_AllegeParentKind = "ALLEGE_PARENT_KIND";
  public final static  String S_AcceptOpId = "ACCEPT_OP_ID";
  public final static  String S_AllegeName = "ALLEGE_NAME";
  public final static  String S_UserProvince = "USER_PROVINCE";
  public final static  String S_OldOrderId = "OLD_ORDER_ID";
  public final static  String S_WareId = "WARE_ID";
  public final static  String S_SendCity = "SEND_CITY";
  public final static  String S_RelateGysId = "RELATE_GYS_ID";
  public final static  String S_ExgbackResp = "EXGBACK_RESP";
  public final static  String S_AcceptComType = "ACCEPT_COM_TYPE";
  public final static  String S_RelateWlsId = "RELATE_WLS_ID";
  public final static  String S_DealTpId = "DEAL_TP_ID";
  public final static  String S_OldSuborderId = "OLD_SUBORDER_ID";
  public final static  String S_BakCol2 = "BAK_COL2";
  public final static  String S_AcceptDesc = "ACCEPT_DESC";
  public final static  String S_AllegeRespType = "ALLEGE_RESP_TYPE";
  public final static  String S_MobilePhoneNo = "MOBILE_PHONE_NO";
  public final static  String S_Indictseq = "INDICTSEQ";
  public final static  String S_RelatePostAddr = "RELATE_POST_ADDR";
  public final static  String S_AllegeLevelId = "ALLEGE_LEVEL_ID";
  public final static  String S_UrgentName = "URGENT_NAME";
  public final static  String S_ExgbackWareFlag = "EXGBACK_WARE_FLAG";
  public final static  String S_AllegeStatus = "ALLEGE_STATUS";
  public final static  String S_RelateStoreId = "RELATE_STORE_ID";
  public final static  String S_RespOpId = "RESP_OP_ID";
  public final static  String S_BakCol1 = "BAK_COL1";
  public final static  String S_AllegeKindId = "ALLEGE_KIND_ID";
  public final static  String S_CallingNum = "CALLING_NUM";
  public final static  String S_AcceptTypeId = "ACCEPT_TYPE_ID";
  public final static  String S_EndOpId = "END_OP_ID";
  public final static  String S_WareCode = "WARE_CODE";
  public final static  String S_AllegeNote = "ALLEGE_NOTE";
  public final static  String S_IndictStatus = "INDICT_STATUS";
  public final static  String S_ComTypeId = "COM_TYPE_ID";
  public final static  String S_AssignStatus = "ASSIGN_STATUS";
  public final static  String S_RespPartnerId = "RESP_PARTNER_ID";
  public final static  String S_DealDesc = "DEAL_DESC";
  public final static  String S_RelateCcsId = "RELATE_CCS_ID";
  public final static  String S_AcceptDate = "ACCEPT_DATE";
  public final static  String S_AllegeId = "ALLEGE_ID";
  public final static  String S_ProcessTime = "PROCESS_TIME";
  public final static  String S_ExgbackOverTime = "EXGBACK_OVER_TIME";
  public final static  String S_RespPartnerType = "RESP_PARTNER_TYPE";
  public final static  String S_AppVersion = "APP_VERSION";
  public final static  String S_EmailAddr = "EMAIL_ADDR";
  public final static  String S_AllegeLxMethod = "ALLEGE_LX_METHOD";
  public final static  String S_ExchgChannel = "EXCHG_CHANNEL";
  public final static  String S_OverTime = "OVER_TIME";
  public final static  String S_WareName = "WARE_NAME";
  public final static  String S_PartnerDeal = "PARTNER_DEAL";
  public final static  String S_ProvinceCode = "PROVINCE_CODE";
  public final static  String S_BakCol3 = "BAK_COL3";
  public final static  String S_StatusTime = "STATUS_TIME";
  public final static  String S_ContentTpId = "CONTENT_TP_ID";


public String getAllegeResp();

public String getExgbackOrderId();

public String getUserLevel();

public String getSendProvince();

public String getUserBrand();

public String getAllegeParentKind();

public long getAcceptOpId();

public String getAllegeName();

public String getUserProvince();

public String getOldOrderId();

public long getWareId();

public String getSendCity();

public long getRelateGysId();

public String getExgbackResp();

public String getAcceptComType();

public long getRelateWlsId();

public long getDealTpId();

public String getOldSuborderId();

public String getBakCol2();

public String getAcceptDesc();

public String getAllegeRespType();

public String getMobilePhoneNo();

public String getIndictseq();

public String getRelatePostAddr();

public String getAllegeLevelId();

public String getUrgentName();

public String getExgbackWareFlag();

public String getAllegeStatus();

public long getRelateStoreId();

public long getRespOpId();

public long getBakCol1();

public String getAllegeKindId();

public long getCallingNum();

public String getAcceptTypeId();

public long getEndOpId();

public String getWareCode();

public String getAllegeNote();

public String getIndictStatus();

public String getComTypeId();

public String getAssignStatus();

public long getRespPartnerId();

public String getDealDesc();

public long getRelateCcsId();

public Timestamp getAcceptDate();

public long getAllegeId();

public long getProcessTime();

public Timestamp getExgbackOverTime();

public String getRespPartnerType();

public long getAppVersion();

public String getEmailAddr();

public String getAllegeLxMethod();

public String getExchgChannel();

public long getOverTime();

public String getWareName();

public String getPartnerDeal();

public String getProvinceCode();

public String getBakCol3();

public Timestamp getStatusTime();

public long getContentTpId();


public  void setAllegeResp(String value);

public  void setExgbackOrderId(String value);

public  void setUserLevel(String value);

public  void setSendProvince(String value);

public  void setUserBrand(String value);

public  void setAllegeParentKind(String value);

public  void setAcceptOpId(long value);

public  void setAllegeName(String value);

public  void setUserProvince(String value);

public  void setOldOrderId(String value);

public  void setWareId(long value);

public  void setSendCity(String value);

public  void setRelateGysId(long value);

public  void setExgbackResp(String value);

public  void setAcceptComType(String value);

public  void setRelateWlsId(long value);

public  void setDealTpId(long value);

public  void setOldSuborderId(String value);

public  void setBakCol2(String value);

public  void setAcceptDesc(String value);

public  void setAllegeRespType(String value);

public  void setMobilePhoneNo(String value);

public  void setIndictseq(String value);

public  void setRelatePostAddr(String value);

public  void setAllegeLevelId(String value);

public  void setUrgentName(String value);

public  void setExgbackWareFlag(String value);

public  void setAllegeStatus(String value);

public  void setRelateStoreId(long value);

public  void setRespOpId(long value);

public  void setBakCol1(long value);

public  void setAllegeKindId(String value);

public  void setCallingNum(long value);

public  void setAcceptTypeId(String value);

public  void setEndOpId(long value);

public  void setWareCode(String value);

public  void setAllegeNote(String value);

public  void setIndictStatus(String value);

public  void setComTypeId(String value);

public  void setAssignStatus(String value);

public  void setRespPartnerId(long value);

public  void setDealDesc(String value);

public  void setRelateCcsId(long value);

public  void setAcceptDate(Timestamp value);

public  void setAllegeId(long value);

public  void setProcessTime(long value);

public  void setExgbackOverTime(Timestamp value);

public  void setRespPartnerType(String value);

public  void setAppVersion(long value);

public  void setEmailAddr(String value);

public  void setAllegeLxMethod(String value);

public  void setExchgChannel(String value);

public  void setOverTime(long value);

public  void setWareName(String value);

public  void setPartnerDeal(String value);

public  void setProvinceCode(String value);

public  void setBakCol3(String value);

public  void setStatusTime(Timestamp value);

public  void setContentTpId(long value);
}
