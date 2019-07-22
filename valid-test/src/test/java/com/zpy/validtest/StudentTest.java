package com.zpy.validtest;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;
import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
@Slf4j
public class StudentTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void testCreateStudent() throws Exception {
        String student = "{" +
                "  \"userId\": \"1ffe5fd6-24b4-4186-88e7-b53768b82315\",\n" +
                "  \"userName\": \"demoData\",\n" +
                "  \"password\": \"demoData\",\n" +
                "  \"age\": 19,\n" +
                "  \"email\": \"695518147qq.com\",\n" +
                "  \"remark\": \"demoData\",\n" +
                "  \"socre\": 1,\n" +
                "  \"status\": true\n" +
                "}";
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/student/create")
                .content(student)
                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();

        //email 不满足邮箱正则表达式
        log.info(mvcResult.getResponse().getContentAsString());

        String student1 = "{" +
                "  \"userId\": \"1ffe5fd6-24b4-4186-88e7-b53768b82315\",\n" +
                "  \"userName\": \"demoData\",\n" +
                "  \"password\": \"demoData\",\n" +
                "  \"age\": 11,\n" +
                "  \"email\": \"695518147@qq.com\",\n" +
                "  \"remark\": \"demoData\",\n" +
                "  \"socre\": 1,\n" +
                "  \"status\": true\n" +
                "}";
        MvcResult mvcResult1 = mockMvc.perform(MockMvcRequestBuilders.post("/student/create")
                .content(student1)
                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();

        //age 必须年满18岁
        log.info(mvcResult1.getResponse().getContentAsString());

        String student2 = "{" +
                "  \"userId\": \"1ffe5fd6-24b4-4186-88e7-b53768b82315\",\n" +
                "  \"userName\": \"demoData\",\n" +
                "  \"password\": \"demoData\",\n" +
                "  \"age\": 1200,\n" +
                "  \"email\": \"695518147@qq.com\",\n" +
                "  \"remark\": \"demoData\",\n" +
                "  \"socre\": 1,\n" +
                "  \"status\": true\n" +
                "}";
        MvcResult mvcResult2 = mockMvc.perform(MockMvcRequestBuilders.post("/student/create")
                .content(student2)
                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();

        //age 年龄不能大于100岁
        log.info(mvcResult2.getResponse().getContentAsString());

        String student3 = "{" +
                "  \"userId\": \"1ffe5fd6-24b4-4186-88e7-b53768b82315\",\n" +
                "  \"userName\": \"demoData\",\n" +
                "  \"password\": \"demoData\",\n" +
                "  \"age\": null,\n" +
                "  \"email\": \"695518147@qq.com\",\n" +
                "  \"remark\": \"demoData\",\n" +
                "  \"socre\": 1,\n" +
                "  \"status\": true\n" +
                "}";
        MvcResult mvcResult3 = mockMvc.perform(MockMvcRequestBuilders.post("/student/create")
                .content(student3)
                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();

        //age 年龄不能为null
        log.info(mvcResult3.getResponse().getContentAsString());

        String student4 = "{" +
                "  \"userId\": \"1ffe5fd6-24b4-4186-88e7-b53768b82315\",\n" +
                "  \"userName\": \"demoData\",\n" +
                "  \"password\": \"demoData\",\n" +
                "  \"age\": 55,\n" +
                "  \"email\": \"695518147@qq.com\",\n" +
                "  \"remark\": \"aaaa\",\n" +
                "  \"socre\": 1,\n" +
                "  \"status\": true\n" +
                "}";
        MvcResult mvcResult4 = mockMvc.perform(MockMvcRequestBuilders.post("/student/create")
                .content(student4)
                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();

        //remark 字段长度要在5-10之间
        log.info(mvcResult4.getResponse().getContentAsString());

        String student5 = "{" +
                "  \"userId\": \"1ffe5fd6-24b4-4186-88e7-b53768b82315\",\n" +
                "  \"userName\": \"demoData\",\n" +
                "  \"password\": \"demoData\",\n" +
                "  \"age\": 55,\n" +
                "  \"email\": \"695518147@qq.com\",\n" +
                "  \"remark\": \"aaaaa\",\n" +
                "  \"socre\": 1,\n" +
                "  \"status\": true\n" +
                "}";
        MvcResult mvcResult5 = mockMvc.perform(MockMvcRequestBuilders.post("/student/create")
                .content(student5)
                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();

        //remark 字段长度要在5-10之间
        log.info(mvcResult5.getResponse().getContentAsString());

        String student6 = "{" +
                "  \"userId\": \"1ffe5fd6-24b4-4186-88e7-b53768b82315\",\n" +
                "  \"userName\": \"demoData\",\n" +
                "  \"password\": \"demoData\",\n" +
                "  \"age\": 55,\n" +
                "  \"email\": \"695518147@qq.com\",\n" +
                "  \"remark\": \"aaaaa\",\n" +
                "  \"socre\": 13.00,\n" +
                "  \"status\": true\n" +
                "}";
        MvcResult mvcResult6 = mockMvc.perform(MockMvcRequestBuilders.post("/student/create")
                .content(student6)
                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();

        //remark 字段长度要在5-10之间
        log.info(mvcResult6.getResponse().getContentAsString());
    }

}
