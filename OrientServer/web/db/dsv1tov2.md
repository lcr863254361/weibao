### 2018-3-23 gny 修改ds相关的数据库表,多个hibernate配置文件添加sequence

1.CWM_SCHEMA USERID 字段改为USERNAME  并新增IP字段
ALTER TABLE CWM_SCHEMA RENAME COLUMN USERID TO USERNAME;
ALTER TABLE CWM_SCHEMA ADD IP VARCHAR(38);

2.CWM_TABLE_COLUMN的sequence和CWM_TAB_COLUMNS共用了 请修改TableColumn.hbm.xml

3.ALTER TABLE CWM_SYS_USERLOGINHISTORY RENAME COLUMN USER_DISPALYNAME TO USER_DISPLAYNAME

4.CWM_ENUM修改DISPLAY_VALUE字段长度为400
ALTER TABLE CWM_ENUM MODIFY (DISPLAY_VALUE VARCHAR2(400));