# 高校竞赛信息系统

这是一个前后端分离的高校竞赛信息管理系统，用于管理和展示高校竞赛相关信息。

## 技术栈

### 前端
- Vue.js 2.6
- Element UI 2.13
- Axios 0.19
- ECharts 4.6 (数据可视化)
- Vue Router 3.0
- Vuex 3.0

### 后端
- Spring Boot 2.4.0
- Spring Data JPA
- MySQL 5.1
- Shiro (权限管理)
- Lombok
- FastJSON

## 项目结构
```
├── front-end/          # 前端项目目录
│   ├── src/           # 源代码
│   ├── public/        # 静态资源
│   └── package.json   # 项目依赖配置
│
├── jingsai/           # 后端项目目录
│   ├── src/          # 源代码
│   └── pom.xml       # Maven配置文件
│
└── 数据库脚本.sql      # 数据库初始化脚本
```

## 开发环境要求
- Node.js
- Java 8
- MySQL 5.x
- Maven

## 快速开始

### 前端部署
1. 进入前端项目目录：
```bash
cd front-end
```

2. 安装依赖：
```bash
npm install
```

3. 启动开发服务器：
```bash
npm run serve
```

### 后端部署
1. 进入后端项目目录：
```bash
cd jingsai
```

2. 使用Maven构建项目：
```bash
mvn clean install
```

3. 运行项目：
```bash
mvn spring-boot:run
```

### 数据库配置
1. 创建MySQL数据库
2. 执行`数据库脚本.sql`文件初始化数据库

## 主要功能
- 竞赛信息管理
- 用户权限管理
- 数据可视化展示
- 文件导入导出

## Docker支持
项目包含Dockerfile，支持容器化部署。

## 注意事项
- 确保MySQL服务已启动
- 配置正确的数据库连接信息
- 前端开发端口默认为8080
- 后端服务端口需要在配置文件中指定 