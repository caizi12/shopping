package ngves.asiainfo.core.ware.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import ngves.asiainfo.core.ware.ivalues.*;

public class QBOJobDateBean extends DataContainer implements DataContainerInterface,IQBOJobDateValue{

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



private static String  m_boName = "ngves.asiainfo.core.ware.bo.QBOJobDate";



  public final static  String S_StartDate = "START_DATE";
  public final static  String S_BakCol2 = "BAK_COL2";
  public final static  String S_BakCol1 = "BAK_COL1";
  public final static  String S_SortId = "SORT_ID";
  public final static  String S_JobTaskType = "JOB_TASK_TYPE";
  public final static  String S_CreateTime = "CREATE_TIME";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_JobDateRltId = "JOB_DATE_RLT_ID";
  public final static  String S_JobTaskName = "JOB_TASK_NAME";
  public final static  String S_JobTaskId = "JOB_TASK_ID";
  public QBOJobDateBean() throws AIException{
      super(ServiceManager.getObjectTypeFactory().getInstance(m_boName));
  }


 public static ObjectType getObjectTypeStatic() throws AIException{
   return ServiceManager.getObjectTypeFactory().getInstance(m_boName);
 }

 public void setObjectType(ObjectType  value) throws AIException{
   throw new AIException("此种数据容器不能重置业务对象类型");
 }


  public void initStartDate(Timestamp value){
     this.initProperty(S_StartDate,value);
  }
  public  void setStartDate(Timestamp value){
     this.set(S_StartDate,value);
  }
  public  void setStartDateNull(){
     this.set(S_StartDate,null);
  }

  public Timestamp getStartDate(){
        return DataType.getAsDateTime(this.get(S_StartDate));
  
  }
  public Timestamp getStartDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StartDate));
      }

  public void initBakCol2(String value){
     this.initProperty(S_BakCol2,value);
  }
  public  void setBakCol2(String value){
     this.set(S_BakCol2,value);
  }
  public  void setBakCol2Null(){
     this.set(S_BakCol2,null);
  }

  public String getBakCol2(){
       return DataType.getAsString(this.get(S_BakCol2));
  
  }
  public String getBakCol2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_BakCol2));
      }

  public void initBakCol1(String value){
     this.initProperty(S_BakCol1,value);
  }
  public  void setBakCol1(String value){
     this.set(S_BakCol1,value);
  }
  public  void setBakCol1Null(){
     this.set(S_BakCol1,null);
  }

  public String getBakCol1(){
       return DataType.getAsString(this.get(S_BakCol1));
  
  }
  public String getBakCol1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_BakCol1));
      }

  public void initSortId(long value){
     this.initProperty(S_SortId,new Long(value));
  }
  public  void setSortId(long value){
     this.set(S_SortId,new Long(value));
  }
  public  void setSortIdNull(){
     this.set(S_SortId,null);
  }

  public long getSortId(){
        return DataType.getAsLong(this.get(S_SortId));
  
  }
  public long getSortIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SortId));
      }

  public void initJobTaskType(String value){
     this.initProperty(S_JobTaskType,value);
  }
  public  void setJobTaskType(String value){
     this.set(S_JobTaskType,value);
  }
  public  void setJobTaskTypeNull(){
     this.set(S_JobTaskType,null);
  }

  public String getJobTaskType(){
       return DataType.getAsString(this.get(S_JobTaskType));
  
  }
  public String getJobTaskTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobTaskType));
      }

  public void initCreateTime(Timestamp value){
     this.initProperty(S_CreateTime,value);
  }
  public  void setCreateTime(Timestamp value){
     this.set(S_CreateTime,value);
  }
  public  void setCreateTimeNull(){
     this.set(S_CreateTime,null);
  }

  public Timestamp getCreateTime(){
        return DataType.getAsDateTime(this.get(S_CreateTime));
  
  }
  public Timestamp getCreateTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreateTime));
      }

  public void initEndDate(Timestamp value){
     this.initProperty(S_EndDate,value);
  }
  public  void setEndDate(Timestamp value){
     this.set(S_EndDate,value);
  }
  public  void setEndDateNull(){
     this.set(S_EndDate,null);
  }

  public Timestamp getEndDate(){
        return DataType.getAsDateTime(this.get(S_EndDate));
  
  }
  public Timestamp getEndDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EndDate));
      }

  public void initJobDateRltId(long value){
     this.initProperty(S_JobDateRltId,new Long(value));
  }
  public  void setJobDateRltId(long value){
     this.set(S_JobDateRltId,new Long(value));
  }
  public  void setJobDateRltIdNull(){
     this.set(S_JobDateRltId,null);
  }

  public long getJobDateRltId(){
        return DataType.getAsLong(this.get(S_JobDateRltId));
  
  }
  public long getJobDateRltIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_JobDateRltId));
      }

  public void initJobTaskName(String value){
     this.initProperty(S_JobTaskName,value);
  }
  public  void setJobTaskName(String value){
     this.set(S_JobTaskName,value);
  }
  public  void setJobTaskNameNull(){
     this.set(S_JobTaskName,null);
  }

  public String getJobTaskName(){
       return DataType.getAsString(this.get(S_JobTaskName));
  
  }
  public String getJobTaskNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobTaskName));
      }

  public void initJobTaskId(long value){
     this.initProperty(S_JobTaskId,new Long(value));
  }
  public  void setJobTaskId(long value){
     this.set(S_JobTaskId,new Long(value));
  }
  public  void setJobTaskIdNull(){
     this.set(S_JobTaskId,null);
  }

  public long getJobTaskId(){
        return DataType.getAsLong(this.get(S_JobTaskId));
  
  }
  public long getJobTaskIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_JobTaskId));
      }


 
 }

