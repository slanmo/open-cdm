<p align="center">
    <b>CloudDM</b>
    <br>
    一款免费且开源的数据库管理工具，适合团队化使用。它提供了访问控制、数据脱敏、SQL 审核、CI/CD 等能力，并支持跨地区部署。
</p>

<p align="center">
	<a href="https://www.cdmgr.com/"><b>首页</b></a> •
	<a href="https://www.cdmgr.com/docs/intro/product_intro"><b>文档</b></a> •
    <a href="https://www.cdmgr.com/blog"><b>Blog</b></a> •
    <a href="https://www.cdmgr.com/blog"><b>Gitee</b></a> •
    <a href="https://www.cdmgr.com/blog"><b>Github</b></a>
</p>

<p align="center">
    [<a target="_blank" href='./README.en.md'>English</a>]
    [<a target="_blank" href='./README.cn.md'>中文</a>]
</p>

---

## 核心能力

### 数据查询

- 丰富等数据源支持多种数据库
  - MySQL、Oracle、MariaDB、PostgreSQL、IBM DB2、SQL Server、 OceanBase、
  - SAP Hana、StarRocks、Doris、SelectDB、ClickHouse、PolarDB、TiDB、Greenplum
  - Hologres、达梦、高斯数据库、AnalyticDB MySQL、MaxCompute、Redis、MongoDB
- 统一 Web 控制台访问数据库；支持事物、隔离级别、查询计划
- 提供查询编辑器、语法高亮、智能提示、执行计划、结果导出等能力

### 数据库管理

- 支持数据库对象包括：库、模式、表、列、索引、视图、函数、存储过程、触发器、用户、角色等
- 支持可视化管理数据库对象：如 创建、删除、修改、查看属性
- 支持通过 环境、集群。来管理不同数据源。

### 权限控制

- 采用 **资源** 与 **功能** 分离的授权模式
    - 资源权限 可在实例、数据库、Schema、表上进行授权，具体取决于语句类型
    - 功能授权 基于角色的访问控制（RBAC）通过角色授权到人
- 支持 **申请权限**、**赋予权限** 及 **临时权限**

### 数据库 CI/CD

- 提供 **Git Push**、**Web Hook**、**HttpCall** 三种方式触发 CI/CD 流程
- 支持 Gitee 作为变更仓库

### SQL 审核

- 支持 **审核规则**、**安全规范** 和 **数据脱敏**
  - 内置 54 条规则，并支持通过规则脚本自定义扩展
- 支持在 SQL 执行前进行 SQL预检，提示风险或阻断执行

### 协同与流程

- 支持 **SQL审核**、**权限工单**、**变更流程** 三种流程。
- 支持 **手动执行**、**立即执行**、**定时执行** 三种方式执行工单。
- 流程引擎：内置、钉钉、飞书、企业微信。
- 统一认证/SSO：OpenLDAP / OpenID Connect (OIDC) / Windows AD / 钉钉 / 飞书 / 企业微信

## 快速开始

### 安装包方式

```text
环境准备
- 安装包
- 环境需准备好 JDK 21
- 准备一台 MySQL(8.0+) 存放程序数据

安装步骤
- 解压安装包
- 进入 bin 目录运行 startup.sh 启动产品
- alone 

```

### Docker 方式

### Kubernetes 方式

- 支持 Docker 部署（单机模式、集群模式）
- 支持 Kubernetes 部署（单机模式、集群模式）

```shell
docker compose -f docker-alone-arm64-<version>.yml up -d
```

## 开发编译

### 开发环境

- JDK21+
- Gradle 9.5.0+
- IntelliJ IDEA 或 Eclipse
- Git
- Linux 或 MacOS 或有 Bash 的 Windows 环境

### 启动入口

- `boot-alone` 项目，单机模式启动入口
- `boot-console` 项目，集群模式 Console 控制台启动入口
- `boot-sidecar` 项目，集群模式 SQL 执行器启动入口

### 本地编译

```bash
# 开发环境构建
./all_build.sh

# 仅更新前端资源
./all_build.sh web

# 生成 tgz 安装包
cd package && ./package.sh

# 生成 tgz 安装包并构建 Docker & Kubernetes 镜像
cd package && ./package.sh --docker

# 指定架构构建 Docker
cd package && ./package.sh --docker=arm64
cd package && ./package.sh --docker=x86_64
```

```bash
# 版本号约定
gradle.properties 中的 cg.clouddm.main.version 字段
```

## 仓库结构

- `clouddm-boot`：console、sidecar、alone 启动入口，以及初始化升级模块。
- `clouddm-platform`：Console、Web、Sidecar、插件装载和共享平台能力。
- `clouddm-plugins`：数据源插件、认证 Provider、功能插件和内部扩展。
- `clouddm-utils`：独立的模块、框架、工具
- `package`：tgz 打包、Docker 镜像、compose 模板和交付输出。

## 开源协议

使用商业友好的 [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0.html) 许可协议。

当前仓库根目录下尚未提供正式的许可证文件，因此本 README 不对许可证做默认推定。
