# SQL语言
[搜狗百科链接](https://baike.sogou.com/v350222.htm?fromTitle=SQL%E8%AF%AD%E8%A8%80&ch=frombaikevr)
---
---
## 应用简介
*结构化查询语言SQL（STRUCTURED QUERY LANGUAGE）是最重要的 关系数据库操作语言，并且它的影响已经超出 数据库领域，得到其他领域的重视和采用，如 人工智能领域的数据检索，第四代软件开发工具中嵌入SQL的语言等。*

## 语句结构

**一： 数据查询语言（ DQL:Data Query Language）：**

其语句，也称为“数据检索 语句”，用以从表中获得数据，确定数据怎样在应用程序给出。保留字 SELECT是DQL（也是所有SQL）用得最多的动词，其他DQL常用的保留字有WHERE，ORDER BY，GROUP BY和HAVING。这些DQL保留字常与其他类型的SQL语句一起使用。

**二： 数据操作语言（DML：Data Manipulation Language）：**

其语句包括动词 INSERT， UPDATE和 DELETE。它们分别用于添加，修改和删除表中的行。也称为动作查询语言。

**三：事务处理语言（TPL）：**

它的语句能确保被DML语句影响的表的所有行及时得以更新。TPL语句包括BEGIN TRANSACTION，COMMIT和ROLLBACK。

**四： 数据控制语言（DCL）：**

它的语句通过GRANT或REVOKE获得许可，确定单个用户和用户组对 数据库对象的访问。某些RDBMS可用GRANT或REVOKE控制对 表单个列的访问。

**五：数据定义语言（ DDL）：**

其语句包括动词CREATE和DROP。在数据库中创建新表或删除表（CREAT TABLE 或 DROP TABLE）；为表加入索引等。DDL包括许多与人 数据库目录中获得数据有关的保留字。它也是动作查询的一部分。

**六：指针控制语言（CCL）：**

它的语句，像DECLARE CURSOR，FETCH INTO和UPDATE WHERE CURRENT用于对一个或多个表单独行的操作。
![图片](https://pic.baike.soso.com/ugc/baikepic2/7609/20170915124734-1226319790_png_467_331_58332.jpg/0)
## 相关函数
**相关函数**
|SQL Aggregate 函数|SQL Scalar 函数|
|---|---|
|AVG() - 返回平均值|UCASE() - 将某个字段转换为大写|

