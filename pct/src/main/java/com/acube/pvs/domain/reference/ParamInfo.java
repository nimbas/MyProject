/*    */ package com.acube.pvs.domain.reference;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class ParamInfo
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = -5380332039314233533L;
/*    */   private String pv_param_id;
/*    */   private String param_type;
/*    */   private String ne_id;
/*    */   private String cs_param_id;
/*    */   private String descr;
/*    */ 
/*    */   public String getPv_param_id()
/*    */   {
/* 20 */     return this.pv_param_id;
/*    */   }
/*    */   public void setPv_param_id(String pv_param_id) {
/* 23 */     this.pv_param_id = pv_param_id;
/*    */   }
/*    */   public String getParam_type() {
/* 26 */     return this.param_type;
/*    */   }
/*    */   public void setParam_type(String param_type) {
/* 29 */     this.param_type = param_type;
/*    */   }
/*    */   public String getNe_id() {
/* 32 */     return this.ne_id;
/*    */   }
/*    */   public void setNe_id(String ne_id) {
/* 35 */     this.ne_id = ne_id;
/*    */   }
/*    */   public String getCs_param_id() {
/* 38 */     return this.cs_param_id;
/*    */   }
/*    */   public void setCs_param_id(String cs_param_id) {
/* 41 */     this.cs_param_id = cs_param_id;
/*    */   }
/*    */   public String getDescr() {
/* 44 */     return this.descr;
/*    */   }
/*    */   public void setDescr(String descr) {
/* 47 */     this.descr = descr;
/*    */   }
/*    */ }

/* Location:           C:\Users\snake71\Documents\pvs_bk_0419\WEB-INF\classes\
 * Qualified Name:     unitel.pvs.domain.reference.ParamInfo
 * JD-Core Version:    0.6.2
 */