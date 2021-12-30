package com.boot.localhosts.util;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class AutoGenerates {

    public static void main(String[] args){
    /*}

    public void AutoGenerate(){*/
        // Step1：代码生成器
        AutoGenerator ag = new AutoGenerator();
        //-------------------------------------------------------------------------------
        // Step2:全局配置
        GlobalConfig gc = new GlobalConfig();
        //填写代码需要生成的目录
        String projectPath = "D:\\gitlab\\localhost";
        //拼接代码最终输出目录
        gc.setOutputDir(projectPath+"/src/main/java");
        //配置开发者信息
        gc.setAuthor("贾海军");
        //配置是否打开目录  默认不打开（false）
        gc.setOpen(false);
        // 实体属性 Swagger2 注解，添加 Swagger 依赖，开启 Swagger2 模式（可选）
        gc.setSwagger2(true);
        //重新生成文件时是否覆盖  false认为不覆盖
        gc.setFileOverride(true);
        //配置主键生成策略
        gc.setIdType(IdType.AUTO);
        //配置日期类型
        gc.setDateType(DateType.ONLY_DATE);
        //默认生成的service会有I前缀
        gc.setServiceName("%sService");
        ag.setGlobalConfig(gc);
        //--------------------------------------------------------------------------------
        //Step3:数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        //配置数据库url地址
        dsc.setUrl("jdbc:mysql://localhost:3306/localhosts?useUnicode=true&characterEncoding=utf8");
        //配置数据库驱动
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        //配置数据库链接账号
        dsc.setUsername("root");
        //配置数据库链接密码
        dsc.setPassword("root");
        ag.setDataSource(dsc);
        //---------------------------------------------------------------------------------
        //Step4:包配置
        PackageConfig pc = new PackageConfig();
        //配置父包名
        pc.setParent("com.boot.localhosts");
        //配置模块名
        //pc.setModuleName("localhosts");
        //配置entity包名
        pc.setEntity("entity");
        //配置mapper包名
        pc.setMapper("mapper");
        //配置service包名
        pc.setService("service");
        //配置controller包名
        pc.setController("controller");
        ag.setPackageInfo(pc);
        //----------------------------------------------------------------------------------
        //Step5策略配置
        StrategyConfig sc = new StrategyConfig();
        // 指定表名（可以同时操作多个表，使用 , 隔开）（需要修改）
        sc.setInclude("user_info");
        //配置数据库表与实体类名之间的映射关系
        sc.setNaming(NamingStrategy.underline_to_camel);
        //配置数据库字段与实体类字段的映射关系
        sc.setColumnNaming(NamingStrategy.underline_to_camel);
        //配置lombok模式
        sc.setEntityLombokModel(true);
        //配置rest风格的控制器
        sc.setRestControllerStyle(false);
        //配置驼峰转连字符
        sc.setControllerMappingHyphenStyle(true);
        // 此处的表名为 test_mybatis_plus_user，模块名为 test_mybatis_plus，去除前缀后剩下为 user。
        sc.setTablePrefix(pc.getModuleName() + "_");
        ag.setStrategy(sc);
        //----------------------------------------------------------------------------------
        //Step6执行代码生成操作
        ag.execute();

    }
}
