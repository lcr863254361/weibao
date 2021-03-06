--  --------------------------------------------------
--  试验过程TASK与PVM表格相关
--  Created On : 星期六, 30 7月, 2016
--  Author       : 孟斌
--  --------------------------------------------------
--试验任务的所关联的检查表的信息
DROP TABLE CWM_TASKCHECKMODEL CASCADE CONSTRAINTS ;
CREATE TABLE CWM_TASKCHECKMODEL (
  ID NUMBER(8) NOT NULL,    -- 自增主键
  NAME  VARCHAR2(38) NOT NULL,
  TASKMODELID  VARCHAR2(200) NOT NULL,    -- 检查任务所属的模型ID,即协同模型中的Task表的ID
  TASKDATAID  VARCHAR2(200) NOT NULL,    -- 协同模型中Task表的记录ID
  CHECKMODELID VARCHAR2(200),           -- 该任务所关联的DS中建立的表的ID,该表已经建立了检查类型的字段.
  CHECKTABLESTATUS NUMBER(8) DEFAULT 0 NOT NULL,    -- 该检查表格的状态 1 编制中, 2 ,可下发  ,4 已下发 ,8 已上传
  SIGNROLES VARCHAR2(4000),    -- 要检查的岗位名称,岗位名称用逗号分割
  SIGNNAMES  VARCHAR2(200),    -- 签署人的USERID,用逗号分割
  HTML CLOB,
  UPLOADUSERS VARCHAR2(200),    -- 上传人,上传人的显示名
  UPLOADTIME DATE   -- 上传时间
) ;

ALTER TABLE CWM_TASKCHECKMODEL ADD REMARK VARCHAR2(2000) NULL;

ALTER TABLE CWM_TASKCHECKMODEL ADD CONSTRAINT PK_CWM_TASKCHECKMODEL
	PRIMARY KEY (ID) ;

--检查模型表与检查数据文件的关联
DROP TABLE CWM_CHECKMODELDATATEMPLATE CASCADE CONSTRAINTS ;
CREATE TABLE CWM_CHECKMODELDATATEMPLATE (
  ID NUMBER(8) NOT NULL,    -- 自增主键
  CHECKMODELID  VARCHAR2(200) NOT NULL,    -- 该任务所关联的DS中建立的表的ID,该表已经建立了检查类型的字段.
  TEMPLATEPATH  VARCHAR2(4000) NOT NULL,    -- 对应EXCEL的路径
  GROUPNAME     VARCHAR2(200),           -- 分组名称
  CREATEUSER    VARCHAR2(200),    -- 上传人的Id
  UPLOADTIME    DATE    -- 上传时间
) ;


ALTER TABLE CWM_CHECKMODELDATATEMPLATE ADD CONSTRAINT PK_CWM_CHECKMODELDATATEMPLATE
	PRIMARY KEY (ID) ;

--试验任务中,检查表格的数据
DROP TABLE CWM_TASKCHECKRELATION CASCADE CONSTRAINTS ;
CREATE TABLE CWM_TASKCHECKRELATION (
  ID NUMBER(8) NOT NULL,    -- 自增主键
  CHECKMODELID  VARCHAR2(200) NOT NULL,    -- 该任务所关联的DS中建立的表的ID,该表已经建立了检查类型的字段.
  CHECKDATAID   VARCHAR2(200) NOT NULL,    -- 检查数据的ID
  TASKMODELID  VARCHAR2(200) NOT NULL,    -- 检查任务所属的模型ID,即协同模型中的Task表的ID
  TASKDATAID  VARCHAR2(200) NOT NULL   -- 协同模型中Task表的记录ID
) ;

ALTER TABLE CWM_TASKCHECKRELATION ADD CONSTRAINT PK_CWM_TASKCHECKRELATION
	PRIMARY KEY (ID) ;

-- 绑定至检查任务的html模板
CREATE TABLE CWM_TASKCHECK_HTML
(
    ID VARCHAR2(38) PRIMARY KEY NOT NULL,
    NAME VARCHAR2(38) NOT NULL,
    HTML CLOB NOT NULL,
    NOTES CLOB
);

-- 综合模板表
CREATE TABLE CWM_TASKMULTIPLECHECKMODEL (
   ID VARCHAR2(38) PRIMARY KEY NOT NULL,
   NAME VARCHAR2(38) NOT NULL, --模板名称
   REMARK VARCHAR2(2000) --备注
);

--综合模板表数据
CREATE TABLE CWM_TASKMULCHECKRELATION (
  ID VARCHAR2(38) PRIMARY KEY NOT NULL,
  TEMPLATEID VARCHAR2(38),
  NAME  VARCHAR2(38) NOT NULL,
  CHECKMODELID VARCHAR2(200),
  MODELDATA CLOB,
  HTML CLOB,
  SIGNROLES VARCHAR2(4000),
  SIGNNAMES VARCHAR2(200),
  UPLOADUSERS VARCHAR2(200),
  REMARK VARCHAR2(2000),
  UPLOADTIME DATE
);