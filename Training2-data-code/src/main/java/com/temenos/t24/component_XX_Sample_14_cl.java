/*   |   *//************** TAFJ INFO ***************************************/
/*   |   *//* <TAFJ-BP>D:\\DS\\Training2-artifects\\Training2-data-code\\src\\Source\\XX_Sample\\Definition\\XX.Sample.component<\TAFJ-BP>  */
/*   |   *//* <TAFJ-BPA><\TAFJ-BPA>  */
/*   |   *//* <TAFJ-BN>component.XX.Sample<\TAFJ-BN>  */
/*   |   *//************** TAFJ INFO ***************************************/
/*   |   */package com.temenos.t24;
/*   |   */
/*   |   */import com.temenos.tafj.common.jVar;
/*   |   */import com.temenos.tafj.common.jVarFactory;
/*   |   */import java.util.Vector;
/*   |   */import java.lang.reflect.Method;
/*   |   */import java.util.HashMap;
/*   |   */import com.temenos.api.T24TypesAbstractConvertible;
/*   |   */import com.temenos.api.ComplexTypeHelper;
/*   |   */import com.temenos.api.GenericRecordHelper;
/*   |   */import com.temenos.api.exceptions.T24CoreException;
/*   |   */import com.temenos.api.exceptions.T24IllegalArgumentException;
/*   |   */import com.temenos.tafj.core.nativecomponents.TF_Core;
/*   |   */import com.temenos.tafj.core.nativecomponents.TF_ErrorHandling;
/*   |   */import com.temenos.tafj.common.PreciseDecimal;
/*   |   */import com.temenos.tafj.common.jSession;
/*   |   */import com.temenos.tafj.common.constants.ConstantsSystem;
/*   |   */import com.temenos.tafj.common.util.BasicConvert;
/*   |   */import com.temenos.tafj.runtime.jRunTime;
/*   |   */import com.temenos.tafj.runtime.jAtVariable;
/*   |   */import com.temenos.t24.*;
/*   |   */import com.temenos.tafj.api.client.impl.T24Context;
/*   |   */import com.temenos.tafj.api.client.impl.TAFJRuntimeFactory;
/*   |   */import com.temenos.api.T24TypesConvertibleHelper;
/*   |   */import com.temenos.api.ListHelper;
/*   |   */import java.util.ArrayList;
/*   |   */import java.util.List;
/*   |   */import java.util.HashSet;
/*   |   */import com.temenos.api.TString;
/*   |   */import com.temenos.api.TNumber;
/*   |   */import com.temenos.api.TDate;
/*   |   */import com.temenos.api.TBoolean;
/*   |   */import com.temenos.api.TStructure;
/*   |   */import com.temenos.api.TValidationResponse;
/*   |   */import com.temenos.tafj.common.IntAndKey;
/*   |   */import com.temenos.tafj.common.DefaultLogger;
/*   |   */
/*   |   */ //COMPONENTDEF component_XX_Sample_14_cl
/*   |   */@SuppressWarnings("unused")
/*   |   */public class component_XX_Sample_14_cl extends jRunTime {
/*   |   */    private final jSession session;
/*   |   */    private T24Context t24Context; // Used to populate list. Lasy initialisation
/*   |   */    private final TF_Core TF_Core;
/*   |   */    private final TF_ErrorHandling TF_ErrorHandling;
/*   |   */    
/*   |   */    public component_XX_Sample_14_cl(jSession session) { // constructor
/*   |   */        this.session = session;
/*   |   */        super.init(session);
/*   |   */        this.TF_Core = new TF_Core(this);
/*   |   */        this.TF_ErrorHandling = new TF_ErrorHandling(this);
/*   |   */    }
/*   |   */    public component_XX_Sample_14_cl() { // empty constructor for introspection
/*   |   */        this.session = null;
/*   |   */        this.TF_Core = null;
/*   |   */        this.TF_ErrorHandling = null;
/*   |   */    }
/*   |   */    public jVar tableCustomer(Object recordId, Object error) {
/*   |   */        jVar jvRecord = jVarFactory.get();
/*   |   */        jVar jvFilePtr = jVarFactory.get();
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "Read", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.READ").invoke("F.CUSTOMER", jvRecordId, jvRecord, jvFilePtr, error);
/*   |   */            return jvRecord;
/*   |   */        } else {
/*   |   */            F_READ_cl.INSTANCE(this.session).invoke("F.CUSTOMER", jvRecordId, jvRecord, jvFilePtr, error);
/*   |   */            return jvRecord;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_Read(Object recordId, Object error) {
/*   |   */        jVar jvRecord = jVarFactory.get();
/*   |   */        jVar jvFilePtr = jVarFactory.get();
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "Read", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.READ").invoke("F.CUSTOMER", jvRecordId, jvRecord, jvFilePtr, error);
/*   |   */            return jvRecord;
/*   |   */        } else {
/*   |   */            F_READ_cl.INSTANCE(this.session).invoke("F.CUSTOMER", jvRecordId, jvRecord, jvFilePtr, error);
/*   |   */            return jvRecord;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_CacheRead(Object recordId, Object error) {
/*   |   */        jVar jvRecord = jVarFactory.get();
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "CacheRead", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("CACHE.READ").invoke("F.CUSTOMER", jvRecordId, jvRecord, error);
/*   |   */            return jvRecord;
/*   |   */        } else {
/*   |   */            CACHE_READ_cl.INSTANCE(this.session).invoke("F.CUSTOMER", jvRecordId, jvRecord, error);
/*   |   */            return jvRecord;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_Write(Object recordId, Object record) {
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "Write", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.WRITE").invoke("F.CUSTOMER", jvRecordId, record);
/*   |   */            return null;
/*   |   */        } else {
/*   |   */            F_WRITE_cl.INSTANCE(this.session).invoke("F.CUSTOMER", jvRecordId, record);
/*   |   */            return null;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_Delete(Object recordId) {
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "Delete", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.DELETE").invoke("F.CUSTOMER", jvRecordId);
/*   |   */            return null;
/*   |   */        } else {
/*   |   */            F_DELETE_cl.INSTANCE(this.session).invoke("F.CUSTOMER", jvRecordId);
/*   |   */            return null;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_ReadU(Object recordId, Object error, Object retry) {
/*   |   */        jVar jvRecord = jVarFactory.get();
/*   |   */        jVar jvFilePtr = jVarFactory.get();
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "ReadU", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.READU").invoke("F.CUSTOMER", jvRecordId, jvRecord, jvFilePtr, error, retry);
/*   |   */            return jvRecord;
/*   |   */        } else {
/*   |   */            F_READU_cl.INSTANCE(this.session).invoke("F.CUSTOMER", jvRecordId, jvRecord, jvFilePtr, error, retry);
/*   |   */            return jvRecord;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_Exists() {
/*   |   */        jVar jvRet = jVarFactory.get();
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "Exists", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("OPF").invoke("F.CUSTOMER" + sFM + "NO.FATAL.ERROR", jvRet);
/*   |   */            return jvRet;
/*   |   */        } else {
/*   |   */            OPF_cl.INSTANCE(this.session).invoke("F.CUSTOMER" + sFM + "NO.FATAL.ERROR", jvRet);
/*   |   */            return jvRet;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_ReadNau(Object recordId, Object error) {
/*   |   */        jVar jvRecord = jVarFactory.get();
/*   |   */        jVar jvFilePtr = jVarFactory.get();
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "ReadNau", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.READ").invoke("F.CUSTOMER$NAU", jvRecordId, jvRecord, jvFilePtr, error);
/*   |   */            return jvRecord;
/*   |   */        } else {
/*   |   */            F_READ_cl.INSTANCE(this.session).invoke("F.CUSTOMER$NAU", jvRecordId, jvRecord, jvFilePtr, error);
/*   |   */            return jvRecord;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_WriteNau(Object recordId, Object record) {
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "WriteNau", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.WRITE").invoke("F.CUSTOMER$NAU", jvRecordId, record);
/*   |   */            return null;
/*   |   */        } else {
/*   |   */            F_WRITE_cl.INSTANCE(this.session).invoke("F.CUSTOMER$NAU", jvRecordId, record);
/*   |   */            return null;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_DeleteNau(Object recordId) {
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "DeleteNau", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.DELETE").invoke("F.CUSTOMER$NAU", jvRecordId);
/*   |   */            return null;
/*   |   */        } else {
/*   |   */            F_DELETE_cl.INSTANCE(this.session).invoke("F.CUSTOMER$NAU", jvRecordId);
/*   |   */            return null;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_ReadUNau(Object recordId, Object error, Object retry) {
/*   |   */        jVar jvRecord = jVarFactory.get();
/*   |   */        jVar jvFilePtr = jVarFactory.get();
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "ReadUNau", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.READU").invoke("F.CUSTOMER$NAU", jvRecordId, jvRecord, jvFilePtr, error, retry);
/*   |   */            return jvRecord;
/*   |   */        } else {
/*   |   */            F_READU_cl.INSTANCE(this.session).invoke("F.CUSTOMER$NAU", jvRecordId, jvRecord, jvFilePtr, error, retry);
/*   |   */            return jvRecord;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_ExistsNau() {
/*   |   */        jVar jvRet = jVarFactory.get();
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "ExistsNau", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("OPF").invoke("F.CUSTOMER$NAU" + sFM + "NO.FATAL.ERROR", jvRet);
/*   |   */            return jvRet;
/*   |   */        } else {
/*   |   */            OPF_cl.INSTANCE(this.session).invoke("F.CUSTOMER$NAU" + sFM + "NO.FATAL.ERROR", jvRet);
/*   |   */            return jvRet;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_ReadHis(Object recordId, Object error) {
/*   |   */        jVar jvRecord = jVarFactory.get();
/*   |   */        jVar jvFilePtr = jVarFactory.get();
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "ReadHis", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.READ").invoke("F.CUSTOMER$HIS", jvRecordId, jvRecord, jvFilePtr, error);
/*   |   */            return jvRecord;
/*   |   */        } else {
/*   |   */            F_READ_cl.INSTANCE(this.session).invoke("F.CUSTOMER$HIS", jvRecordId, jvRecord, jvFilePtr, error);
/*   |   */            return jvRecord;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_WriteHis(Object recordId, Object record) {
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "WriteHis", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.WRITE").invoke("F.CUSTOMER$HIS", jvRecordId, record);
/*   |   */            return null;
/*   |   */        } else {
/*   |   */            F_WRITE_cl.INSTANCE(this.session).invoke("F.CUSTOMER$HIS", jvRecordId, record);
/*   |   */            return null;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_DeleteHis(Object recordId) {
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "DeleteHis", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.DELETE").invoke("F.CUSTOMER$HIS", jvRecordId);
/*   |   */            return null;
/*   |   */        } else {
/*   |   */            F_DELETE_cl.INSTANCE(this.session).invoke("F.CUSTOMER$HIS", jvRecordId);
/*   |   */            return null;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_ReadUHis(Object recordId, Object error, Object retry) {
/*   |   */        jVar jvRecord = jVarFactory.get();
/*   |   */        jVar jvFilePtr = jVarFactory.get();
/*   |   */        jVar jvRecordId = jVarFactory.get(recordId);
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "ReadUHis", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("F.READU").invoke("F.CUSTOMER$HIS", jvRecordId, jvRecord, jvFilePtr, error, retry);
/*   |   */            return jvRecord;
/*   |   */        } else {
/*   |   */            F_READU_cl.INSTANCE(this.session).invoke("F.CUSTOMER$HIS", jvRecordId, jvRecord, jvFilePtr, error, retry);
/*   |   */            return jvRecord;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar Customer_ExistsHis() {
/*   |   */        jVar jvRet = jVarFactory.get();
/*   |   */        if (jRunTime.logComponentUsageEnabled(this.session)){
/*   |   */             jRunTime.logComponentUsage(this.session, "XX.Sample", "TABLE", "ExistsHis", "CUSTOMER");
/*   |   */        }
/*   |   */        if (this.session.isUnitTest()) {
/*   |   */            this.session.findStub("OPF").invoke("F.CUSTOMER$HIS" + sFM + "NO.FATAL.ERROR", jvRet);
/*   |   */            return jvRet;
/*   |   */        } else {
/*   |   */            OPF_cl.INSTANCE(this.session).invoke("F.CUSTOMER$HIS" + sFM + "NO.FATAL.ERROR", jvRet);
/*   |   */            return jvRet;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */    //END 
/*   |   */    
/*   |   */    
/*   |   */    public jVar XXVFtValidation() {
/*   |   */          if (jRunTime.logComponentUsageEnabled(session)){
/*   |   */               jRunTime.logComponentUsage(this.session, "XX.Sample", "METHOD", "XXVFtValidation", "XX.V.FT.VALIDATION");
/*   |   */          }
/*   |   */          if (this.session.isUnitTest()) {
/*   |   */              return this.session.findStub("XX.Sample.XXVFtValidation", "XX.V.FT.VALIDATION").invoke();
/*   |   */          } else {
/*   |   */              jRunTime jrt = XX_V_FT_VALIDATION_cl.INSTANCE(this.session);
/*   |   */              jVar ret = jrt.invoke();
/*   |   */    	       return ret;
/*   |   */          }
/*   |   */    }
/*   |   */    
/*   |   */    public static jVar XXVFtValidation_isImplemented(){
/*   |   */       try{
/*   |   */            Class<?> jBCClass = Class.forName("com.temenos.t24.XX_V_FT_VALIDATION_cl");
/*   |   */            return jVarFactory.get("1" + sFM + "XX.V.FT.VALIDATION");
/*   |   */        }catch(Throwable t){
/*   |   */            // Stay quite 
/*   |   */        }
/*   |   */        return jVarFactory.get("0" + sFM + "XX.V.FT.VALIDATION");
/*   |   */    }
/*   |   */    
/*   |   */    public jVar extractCategDetails() {
/*   |   */          if (jRunTime.logComponentUsageEnabled(session)){
/*   |   */               jRunTime.logComponentUsage(this.session, "XX.Sample", "METHOD", "extractCategDetails", "EXTRACT.CATEG.DETAILS");
/*   |   */          }
/*   |   */          if (this.session.isUnitTest()) {
/*   |   */              return this.session.findStub("XX.Sample.extractCategDetails", "EXTRACT.CATEG.DETAILS").invoke();
/*   |   */          } else {
/*   |   */              jRunTime jrt = EXTRACT_CATEG_DETAILS_cl.INSTANCE(this.session);
/*   |   */              jVar ret = jrt.invoke();
/*   |   */    	       return ret;
/*   |   */          }
/*   |   */    }
/*   |   */    
/*   |   */    public static jVar extractCategDetails_isImplemented(){
/*   |   */       try{
/*   |   */            Class<?> jBCClass = Class.forName("com.temenos.t24.EXTRACT_CATEG_DETAILS_cl");
/*   |   */            return jVarFactory.get("1" + sFM + "EXTRACT.CATEG.DETAILS");
/*   |   */        }catch(Throwable t){
/*   |   */            // Stay quite 
/*   |   */        }
/*   |   */        return jVarFactory.get("0" + sFM + "EXTRACT.CATEG.DETAILS");
/*   |   */    }
/*   |   */    
/*   |   */    //
/*   |   */    // static method to get the @APIClass from a component.
/*   |   */    //  @see TF.Core.instanceof() method
/*   |   */    // 
/*   |   */    public static String getPublishedAPIClass(){
/*   |   */    	return "N/A";
/*   |   */    }
/*   |   */    //
/*   |   */    // static map & method to verify if a method is an instance of an interface
/*   |   */    //  @see TF.Core.instanceof() method
/*   |   */    // 
/*   |   */    private static HashMap<String, String> hmMethodsInterface = new HashMap<String, String>();
/*   |   */    private static HashSet<String> hsPublishedInterfaces = new HashSet<String>();
/*   |   */    static{
/*   |   */    }
/*   |   */    public static boolean isPublishedInterface(String sInterface) {
/*   |   */        return hsPublishedInterfaces.contains(sInterface);
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */     // Only for the public interfaces. To verify if a Method is an instance of a jBC interface
/*   |   */    
/*   |   */    public static int instanceOf(String sMethod, String sInterface) {
/*   |   */        DefaultLogger.debug("instanceOf('" + sMethod + "', '" + sInterface + "')");
/*   |   */        for (String sKey : hmMethodsInterface.keySet()) {
/*   |   */            DefaultLogger.debug("hmMethodsInterface : '" + sKey + "' -> '" + hmMethodsInterface.get(sKey) + "'");
/*   |   */        }
/*   |   */        String sInstance = hmMethodsInterface.get(sMethod);
/*   |   */        DefaultLogger.debug("sInstance : '" + sInstance + "'");
/*   |   */        if (sInstance == null || !sInstance.equals(sInterface)) {
/*   |   */            DefaultLogger.debug("return 0");
/*   |   */            return 0;
/*   |   */        } else {
/*   |   */            DefaultLogger.debug("return 1");
/*   |   */            return 1;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar CallAt(Object subroutine, Object... params) {
/*   |   */        String sSubroutine = jVarFactory.get(subroutine).toString();
/*   |   */        try {
/*   |   */            Method met = component_XX_Sample_14_cl.class.getDeclaredMethod(sSubroutine, new Class[] {Object.class });
/*   |   */            Object[] args = new Object[params.length];
/*   |   */            for (int i = 0; i < params.length; i++) {
/*   |   */                args[i] = params[i];
/*   |   */            }
/*   |   */            Object ret = met.invoke(this, args);
/*   |   */            return (jVar) ret;
/*   |   */        } catch (Throwable t) {
/*   |   */            super.logError("Invocation error", t);
/*   |   */            // put the exception message in a specific common for errorHandling for T24 to handle it
/*   |   */            if (this.session != null){
/*   |   */                TF_ErrorHandling.throwException(t, false);
/*   |   */            }
/*   |   */        }
/*   |   */        return null;
/*   |   */    }
/*   |   */    //CONSTANTS
/*   |   */    public static final int _Customer_EbCusLegalId = null!=null?0: 1;
/*   |   */    
/*   |   */    //For Sanity Check
/*   |   */    public static String[] getDependenciesStatic(){
/*   |   */        String ret[] = new String[8];
/*   |   */        ret[0] = "F.DELETE";
/*   |   */        ret[1] = "CACHE.READ";
/*   |   */        ret[2] = "XX.V.FT.VALIDATION";
/*   |   */        ret[3] = "F.WRITE";
/*   |   */        ret[4] = "OPF";
/*   |   */        ret[5] = "F.READU";
/*   |   */        ret[6] = "F.READ";
/*   |   */        ret[7] = "EXTRACT.CATEG.DETAILS";
/*   |   */        return ret;
/*   |   */    }
/*   |   */    
/*   |   */    //For Debugger and tShow
/*   |   */    public String getPathFileNameBasic(){
/*   |   */        return "D:\\DS\\Training2-artifects\\Training2-data-code\\src\\Source\\XX_Sample\\Definition\\XX.Sample.component";
/*   |   */    }
/*   |   */    
/*   |   */    //static method
/*   |   */    public static String getPathFileNameBasicStatic(){
/*   |   */        return "D:\\DS\\Training2-artifects\\Training2-data-code\\src\\Source\\XX_Sample\\Definition\\XX.Sample.component";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getCompileInfo() {
/*   |   */        return "1609068351778	27 Dec 2020 13:25:51	amr-abdelhalim	3";
/*   |   */    }
/*   |   */    
/*   |   */    // static method
/*   |   */    public static String getCompileInfoStatic() {
/*   |   */        return "1609068351778	27 Dec 2020 13:25:51	amr-abdelhalim	3";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getPackageBasic() {
/*   |   */        return "";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getPackageBasicStatic() {
/*   |   */        return "";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getImportBasic() {
/*   |   */        return "com.temenos.t24";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getImportBasicStatic() {
/*   |   */        return "com.temenos.t24";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getVersion() {
/*   |   */        return "R19_SP32.0";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getVersionStatic() {
/*   |   */        return "R19_SP32.0";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getReplacementInfo() {
/*   |   */        return "false";
/*   |   */    }
/*   |   */    public static String getServiceDefinition() {
/*   |   */        return "eNpdjzFrwzAUhHf9ijcmiyCldDB0UGQlCNQGYlV4la2XVEWyjK2UQsl/r2xoh65337t316c4pgGHDG1LGxvHgCRitjE5DAan2acBdvSJkPHWBd9DMd+TK7Q5ZGODdzYvyIZsyTcBgI89r5YsQw+aGqZkzbQ8vZL7X0K2XUDgtzmniBOsV/nhsQL+1ujTizgvwsVjcHO1mqIrsMKrDdJtxJ4WjipxZIrKegvPsFug+/ph8p82429J/MqT7TMv0rUuo3yY/xUVrT4zrilnWhxpLTSTqilJPwDsVDA=";
/*   |   */    }
/*   |   */
/*   |   */}

